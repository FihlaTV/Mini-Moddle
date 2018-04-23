package com.example.dell.mini_moodle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String IdAsString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Button goo = (Button) findViewById(R.id.google);
            Button abt = (Button) findViewById(R.id.about);
            Button map = (Button) findViewById(R.id.google_map);
            ImageButton cn = (ImageButton) findViewById(R.id.CN);
            ImageButton dbms = (ImageButton) findViewById(R.id.DBMS);
            ImageButton isee = (ImageButton) findViewById(R.id.ISEE);
            ImageButton toc = (ImageButton) findViewById(R.id.TOC);
            ImageButton sepm = (ImageButton) findViewById(R.id.SEPM);
            goo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Google.class);
                    startActivity(intent);
                }
            });
             map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                    startActivity(intent);
                }
            });


            abt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {


                        Intent myintent = new Intent(getApplicationContext(), About_us.class);
                        startActivity(myintent);
                    }catch (Exception e)
                    {
                        Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

                    }
                }
            });
            unit_viewer(toc, Chap_toc.class);
            unit_viewer(cn, Chap_cn.class);
            unit_viewer(dbms, Chap_dbms.class);
            unit_viewer(isee, Chap_isee.class);
            unit_viewer(sepm, Chap_sdl.class);

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();


        }
    }
    public void unit_viewer (final ImageButton but , final Class<? extends Activity> ActivityToOpen){
        try {
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    IdAsString = v.getResources().getResourceName(v.getId());
                    String s = "com.example.dell.mini_moodle:id/";
                    Intent intent = new Intent(getApplicationContext(), ActivityToOpen);

                    {
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), IdAsString.substring(s.length()), Toast.LENGTH_SHORT).show();
                      //  startActivity(intent);
                       // finish();//FromChild(getParent(), new Intent(MainActivity.this , Sub_Units.class),1);
                    }

                }
            });
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

}
