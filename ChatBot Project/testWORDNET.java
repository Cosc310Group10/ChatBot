import java.net.URL;
import java.io.File;
import java.io.IOException;
import edu.mit.jwi.data.FileProvider;
import edu.mit.jwi.item.*;
import edu.mit.jwi.*;
import edu.mit.jwi.IDictionary;


public class testWORDNET{
    public static String filePath = System.getProperty("C:/Users/lance_oxb4bxn/OneDrive/UBCO/2021-2022 Year 4/Term 2/COSC 310/TeamGitHub/ChatBot/ChatBot Project/edu.mit.jwi_2.4.0_src/edu/mit/jwi/data");
    public static void main(String[] args){
        // File wnDir = new File(System.getProperty("C:/Program Files (x86)/WordNet/2.1/bin/"));
        // demonstrateExportAndLoad(wnDir);
        
System.out.println("test");
testDictionary();
    }

//     public void demonstrateExportAndLoad ( File wnDir ) throws IOException {
            
//         // load RAM dictionary data into memory
//         System.out.print(" Loading dictionary data ... ");
//         long t = System.currentTimeMillis();
//         IRAMDictionary ramDict = new RAMDictionary( wnDir );
//         ramDict.setLoadPolicy( ILoadPolicy . IMMEDIATE_LOAD );
//         ramDict.open() ;
//         t = System.currentTimeMillis() -t;
//         System.out.printf(" done (%1 d sec )\n", t /1000);
       
//         // we will store our exported Wordnet data here
//         File exFile = File.createTempFile(" JWI_Export_ ", ".wn");
//         exFile.deleteOnExit();
       
//         // export in - memory data
//         System.out.print(" Exporting dictionary data ... ");
//         t = System.currentTimeMillis ();
//         ramDict.export (new FileOutputStream ( exFile ) );
//         ramDict.close ();
//         t = System.currentTimeMillis () -t;
//         System.out.printf(" done (%1 d sec )\n", t /1000);
       
//         // take a look at the file
//         System.out.printf(" Export is %1d MB\n", exFile.length () /1048576);
       
//         // load RAM dictionary data
//         System.out.print(" Loading from exported data ... ");
//         t = System.currentTimeMillis();
//         ramDict = new RAMDictionary ( exFile );
//         ramDict.open() ;
//         t = System.currentTimeMillis() -t ;
//         System.out.printf(" done (%1 d sec )\n", t /1000);
       
//         trek ( ramDict );
// }

public static void testDictionary ()  {
    
    try{
     // construct the URL to the Wordnet dictionary directory
     String wnhome = "C:/Program Files/WordNet/2.1";
     System.out.println(wnhome);
     String path = wnhome + File.separator + "dict";
     System.out.println(wnhome);
     URL url = new URL ("file", null , path);
    
    
     // construct the dictionary object and open it
     IDictionary dict = new Dictionary (url);
     dict.open();
    
     // look up first sense of the word "dog "
     IIndexWord idxWord = dict.getIndexWord("dog", POS.NOUN);
     IWordID wordID = idxWord.getWordIDs().get(0);
     IWord word = dict.getWord( wordID );
     System.out.println("Id = " + wordID );
     System.out.println(" Lemma = " + word.getLemma());
     System.out.println(" Gloss = " + word.getSynset().getGloss());
    }catch(Exception e){
        e.printStackTrace();
    }
     }
       

}