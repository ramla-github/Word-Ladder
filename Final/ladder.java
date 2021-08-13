import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.String;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ladder extends databaseInfo {

	static int shortestChainLen(String start, String target, Set<String> D)
			{
			if(start == target)
			return 0;
			// If the target String is not
			// present in the dictionary
			if (!D.contains(target))
			return 0;
			// To store the current chain length
			// and the length of the words
			int level = 0, wordlength = start.length();

			// Push the starting word into the queue
			Queue<String> Q = new LinkedList<>();
			Q.add(start);
		
			// While the queue is non-empty
			while (!Q.isEmpty())
			{
			
			// Increment the chain length
			++level;
			
			// Current size of the queue
			int sizeofQ = Q.size();
		
			// Since the queue is being updated while
			// it is being traversed so only the
			// elements which were already present
			// in the queue before the start of this
			// loop will be traversed for now
			for (int i = 0; i < sizeofQ; ++i) {
			
			// Remove the first word from the queue
			char []word = Q.peek().toCharArray();
			Q.remove();
			
			// For every character of the word
			for (int pos = 0; pos < wordlength; ++pos)
			{
			
			// Retain the original character
			// at the current position
			char orig_char = word[pos];
			
			// Replace the current character with
			// every possible lowercase alphabet
			for (char c = 'a'; c <= 'z'; ++c)  {
			word[pos] = c;
			
			// If the new word is equal
			// to the target word
			if (String.valueOf(word).equals(target))
			return level + 1;
			
			// Remove the word from the set
			// if it is found in it
			if (!D.contains(String.valueOf(word)))
			continue;
			D.remove(String.valueOf(word));
			
			// And push the newly generated word
			// which will be a part of the chain
			Q.add(String.valueOf(word));
			}
			
			// Restore the original character
			// at the current position
			word[pos] = orig_char;
			}
			}
			}
			
			return 0;
			}
	
	public void loadDictionary(String file_name) {

  		databaseInfo dbInfo = new databaseInfo();
        ArrayList<String> dictionaryWords = dbInfo.getWordsFromDatabase();
  
  		String[] dictionary = new String[dictionaryWords.size()];
  
  	    for (int i = 0; i < dictionaryWords.size(); i++) {
          dictionary[i] = dictionaryWords.get(i);
          
        }
	}
	public static boolean matching(String word,String line){
		 String newline = line.replaceAll("[AEIOUYaeiouy]","");
		 String newword = word.replaceAll("[AEIOUYaeiouy]","");
		  char[] wordarr = newword.toCharArray();
		  char[] linearr = newline.toCharArray();
		  Arrays.sort(wordarr);
		  Arrays.sort(linearr);
		  return Arrays.equals(wordarr,linearr);
		}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws SQLException, IOException {
		  
		  ArrayList<String> dictionaryWords = new ArrayList<String>();
		  ArrayList<String> dictionaryClue= new ArrayList<String>();

		Connection db_connection = null;
		String url = "jdbc:mysql://localhost/ladder";
		String user = "root";
		String password = "";
		db_connection = DriverManager.getConnection(url, user, password);
		System.out.println("Success: Connection established");
		Statement statement_object = db_connection.createStatement();
		String sql_query_str = "SELECT * FROM wordbank";
		ResultSet result_set = statement_object.executeQuery(sql_query_str);

	
		  
		Scanner input = new Scanner(System.in);
		System.out.println("Hello and Welcome, please choose a game mode");
		System.out.println("1. Build Swap Graph");
		System.out.println("2. Find the path between 2 words");
		System.out.println("3. Find all paths of a word with N Steps");
		System.out.println("4. Find a path from a word with 10 steps and generate a html file");
		System.out.println("5. Exit game");
		System.out.println("6. Sort N words");
		
		
		int choiceentry = -1;

		while (choiceentry < 1 || choiceentry > 6) {

			System.out.println("Enter a number to choose that game mode:");
			if (input.hasNextInt())
				choiceentry = input.nextInt();

		}
		
		switch (choiceentry) {
		case 1:
			System.out.println("Enter the starting word");
			String startValue1 = input.next();
			startValue1 = startValue1.toLowerCase();
			System.out.println("Enter the ending word");
			String endValue1 = input.next();
			endValue1 = endValue1.toLowerCase();
			if (matching(startValue1, endValue1)) {
				int j1 = 0;
				while (result_set.next()) {

					String Words = result_set.getString("Word");
					Words = Words.toLowerCase();
					dictionaryWords.add(Words);
					j1++;

				}

				int startpoint2 = dictionaryWords.indexOf(startValue1);
				int endpoint2 = dictionaryWords.indexOf(endValue1);

				ArrayList<String> arr2 = new ArrayList<String>();
				List<String> arrlist22 = dictionaryWords.subList(startpoint2, endpoint2);

				HashMap<String, ArrayList> map2 = new HashMap<String, ArrayList>();
				int length2 = startValue1.length();
				for (int a = 0; a < arrlist22.size(); a++) {
					String word = arrlist22.get(a);
					if (word.length() == length2) {
						String result = word.replaceAll("[AAEIOUYaeiouy]", "");
						char[] resultarr = result.toCharArray();
						Arrays.sort(resultarr);
						result = new String(resultarr);
						result = result.replaceAll("", "");
						boolean exists = map2.containsKey(result);
						if (exists) {

							map2.get(result).add(word);
						}

						else {
							ArrayList<String> newarr = new ArrayList<String>();
							newarr.add(word);
							map2.put(result, newarr);
						}

					}
				}
				String result = startValue1.replaceAll("[AEIOUYaeiouy]", "");
				char[] resultarr = result.toCharArray();
				Arrays.sort(resultarr);
				result = new String(resultarr);
				result = result.replaceAll(" ", "");

				for (Map.Entry<String, ArrayList> entry : map2.entrySet()) {
					String key = entry.getKey();
					ArrayList<String> value = new ArrayList<String>();
					value = entry.getValue();
					if (key.equals(result)) {
						for (int i = 0; i < value.size(); i++) {
							if (i == (value.size() - 1)) {
								//System.out.print(value.get(i) + " > " + endValue1);

							} else {
								//System.out.print(value.get(i) + " > ");
								
							}
							
						} 
						; System.out.println("\nSwap Graph Built Successfully");
					} 

				}

			} else {
				System.out.println("Words are not swapable");
			}
	
			
		
			
			break;
		case 2:
			
			System.out.println("Enter the starting word");
			String startValue2 = input.next();
			startValue2 = startValue2.toLowerCase();
			System.out.println("Enter the ending word");
			String endValue2 = input.next();
			endValue2 = endValue2.toLowerCase();
			if(matching(startValue2,endValue2)){
				int j1=0;
				while (result_set.next()) {
					
					String Words = result_set.getString("Word");
					 Words=Words.toLowerCase();
						dictionaryWords.add(Words);	
						j1++;
					
					}
				

				int startpoint2 = dictionaryWords.indexOf(startValue2);
				int endpoint2 = dictionaryWords.indexOf(endValue2);

				
				 ArrayList<String> arr2 = new ArrayList<String>();
		          List<String> arrlist22 = dictionaryWords;
		            
				  HashMap<String, ArrayList> map2 = new HashMap<String, ArrayList>();
				  String result = startValue2.replaceAll("[AEIOUYaeiouy]","");
				  char[] resultarr = result.toCharArray();
					 Arrays.sort(resultarr);
					 result = new String(resultarr);
					 result = result.replaceAll(" ", "");
				  arr2.add(startValue2);
			       map2.put(result,arr2);

				  
				  int length2 = startValue2.length();
				  for(int a=0;a<arrlist22.size();a++) {
					  String word = arrlist22.get(a);
					  if(word.length()==length2) {
						   result = word.replaceAll("[AEIOUYaeiouy]","");
							 resultarr = result.toCharArray();
							 Arrays.sort(resultarr);
							 result = new String(resultarr);
							 result = result.replaceAll(" ", "");
							 boolean exists = map2.containsKey(result);
						
							 
							 if(exists){						     
						              ArrayList<String> arrCheck = new ArrayList<String>();
										 arrCheck = map2.get(result);
										 if(!(arrCheck.contains(word))) {
											 map2.get(result).add(word);
										 }
										
										
						            }	
						      
						      else{
						        ArrayList<String> newarr = new ArrayList<String>();
						         newarr.add(word);
						         map2.put(result,newarr);
					  }
					  
					  
				  }
					  
				  }
				  result = startValue2.replaceAll("[AEIOUYaeiouy]","");
					  resultarr = result.toCharArray();
					 Arrays.sort(resultarr);
					 result = new String(resultarr);
					 result = result.replaceAll(" ", "");
					
					 for (Map.Entry<String, ArrayList> entry : map2.entrySet()) {
				         String key = entry.getKey();
				         List<String> value = new ArrayList<String>();
					     value = entry.getValue();
					     if(key.equals(result)) {
					    	value = value.subList(0, value.indexOf(endValue2)+1);
					         for(int i=0; i < value.size(); i++){
					        	 if(i==(value.size()-1)) {
							            System.out.print( value.get(i));

					        	 }
							   
					        	 else {
					        		 System.out.print( value.get(i) + " > ");
					        	 }
					            
					        };
					     }
					     
				  }
				  

		
			
			}
			else {
				System.out.println("Words are not Swapable");
			}
			
			break;
		case 3:
		
			System.out.println("Enter number of steps");
			int steps = input.nextInt();
			System.out.println("Enter word");
			String startValue3 =input.next();
			startValue3 = startValue3.toLowerCase();
			int j2=0;
			while (result_set.next()) {
				
				String Words = result_set.getString("Word");
				 Words=Words.toLowerCase();
					dictionaryWords.add(Words);	
					j2++;
				
				}
			
			Collections.sort(dictionaryWords);
			
			  int startpoint3 = dictionaryWords.indexOf(startValue3);

			  int length3 = startValue3.length();
			  String endValue3 = "null";
			  for(int a=startpoint3;a<dictionaryWords.size();a++) {
				  String word = dictionaryWords.get(a);
				  

				  if(word.length()==length3) {
					if(matching(word,startValue3)) {
						  ArrayList<String> arr3 = new ArrayList<String>();
						 endValue3 = word;
						 endValue3 = endValue3.toLowerCase();
							int endpoint3 = dictionaryWords.indexOf(endValue3);
							
					          List<String> arrlist23 = dictionaryWords;
					         
					          HashMap<String, ArrayList> map3 = new HashMap<String, ArrayList>();		
							  String result = startValue3.replaceAll("[AEIOUYaeiouy]","");
							  char[] resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
							    arr3.add(startValue3);
						        map3.put(result,arr3);
						        arrlist23.remove(startValue3);
								  for(int c=0;c<arrlist23.size();c++) {
									  String words = arrlist23.get(c);
									  if(words.length()==length3) {
										  result = words.replaceAll("[AEIOUYaeiouy]","");
											resultarr = result.toCharArray();
											 Arrays.sort(resultarr);
											 result = new String(resultarr);
											 result = result.replaceAll(" ", "");
											 boolean exists = map3.containsKey(result);
										     if(exists){
										    	 
										              map3.get(result).add(words);
										            }
										      
										      else{
										        ArrayList<String> newarr = new ArrayList<String>();
										         newarr.add(words);
										         map3.put(result,newarr);
									  }
									  
									  
								  }
									  
									  
								  }
								  
								  
								
					          
					           result = startValue3.replaceAll("[AEIOUYaeiouy]","");
								  resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
									
								 for (Map.Entry<String, ArrayList> entry : map3.entrySet()) {
							         String key = entry.getKey();
							         List<String> value = new ArrayList<String>();
								     value = entry.getValue();
								     int sizeofmap = map3.size();
								     if(key.equals(result)&& value.size()>=steps) {
								    	value = value.subList(0, steps);
								         for(int i=0; i < value.size(); i++){
								        	 if(i==(value.size()-1)) {
										            System.out.print( value.get(i));

								        	 }
										   
								        	 else {
								        		 System.out.print( value.get(i) + " > ");
								        	 }
								        };
							            System.out.println(" ");
							            return;

								     }
								     
							  }
							  

					       
					  }
					 
				  }
				 
			  }
	
			
			break;
		case 4:
			int steps2 = 10;
			System.out.println("Enter word");
			String startValue4 =input.next();
			startValue4 = startValue4.toLowerCase();
			int j3=0;
			while (result_set.next()) {
				
				String Words = result_set.getString("Word");
				 Words=Words.toLowerCase();
					dictionaryWords.add(Words);	
					j3++;
				
				}
		      List<String> arrval= new ArrayList<String>();

			
			Collections.sort(dictionaryWords);
			
			  int startpoint4 = dictionaryWords.indexOf(startValue4);

			  int length4 = startValue4.length();
			  String endValue4 = "null";
			  for(int a=startpoint4;a<dictionaryWords.size();a++) {
				  String word = dictionaryWords.get(a);
				  

				  if(word.length()==length4) {
					if(matching(word,startValue4)) {
						  ArrayList<String> arr4 = new ArrayList<String>();
						 endValue4 = word;
						 endValue4 = endValue4.toLowerCase();
							int endpoint3 = dictionaryWords.indexOf(endValue4);
							
					          List<String> arrlist24 = dictionaryWords;
					         
					          HashMap<String, ArrayList> map4 = new HashMap<String, ArrayList>();		
							  String result = startValue4.replaceAll("[AEIOUYaeiouy]","");
							  char[] resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
							    arr4.add(startValue4);
						        map4.put(result,arr4);
						        arrlist24.remove(startValue4);
								  for(int c=0;c<arrlist24.size();c++) {
									  String words = arrlist24.get(c);
									  if(words.length()==length4) {
										  result = words.replaceAll("[AEIOUYaeiouy]","");
											resultarr = result.toCharArray();
											 Arrays.sort(resultarr);
											 result = new String(resultarr);
											 result = result.replaceAll(" ", "");
											 boolean exists = map4.containsKey(result);
										     if(exists){
										    	 
										              map4.get(result).add(words);
										            }
										      
										      else{
										        ArrayList<String> newarr = new ArrayList<String>();
										         newarr.add(words);
										         map4.put(result,newarr);
									  }
									  
									  
								  }
								  }
								  
								  
								
					          
					           result = startValue4.replaceAll("[AEIOUYaeiouy]","");
								  resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
									
								 for (Map.Entry<String, ArrayList> entry : map4.entrySet()) {
							         String key = entry.getKey();
							         List<String> value = new ArrayList<String>();
								     value = entry.getValue();
								     int sizeofmap = map4.size();
								     if(key.equals(result)&& value.size()>=steps2) {
								    	value = value.subList(0, steps2);
								    	arrval.addAll(value);
								       
							            
								        
								     }
								     
							  }
							  

					       
					  }
					 
				  }
				 
			  }
			  arrval = arrval.subList(0, 9);
			     System.out.println(arrval);
			     
		ResultSet val_set = statement_object.executeQuery(sql_query_str);
		  ArrayList<String> valarr = new ArrayList<String>();
		  
		while (val_set.next()) {
			
			String Clues = val_set.getString("Clue");
			String words = val_set.getString("Word");
			words=words.toLowerCase();
				if(arrval.contains(words)&&! (words.contentEquals(startValue4))) {
					valarr.add(Clues);
				}
				
			
			}
	     System.out.println(valarr);


	     File ladderhtml = new File("ladder.html");
			BufferedWriter hg = new BufferedWriter(new FileWriter(ladderhtml));

						hg.append("<!DOCTYPE html>\n");
						hg.append("<html>\n\n");
						hg.append("<head>\n");
						hg.append("\t<title>Ladder Swap Puzzle</title>\n");
						hg.append("\t<style>\n");
						hg.append("\ttable{\n\t\tbackground-color: #00b3ff;\n\t\tcolor: #000000;\n\t\tborder-spacing: 10px;\n" + 
						          "\t\tfont-family: College;\n\t\tmargin-left: auto;\n\t\tmargin-right: auto;\n" + 
								  "\t\tbox-shadow: inset -3px -3px 3px rgba(0,0,0,0.4), 3px 3px 5px 0px rgba(0,0,0,0.5);\n" + 
						          "\t\tborder-radius: 0.8rem;\n\t}\n\n");
						hg.append("\ttd{\n\t\tbackground-color: #edd2fc;\n\t\tpadding: 50px;\n\t\twidth: 100px;\n\t\ttext-align: center;\n" + 
						          "\t\tfont-size: 18px;\n\t\tfont-weight: bold;\n\t\ttext-shadow: 0px 1px 0px rgba(255,255,255,0.8)," + 
								  "0px -1px 0px rgba(0,0,0,.8);\n\t\tbox-shadow: inset -5px -5px 7px rgba(0,0,0,0.4), " + 
						          "2px 2px 3px 0px rgba(0,0,0,0.5);\n\t\tborder-radius: 0.8rem;\n\t}\n");
						hg.append("\t</style>\n");
						hg.append("</head>\n\n");
						hg.append("<body>\n");
						hg.append("\t<table>\n");
						hg.append("\t\t<tr> ");
						hg.append("\t\t<th> Words");
						hg.append("\t\t</th>");
						hg.append("\t\t<th>  ");
						hg.append("\t\t</th>");
						hg.append("\t\t</tr> ");
						hg.append("\t\t<tr> ");
						hg.append("\t\t<td> "+startValue4);
						hg.append("\t\t</td>");
						hg.append("\t\t<td> "+valarr.get(0));
						hg.append("\t\t</td>");
						hg.append("\t\t</tr>");
						hg.append("\t\t<tr>  ");
						hg.append("\t\t<td>  "+valarr.get(1));
						hg.append("\t\t</td>");
						hg.append("\t\t<td>  "+valarr.get(2));
						hg.append("\t\t</td>");
						hg.append("\t\t</tr>");
						hg.append("\t\t<tr> ");
						hg.append("\t\t<td>  "+valarr.get(3));
						hg.append("\t\t</td>");
						hg.append("\t\t<td>  "+valarr.get(4));
						hg.append("\t\t</td>");
						hg.append("\t\t</tr>");
						hg.append("\t\t</th>");
						hg.append("\t\t<th>  ");
						hg.append("\t\t</th>");
						hg.append("\t\t</tr>");
						hg.append("\t\t<tr> ");
						hg.append("\t\t<td>  "+valarr.get(5));
						hg.append("\t\t</td>");
						hg.append("\t\t<td>  "+valarr.get(6));
						hg.append("\t\t</td>");
						hg.append("\t\t</tr>");
						hg.append("\t\t<tr>  ");
						hg.append("\t\t<td>  "+valarr.get(7));
						hg.append("\t\t</td>");
						hg.append("\t\t<td> "+arrval.get(8));
						hg.append("\t\t</td>");
						hg.append("\t\t</tr>");
						
						hg.append("\t\t<caption> Find the Swap Path in 10 steps </caption>\n");
						hg.append("");
						
						hg.append("\t</table>\n");
						hg.append("");
						hg.append("");
						hg.append("Solve the swap ladder puzzle. It starts from left to right and from top to bottom. Use the hints to help solve the puzzle");
						hg.append("</body>\n\n");
						hg.append("</html>");
						Desktop.getDesktop().browse(ladderhtml.toURI());
						// htmlhtml File.close();
						hg.close();
						//html_file.write(hg.toString());
						// html_file.flush();
						//html_file.close();

			break;
		case 5:
			System.out.println("Goodbye");
			break;
			
		case 6:
			String sql_query_str1= "Select* FROM wordbank";
			ResultSet result_set1= statement_object.executeQuery(sql_query_str);
			System.out.println("How many random words do you want?");
			int numWord= input.nextInt();
			int j5=0;
			while (result_set1.next()){
				String words= result_set1.getString("Word");
				words= words.toLowerCase();
				dictionaryWords.add(words);
				ArrayList<String> word= new ArrayList<String>();
				j5++;
				
				for (int i= 0; i< numWord; i++){
					ArrayList<String> randomWords= new ArrayList<String>();
					
					Collections.sort(randomWords);
					
				}
			}
			System.out.println("Here is your list of words"+ numWord);
			System.out.println("Here is the alphabetical word list"+numWord);

			break;
			
		default:
			break;
		}
	
	}
}



