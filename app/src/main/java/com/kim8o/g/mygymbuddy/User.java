package com.kim8o.g.mygymbuddy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class User extends Activity {
    public static final String EXTRA_MESSAGE ="Username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=(TextView)findViewById(R.id.etxt_username);
        messageView.setText(messageText);
    }

    /*Spinner spinner = (Spinner) findViewById(R.id.snr_gender);
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.user_gender, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
    spinner.setAdapter(adapter);*/

        public void onClickContinue(View view){
            EditText messageView= (EditText)findViewById(R.id.etxt_username);
            String messageText=messageView.getText().toString();
            Intent intent = new Intent(this, DailyUpdate.class);
            intent.putExtra(User.EXTRA_MESSAGE,messageText);
            startActivity(intent);
        }
        public void onClickBack(View view){
            //EditText messageView= (EditText)findViewById(R.id.etxt_username);
            //String messageText=messageView.getText().toString();
            Intent intent = new Intent(this, Login.class);
            //intent.putExtra(User.EXTRA_MESSAGE,messageText);
            Toast.makeText(User.this, "Exiting MyGymBuddy...", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }

    }





