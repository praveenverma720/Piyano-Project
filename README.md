# Piyano-Project
This is basic Piyano app in which user can input their musical note and get the appropriate result.

# Project structure 
Programing or Designing language used :- Java as Backend, xml as Front End.
IDE used Android Studio.
Platform :- Android Platform
Testing :- Tested in android API Level 21(Android Lollipop 5.0) and API Level 23(Android Marshmallow 6.0).

# Front End Design:-
There is a single layout in which one EditText box to get user input and two Butoon to play and stop user inputed result(sound).

# Back End :-
Here in back end first we initilize all button and edittext box from their id by findViewbyId method after that initilize all musical file and assing them given musical value.
After it we get User input from edittext and assign this input in string variable after that we perform split the stiring using Java Token.
When we set onClickListner Method on both button on play button we can play song by using soundpool class and from stop method we can stop the sound.

# Bug 
   When we use for loop to perform multiple operation using if else loop then some time sound file is overlaped with each other so we have to 
   set delay or sleep method in for loop so sound file can not overlap each other but if we use delay in for loop then it always set delay on each if loop
   so problem here is if a sound file duration is less then delay time then sound file have to wait for delay so if two sound play continus without delay then make some appropriate 
   sound then if delay is accured then their appropriate result is not obtained.So if any one have solution of this bug then let me know. E-mail : praveenverma720@gmail.com
   
