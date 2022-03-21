package group10;
// GROUP 10 COSC 310 Tokenizer Class
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
import opennlp.tools.tokenize.SimpleTokenizer;  

        public class Tokenizer { 

         Tokenizer(){

         }
           
         public static String tokens[];
         public static void createAToken(String input) throws IOException{
              

              //Instantiating SimpleTokenizer class 
              SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;  
               
              //Tokenizing the given sentence 
              tokens = simpleTokenizer.tokenize(input);  
               //read in^^
              //Printing the tokens 
            //   for(String token : tokens) {         
            //      System.out.println(token);  
            //   } 
            

              
            }      
              
            
        }
