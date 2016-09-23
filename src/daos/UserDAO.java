package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.*;
import exceptions.UserException;
import model.*;

//data access object
public class UserDAO {
	
	
	public void registerUser(User user) throws UserException{
		Connection connection = DBConnection.getInstance().getConnection();
		
		
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO users VALUES(null, ?, ?, ?, ?, ?)");	
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPhoneNumber());
			ps.setString(5, user.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new UserException("User registration failed!");
		}
		
	}
}
