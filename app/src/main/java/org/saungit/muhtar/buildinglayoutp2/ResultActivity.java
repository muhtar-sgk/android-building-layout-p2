package org.saungit.muhtar.buildinglayoutp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String qty = intent.getStringExtra("qty");

        TextView textQty = (TextView)findViewById(R.id.text_view_qty);
        textQty.setText(qty);

        TextView textPrice = (TextView)findViewById(R.id.text_view_total_harga);
        int intQty = Integer.parseInt(qty);

        int total = intQty * 50000;

        textPrice.setText(String.valueOf(total));
    }
}
