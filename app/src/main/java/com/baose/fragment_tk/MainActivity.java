package com.baose.fragment_tk;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction fragmentTransaction;
    FragmentListStudent fragmentListStudent;
    int displayMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        displayMode = getResources().getConfiguration().orientation;
        if(displayMode == 1){
            setContentView(R.layout.activity_main);
        }else{
            setContentView(R.layout.activity_main_land);
        }
        fragmentListStudent = new FragmentListStudent();

        manager = getSupportFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container_one,fragmentListStudent);
        fragmentTransaction.commit();
    }
}
