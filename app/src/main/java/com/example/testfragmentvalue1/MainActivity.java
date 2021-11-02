package com.example.testfragmentvalue1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this::showDialog);
    }

    public void showDialog(View view) {
        DialogFragment dialogFragment = new MyDialogFragment();

        Bundle args = new Bundle();
        args.putString("title", "こんにちは");
        args.putInt("number", 123);
        dialogFragment.setArguments(args);

        dialogFragment.show(getSupportFragmentManager(), "my_dialog");
    }
}