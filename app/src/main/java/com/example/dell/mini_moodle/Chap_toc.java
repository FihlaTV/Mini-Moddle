package com.example.dell.mini_moodle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DELL on 10/5/2017.
 */

public class Chap_toc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.units);
        Button unit1 = (Button) findViewById(R.id.UNIT_1);
        Button unit2 = (Button) findViewById(R.id.UNIT_2);
        Button unit3 = (Button) findViewById(R.id.UNIT_3);
        Button unit4 = (Button) findViewById(R.id.UNIT_4);
        Button unit5 = (Button) findViewById(R.id.UNIT_5);
        Button unit6 = (Button) findViewById(R.id.UNIT_6);
        Button syllabus = (Button) findViewById(R.id.Syllabus);
        subject_viewer(syllabus);
        subject_viewer(unit1);
        subject_viewer(unit2);
        subject_viewer(unit3);
        subject_viewer(unit4);
        subject_viewer(unit5);
        subject_viewer(unit6);
    }

    public void subject_viewer (Button btn)
    {try {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Sub_toc.class);
                {
                    String IdAs = v.getResources().getResourceName(v.getId());
                    String s = "com.example.dell.mini_moodle:id/";
                    Toast.makeText(getApplicationContext(), IdAs.substring(s.length()), Toast.LENGTH_SHORT).show();
                    intent.putExtra("s_id", IdAs.substring(s.length()));
                    startActivity(intent);
                }
            }
        });
    }
    catch (Exception e){
        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
    }
    }
}