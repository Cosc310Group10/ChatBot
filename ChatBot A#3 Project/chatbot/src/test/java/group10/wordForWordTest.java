package group10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class wordForWordTest {
    
    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = {"who is your wife","what is deadpools imdb"}) //add a whole bunch of tests
    public void testWordForWordISTRUE(String input) throws IOException
    {
        Tokenizer.createAToken(input);
        ChatBot.wordForWord(Tokenizer.tokens);
        assertEquals(ChatBot.speltCorrectly,true);

        
    }

    @Test
    @DisplayName("Repeated Testing")
    @ParameterizedTest
    @ValueSource(strings = {"who is your wief","what is dedools imdb"}) //add a whole bunch of tests
    public void testWordForWordIsFALSE(String input) throws IOException
    {
        Tokenizer.createAToken(input);
        ChatBot.wordForWord(Tokenizer.tokens);
        assertEquals(ChatBot.speltCorrectly,false);

        
    }
}
