package co.simplon;

import java.util.List;

public interface ContactsDAO {

	 // Donner la liste des emails des contacts selon le type de contact
	 // * @param string type pour type de contact
	 // @return Liste des mails
	 //@throws Exception exception
	 
	List<String> findEmailsByContactType(String type) throws Exception;

	//ajouter une methode sur Contact DAO permettant de d�finir la cr�ation en base d'un contact
	

}