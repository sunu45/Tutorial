package com.abc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//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
    private Button btnLogin;
    private EditText text1;
    private EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btnLogin = (Button) findViewById(R.id.loginButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Hello","hello world 1234");

                Intent intent = new Intent(getApplicationContext(), ActivitySecond.class);
                String message = "Hi from activity 1";//editText.getText().toString();
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);

         /*       AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to delete");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // on click
                        Log.d("alertdialog","you clicked yes");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Log.d("alertdialog","you clicked No");
                    }
                });
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("AlertDialogExample");
                alert.show();
                
          */
            }

        });

        Log.d("Activity life cycle","On create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity life cycle","On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity life cycle","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity life cycle","On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity life cycle","On stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity life cycle","On destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity life cycle","On restart");
    }
}