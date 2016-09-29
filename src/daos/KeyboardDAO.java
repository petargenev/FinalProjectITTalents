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
import models.Dishwasher;
import models.Keyboard;

public class KeyboardDAO {
	Connection connection = DBConnection.getInstance().getConnection();
	
	public Collection<Keyboard> showAllKeyboards()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<Keyboard> keyboards = new ArrayList<Keyboard>();
		String query = "SELECT a.*, c.* FROM article a join keyboard c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");
			
			String type = rs.getString("type");
			String color = rs.getString("color");
			
			keyboards.add(new Keyboard(label, model, price, type, color));
		}
		return Collections.unmodifiableList(keyboards);
	}
}
