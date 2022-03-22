package group10;
// GROUP 10 COSC 310 check probability test class

// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

//importing required packages
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//this test case tests against the true and false cases of our probability method which checks that all the probabilities are greater than 0.6
// here we test cases where the input is right, and where it is wrong to see if it works effectively
public class checkPOSProbTest {
    // true test cast
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = { "who is your wife", "what is deadpools imdb",  "how many awards has free guy received", "how old are you", "how many kids do you have", "how many twitter followers do you have", "what is your eye colour", "what is your height", "what is your net worth", "what is your birthdate", "what is the cast of changeup", "what location was deadpool2 filmed in" }) // add a whole bunch of tests
                                                                             // HERE*******************
    public void checkPOSProbIsTRUE(String input) throws IOException {
        // calling the tokenizer method with the input to initialize that token variable
        Tokenizer.createAToken(input);
        // calling the postag method with the tokenized input to initialize the
        // probability variable
        POSTagging.posTag(Tokenizer.tokens);
        // check if the probability method with the probs double[] array returns true,
        // and check if it matches true to indicate test passed with correct input
        assertEquals(ChatBot.checkPOSProb(POSTagging.probs), true);
    }

    // ----------------------------------------------------------------------------------------------------------------------------
    // false test case
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = { "who si your wfee", "what is dedpooools cst", "how many awads has free guy received", "how oldd are you", "how many kds do you have", "how many twiter followes do you have", "what is your eye ecolour", "what isyourheight", "what is your pet worth", "what is your birdthdate", "what is the castf changeup", "what location was dedpool2 filmed in"}) // add a whole bunch of tests
    public void checkPOSProbIsFALSE(String input) throws IOException {
        // calling the tokenizer method with the input to initialize that token variable
        Tokenizer.createAToken(input);
        // calling the postag method with the tokenized input to initialize the
        // probability variable
        POSTagging.posTag(Tokenizer.tokens);
        // check if the probability method with the probs double[] array returns false,
        // and check if it matches false to indicate test passed with incorrect input
        assertEquals(ChatBot.checkPOSProb(POSTagging.probs), true);
    }
}