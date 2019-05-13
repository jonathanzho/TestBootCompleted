package com.example.jonathan.testbootcompleted;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {
  private static final String TAG = " TBC " + "BootCompletedReceiver";

  @Override
  public void onReceive(Context context, Intent intent) {
    String actionName = intent.getAction();

    Log.d(TAG, "onReceived: actionName=[" + actionName + "]");

    // Intent to start Activity from BroadcastReceiver
    Intent saIntent = new Intent(context, MainActivity.class);
    saIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);    // important to have this line
    saIntent.putExtra("actionName", actionName);

    // Start MainActivity
    context.startActivity(saIntent);
  }
}
