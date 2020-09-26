package com.example.balancednews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        TextView txtTitle = findViewById(R.id.txtTitle);
        EditText editSearch = findViewById(R.id.editSearch);
        editSearch.getText().toString();

    }

    public void onBtnClick(View view) {

    }
}
