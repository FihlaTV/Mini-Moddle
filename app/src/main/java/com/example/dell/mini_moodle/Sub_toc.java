package com.example.dell.mini_moodle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/5/2017.
 */

public class Sub_toc extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        String str2 = getIntent().getStringExtra("s_id");
        if(str2.equalsIgnoreCase("Syllabus")){
            setContentView(R.layout.pdf_view);
            PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
            pdfView.fromAsset("PDFs/TOC.pdf").load();
        }

        else if (str2.equalsIgnoreCase("UNIT_1")) {
            setContentView(R.layout.work);
           // Button chap1 = (Button) findViewById(R.id.toc_chapter1);
           /// Button chap2 = (Button) findViewById(R.id.toc_chapter2);
           // UnitToChap(chap1);
            //UnitToChap(chap2);
        }
        else if (str2.equalsIgnoreCase("UNIT_2")) {
            setContentView(R.layout.work);
           // Button chap4 = (Button) findViewById(R.id.toc_chapter3);
         //   UnitToChap(chap4);
        }
        else if (str2.equalsIgnoreCase("UNIT_3")) {
            setContentView(R.layout.work);
            //Button chap5 = (Button) findViewById(R.id.toc_chapter4);
            //UnitToChap(chap5);
        }
        else if (str2.equalsIgnoreCase("UNIT_4")) {
            setContentView(R.layout.work);
           // Button chap8 = (Button) findViewById(R.id.toc_chapter6);
        ///    UnitToChap(chap8);
        }
        else if (str2.equalsIgnoreCase("UNIT_5")) {
            setContentView(R.layout.work);
            //Button chap10 = (Button) findViewById(R.id.toc_chapter5);
            //UnitToChap(chap10);
        }
        else {
            setContentView(R.layout.work);
         //   Button chap13 = (Button) findViewById(R.id.toc_chapter7);
           // UnitToChap(chap13);
        }
    }

    /*public void UnitToChap(Button B_name) {

        B_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chapter = v.getResources().getResourceName(v.getId());
                String s = "com.example.dell.mini_moodle:id/";
                Intent intent = new Intent(getApplicationContext(), pdf_toc.class);
                {
                    intent.putExtra("Chap",chapter.substring(s.length()));
                    startActivity(intent);
                }
            }
        });
   }*/
}


