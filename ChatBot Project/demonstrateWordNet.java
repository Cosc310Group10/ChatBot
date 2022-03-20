import java.lang.System;
import java.io.*;

public class demonstrateWordNet{
    String dir = System.getProperty("user.dir");
    File wnDir = new File(System.getProperty("user.dir"));
    public void demonstrateExportAndLoad (File wnDir) throws IOException {
        
        // load RAM dictionary data into memory
        System . out . print (" Loading dictionary data ... ") ;
        long t = System . currentTimeMillis () ;
        IRAMDictionary ramDict = new RAMDictionary (System.getProperty("user.dir")) ;
        ramDict . setLoadPolicy ( ILoadPolicy . IMMEDIATE_LOAD ) ;
        ramDict . open () ;
        t = System . currentTimeMillis () -t ;
        System . out . printf (" done (%1 d sec )\n", t /1000) ;
        // we will store our exported Wordnet data here
        File exFile = File . createTempFile (" JWI_Export_ ", ".wn") ;
        exFile . deleteOnExit () ;
        
        // export in - memory data
        System . out . print (" Exporting dictionary data ... ") ;
        t = System . currentTimeMillis () ;
        ramDict . export (new FileOutputStream ( exFile ) ) ;
        ramDict . close () ;
        t = System . currentTimeMillis () -t ;
        System . out . printf (" done (%1 d sec )\n", t /1000) ;
        // take a look at the file
        System . out . printf (" Export is %1d MB\n", exFile . length () /1048576) ;
        
        // load RAM dictionary data
        System . out . print (" Loading from exported data ... ") ;
        t = System . currentTimeMillis () ;
        ramDict = new RAMDictionary ( exFile ) ;
        ramDict . open () ;
        t = System . currentTimeMillis () -t ;
        System . out . printf (" done (%1 d sec )\n", t /1000) ;
        trek ( ramDict ) ;
        }
}
