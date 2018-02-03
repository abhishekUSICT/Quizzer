package com.example.abhishekarora.quizzer;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.example.abhishekarora.quizzer.R;
public class MainActivity extends AppCompatActivity {
    public static int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView a = (TextView) findViewById(R.id.algo);
        a.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                x=1;
                Intent aIntent = new Intent(MainActivity.this, AlgoActivity.class);
                startActivity(aIntent);
            }
        });
        TextView b = (TextView) findViewById(R.id.ds);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                x=2;
                Intent bIntent = new Intent(MainActivity.this, AlgoActivity.class);
                startActivity(bIntent);
            }
        });
        TextView c = (TextView) findViewById(R.id.apti);

        c.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                x=3;
                Intent cIntent = new Intent(MainActivity.this, AlgoActivity.class);
                startActivity(cIntent);
            }
        });
        TextView d = (TextView) findViewById(R.id.math);
        d.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                x=4;
                Intent dIntent = new Intent(MainActivity.this, AlgoActivity.class);
                startActivity(dIntent);
            }
        });
    }
}
