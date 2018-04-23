package com.example.dell.mini_moodle;

import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by DELL on 10/6/2017.
 */

public class pdf_isee extends Chap_isee {
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
        if(cname.equalsIgnoreCase("isee_chapter1"))
        {
            pdf_view("PDFs/i1.pdf");
        }
        else if(cname.equalsIgnoreCase("isee_chapter2"))
        {
            pdf_view("PDFs/i2.pdf");
        }
        else if(cname.equalsIgnoreCase("isee_chapter3"))
        {
            pdf_view("PDFs/i3.pdf");
        }
        else if(cname.equalsIgnoreCase("isee_chapter4"))
        {
            pdf_view("PDFs/i4.pdf");
        }
        else if(cname.equalsIgnoreCase("isee_chapter5"))
        {
            pdf_view("PDFs/i5.pdf");
        }
        else
        {
            pdf_view("PDFs/i6.pdf");
        }

    }

    public void pdf_view(String pdf_name)
    {
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).load();
    }

}
