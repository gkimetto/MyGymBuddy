package com.kim8o.g.mygymbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Equipment extends Activity {
    //onCreate() gets called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
    }
    //Call onUserLogin when the login button is pressed
    public void onUserSignup(View view){
        Intent intent = new Intent(this, User.class);
        startActivity(intent);
    }
//If the user enters a username and password


    public void onClickSave(View view){
        EditText messageView= (EditText)findViewById(R.id.etxt_username);
        String messageText=messageView.getText().toString();
        Intent intent = new Intent(this, User.class);
        intent.putExtra(User.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }
    public void onClickBack(View view){
        //EditText messageView= (EditText)findViewById(R.id.etxt_username);
        //String messageText=messageView.getText().toString();
        Intent intent = new Intent(this, DailyUpdate.class);
        //intent.putExtra(User.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }

}





