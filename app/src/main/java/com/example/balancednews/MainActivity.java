package com.example.balancednews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private TextView searchResults;
    private String API_KEY = "placeholder";
    private String TAG = "errorBalance";

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
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        String url = "http://newsapi.org/v2/top-headlines/apiKey=" + API_KEY;
        JsonObjectRequest jsonObjectrequest = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                searchResults.setText(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, error.toString());
            }
        });
        requestQueue.add(jsonObjectrequest);
    }
}
