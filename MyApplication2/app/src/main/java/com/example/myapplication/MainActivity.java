package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//dp density independence> pixel
//not pixel?as a different UI , cuz pixels differes from device to another
//all strings inside String.xml
//LayputCompat should do it vertical
// we find the extraction of design within the styles.xml in order to exchange it at once not via different places and classes
//2 types we can do -->a normal style , and dark mode (then all attributes and designs/styles will be differed )
//match parent takes all scree, wrap takes based on the content
//view should have prefix->to get easier searched about within the intelliscence
//gone means not visible and isnt taking even a place in the memory-> gone with animated entery
//invisible its not showed but its place is reserved
//so we take it and put it down not via the UI , then but the textview inside it ;As the code "Scrollable" has the textview inside

//lineSpacingMulti --> to let spaces between lines of the paragraph
//Scrollview-->has no shape but functionality
public class MainActivity extends AppCompatActivity {
private TextView txtHobbies;
private Button btnSave;
private EditText edtHobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHobbies=findViewById(R.id.txtHobbies);
        btnSave=findViewById(R.id.btnSave);
        edtHobbies=findViewById(R.id.edtHbbies);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edtHobbies.getText().toString();
                if(!str.isEmpty()){//robust code ? to sure the input/data (cuz may an exception/bug  from user ; so should be done backed not front end )  then continue the processing
                    txtHobbies.setText(str);
                    txtHobbies.setVisibility(view.VISIBLE);//VISIBLE--> an integer constant

                }
            }
        });
    }
}