package jpaTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import co.simplon.domaine.Contact;

import static org.junit.Assert.assertEquals;

public class TestJPA {

	@Test
	public void lecturePremierContact() {

		//GIVEN
		Long idRecherche = 1L;
		//WHEN
		
		Contact contact = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BaseContacts");
		EntityManager em = emf.createEntityManager();
		contact = em.find(Contact.class, idRecherche);
		
		//THEN
		assertEquals(1, contact.getId());
		assertEquals("Dave", contact.getPrenom());
		assertEquals("Smith", contact.getNom());
		assertEquals("dsmith@icloud.com", contact.getEmail());
		assertEquals("friend", contact.getContact_Type());
		assertEquals(46, contact.getAge());
	}
}