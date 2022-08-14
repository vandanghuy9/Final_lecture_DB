package database;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class testDB {
	public Connection connection;
	public InsertData_library() throws SQLException {
		connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/final_term";
			String user ="root";
			String password = "15112002";
			try{
				connection = (Connection) DriverManager.getConnection(url,user,password);
				System.out.println("Connected to database");
			}catch(SQLException ex) {
				System.out.println("disconnected");
			}
		}catch(ClassNotFoundException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public int Insert_Ball(String Ball_ID,String Type,String Color,String Material,double Price,String name) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO ball(Ball_ID,Type,Color,Material,Price,name) VALUES (?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,Ball_ID);
		prepare.setString(2,Type);
		prepare.setString(3,Color);
		prepare.setString(4,Material);
		prepare.setDouble(5, Price);
		prepare.setString(6,name);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	
	public int InsertData_BackBag(String backbag_ID,String name,String size,String material,String color,String collection) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO backbag(backbag_ID,name,size,material,color,collection) VALUES (?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,backbag_ID);
		prepare.setString(2,name);
		prepare.setString(3,size);
		prepare.setString(4,material);
		prepare.setString(5, color);
		prepare.setString(6, collection);

		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int InsertData_DuffleBag(String duffle_ID,String name,String size,String material,String color,String collection) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO duffle_bag(duffle_ID,name,size,material,color,collection) VALUES (?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,duffle_ID);
		prepare.setString(2,name);
		prepare.setString(3,size);
		prepare.setString(4,material);
		prepare.setString(5, color);
		prepare.setString(6, collection);

		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_Gloves(String gloves_ID,String type,String size,String color,String name, String collection,String gender) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO gloves(Gloves_ID,Type,Size,Color,name,collection,gender) VALUES(?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,gloves_ID);
		prepare.setString(2, type);
		prepare.setString(3, size);
		prepare.setString(4, color);
		prepare.setString(5, name);
		prepare.setString(6, collection);
		prepare.setString(7, gender);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_Hat(String hat_ID,String type,String gender,String collection,String color ,String name) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO hat(Hat_ID,Type,Gender,Collection,Color,name) VALUES(?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,hat_ID);
		prepare.setString(2, type);
		prepare.setString(3, gender);
		prepare.setString(4, collection);
		prepare.setString(5, color);
		prepare.setString(6, name);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_bottle(String bottle_ID,String type,String color,String size,String collection,String name,String material) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO water_bottle(Bottle_ID,type,Color,Size,Collection,name,material) VALUES(?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,bottle_ID);
		prepare.setString(2, type);
		prepare.setString(3, color);
		prepare.setString(4, size);
		prepare.setString(5, collection);
		prepare.setString(6, name);
		prepare.setString(7, material);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	public int Insert_socks(String Sock_ID,String type,String size,String gender,String Dri_Fit,String color,String name,String collection) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO socks(Socks_ID,Type,Size,Gender,Dri_Fit,Color,name,collection) VALUES(?,?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,Sock_ID);
		prepare.setString(2, type);
		prepare.setString(3, size);
		prepare.setString(4, gender);
		prepare.setString(5, Dri_Fit);
		prepare.setString(6, color);
		prepare.setString(7, name);
		prepare.setString(8, collection);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_shirt(String Shirt_ID,String shirt_name,String size,String shirt_type,String material,String color,String sport_type,String gender,String collection) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO shirt(shirt_ID,shirt_name,size,shirt_type,material,color,sport_type,sex,collection) VALUES(?,?,?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,Shirt_ID);
		prepare.setString(2, shirt_name);
		prepare.setString(3, size);
		prepare.setString(4, shirt_type);
		prepare.setString(5, material);
		prepare.setString(6, color);
		prepare.setString(7, sport_type);
		prepare.setString(8, gender);
		prepare.setString(9, collection);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_sandals(String Shirt_ID,String name,String type,String material,int size,String color,String collection,String gender) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO sandals(sandal_ID,name,type,material,size,color,collection,gender) VALUES(?,?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,Shirt_ID);
		prepare.setString(2,name);
		prepare.setString(3,type);
		prepare.setString(4,material);
		prepare.setInt(5,size);
		prepare.setString(6, color);
		prepare.setString(7, collection);
		prepare.setString(8, gender);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_pants(String pant_ID,String name,String size,String gender,String type,String color,String material,String sport_type,String collection) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO pants (pant_ID,pant_name,size,gender,type,color,material,sport_type,collection) VALUES(?,?,?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,pant_ID);
		prepare.setString(2,name);
		prepare.setString(3,size);
		prepare.setString(4,gender);
		prepare.setString(5,type);
		prepare.setString(6, color);
		prepare.setString(7,material);
		prepare.setString(8, sport_type);
		prepare.setString(9, collection);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_sneaker(String sneaker_ID,String Name,String Type,String Material,String Size,String Color,String Collection,String Gender,String Height,String sport_type) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO sneaker(sneaker_ID,name,type,material,size,color,collection,gender,height,sport_type) VALUES(?,?,?,?,?,?,?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,sneaker_ID);
		prepare.setString(2,Name);
		prepare.setString(3,Type);
		prepare.setString(4,Material);
		prepare.setString(5,Size);
		prepare.setString(6,Color);
		prepare.setString(7,Collection);
		prepare.setString(8, Gender);
		prepare.setString(9, Height);
		prepare.setString(10, sport_type);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_ncc(String ncc_id,String name,String address) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO ncc(Ncc_id,Name,Address) VALUES(?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,ncc_id);
		prepare.setString(2,name);
		prepare.setString(3,address);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_customer(String name,Date DOB,String gender,String address) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO customer(Name,DOB,Gender,address) VALUES(?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,name);
		prepare.setDate(2,DOB);
		prepare.setString(3,gender);
		prepare.setString(4,address);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_shipment(int id,String product,int quantity,float price) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO lohang(lohang_id,product_id,quantity,price) VALUES(?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setInt(1,id);
		prepare.setString(2,product);
		prepare.setInt(3,quantity);
		prepare.setFloat(4,price);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_shipment_detail(String ncc, int lohang,Date date) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO cungcap(ncc_id,lohang_id,ngay_nhap) VALUES(?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,ncc);
		prepare.setInt(2,lohang);
		prepare.setDate(3,date);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_employee(String name, Date date,int salary) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO employee(name,DOB,salary) VALUES(?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setString(1,name);
		prepare.setDate(2,date);
		prepare.setInt(3,salary);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_bill(Date date) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO bill(date) VALUES(?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setDate(1,date);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int Insert_orderdetail(int id, String product ,int quantity,int price) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "INSERT INTO order_detail(OrderID,Product_ID,quantity,price) VALUES(?,?,?,?)";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setInt(1,id);
		prepare.setString(2,product);
		prepare.setInt(3,quantity);
		prepare.setInt(4,price);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
	
	public int UPDATE(int id,Date date) throws SQLException
	{
		ResultSet rs = null;
		PreparedStatement prepare = null;
		int ID = 0;
		try {
		String InsertQuery = "UPDATE bill SET date = ? WHERE order_id = ?";
		prepare = connection.prepareStatement(InsertQuery, Statement.RETURN_GENERATED_KEYS);
		prepare.setDate(1,date);
		prepare.setInt(2,id);
		int row = prepare.executeUpdate();
		if (row == 1)
		{
			rs= prepare.getGeneratedKeys();
			if (rs.next())
			{
				ID = rs.getInt(1);
			}
		}
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null)rs.close();
				prepare.close();
			}catch(SQLException e){
				System.out.print(e.getMessage());
			}
			
		}
		return ID;
	}
}

