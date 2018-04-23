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

public class pdf_toc extends Sub_toc {
    Intent myintent = new Intent(getApplicationContext(),work_in_progress.class);

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
        if(cname.equalsIgnoreCase("toc_chapter1"))
        {
            startActivity(myintent);
        }
        else if(cname.equalsIgnoreCase("toc_chapter2"))
        {
            //pdf_view("PDFs/d2.pdf");
            startActivity(myintent);
        }
        else if(cname.equalsIgnoreCase("toc_chapter3"))
        {
           // pdf_view("PDFs/d3.pdf");
            startActivity(myintent);
        }
        else if(cname.equalsIgnoreCase("toc_chapter4"))
        {
            //pdf_view("PDFs/d4.pdf");
            startActivity(myintent);
        }
        else if(cname.equalsIgnoreCase("toc_chapter5"))
        {
           // pdf_view("PDFs/d5.pdf");
            startActivity(myintent);
        }
        else
        {
            //pdf_view("PDFs/d6.pdf");
            startActivity(myintent);
        }

    }

    public void pdf_view(String pdf_name)
    {
        PDFView pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).load();
    }

}

