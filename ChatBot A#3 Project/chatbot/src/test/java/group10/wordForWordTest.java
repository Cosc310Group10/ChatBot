package group10;
// GROUP 10 COSC 310 check word for word test ** Finished **

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

// this test case tests against our word for word method which takes in a user input and tests if the tokenized user input matches with 
// items in the dictonary indicating it is spelt right. This is after we already analyzed via probability, and is a second check to that.
public class wordForWordTest {

    // true test for correct sentences
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = { "who is your wife", "what is deadpools imdb", "how many awards has free guy received", "how old are you", "how many kids do you have", "how many twitter followers do you have", "what is your eye colour", "what is your height", "what is your net worth", "what is your birthdate", "what is the cast of changeup", "what location was deadpool2 filmed in" }) // add a whole bunch of tests
    public void testWordForWordISTRUE(String input) throws IOException {
        // create a tokenized array with the input
        Tokenizer.createAToken(input);
        // call the word for word method with this tokenized input
        ChatBot.wordForWord(Tokenizer.tokens);
        // check the speltCorrectly boolean after checking, and see if this matches to
        // true
        assertEquals(ChatBot.speltCorrectly, true);

    }

    // ----------------------------------------------------------------------------------------------------------------------------
    // false test for incorrect sentences
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = { "who is your wief", "what is dedools imdb", "how many awards has freee guy received", "howww olddas aree uyuo", "how many kidq do you have", "how many twiteer followerse do you have", "what is your eye coloour", "what is your heght", "what is your net woirth", "what is your birthdaate", "wat is the cas of changeup", "what location was deapool2 filmed in"  }) // add a whole bunch of tests
    public void testWordForWordIsFALSE(String input) throws IOException {
        // create a tokenized array with the input
        Tokenizer.createAToken(input);
        // call the word for word method with this tokenized input
        ChatBot.wordForWord(Tokenizer.tokens);
        // check the speltCorrectly boolean after checking, and see if this matches to
        // false
        assertEquals(ChatBot.speltCorrectly, false);

    }
}
