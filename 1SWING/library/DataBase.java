package library;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DataBase {
	
	Statement st; 
	ResultSet rs;
	Connection con;
	String query;
	
	
	public DataBase() {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pass = "root";
			
		try {
			con = DriverManager.getConnection(url, user, pass);
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Admin_add() {
		query = "INSERT INTO admin (name, emp_no) VALUES ('Hariom', 01)";
		try {
			st.executeUpdate(query);
			System.out.println("ADDED SUCCESSFULLY....\n");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Admin_view() {
		query = "SELECT * FROM admin";
		try {
			rs = st.executeQuery(query);
			while(rs.next()) {
				String name = rs.getString("name");
				int id = rs.getInt("emp_no");
				
				System.out.println("Library: " + name + " ID: " + id);
			}
			System.out.println("NO MORE RECORDS.....\n");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Admin_delete() {
		query = "DELETE FROM admin WHERE emp_no = 1";
		
		try {
			st.executeUpdate(query);
			System.out.println("DELETED SUCCESSFULLY....\n");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Library
	
	public void addBooks(){
        query = "INSERT INTO Library (Books, Status) VALUES ('Harry Potter', 'Available')";
        try {
            st.executeUpdate(query);
            System.out.println("BOOKS ADDED...\n");
            con.close();
        } catch (SQLException e) {
            System.out.println("Error While Adding");
        }
    }
	
	public void viewBooks(){
        query = "SELECT * FROM Library";
        try {
            rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String books = rs.getString("Books");
                String status = rs.getString("Status");

                System.out.println("ID: " + id + " Books: " + books + " Status: " + status);
            }
            System.out.println("NO MORE RECORDS.....\n");
            con.close();
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }
	
	public void issueBooks(){
        query = "UPDATE Library SET Status = \"Issued\" WHERE Books = \"Harry Potter\" ";
        try {
            st.executeUpdate(query);
            System.out.println("Issued");
        } catch (SQLException e) {
            System.out.println("Error While Issuing");
        }
    }

    public void viewIssued(){
        query = "SELECT * FROM Library WHERE Status='Issued' ";
        try {
            rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String books = rs.getString("Books");
                String status = rs.getString("Status");

                System.out.println("ID: " + id + " Books: " + books + " Status: " + status);
            }
        } catch (SQLException e) {
            System.out.println("Error While Viewing");
        }
    }

    public void returnBooks(){
        query = "UPDATE Library Set Status = 'Returned' WHERE Books = 'Harry Potter' ";
        try {
            st.executeUpdate(query);
            System.out.println("returned");
        } catch (SQLException e) {
            System.out.println("Error While Returning");
        }
    }
}
