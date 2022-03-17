import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class spellCheckTest {
	
	static boolean speltCorrectly = false;
	static String[] splitInput;
	
	public static void wordForWord(String userInput) throws IOException {
		splitInput = userInput.split(" ");
		
		for(int i=0; i<splitInput.length;i++) {
			
			isMySpellingRight(splitInput[i],"C:\\Users\\lance_oxb4bxn\\OneDrive\\UBCO\\Coding\\test.txt");
		}
		
	}
	
	public static void isMySpellingRight(String userInput, String filePath) throws IOException {
		
		 FileReader fr = new FileReader(filePath);
		 BufferedReader in = new BufferedReader(fr);
		 
		 String word;
		 while((word = in.readLine())!= null) {
			 
			 if(userInput.equals(word)) {
				 speltCorrectly = true;
				 break;
			 }else {
				 speltCorrectly = false;
			 }
		 }
		 in.close();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String userInput = in.nextLine();

		wordForWord(userInput);
		if(speltCorrectly == true) {
			System.out.println("YAY");
		}
		
	}

}
