import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ladder {

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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello and Welcome, please choose a game mode");
		System.out.println("1. Build Swap Graph");
		System.out.println("2. Find the path between 2 words");
		System.out.println("3. Find all paths of a word with N Steps");
		System.out.println("4. Find a path from a word with 10 steps and generate a html file");

		// System.out.println("Enter a number to choose that game mode:");
		int choiceentry = -1;

		while (choiceentry < 1 || choiceentry > 4) {

			System.out.println("Enter a number to choose that game mode:");
			if (input.hasNextInt())
				choiceentry = input.nextInt();

		}

		switch (choiceentry) {
		case 1:
			// do logic
			System.out.println("Graph built successful");
			break;
		case 2:
			// do logic
			System.out.println("Enter the starting word");
			int startValue = input.nextInt();
			System.out.println("Enter the ending word");
			int endValue = input.nextInt();
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
					          List<String> arrlist23 = dictionaryWords.subList(startpoint3, (endpoint3+1));
					         
					          HashMap<String, ArrayList> map3 = new HashMap<String, ArrayList>();				        	  
								  for(int c=0;c<arrlist23.size();c++) {
									  String words = arrlist23.get(c);
									  if(words.length()==length3) {
										  String result = words.replaceAll("[AEIOUaeiou]","");
											 char[] resultarr = result.toCharArray();
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
								  
								  
								
					          
					          String result = startValue3.replaceAll("[AEIOUaeiou]","");
								 char[] resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
							  for (Map.Entry<String, ArrayList> entry : map3.entrySet()) {
							         String key = entry.getKey();
							         ArrayList<String> value = new ArrayList<String>();
								     value = entry.getValue();
								     if(startValue3.equals(value.get(0))) {
								    	 int size = value.size();
								    	if(size==steps) {
								    		  for(int i=0; i < value.size(); i++){
										        	 if(i==(value.size()-1)) {
												            System.out.print( value.get(i));

										        	 }
										        	 else {
										        		 System.out.print( value.get(i) + " > ");
										        	 }
										            
										        }
								    	}
								        
								     }

							  }

					       
					  }
					 
				  }
				 
			  }
	
			
			break;
		case 4: System.out.println("Enter word");
			String startValue4 =input.next();
			startValue4 = startValue4.toLowerCase();
			int j3=0;
			while (result_set.next()) {
				
				String Words = result_set.getString("Word");
				 Words=Words.toLowerCase();
					dictionaryWords.add(Words);	
					j3++;
				
				}
		

			
			  int startpoint4 = dictionaryWords.indexOf(startValue4);

			  int length4 = startValue4.length();
			  String endValue4 = "null";
			  for(int a=startpoint4;a<dictionaryWords.size();a++) {
				  String word = dictionaryWords.get(a);
				  if(word.length()==length4) {
					if(matching(word,startValue4)) {
						  ArrayList<String> arr3 = new ArrayList<String>();
						 endValue4 = word;
						 endValue4 = endValue4.toLowerCase();
							int endpoint3 = dictionaryWords.indexOf(endValue4);
					          List<String> arrlist23 = dictionaryWords.subList(startpoint4, (endpoint3+1));
					         
					          HashMap<String, ArrayList> map3 = new HashMap<String, ArrayList>();				        	  
								  for(int c=0;c<arrlist23.size();c++) {
									  String words = arrlist23.get(c);
									  if(words.length()==length4) {
										  String result = words.replaceAll("[AEIOUaeiou]","");
											 char[] resultarr = result.toCharArray();
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
								  
								  
								
					          
					          String result = startValue4.replaceAll("[AEIOUaeiou]","");
								 char[] resultarr = result.toCharArray();
								 Arrays.sort(resultarr);
								 result = new String(resultarr);
								 result = result.replaceAll(" ", "");
							  for (Map.Entry<String, ArrayList> entry : map3.entrySet()) {
							         String key = entry.getKey();
							         ArrayList<String> value = new ArrayList<String>();
								     value = entry.getValue();
								     if(startValue4.equals(value.get(0))) {
								    	 int size = value.size();
								    	if(size==10) {
								    		  for(int i=0; i < value.size(); i++){
										        	 if(i==(value.size()-1)) {
												            System.out.print( value.get(i));

										        	 }
										        	 else {
										        		 System.out.print( value.get(i) + " > ");
										        	 }
										            
										        }
								    	}
								        
								     }

							  }

					       
					  }
					 
				  }
				 
			  }
				break;
		case 5:
			System.out.println("Goodbye");
			break;
		}
	}
}
