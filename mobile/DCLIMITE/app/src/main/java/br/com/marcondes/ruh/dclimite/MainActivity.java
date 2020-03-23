package br.com.marcondes.ruh.dclimite;

import android.content.Intent;
import android.media.session.MediaSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Visibilidade dos botões e do text
        final ImageButton btn = (ImageButton) findViewById(R.id.btn_facil);
        btn.setVisibility(View.INVISIBLE);
        final ImageButton btn1 = findViewById(R.id.btn_médio);
        btn1.setVisibility(View.INVISIBLE);
        final ImageButton btn2 = findViewById(R.id.btn_dificil);
        btn2.setVisibility(View.INVISIBLE);
        final TextView tw = findViewById(R.id.txt_f);
        tw.setVisibility(View.INVISIBLE);
        final TextView tw1 = findViewById(R.id.txt_m);
        tw1.setVisibility(View.INVISIBLE);
        final TextView tw2 = findViewById(R.id.txt_D);
        tw2.setVisibility(View.INVISIBLE);

        // Voltar a visibilidade quando click
        Button bt = (Button) findViewById(R.id.btn_start);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setVisibility(View.VISIBLE);
                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                tw.setVisibility(View.VISIBLE);
                tw1.setVisibility(View.VISIBLE);
                tw2.setVisibility(View.VISIBLE);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Perguntas.class));
                //Toast.makeText(getApplicationContext(),"Ñ terminado",Toast.LENGTH_SHORT).show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ñ terminado",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ñ terminado",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

