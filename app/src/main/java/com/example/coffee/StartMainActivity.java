package com.example.coffee;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartMainActivity extends Activity implements View.OnClickListener{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        button = findViewById(R.id.button3);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(StartMainActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
