package group10;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class analyzeInputTest {
    
    
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
          
       
    

