package com.example.dell.mini_moodle;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.media.AudioFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import static android.R.attr.start;

//Activity Variable
public class Login extends Activity {
    MediaPlayer mediaPlayer ;
	EditText user, pass;
	Button login, not_reg;
	DatabaseHandler db;
	Cursor cursor;

		@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginn);
            try {

                VideoView videoview = (VideoView) findViewById(R.id.videoView);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.test);
                videoview.setVideoURI(uri);
                videoview.start();
                videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.setLooping(true);
                    }
                });



            }catch (Exception e){
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
            }


       		user =(EditText)findViewById(R.id.eduser);
		pass = (EditText)findViewById(R.id.edpass);
		login =(Button)findViewById(R.id.login);
		not_reg =(Button)findViewById(R.id.not_reg);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				db=new DatabaseHandler(Login.this, null, null, 2);
			String username=user.getText().toString().trim();
			String password= pass.getText().toString();
			
			String StoredPassword =db.getregister(username);
			if(password.equals(StoredPassword)){

				Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_SHORT).show();
				startActivity(new Intent(getApplicationContext(),MainActivity.class));

			}
			else{
				Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_SHORT).show();
			user.setText("");
			pass.setText("");
			}
			
			
			}
		});

            not_reg.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub

                    startActivity(new Intent(getApplicationContext(), new_sign_up.class));
                }
            });

		}



}


