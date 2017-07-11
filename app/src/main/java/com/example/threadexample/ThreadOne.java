package com.example.threadexample;

import android.widget.TextView;

/**
 * Created by Praful Dhabekar on 7/11/2017.
 */


public class ThreadOne implements Runnable {

    TextView textView;

    public ThreadOne(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void run() {
        for (int i=0;i<10000000;i++){

            textView.setText(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
