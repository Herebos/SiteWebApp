import java.sql.*;
public class AccesSQL {

	public static void main(String[] args) {
		
		try
	    {
	      // create our mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/test";
	      Class.forName(myDriver);							// admin user & mdp
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT FROM ID_user";
	      
	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
		
		
	    GET(ID_user);
		GET(user_name);
		if (user_name == ID_user(name)) {
			System.out.println("Welcome "+user_name+" !");
			void.sendRedirect(monsite.fr/profil.php);
			}
		} else {
			System.out.println("Mauvais nom/mot de passe");
			void.sendRedirect(monsite.fr/LogIn.php);
		}
		st.close();
	}

	}

}
