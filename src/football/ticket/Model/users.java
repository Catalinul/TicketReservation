package football.ticket.Model;

import java.sql.*;

public class users implements SqlQuerries {

    private String firstname;
    private String lastname;
    private String password;
    private Integer admin;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public users(String firstname, String lastname, String password, Integer admin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.admin = admin;
    }

    public void addUser() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket","root","");
        PreparedStatement statement = connection.prepareStatement(addNewUser);

        statement.setString(1,this.firstname);
        statement.setString(2,this.lastname);
        statement.setString(3,this.password);
        statement.setInt(4,this.admin);

        int i = statement.executeUpdate();
        System.out.println(i + " records inserted");

        connection.close();
    }

    public void findUserByLastName() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket", "root", "");

        PreparedStatement statement = connection.prepareStatement(findUserByLastName);

        statement.setString(1, this.lastname);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void findUserByFirstName() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket", "root", "");

        PreparedStatement statement = connection.prepareStatement(findUserByFirstName);

        statement.setString(1, this.firstname);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void deleteUserByFirstName() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket","root","");

        PreparedStatement statement = connection.prepareStatement(deleteUserByFirstName);

        statement.setString(1,this.firstname);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    public void deleteUserByLastName() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket","root","");

        PreparedStatement statement = connection.prepareStatement(deleteUserByLastName);

        statement.setString(1,this.lastname);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

}
