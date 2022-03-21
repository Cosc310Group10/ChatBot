package group10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class checkPOSProbTest {
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = {"who is your wife"}) //add a whole bunch of tests
    public void checkPOSProbIsTRUE(String input) throws IOException
    {
        Tokenizer.createAToken(input);
        POSTagging.posTag(Tokenizer.tokens);
        assertEquals(ChatBot.checkPOSProb(POSTagging.probs), true);
    }

    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = {"who si your wfee","what is dedpooools cst"}) //add a whole bunch of tests
    public void checkPOSProbIsFALSE(String input) throws IOException
    {
        Tokenizer.createAToken(input);
        POSTagging.posTag(Tokenizer.tokens);
        assertEquals(ChatBot.checkPOSProb(POSTagging.probs), false);
    }
}
