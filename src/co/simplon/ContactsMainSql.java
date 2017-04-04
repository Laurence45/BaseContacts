package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ContactsMainSql {

	private static final Logger logger = LoggerFactory.getLogger(ContactsMainSql.class);
	
	    static String databaseUrl = "jdbc:mysql://sql8.freemysqlhosting.net:3306/sql8157970?user=sql8157970&password=GTyyUfvfQ6";

	    //static String requeteSql = "SELECT FNAME FROM CONTACTS ORDER BY FNAME";	    
	    //static String requeteSql = "SELECT * from CONTACTS where contact_type ='friend'"; // Utiliser SELECT 'EMAIL' pour recuperer contenu une colonne 
	    
	    public static void main(String[] args) throws Exception {
	    	logger.info(args[0]);
	    String requeteSql = "SELECT email from CONTACTS where contact_type = '"+ args[1]+ "'" ;
	    
	   // public static void main(String[] args) throws Exception {
	        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

	        Connection connexion = DriverManager.getConnection(databaseUrl);
	        PreparedStatement requete = connexion.prepareStatement("SELECT * FROM CONTACTS WHERE CONTACT_TYPE = ? or CONTACT_TYPE = ?");
	        requete.setString(1, args[0]);
	        requete.setString(2,args [1]);
	        ResultSet resultat = requete.executeQuery();
	        
	      //  Statement requete = connexion.createStatement();
	       // ResultSet resultat = requete.executeQuery(requeteSql);
	        while (resultat.next()) {
	            //String prenom = resultat.getString("EMAIL"); = label
	        	//String prenom = resultat.getString(4); // = index
	            //System.out.println(prenom);
	            
	        	//String email = resultat.getString("EMAIL");
	        	String email = resultat.getString(4);
	            System.out.println(email);
	        }
	        resultat.close();
	        requete.close();
	        connexion.close();
	    }
	}	

	
	
