package group10;
// GROUP 10 COSC 310 POSTagging class ** Finished ** 

// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

//importing required packages
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;

// This class takes in a String array which is a tokenized array with each index containing a single word, and it calculates the POS Tag
// for each word into a String[] tags array. The tags consist of: // NNP,VBZ for noun singular and verbs, CD for cardinal number, NNS for noun plural, and JJ for adjective.
public class POSTagging {
  // creating a default constructor to be used in other classes
  POSTagging() {

  }

  // creating public static variables so these can be accessed by other classes
  // and tests
  public static String tags[];
  public static double probs[];

  // this method uses a toolkit API (openNLP) to calculate the pos tags and
  // probability each tag is right
  public static String[] posTag(String[] tokens) throws IOException {

    // defining the input stream
    InputStream posModelIn = null;
    // Parts-Of-Speech Tagging section
    // This reads the parts-of-speech model to a stream from the file
    posModelIn = new FileInputStream("en-pos-maxent.bin");
    // This is loading the parts-of-speech model
    POSModel posModel = new POSModel(posModelIn);
    // This is initializing the parts-of-speech tagger with model
    POSTaggerME posTagger = new POSTaggerME(posModel);
    // This is the Tagger tagging the tokens andc creates the tags array stored in
    // the public static variable
    tags = posTagger.tag(tokens);
    // this creates the probability array stored in the public static variable
    probs = posTagger.probs();

    return tags;// returning the tags array
  }
}
