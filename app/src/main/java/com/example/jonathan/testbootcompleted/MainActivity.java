package com.example.jonathan.testbootcompleted;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = " TBC " + "MainActivity";

  private TextView mTextView;
  private static String sActionName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.d(TAG, "onCreate: savedInstanceState=[" + savedInstanceState + "]");

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Get the Intent that started this activity and extract the string
    Intent intent = getIntent();

    if(sActionName == null) {
      sActionName = intent.getStringExtra("actionName");
      Log.v(TAG, "onCreate: sActionName=[" + sActionName + "]");
    }

    // Capture the layout's TextView
    mTextView = findViewById(R.id.tvActionName);
  }

  @Override
  protected void onResume() {
    Log.d(TAG, "onResume");

    super.onResume();

    Log.v(TAG, "onResume: sActionName=[" + sActionName + "]");

    // Set the string as its text
    mTextView.setText("[" + sActionName + "]");
  }

  @Override
  protected void onPause() {
    Log.d(TAG, "onPause");

    super.onPause();
  }

  @Override
  protected void onDestroy() {
    Log.d(TAG, "onDestroy");

    super.onDestroy();
  }
}
