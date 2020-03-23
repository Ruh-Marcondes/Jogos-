package br.com.marcondes.ruh.dclimite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class Perguntas extends AppCompatActivity{
    // Variveis


    public static int[] id = {0,1,2};
    public static String [] perguntas = {"No início da série a qual deus nordico os gemios haviam se dedicado?",
            "Qual o nome do navio que devia ser evitado a qualquer custo, segundo o Johann:",
            "Qual a especie do Dragão, na qual o dente era a chave do Olho de Dragão?"};

    public static String[] resposta = {"Loki",
            "O Ceifeiro",
            "Fantasma da Neve"};
    public static String[] alternativa2 = {"Odin",
            "O Cruzeiro",
            "Canção da Morte"};
    public static String[] alternativa3 = {"Thor",
            "O Justiceiro",
            "Terror dos Mares"};
    public static String[] alternativa4 = {"Sif",
            "O Cesteiro",
            "Terror da Neves"};
    public static String[] dificuldade = {"F","F","F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);

        ImageButton ib = findViewById(R.id.next);

        jogada();
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Ñ terminado",Toast.LENGTH_SHORT).show();
                jogada();
            }
        });
    }

    public static int a,
            b = 1,
            c = perguntas.length;
    public static int[] jafoi = new int[c];

    private void sorteio() {
        Random rg = new Random();
        a = rg.nextInt(c);
    }

    public void jogada(){
        TextView tw = findViewById(R.id.txtnumper);
        tw.setText((String.valueOf(b)));
        pergunta();
        b++;
    }
    private  void pergunta() {
        TextView tw1 = findViewById(R.id.txtpergunta);
        sorteio();
        tw1.setText(String.valueOf(perguntas[a]));

        /*if (jafoi[a] == null){
        sorteio();
        }else {
            jafoi[b-1] = id[c];
        }*/

    }
   
}