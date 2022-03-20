package group10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.SimpleTokenizer;  

        public class SimpleTokenizerExample { 
           public static void main(String args[]) throws IOException{ 
             
              String sentence = "Hi. How are you? Welcome to Tutorialspoint. " 
                 + "We provide free tutorials on various technologies"; 
            
              //Instantiating SimpleTokenizer class 
              SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;  
               
              //Tokenizing the given sentence 
              String tokens[] = simpleTokenizer.tokenize(sentence);  
               
              //Printing the tokens 
              for(String token : tokens) {         
                 System.out.println(token);  
              }       
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
            String tags[] = posTagger.tag(tokens);
            double probs[] = posTagger.probs();
            System.out.println("Token\t:\tTag\t:\tProbability\n---------------------------------------------");
            for(int i=0;i<tokens.length;i++){
                System.out.println(tokens[i]+"\t:\t"+tags[i]+"\t:\t"+probs[i]);
            }
           }  
        }
