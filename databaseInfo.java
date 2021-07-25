import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class databaseInfo {
	//public static void main(String[] args) {
    public ArrayList<DictionaryWord> getWordsFromDatabase() {
      	ArrayList<DictionaryWord> dictionaryWords = new ArrayList<DictionaryWord>();
			
		Connection db_connection = null;
		try {
//			// Step 0: Register the Driver
//			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 1: Get the connection object for the database
			String url = "jdbc:mysql://localhost/ladder";
			String user = "root";
			String password = "";
			db_connection = DriverManager.getConnection(url, user, password);
			System.out.println("Success: Connection established");

			// Step 2: Create a statement object
			Statement statement_object = db_connection.createStatement();

			// Step 3: Execute SQL query
			// Set the query string you want to run on the database
			// If this query is not running in PhpMyAdmin, then it will not run here
			String sql_query_str = "SELECT * FROM wordbank";
			ResultSet result_set = statement_object.executeQuery(sql_query_str);

			// Step 4: Process the result set
			// There are many methods for processing the ResultSet
			// See https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html

			while (result_set.next()) {
				String Words = result_set.getString("Words");
				String Length = result_set.getString("Length");
				String WordID = result_set.getString("Word_ID");

				//System.out.println(Word);
				//System.out.println(Length);
				//System.out.println(WordID);
              	dictionaryWords.add(new DictionaryWord(Words, Length, WordID));
                

			} // end while

		} // end try
		catch (Exception ex) {
			ex.printStackTrace();
		} // end catch
      
      return dictionaryWords;

	} // end main method

} // end class