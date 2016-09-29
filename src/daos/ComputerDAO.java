package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import connection.DBConnection;
import exceptions.ArticleException;
import exceptions.InvalidInputException;
import exceptions.UserException;
import models.Computer;
import models.User;

public class ComputerDAO {
	Connection connection = DBConnection.getInstance().getConnection();

	public Collection<Computer> showAllComputers()
			throws SQLException, InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		List<Computer> computers = new ArrayList<Computer>();
		String query = "SELECT a.*, c.* FROM article a join computer c ON(a.id = c.id);";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String label = rs.getString("label");
			String model = rs.getString("model");
			int price = rs.getInt("price");

			String type = rs.getString("type");
			int ram = rs.getInt("ram");
			String processorType = rs.getString("processor_type");
			double displaySize = rs.getDouble("display_size");
			double processorSpeed = rs.getDouble("processor_speed");
			String videoCardType = rs.getString("videocard_type");
			int hdd = rs.getInt("hdd");
			String operationSystem = rs.getString("operation_system");
			computers.add(new Computer(type, label, model, ram, processorType, displaySize, processorSpeed,
					videoCardType, hdd, operationSystem, price));
		}
		return Collections.unmodifiableList(computers);
	}

	public void addComputer(Computer computer) throws ArticleException {

		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO article VALUES(null, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, computer.getLabel());
			ps.setString(2, computer.getModel());
			ps.setDouble(3, computer.getPrice());
			ps.executeUpdate();

			ResultSet generatedKeys = ps.getGeneratedKeys();
			int articleId =1;
			if (generatedKeys.next()) {
				articleId = generatedKeys.getInt(1);
				
						
			}

			PreparedStatement ps1 = connection
					.prepareStatement("INSERT INTO computer VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, articleId);
			ps.setString(2, computer.getType());
			ps.setInt(3, computer.getRam());
			ps.setString(4, computer.getProcessorType());
			ps.setDouble(5, computer.getDisplaySize());
			ps.setDouble(6, computer.getProcessorSpeed());
			ps.setString(7, computer.getVideoCardType());
			ps.setInt(8, computer.getHdd());
			ps.setString(9, computer.getOperationSystem());
			ps1.executeUpdate();

		} catch (SQLException e) {
			throw new ArticleException();
		}

	}
}
