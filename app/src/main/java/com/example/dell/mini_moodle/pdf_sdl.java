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

public class pdf_sdl extends  Chap_sdl {

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
        if(cname.equalsIgnoreCase("sepm_chapter1"))
        {
            pdf_view("PDFs/s1.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter2"))
        {
            pdf_view("PDFs/s2.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter3"))
        {
            pdf_view("PDFs/s3.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter4"))
        {
            pdf_view("PDFs/s4.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter5"))
        {
            pdf_view("PDFs/s5.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter6"))
        {
            pdf_view("PDFs/s6.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter7"))
        {
            pdf_view("PDFs/s7.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter8"))
        {
            pdf_view("PDFs/s8.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter9"))
        {
            pdf_view("PDFs/s9.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter10"))
        {
            pdf_view("PDFs/s10.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter11"))
        {
            pdf_view("PDFs/s11.pdf");
        } else if(cname.equalsIgnoreCase("sepm_chapter12"))
        {
            pdf_view("PDFs/s12.pdf");
        }
        else if(cname.equalsIgnoreCase("sepm_chapter13"))
        {
            pdf_view("PDFs/s13.pdf");
        }


    }

    public void pdf_view(String pdf_name)
    {
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).load();
    }

}

