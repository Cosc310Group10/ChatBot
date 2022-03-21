package group10;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
// GROUP 10 COSC 310 Translate Class ** Finished ** 
// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

//this class is the translate class which is another Toolkit API used to translate the users input from various languages to english before
//then further preceding to respond to the input. Note that we have it set from spanish to english but this can change if we would like to change it.
// The maximum requests per hour is 100 requests, so comment the code block out in the ChatBot method if you need more attempts otherwise the user input is
//blocked from being translated and results in "{", so be sure not to surpass the 100 requests per hour
public class Translate {

  // ***THIS NEEDS A PAID FOR LOGIN ID AND PASSWORD*** $2 a month
  private static final String CLIENT_ID = "Griffinwilchuk@gmail.com";
  private static final String CLIENT_SECRET = "aa8e06c5439e49be8609a815fdd5081a";
  private static final String ENDPOINT = "http://api.whatsmate.net/v1/translation/translate";

  /**
   * Entry Point
   */
  // this is the main method to specify the translation requirements and test the
  // functionality within this method if needed
  // public static void main(String[] args) throws Exception {
  // Specify your translation requirements here:
  // String fromLang = "es";
  // String toLang = "en";
  // String text = "hola como se llama tu esposa";

  // Translate.translate(fromLang, toLang, text);
  // }

  /**
   * Sends out a WhatsApp message via WhatsMate WA Gateway.
   */
  // This method translates the user input from the language it comes in as, into
  // the language wanted
  public static String translate(String fromLang, String toLang, String text) throws Exception {
    // Should have used a 3rd party library to make a JSON string from an
    // object
    // builds the JSON data to send to translate below
    String jsonPayload = new StringBuilder()
        .append("{")
        .append("\"fromLang\":\"")
        .append(fromLang)
        .append("\",")
        .append("\"toLang\":\"")
        .append(toLang)
        .append("\",")
        .append("\"text\":\"")
        .append(text)
        .append("\"")
        .append("}")
        .toString();

    // establishing a connection to the URL to make requests
    URL url = new URL(ENDPOINT); // establishing URL
    HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // establishing http connection
    // making requests to the connection to login
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
    conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
    conn.setRequestProperty("Content-Type", "application/json");

    // here we send the JSON data to get translated
    OutputStream os = conn.getOutputStream();
    os.write(jsonPayload.getBytes());
    os.flush();
    os.close();

    // translation commands in process to translate the text
    int statusCode = conn.getResponseCode();
    ;
    BufferedReader br = new BufferedReader(new InputStreamReader(
        (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()));
    String output;

    // while the output is not null and there is something to read, return the
    // output
    while ((output = br.readLine()) != null) {

      return output;

    }

    conn.disconnect(); // disconnecting the stream
    return ""; // otherwise return an empty string

  }

}