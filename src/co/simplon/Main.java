package co.simplon;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.simplon.dao.ContactsDAO;
import co.simplon.dao.JDBCContactDAO;

public class Main {
	
private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
    	logger.info(args[0]);
        ContactsDAO dao = new JDBCContactDAO();
        String type = args[0];
        List<String> emails = dao.findEmailsByContactType(type);
        for (String email : emails) {
            System.out.println(email);
        }
    }

}
