package org.saungit.muhtar.buildinglayoutp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 0;
    Button btnMinus;
    TextView textNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMinus = (Button) findViewById(R.id.btn_minus);
        Button btnPlus = (Button) findViewById(R.id.btn_plus);
        Button btnSubmit = (Button) findViewById(R.id.btn_submit);
        textNumber = (TextView) findViewById(R.id.text_view_number);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = x+1;
                textNumber.setText(""+x);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    x = x - 1;
                    textNumber.setText(""+x);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("qty", String.valueOf(x));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnMinus.setEnabled(true);
    }
}
