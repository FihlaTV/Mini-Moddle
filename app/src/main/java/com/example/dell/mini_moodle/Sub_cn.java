package com.example.dell.mini_moodle;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/5/2017.
 */

public class Sub_cn  extends MainActivity {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String str2 = getIntent().getStringExtra("s_id");
        try{

            if(str2.equalsIgnoreCase("Syllabus")){
                setContentView(R.layout.pdf_view);
                pdf_view("PDFs/CN.pdf");
        }
        else if (str2.equalsIgnoreCase("UNIT_1")) {
            setContentView(R.layout.cn_unit1);
            Button chap1 = (Button) findViewById(R.id.cn_chapter1);
            UnitToChap(chap1);
        }
        else if (str2.equalsIgnoreCase("UNIT_2")) {
            setContentView(R.layout.cn_unit2);
            Button chap4 = (Button) findViewById(R.id.cn_chapter2);
            UnitToChap(chap4);
        }
        else if (str2.equalsIgnoreCase("UNIT_3")) {
            setContentView(R.layout.cn_unit3);
            Button chap5 = (Button) findViewById(R.id.cn_chapter3);
            UnitToChap(chap5);
        }
        else if (str2.equalsIgnoreCase("UNIT_4")) {
            setContentView(R.layout.cn_unit4);
            Button chap8 = (Button) findViewById(R.id.cn_chapter4);
            UnitToChap(chap8);
            Button chap9 = (Button) findViewById(R.id.cn_chapter5);
            UnitToChap(chap9);
        }
        else if (str2.equalsIgnoreCase("UNIT_5")) {
            setContentView(R.layout.cn_unit5);
            Button chap13 = (Button) findViewById(R.id.cn_chapter6);
            UnitToChap(chap13);
        }
        else {
            setContentView(R.layout.cn_unit6);
            Button chap13 = (Button) findViewById(R.id.cn_chapter7);
            UnitToChap(chap13);
        }
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }

    public void pdf_view(String str){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(str).load();
    }
    public void UnitToChap(Button B_name) {

        B_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chapter = v.getResources().getResourceName(v.getId());
                String s = "com.example.dell.mini_moodle:id/";
                Intent intent = new Intent(getApplicationContext(), pdf_cn.class);
                {
                    intent.putExtra("Chap",chapter.substring(s.length()));
                    startActivity(intent);
                }
            }
        });
    }
}
