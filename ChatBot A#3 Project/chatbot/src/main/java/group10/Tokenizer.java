package group10;
// GROUP 10 COSC 310 Tokenizer Class ** Finished ** 

// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

//importing required packages
import java.io.IOException;
import opennlp.tools.tokenize.SimpleTokenizer;

public class Tokenizer {

  // creating a default constructor so it can be used by other classes
  Tokenizer() {

  }

  // creating a public static tokens array so it can be accessed by other classes
  public static String tokens[];

  // this method uses the toolkit API (openNLP) and creates a tokenized array
  // given a string input, and throws an IOException if there is an error
  public static void createAToken(String input) throws IOException {

    // Here we are instantiating SimpleTokenizer class
    SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;

    // And then we are tokenizing the user input, which is stored in the public
    // static variable
    tokens = simpleTokenizer.tokenize(input);

  }

}
