package com.project.retest;

import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class testUtil {
    private Context context;

    private static Toast toast;

    public testUtil(Context context) {
        this.context = context;
    }


    public void showToast(String msg) {
        Toast myToast = Toast.makeText(context,msg, Toast.LENGTH_SHORT);
        myToast.show();

    }
}
