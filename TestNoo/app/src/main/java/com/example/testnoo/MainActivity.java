package com.example.testnoo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<TasksList> MyTaskList;
    private ArrayAdapter<TasksList> MyAdapter;
    private ListView listview;
    private Button btnToAddTasks;
    private Button buttonBack;
    private EditText editText;
    private TextView textViewTask;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textViewTask = findViewById(R.id.textViewTask);
        listview = findViewById(R.id.listView);
        listview.setVisibility(View.VISIBLE);//so this is how is it visible always
        btnToAddTasks = findViewById(R.id.button);
        buttonBack = findViewById(R.id.button4);
//        MyTaskList=new ArrayList<>();//So we delete this inOrder to use "LetsLoadBySharedPref" methodd
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

       LetsLoadBySharedPref();//first restore if any data
// Create a layout manager with horizontal orientation

        //MyAdapter.notifyDataSetChanged();//this sentence when any changes needed , but still we didnt identify it yet
//
// Does it needed??:
//        prefs=findViewById(R.id.prefs);

        editText = findViewById(R.id.editText);
//        inputing=findViewById(R.id.editText);
        //                          new ArrayAdapter<TasksList>                                android.R.layout.test_list_item
        MyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MyTaskList);
        listview.setAdapter(MyAdapter);
        listview.setLongClickable(true);//so when click on that iten its accessable with long one
        MyAdapter.notifyDataSetChanged();
      //  prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
        //  AutoDeletionn();
        // MyAdapter.notifyDataSetChanged();
        Button savingbtn = findViewById(R.id.buttonSave);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAct2();
            }
        });
        //now lets get to the shared preferences and GSON,,to save info
        savingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OurDataMethodToBeSaved();
               // AutoDeletionn();///////////////////need
            }
        });
        btnToAddTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItemToList();

            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Context context = getApplicationContext();
//                Toast.makeText(context, "My Task is done & removed from list", Toast.LENGTH_LONG).show();
                MyTaskList.remove(position);
                MyAdapter.notifyDataSetChanged();
                return true;
            }
        });

    }

    private void AutoDeletionn() {
        for (int i = MyTaskList.size() - 1; i >= 0; i--) {
            TasksList task = MyTaskList.get(i);
            //  if (task.isALlDone() && listview.isLongClickable()==true) {
            if (listview.isLongClickable() == true) {
                MyTaskList.remove(i);
                //here a missing line to remove from virtual viewlist
                MyAdapter.notifyDataSetChanged();
            }
        }
    }

    private void OurDataMethodToBeSaved() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(MyTaskList);
        //save to listview kman:///missing
        editor.putString("task list", json);//i ve to resure if the strin should be the name of classs itself or nah
        editor.apply();

    }

    private void LetsLoadBySharedPref() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("task list", null);
        Type type = new TypeToken<ArrayList<TasksList>>() {
        }.getType();
        MyTaskList = gson.fromJson(json, type);
        if (MyTaskList == null) {
            MyTaskList = new ArrayList<>();
        }}


        public void openAct2 () {
            Intent intent = new Intent(this, Act2.class);
            startActivity(intent);
        }

        private void addItemToList () {
            //listview.setVisibility(View.VISIBLE);
            String newItem = editText.getText().toString().trim();
            if (!newItem.isEmpty()) {
                TasksList newTaskk = new TasksList(newItem);
                MyTaskList.add(newTaskk);
                listview.setAdapter(MyAdapter);//my line :P
                //here i do believe that thers is a missing line to add to the virtual viewList
                MyAdapter.add(newTaskk);
                //  listview.setFilterText(newItem);
                //  listview.announceForAccessibility(newItem);
                // editText.append(newItem);
                // listview.setVisibility(View.VISIBLE);
                MyAdapter.notifyDataSetChanged();
                editText.getText().clear();
                // editText.setText("");
//             listview.setVisibility(View.VISIBLE);

            }
            // OurDataMethodToBeSaved();
        }

    //////////////////////So this to let it delete the task when long clock
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        // get my task  position
        TasksList taskpositionClicked = MyTaskList.get(position);
        taskpositionClicked.isALlDone();//true
        MyAdapter.notifyDataSetChanged();
        AutoDeletionn();
        return true;
    }}



