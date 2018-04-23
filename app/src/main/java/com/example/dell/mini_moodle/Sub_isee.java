package com.example.dell.mini_moodle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/5/2017.
 */

public class Sub_isee extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String str2 = getIntent().getStringExtra("s_id");

        if(str2.equalsIgnoreCase("Syllabus")){
            setContentView(R.layout.pdf_view);
            PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
            pdfView.fromAsset("PDFs/ISEE.pdf").load();

        }
        else if (str2.equalsIgnoreCase("UNIT_1")) {
            setContentView(R.layout.isee_unit1);
            Button chap1 = (Button) findViewById(R.id.isee_chapter1);
            UnitToChap(chap1);
        }
        else if (str2.equalsIgnoreCase("UNIT_2")) {
            setContentView(R.layout.isee_unit2);
            Button chap4 = (Button) findViewById(R.id.isee_chapter2);
            UnitToChap(chap4);
        }
        else if (str2.equalsIgnoreCase("UNIT_3")) {
            setContentView(R.layout.isee_unit3);
            Button chap5 = (Button) findViewById(R.id.isee_chapter3);
            UnitToChap(chap5);
        }
        else if (str2.equalsIgnoreCase("UNIT_4")) {
            setContentView(R.layout.isee_unit4);
            Button chap8 = (Button) findViewById(R.id.isee_chapter4);
            UnitToChap(chap8);
        }
        else if (str2.equalsIgnoreCase("UNIT_5")) {
            setContentView(R.layout.isee_unit5);
            Button chap10 = (Button) findViewById(R.id.isee_chapter5);
            UnitToChap(chap10);
        }
        else {
            setContentView(R.layout.isee_unit6);
            Button chap13 = (Button) findViewById(R.id.isee_chapter6);
            UnitToChap(chap13);
        }
    }

    public void UnitToChap(Button B_name) {

        B_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chapter = v.getResources().getResourceName(v.getId());
                String s = "com.example.dell.mini_moodle:id/";
                Intent intent = new Intent(getApplicationContext(), pdf_isee.class);
                {
                    intent.putExtra("Chap",chapter.substring(s.length()));
                    startActivity(intent);
                }
            }
        });
    }
}
