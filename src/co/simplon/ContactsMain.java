package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class ContactsMain {

   // static String databaseUrl = "jdbc:oracle:thin:ANNUAIRE/annuaire@LOCALHOST:1521:XE";

   // static String requeteSql = "SELECT FNAME FROM CONTACTS ORDER BY FNAME";
    
    /**
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new OracleDriver());

        Connection connexion = DriverManager.getConnection(databaseUrl);
        Statement requete = connexion.createStatement();
        ResultSet resultat = requete.executeQuery(requeteSql);
        while (resultat.next()) {
            String prenom = resultat.getString("FNAME"); 
            System.out.println(prenom);
        }
        resultat.close();
        requete.close();
        connexion.close();
       **/
   
    static String databaseUrl = "jdbc:mysql://sql8.freemysqlhosting.net:3306/sql8157970?user=sql8157970&password=GTyyUfvfQ6";
    static String requeteContacts = "INSERT INTO Contacts (FNAME, LNAME, EMAIL, CONTACT_TYPE, AGE) VALUES (?,?,?,?,?)";
		
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());  
        Connection connexion = DriverManager.getConnection(databaseUrl);
        java.sql.PreparedStatement requete = connexion.prepareStatement(requeteContacts);
        requete.setString(1, "Mario");
        requete.setString(2, "Tours");
        requete.setString(3, "Mario.Tours@gmail.com");
        requete.setString(4, "Friend");
        requete.setInt(5, 50);
        
        int resultat = requete.executeUpdate();
  
        
    // fermer les ressources        
    requete.close();
    connexion.close();

}
}
