package com.example.mtodo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<TasksList> {

    public Adapter(View.OnClickListener context, ArrayList<String> tasks) {
        super((Context) context, 0, tasks);
    }

    @NonNull

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TasksList task = getItem(position);

        if (convertView == null) {//////////////////////////////
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }

        // Set the task details to the views in your list item layout
        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView descriptionTextView = convertView.findViewById(R.id.descriptionTextView);
        CheckBox doneCheckBox = convertView.findViewById(R.id.doneCheckBox);

        if (task != null) {
            titleTextView.setText(task.getTopic());
            descriptionTextView.setText(task.getBriefDesc());
            doneCheckBox.setChecked(task.isALlDone());
        }

        return convertView;
    }
}
