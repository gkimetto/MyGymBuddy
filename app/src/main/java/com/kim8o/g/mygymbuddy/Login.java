package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class Login extends Activity {
    //@Override
//onCreate() gets called when the activity is created
    private EditText EditTtxtUserName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
//Call onUserLogin when the login button is pressed
    public void onUserSignup(View view){
        Intent intent = new Intent(this, User.class);

        Toast.makeText(Login.this, "Starting Profile Builder...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
//If the user enters a username and password


    public void onUserLogin(View view) {
        EditText messageView = (EditText) findViewById(R.id.etxt_username);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, DailyUpdate.class);
        intent.putExtra(User.EXTRA_MESSAGE, messageText);
        EditTtxtUserName = (EditText) findViewById(R.id.etxt_username);
        Toast.makeText(Login.this, "Authentication Succeeded...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void onUserForgotPassword(View view){
        //EditText messageView= (EditText)findViewById(R.id.etxt_username);
        //String messageText=messageView.getText().toString();
        Intent intent = new Intent(this, DailyUpdate.class);
        //intent.putExtra(User.EXTRA_MESSAGE,messageText);
        EditTtxtUserName=(EditText)findViewById(R.id.etxt_username);
        Toast.makeText(Login.this, "Password request sent...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


}
