package com.example.handsonjavaappclockdigital;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtHoraAtual;

    private TextClock textView3, textView2;

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponentesDeLayout();

        capturarHoraAtual();

    }

    private void capturarHoraAtual() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtHoraAtual.setText("Hora: "+textView3.getText()+"\n\nHora: "+textView2.getText());

            }
        });

    }

    private void iniciarComponentesDeLayout() {

        txtHoraAtual = findViewById(R.id.txtHoraAtual);
        textView3 = findViewById(R.id.textView3);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
    }
}