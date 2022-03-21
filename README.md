<h1 align="center"> Ryan Reynolds Chat Bot </h1>
<h2 align="center"> COSC 310 - Group 10</h2>
<h3 align="center">Lance Rogan, Blake Ablitt, Ben Van Bergeyk, <br>Griffin Wilchuk, and Carla Mather </h3>
<p align="center">
<img src="images/ryan_reynolds.jpg" alt="hiking" width="350" height="400" />
<img src="images/chat_bot.jpg" alt="hiking" width="350" height="400" />
  
 <p align = "center"><a href="https://www.imdb.com/name/nm0005351/">Learn more about Ryan Reynolds</a>
 <h2>About the Project:</h2>
 <p>This project is a chatbot which takes user inputs and responds as though it is the famous actor Ryan Reynolds. It can handle a variety of questions about Ryan Reynolds’ personal life or about several of the movies he has acted in. The program will boot up and then be ready for the user to ask any question they like. If the chatbot version of Ryan Reynolds knows the answer then the user will see the response on screen, but if the chatbot version of Ryan Reynolds does not know the answer then the user will see a message explaining that the chatbot can’t answer their question. Occasionally, if the question is appropriate for a return question, the Ryan Reynolds chatbot will sometimes ask a question back to the user. This will be a response question. This back and forth between the user and the Ryan Reynolds chatbot will go on for an infinite amount of time before the user chooses to end the program with a simple trigger word.</p>
 <br>
 <h3>Class Organization:</h3>
 <p>The Class organization of this Chat-Robot is fairly straightforward. We have segregated the main chat function classes into 4 main categories, The Ryan Reynolds Class, the Movie Class, the Business Class and the Main Class. With supporting classes providing various features present, they include, POSTagging, Tokenizer and Translate. </p>
 <h3>1.) Ryan Reynolds Class:</h3>
 <p>This Ryan Reynolds class is essentially a class which encapsulates and acquires all of the physical attributes, personal / personal informational attributes, and Movie Attributes. For example, this class is essentially creating an object approximation of the actor Ryan Reynolds with all of his most imporant information. In this class we have his: height, weight, hair color, eye color, gender, birthplace, wifes name, kids names, social media handle, twitter followers, instagram followers, tiktok followers, net worth, previous marriage, personal / other awards. <br><br>In addition to this, we also have a sample of 12 movies Ryan Reynolds has been in which are also included in his attributes. The movies included are: Deadpool, Deadpool 2, Free Guy, R.I.P.D, Green Lantern, Buried, 6 Underground, Red Notice, Self/Less, The Hitman's Bodyguard, Change up, and the proposal. It is imporant to note that each movie object contains: IMDb star rating, title, year it was released, PG-13 or advisory rating, List of main cast members, Director, genre, list of all awards given to movie, box office profit, location movie was filmed, time taken to film the movie, duration/length of movie, and the budget of the movie. This class includes necessary and additional constructors, and all of the getters and setters provided.</p>
 <h3>2.) Movie Class:</h3>
 <p>This movie class is essentially a class which creates a movie object which stores information about a movie, which is then initialized and used as various attributes in the Ryan Reynolds class. For example, each movie object contains: IMDb star rating, title, year it was released, PG-13 or advisory rating, List of main cast members, Director, genre, list of all awards given to movie, box office profit, location movie was filmed, time taken to film the movie, duration/length of movie, and the budget of the movie. This class also includes necessary and additional constructors, all of the getters and setters, and a customized toString() method which specifies movie information.</p>
  <h3>3.) Business Class:</h3>
 <p>This Business class is essentially a class which creates a business object which stores information about a businesses, which is then initialized and used as various attributes in the Ryan Reynolds class. For example, each business object contains: the name of the business, the year the business was started/established, the location the business is in, and the title of Ryan Reynolds holds in the business. This class also includes necessary and additional constructors, and all of the getters and setters which specifies the business information.</p>
 <h3>4.) Main Class:</h3>
 <p>Here is a general overview of the main class: <br><br>This class includes the main method and main functionality of the Ryan Reynolds Chat-Bot. The main method is broken down into various parts. First we have our cool function which delays the bootup of the program to simulate as if we are turning on a system to talk to the chat bot. We have the delay set to 2 seconds, and then the program and first greeting is printed. Next we take the user input and check if ask a question is true (this value is set to true if the chatbot asks a question back to the user 1/3 of the time), and if so, a print statement is sent out and the user input is stored temporarily. <br><br>After this, we set the ask a question to false, and prompt the user to input a question. Once we received the user input, we send it to the chatbot function which delegates the input into various subproblems to then determine how the chatbot will respond. This process continues infinitely until the user types goodbye, and then the engaged boolean is set to true and the while loop evlautes to !true = false, and the goodbye print is sent and the program ends. <br><br>In the chatbot function the user input is sent to, we simply call the analyzeInput function. This analyzeInput function takes in the users input and directs how the robot is going to respond based on if the user input is a greeting, or a who, what, where, when, or how question, otherwise a default response is sent. This input is then further analyzed in a subproblem to determine if the input is a who, what, where, when, or how question about Ryan Reynolds movies or personal life. From here it calls the movie response and personal response to determine what this question is about. Inside each of these who, what, where, when, or how movie response and personal response methods, we have conditions for what questions are being asked and how the chatbot will respond to each of these questions. Lastly, in the personal response methods, we call the askAQuestionResponse which determines if the chatbot will ask the same question back to the user by generating a randomnumber from 1 to 3, hence it happens 1/3 of the time. </p>
 <h2>The Translate Class</h2>
 <p> This class contains an API to WhatsMate Translator. There is a small sample program in the main, fromLang is used to specify the input langaue while toLang is used to specify the output language. The string text contains the string youd like to translate. For our purposes, the method translate() is called on every user input to ensure all text is in english before processing begins. All credit for this API goes to WhatsMate and their team, please see refrences file for more information.</p></p>

 <h2>The POSTagging Class</p>
 <p> The POSTagging class is an implementation of an API from OpenNLP. The purpose of this class is to recognize and 'tag' each word within the user input and assign it the proper part of speech; along with a probability threshold of how accurate the POS assignment was.</p>

 <h2>The Tokenizer Class</h2>
 <p>The Tokenizer class is another API implementation from OpenNLP. The tokenizer function will take the user input and turn it into an array where each index is one word from the user input. This class has assisted with the spellcheck function developed by our group, passing the tokenized array of the user input and comparing each index to a dictionary</p>
 <br>
 <h2>How to Compile and Run Code:</h2>
 <p>Before compiling this project, please ensure your device has the latest version of Java downloaded. <br><br>
Download all files from this repository to an appropriate location on your device. <br><br>
Open your IDE of choice, Load all files, and run the program! <br><br>
To end the conversation, simply input "End"</p>
 
 <h2>Additional Features Added</h2>
 <br>
 <p>Feature 1: Spellcheck</p>
 <br><br>
 <p>An additional feature added within this assignment was a spellcheck function, which takes the user input and scans it against a  ictionary containing over 100000 words. If the word is matched within the dictionary, the system presumes it has been spelt correctly. If any of the user input is decalred to be spelt incorrectly, the system will output a default message letting the user know they have mispelled their input</p>
 <br><br>
<p>Feature 2: Translation<p>
<br><br>
<p>The translation API that has been added effectively allows the system to take in user input in Spanish, translate it to english and respond. This allows our chat bot to respond to a wider variety of input, making the implementation of it more applicabile to a "real world" setting</p>
<br><br>
<p> Feature 3: Tokenizer</p>
<br><br>
<p> The addition of the Tokenizer toolkit allows for our code to flow smoother. The tokenizer breaks down the users input into single word strings placed into an array. This implementation allows the system to already know the key word being searched for instead of scanning through the users entire input. </p>

