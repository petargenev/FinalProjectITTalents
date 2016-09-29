package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import connection.DBConnection;
import exceptions.InvalidInputException;
import models.Mouse;
import models.Refrigerator;

public class RefrigeratorDAO {
	Connection connection = DBConnection.getInstance().getConnection();
	
	public Collection<Refrigerator> showAllRefrigerators()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<Refrigerator> refrigerators = new ArrayList<Refrigerator>();
		String query = "SELECT a.*, c.* FROM article a join refrigerator c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");
			
			int totalCapacity = rs.getInt("total_capacity");
			String energyClass = rs.getString("energy_class");
			String colour = rs.getString("colour");
			
			
			refrigerators.add(new Refrigerator(label, model, price, totalCapacity, energyClass, colour));
		}
		return Collections.unmodifiableList(refrigerators);
	}
}
