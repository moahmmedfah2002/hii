package ma.ensa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Client client1 = new Client(2,"mohammed",23);
        Client client2 = new Client(2,"mohammed",30);
        Client client3 = new Client(2,"mohammed",50);
        List<Client> clients = new ArrayList<>();
        clients.add(client2);
        clients.add(client1);
        clients.add(client3);

        clients.sort(Comparator.comparingInt(Client::getAge));
        clients.forEach(System.out::println);


        Connexion connexion=new Connexion();
//        for (Client client : clients) {
//            System.out.println(client);
//        }



    }
}