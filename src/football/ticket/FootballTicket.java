package football.ticket;
import football.ticket.Model.*;
import football.ticket.View.Login1;
import java.sql.SQLException;

/*
7. Football ticket reservation

Va exista un utilizator normal care poate:
	- sa isi creeze un cont;
	- sa ii rezerve un loc sau mai multe la un meci;
	- sa vizualizeze locuri la oricare logare in aplicatie.

Va exista un utilizator admin care poate:
	- sa adauge meciuri;
	- sa rezerve locuri pentru VIP;
	- sa elibereze locuri;
	- sa schimbe detaliile meciului;
	- see all reservation and query them by id.
 */


public class FootballTicket {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        users user1 = new users("Andrei","Popescu","casetofon",0);
        user1.addUser();

        users user2 = new users("Marius","Georgescu","macarena",1);
        user2.addUser();

        user2.deleteUserByFirstName();
    }
}

