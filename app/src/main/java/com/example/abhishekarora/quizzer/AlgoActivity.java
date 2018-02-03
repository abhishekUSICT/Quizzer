package com.example.abhishekarora.quizzer;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.example.abhishekarora.quizzer.R;
import java.util.ArrayList;

public class AlgoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        TextView a = (TextView) findViewById(R.id.lone);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (MainActivity.x)
                {
                    case 1:Intent aIntent = new Intent(AlgoActivity.this, q11.class);
                        startActivity(aIntent);
                        break;
                    case 2:Intent bIntent = new Intent(AlgoActivity.this, q21.class);
                        startActivity(bIntent);
                        break;
                    case 3:Intent cIntent = new Intent(AlgoActivity.this, q31.class);
                        startActivity(cIntent);
                        break;
                    case 4:Intent dIntent = new Intent(AlgoActivity.this, q41.class);
                        startActivity(dIntent);
                        break;
                }
            }
        });
        TextView b = (TextView) findViewById(R.id.ltwo);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (MainActivity.x)
                {
                    case 1:Intent aIntent = new Intent(AlgoActivity.this, q12.class);
                        startActivity(aIntent);
                        break;
                    case 2:Intent bIntent = new Intent(AlgoActivity.this, q22.class);
                        startActivity(bIntent);
                        break;
                    case 3:Intent cIntent = new Intent(AlgoActivity.this, q32.class);
                        startActivity(cIntent);
                        break;
                    case 4:Intent dIntent = new Intent(AlgoActivity.this, q42.class);
                        startActivity(dIntent);
                        break;
                }
            }
        });

             // 8 more activities to be created

        TextView c = (TextView) findViewById(R.id.lthree);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (MainActivity.x)
                {
                    case 1:Intent aIntent = new Intent(AlgoActivity.this, q11.class);
                        startActivity(aIntent);
                        break;
                    case 2:Intent bIntent = new Intent(AlgoActivity.this, q21.class);
                        startActivity(bIntent);
                        break;
                    case 3:Intent cIntent = new Intent(AlgoActivity.this, q31.class);
                        startActivity(cIntent);
                        break;
                    case 4:Intent dIntent = new Intent(AlgoActivity.this, q41.class);
                        startActivity(dIntent);
                        break;
                }
            }
        });
        TextView d = (TextView) findViewById(R.id.lfour);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (MainActivity.x)
                {
                    case 1:Intent aIntent = new Intent(AlgoActivity.this, q11.class);
                        startActivity(aIntent);
                        break;
                    case 2:Intent bIntent = new Intent(AlgoActivity.this, q21.class);
                        startActivity(bIntent);
                        break;
                    case 3:Intent cIntent = new Intent(AlgoActivity.this, q31.class);
                        startActivity(cIntent);
                        break;
                    case 4:Intent dIntent = new Intent(AlgoActivity.this, q41.class);
                        startActivity(dIntent);
                        break;
                }
            }
        });
    }

}
