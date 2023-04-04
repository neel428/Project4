package edu.uga.cs.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class MainActivity extends AppCompatActivity {
    final String TAG = "CSVReading";
    private Button quizButton;
    private Button resultButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List res = new ArrayList<>();
        try {

            InputStream in_s = getAssets().open("country_continent.csv");

            CSVReader reader = new CSVReader(new InputStreamReader(in_s));
            String[] nextRow;
            int i = 0;
            while ((nextRow = reader.readNext()) != null) {

                String[] value = new String[194];
                value[i] = nextRow[i];
                i++;

            }
        }catch(Exception e){
                Log.e(TAG, e.toString());
            }

        quizButton = findViewById(R.id.button);
        resultButton = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);

        //Starts CountryActivity
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( view.getContext(), CountryQuiz.class );

                startActivity( intent );
            }
        });
    }


}