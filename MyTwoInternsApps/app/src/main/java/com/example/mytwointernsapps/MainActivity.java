package com.example.mytwointernsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//all activities iam having are described within the "Android Manifest" class , all attributes/properities , google map , google play , id . all items to be download to the mobile of android , charachterstics of my projects all  of them are there
//for future perrmissions will be there-GPS also ,camera,contacts , pics
//all activites will be defined via Manifiests
// <intent-filter> //its permissions , charachterstics ...
//MAIN means that this one is working
//this "<category android:name="android.intent.category.LAUNCHER" />" means the main icon shortcut when download the app to let user open it via it "Launcher
// the 2nd activity has no intent filter--> so its not accessable to call from outter"
//in android the activities are built to be independent of each others So we can launch them individually
// we can call previous-exiting activites from users device and without building it from zero-->save time & effort
//ill let the user share a pic from studio .. whichs fine So why do i need a new whole program to build from zero to share a pic from the device all over again???
//then i will let the user chooses between apps withing his phone
//for ex i want to show the numbers inside the phone , i can call anything that does this work and i DONT have to build it from zero
//or sending emails !! i will let it inhert it or do call the activity its not logical to rebuild it again !So we only need to recall that thing that makes us open Email
//no direct reference as an obj between activities in android , i cant write a code via activity 1 that makes activity 2 does open it and launches it
//buttom from activity 1 to ".show" for ex to activity 2 --> nope cannt
//intent Arequest from act 1 to the system to launch act 2
//in main activity event handler: we have Intent intent then intent.putExtra(string)  -->>hashmap(name value name value) save info on obj as shape of name value
//start actrivity(intent) --> this a request from android to open activity 2
//act1&2 pics mylaptop
//thers a high overload
//startActivity is from "AppCompatActivity " so inheritance &get intent also from extends
//now working foreground , not working background (till developer or Android systems decide to terminate it)
//when back i turn off the activity thats why we need to override to "are u sure to exist?"
// the circule het the activity to background(still alive)



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}