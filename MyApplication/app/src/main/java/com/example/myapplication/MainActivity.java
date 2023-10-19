package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// im in need to give idZ to all elements in my design
public class MainActivity extends AppCompatActivity {
    //all activity more than starting point , from main-ground(foreground)  to background and vice-versa

    //1-So the first thing weve to build referencess
    private TextView txtResult;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//oncreate is the lifecycle if for the first time the activity then call it , and if the activity turned off and removed from the momory and we re called it then OnCreate;بنحط فيها الكود التجهيزي
      //oncreate if destruction then again build
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// XML where? here indicating to part 2..    --activity_main-- is the answer
   //2-then to connect with them -XML with Java
        txtResult = findViewById(R.id.txtResult);
        btnClick=findViewById(R.id.btnclick);
        //these lines are HOX(connect references with objects of XML:same names:) -> connection then do implement whatever needed
//onCreate having Hox and event handles -->كود رئيسي تجهيزي for activity
        //now handling :
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  txtResult.setText("From the river to the sea Palestine will be free 7 to  17-10-2023");
                  txtResult.setText(" Palestine will be free");

            }
        });
    }
    //oncreate is a member from main method , individual methods have their own duty



}