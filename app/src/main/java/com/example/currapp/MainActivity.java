package com.example.currapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner to,from;
    Button b1;
    EditText mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = findViewById(R.id.fromspiner);
        from = findViewById(R.id.tospiner);
        mytext= findViewById(R.id.montantxt);
        b1 = findViewById(R.id.convertbutton);
        String[] currencies = {"MAD","EURO","USD","YEN"};
        ArrayAdapter adapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,currencies);
        from.setAdapter(adapter1);
        to.setAdapter(adapter1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double res;
                Double money = Double.parseDouble(mytext.getText().toString());
                if (to.getSelectedItem().toString() == "MAD") {
                    switch (from.getSelectedItem().toString()) {
                        case "EURO":
                            res = money * 0.09;
                            Toast.makeText(getApplicationContext(), res.toString() + " euro", Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            res = money * 0.014;
                            Toast.makeText(getApplicationContext(), res.toString() + " euro", Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            res = money * 12.9;
                            Toast.makeText(getApplicationContext(), res.toString() + " euro", Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "You cant convert from MAD to MAD", Toast.LENGTH_LONG).show();
                    }
                } else if (from.getSelectedItem().toString() == "EURO") {
                    switch (to.getSelectedItem().toString()) {
                        case "MAD":
                            res = money * 11.09;
                            Toast.makeText(getApplicationContext(), res.toString() + "dh", Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            res = money * 1.06;
                            Toast.makeText(getApplicationContext(), res.toString() + "$", Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            res = money * 143.7;
                            Toast.makeText(getApplicationContext(), res.toString() + "yen", Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "You cant convert from EURO to EURO", Toast.LENGTH_LONG).show();
                    }
                } else if (from.getSelectedItem().toString() == "USD") {
                    switch (to.getSelectedItem().toString()) {
                        case "MAD":
                            res = money * 10.4;
                            Toast.makeText(getApplicationContext(), res.toString() + "dh", Toast.LENGTH_LONG).show();
                            break;
                        case "EURO":
                            res = money * 0.93;
                            Toast.makeText(getApplicationContext(), res.toString() + "euro", Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            res = money * 134.7;
                            Toast.makeText(getApplicationContext(), res.toString() + "yen", Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "You cant convert from USD to USD", Toast.LENGTH_LONG).show();
                    }
                } else if (from.getSelectedItem().toString() == "YEN") {
                    switch (to.getSelectedItem().toString()) {
                        case "MAD":
                            res = money * 0.077;
                            Toast.makeText(getApplicationContext(), res.toString() + "dh", Toast.LENGTH_LONG).show();
                            break;
                        case "EURO":
                            res = money * 0.0069;
                            Toast.makeText(getApplicationContext(), res.toString() + "euro", Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            res = money * 0.007;
                            Toast.makeText(getApplicationContext(), res.toString() + "$", Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "You cant convert from USD to USD", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        }


}
