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

import models.WebCamera;

public class WebCameraDAO {
	Connection connection = DBConnection.getInstance().getConnection();

	public Collection<WebCamera> showAllWashingMachines()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<WebCamera> webCameras = new ArrayList<WebCamera>();
		String query = "SELECT a.*, c.* FROM article a join web_camera c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");

			String resolution = rs.getString("resolution");
			int framesPerSecond = rs.getInt("frames_per_second");
			String microphone = rs.getString("microphone");
			
			boolean hasMicrophone = false;
			if(microphone.equals("true")){
				hasMicrophone = true;
			}

			webCameras.add(new WebCamera(label, model, price, resolution, framesPerSecond, hasMicrophone));
		}
		return Collections.unmodifiableList(webCameras);
	}
}
