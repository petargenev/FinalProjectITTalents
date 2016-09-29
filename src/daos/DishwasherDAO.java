package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import connection.DBConnection;
import exceptions.InvalidInputException;

import models.Dishwasher;

public class DishwasherDAO {
	Connection connection = DBConnection.getInstance().getConnection();
	
	public Collection<Dishwasher> showAllDishwashers()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<Dishwasher> dishwashers = new ArrayList<Dishwasher>();
		String query = "SELECT a.*, c.* FROM article a join dishwasher c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");

			int capacity = rs.getInt("capacity");
			String energyClass = rs.getString("energy_class");
			int programmesNumber = rs.getInt("programmes_number");
			int temperaturesNumber = rs.getInt("temperatures_number");
			dishwashers.add(new Dishwasher(label, model, price, capacity, energyClass, programmesNumber, temperaturesNumber));
		}
		return dishwashers;
	}
}
