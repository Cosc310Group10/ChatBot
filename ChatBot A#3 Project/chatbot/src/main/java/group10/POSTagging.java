package group10;
// GROUP 10 COSC 310 POSTagging class
// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;

public class POSTagging {
    POSTagging(){

    }
    public static String tags[];
    public static double probs[];

    public static String[] posTag(String[] tokens) throws IOException{
    InputStream tokenModelIn = null;
              InputStream posModelIn = null;
              // Parts-Of-Speech Tagging
            // reading parts-of-speech model to a stream 
            posModelIn = new FileInputStream("en-pos-maxent.bin");
            // loading the parts-of-speech model from stream
            POSModel posModel = new POSModel(posModelIn);
            // initializing the parts-of-speech tagger with model 
            POSTaggerME posTagger = new POSTaggerME(posModel);
            // Tagger tagging the tokens
            tags = posTagger.tag(tokens);
            probs = posTagger.probs();

            return tags;
        }
}
