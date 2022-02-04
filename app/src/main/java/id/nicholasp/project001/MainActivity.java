package id.nicholasp.project001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // langkah 1 : membuat objects: properties dan methods
    private Button btn_toast, btn_counter, btn_counterminus, btn_reset;
    private TextView txtDisplayValue;
    private int myValue = 0; // nilai awal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //langkah 2 : mengenalkan global variable dengan id dalam layout
        btn_toast = findViewById(R.id.btn_toast);
        btn_counter = findViewById(R.id.btn_counter);
        btn_counterminus = findViewById(R.id.btn_counterminus);
        btn_reset = findViewById(R.id.btn_reset);
        txtDisplayValue = findViewById(R.id.txtDisplayValue);

        //langkah 3 : event handling
        //event handling btn_toast
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode perintah dalam btn_toast
                Toast.makeText(MainActivity.this, "Anda mengklik tombol Toast",
                        Toast.LENGTH_LONG).show();
            }
        });

        //event handling btn_counter
        btn_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode perintah btn_counter
                myValue++;
                if (txtDisplayValue != null) {
                    txtDisplayValue.setText(Integer.toString(myValue));
                }
            }
        });

        btn_counterminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myValue--;
                if (txtDisplayValue != null) {
                    txtDisplayValue.setText(Integer.toString(myValue));
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myValue = 0;
                if (txtDisplayValue != null) {
                    txtDisplayValue.setText(Integer.toString(myValue));
                }
            }
        });
    }
}