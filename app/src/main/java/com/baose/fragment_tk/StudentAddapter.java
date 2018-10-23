package com.baose.fragment_tk;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAddapter extends ArrayAdapter<Student> {

    private Activity context;
    private  int resource;
    private List<Student> list;
    public StudentAddapter(@NonNull Activity context, int resource,
                           @NonNull List<Student> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource= resource;
        this.list = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        convertView =  layoutInflater.inflate(resource,parent,false);
        TextView txtName= convertView.findViewById(R.id.tv_name_fragment_student_listview);
        txtName.setText(list.get(position).getHoten());
        return convertView;
    }
}
