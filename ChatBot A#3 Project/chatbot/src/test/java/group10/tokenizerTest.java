package group10;
// GROUP 10 COSC 310 check tokenizer test
// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class tokenizerTest {
    
    
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = {"who is your wife"}) //add a whole bunch of tests
    public void testTokenizeIsTRUE(String input) throws IOException
    {

        Tokenizer.createAToken(input);
        String[] check = input.split(" ");
        assertArrayEquals(Tokenizer.tokens, check);

        
    }

    
      
        }       
          
       
    

