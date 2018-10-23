package com.baose.fragment_tk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentListStudent extends Fragment{

    ListView listViewStudent;
    List<Student> studenList;
    FragmentManager manager;
    FragmentTransaction transaction;
    int displaymode;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View View_FragmentListStudent = inflater.inflate(R.layout.fragment_list_student,container,false);
        displaymode=getActivity().getResources().getConfiguration().orientation;
        manager = getActivity().getSupportFragmentManager();
        listViewStudent = View_FragmentListStudent.findViewById(R.id.lv_listStudent);
        studenList  = new ArrayList();
        studenList.add(new Student("Nguyen Van A",1999, "Nha khong co", "abc@gmail.com"));
        studenList.add(new Student("Nguyen Van B",1999, "Nha khong co", "abc@gmail.com"));
        studenList.add(new Student("Nguyen Van C",1999, "Nha khong co", "abc@gmail.com"));
        studenList.add(new Student("Nguyen Van D",1999, "Nha khong co", "abc@gmail.com"));
        StudentAddapter studentAddapter = new StudentAddapter(getActivity(),R.layout.viewchild_listview_student,studenList);
        listViewStudent.setAdapter(studentAddapter);
        listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = studenList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("student",student);
                FragmentDetailStudent fragmentDetailStudent = new FragmentDetailStudent();
                fragmentDetailStudent.setArguments(bundle);
                transaction = manager.beginTransaction();
                if(displaymode==1){
                    transaction.replace(R.id.fragment_container_one,fragmentDetailStudent);
                }else {
                    transaction.replace(R.id.fragment_container_two,fragmentDetailStudent);
                }
                transaction.commit();
            }
        });
        return View_FragmentListStudent;
    }

}
