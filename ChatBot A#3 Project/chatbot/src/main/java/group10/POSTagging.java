package group10;

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
            // System.out.println("Token\t:\tTag\t:\tProbability\n---------------------------------------------");
            // for(int i=0;i<tokens.length;i++){
            //     System.out.println(tokens[i]+"\t:\t"+tags[i]+"\t:\t"+probs[i]);
            // }

            return tags;
        }
}
