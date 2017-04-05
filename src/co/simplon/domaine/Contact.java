package co.simplon.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "CONTACTS")
public class Contact {

	public Contact() {
		super();
	}

//définition du contact en utilisant les 6 informations de la base de donnée
@Id
@Column (name = "ID", nullable = false)
		private long id; 
@Column (name = "FNAME", length = 100)
	    private String prenom;
@Column (name = "LNAME", length = 100)    
	    private String nom;
@Column (name = "EMAIL", length = 255 )	    
	    private String email;
@Column (name = "CONTACT_TYPE", length = 30)	    
	    private String contact_type;
@Column (name = "AGE")	    
	    private int age;

	    
	    public Contact(String prenom, String nom, String contact_type) {
	        super();
	        this.prenom = prenom;
	        this.nom = nom;
	        this.contact_type = contact_type;
	    }     
	     
	    public Contact(long id, String prenom, String nom, String contact_type) {
	            this(prenom, nom, contact_type);
	            this.id = id;
	        }

	        public String getEmail() {
	            return email;
	        }

	        public void setEmail(String email) {
	            this.email = email;
	        }

	        public int getAge() {
	            return age;
	        }

	        public void setAge(int age) {
	            this.age = age;
	        }

	        public long getId() {
	            return id;
	        }

	        public String getPrenom() {
	            return prenom;
	        }

	        public String getNom() {
	            return nom;
	        }

	        public String getContact_Type() {
	            return contact_type;
}
}