package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.activity.InvalidActivityException;

import connection.DBConnection;
import exceptions.InvalidInputException;
import models.Keyboard;
import models.Monitor;

public class MonitorDAO {
	Connection connection = DBConnection.getInstance().getConnection();
	
	public Collection<Monitor> showAllMonitors()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException, InvalidActivityException {
		List<Monitor> monitors = new ArrayList<Monitor>();
		String query = "SELECT a.*, c.* FROM article a join monitor c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");
			
			String displayType = rs.getString("display_type");
			double displaySize = rs.getDouble("display_size");
			String resolution = rs.getString("resolution");
			String contrast = rs.getString("contrast");
			
			monitors.add(new Monitor(label, displayType, displayType, displaySize, resolution, contrast, price));
			
		}
		return Collections.unmodifiableList(monitors);
	}
}
