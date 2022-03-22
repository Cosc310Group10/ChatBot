package group10;
// GROUP 10 COSC 310 check tokenizer test ** Finished **

// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

//importing required packages
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// this tests the tokenizer method to see if it creates a tokenized string array properly which is then sent to other critical main functioning methods
public class tokenizerTest {

    // testing true input, where this is the only case for creating the tokenized
    // input
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = { "who is your wife",  "how many awards has free guy received", "how old are you", "how many kids do you have", "how many twitter followers do you have", "what is your eye colour", "what is your height", "what is your net worth", "what is your birthdate", "what is the cast of changeup", "what location was deadpool filmed in" }) // add a whole bunch of tests,
                                                   // **********************************************NOTE THIS WONT WORK
                                                   // WITH PERIODS ETC
    public void testTokenizeIsTRUE(String input) throws IOException {
        // here we tokenize the user input
        Tokenizer.createAToken(input);
        // here we ALSO tokenize the user input but with a very straightforward way
        // without a method
        // we simply just split the input at the space and we check
        String[] check = input.split(" ");
        // if the tokenized input equals to the input split at the string then we return
        // true, otherwise false, by checking if they equal eachother
        assertArrayEquals(Tokenizer.tokens, check);

    }

}
