package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayTransResult extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_trans_result);
        Intent intent = getIntent();
        String message = intent.getStringExtra("info");
        String message1 = intent.getStringExtra("info1");
        String message2 = intent.getStringExtra("infoamt");
        String message3= intent.getStringExtra("inforefnum");      String message4=intent.getStringExtra("infoextdata");
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        TextView textView1 = findViewById(R.id.textView2);
        textView1.setText(message1);
        TextView textView2 = findViewById(R.id.textView3);
        textView2.setText(message2);
        TextView textView3= findViewById(R.id.textView4);
        textView3.setText(message3);
        TextView textView4=findViewById(R.id.textView5);
        textView4.setText(message4);
}
}