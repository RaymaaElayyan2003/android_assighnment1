package com.example.myprojj0;
// im giung to build a simple storage for a data to test
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

//in linear layout -->center gravity , margin(to gel lower) and padding
//values stored in spinner can be saved by "srtings.xml" file
//android:entries="@array/books" and
//<string-array name="books">
//<item>Programming books</item>
//<item>Testing </item>
//<item>Software Engineering</item>
//</string-array>
//androidx.appcompat.widget.LinearLayoutCompat -->vertical or horizontal to show the views  , bs hon vertical cuz all of them under each others
// android:orientation="vertical"
//         android:padding="10dp"-->here double pixel cuz letting the mobile app suits all phones screens
//those: Below cant be matched with linear So Remove them
//app:layout_constraintBottom_toBottomOf="parent"
//        app:layout_constraintEnd_toEndOf="parent"
//        app:layout_constraintStart_toStartOf="parent"
//        app:layout_constraintTop_toTopOf="parent" />
public class MainActivity extends AppCompatActivity {
//ok (with whom we will talk ?) for Button, txtResult , spinner
    private TextView txtResult;
    private Button btnSearch;
    private Spinner spnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//R(auto generated we dont have to see it)  is a connector file between XML & java that saves docs within it
    txtResult=findViewById(R.id.txtResult);
    btnSearch=findViewById(R.id.btnSearch);
    spnSearch=findViewById(R.id.spnSearch);
    btnSearch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //takes what chose from user and show it via the textview ..
            String str="";

            str=spnSearch.getSelectedItem().toString();//takes from user to exchange to string :
          //  txtResult.setText(str);//then show it
//now connect the database with main so removing the previous line
DataBase db=new DataBase();
List<Book> result=db.getBooks(str);
String r="";
            for ( Book b :result) {
                r+=b.getTitle()+"\n";

            }
            txtResult.setText(r);
        }
    });
    }
}