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
import models.Refrigerator;
import models.WashingMachine;

public class WashingMachineDAO {
	Connection connection = DBConnection.getInstance().getConnection();

	public Collection<WashingMachine> showAllWashingMachines()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<WashingMachine> washingMachines = new ArrayList<WashingMachine>();
		String query = "SELECT a.*, c.* FROM article a join washing_machine c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");

			String kind = rs.getString("kind");
			int roundsPerMinute = rs.getInt("rounds_per_minute");
			String energyClass = rs.getString("energy_class");
			double washingCapacity = rs.getDouble("washing_capacity");

			washingMachines.add(new WashingMachine(label, model, price, kind, roundsPerMinute, energyClass, washingCapacity));
		}
		return Collections.unmodifiableList(washingMachines);
	}
}
