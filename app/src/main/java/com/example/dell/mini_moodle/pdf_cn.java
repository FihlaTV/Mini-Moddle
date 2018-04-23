package com.example.dell.mini_moodle;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/6/2017.
 */

public class pdf_cn extends Chap_cn {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pdf_view);
            String message = getIntent().getStringExtra("Chap");
            pdf_checker(message);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void pdf_checker(String cname){
        if(cname.equalsIgnoreCase("cn_chapter1"))
        {
            pdf_view("PDFs/c1.pdf");
        }
        else if(cname.equalsIgnoreCase("cn_chapter2"))
        {
            pdf_view("PDFs/c2.pdf");
        }
        else if(cname.equalsIgnoreCase("cn_chapter3"))
        {
            pdf_view("PDFs/c3.pdf");
        }
        else if(cname.equalsIgnoreCase("cn_chapter4"))
        {
            pdf_view("PDFs/c4.pdf");
        }
        else if(cname.equalsIgnoreCase("cn_chapter5"))
        {
            pdf_view("PDFs/c5.pdf");
        }
        else if(cname.equalsIgnoreCase("cn_chapter7"))
        {
            pdf_view("PDFs/c7.pdf");
        }
        else
        {
            pdf_view("PDFs/c6.pdf");
        }

    }

    public void pdf_view(String pdf_name)
    {
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).load();
    }

}
