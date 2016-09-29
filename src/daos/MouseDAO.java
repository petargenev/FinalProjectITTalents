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
import models.Keyboard;
import models.Mouse;

public class MouseDAO {
	Connection connection = DBConnection.getInstance().getConnection();
	
	public Collection<Mouse> showAllDishwashers()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<Mouse> mouses = new ArrayList<Mouse>();
		String query = "SELECT a.*, c.* FROM article a join mouse c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");
			
			double resolution = rs.getDouble("resolution");
			
			
			mouses.add(new Mouse(label, model, price, resolution));
		}
		return Collections.unmodifiableList(mouses);
	}
}
