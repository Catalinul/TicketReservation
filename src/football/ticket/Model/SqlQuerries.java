package football.ticket.Model;

public interface SqlQuerries {
    String addNewUser="INSERT INTO users ( firstname, lastname, password, admin)" +
            "VALUES (?, ? , ? , ? )";


    String findUserByFirstName="SELECT * FROM users WHERE  firstname = ?";

    String findUserByLastName="SELECT * FROM users WHERE  lastname = ?";

    String deleteUserByFirstName="DELETE FROM users WHERE firstname = ?";

    String deleteUserByLastName="DELETE FROM users WHERE firstname = ?";
}