package com.baose.fragment_tk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetailStudent extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View detailView = inflater.inflate(R.layout.fragment_detail_student,container,false);

        TextView txtName = detailView.findViewById(R.id.tv_name_fragment_student_detail);
        TextView txtNamsinh = detailView.findViewById(R.id.tv_birth_year_fragment_student_detail);
        TextView txtAddress = detailView.findViewById(R.id.tv_address_fragment_student_detail);
        TextView txtEmail = detailView.findViewById(R.id.tv_email_fragment_student_detail);
        Student student = (Student) getArguments().getSerializable("student");
        txtName.setText(student.getHoten());
        txtNamsinh.setText(student.getNamsinh()+"");
        txtAddress.setText(student.getDiachi());
        txtEmail.setText(student.getEmail());
        return  detailView;

    }
}
