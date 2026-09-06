package com.modernpoetry.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Modern Poetry\n\nခေတ်ပေါ်ကဗျာများမှ ကြိုဆိုပါတယ်");
        text.setTextSize(24);
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);
        text.setPadding(30, 30, 30, 30);

        setContentView(text);
    }
}
