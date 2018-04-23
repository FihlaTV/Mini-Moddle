package com.example.dell.mini_moodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/5/2017.
 */

public class Sub_sepm  extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            String str2 = getIntent().getStringExtra("s_id");

            if(str2.equalsIgnoreCase("Syllabus")){
                setContentView(R.layout.pdf_view);
                PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("PDFs/SEPM.pdf").load();
            }

            else if (str2.equalsIgnoreCase("UNIT_1")) {
                setContentView(R.layout.sepm_unit1);
                Button chap1 = (Button) findViewById(R.id.sepm_chapter1);
                Button chap2 = (Button) findViewById(R.id.sepm_chapter2);
                Button chap3 = (Button)findViewById(R.id.sepm_chapter3);
                UnitToChap(chap1);
                UnitToChap(chap2);
                UnitToChap(chap3);
            }
            else if (str2.equalsIgnoreCase("UNIT_2")) {
                setContentView(R.layout.sepm_unit2);
                Button chap4 = (Button) findViewById(R.id.sepm_chapter4);
                UnitToChap(chap4);
            }
            else if (str2.equalsIgnoreCase("UNIT_3")) {
                setContentView(R.layout.sepm_unit3);
                Button chap5 = (Button) findViewById(R.id.sepm_chapter5);
                Button chap6 = (Button)findViewById(R.id.sepm_chapter6);
                Button chap7 = (Button)findViewById(R.id.sepm_chapter7);
                UnitToChap(chap5);
                UnitToChap(chap6);
                UnitToChap(chap7);
            }
            else if (str2.equalsIgnoreCase("UNIT_4")) {
                setContentView(R.layout.sepm_unit4);
                Button chap8 = (Button) findViewById(R.id.sepm_chapter8);
                Button chap9 = (Button)findViewById(R.id.sepm_chapter9);
                UnitToChap(chap8);
                UnitToChap(chap9);
             }
            else if (str2.equalsIgnoreCase("UNIT_5")) {
                setContentView(R.layout.sepm_unit5);
                Button chap10 = (Button) findViewById(R.id.sepm_chapter10);
                Button chap11 = (Button)findViewById(R.id.sepm_chapter11);
                Button chap12 = (Button)findViewById(R.id.sepm_chapter12);
                UnitToChap(chap10);
                UnitToChap(chap11);
                UnitToChap(chap12);
            }
            else {
                setContentView(R.layout.sepm_unit6);
                Button chap13 = (Button) findViewById(R.id.sepm_chapter13);
                UnitToChap(chap13);
            }
    }

    public void UnitToChap(Button B_name) {

        B_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chapter = v.getResources().getResourceName(v.getId());
                String s = "com.example.dell.mini_moodle:id/";
                Intent intent = new Intent(getApplicationContext(), pdf_sdl.class);
                {
                    intent.putExtra("Chap",chapter.substring(s.length()));
                    startActivity(intent);
                }
            }
        });
    }
}
