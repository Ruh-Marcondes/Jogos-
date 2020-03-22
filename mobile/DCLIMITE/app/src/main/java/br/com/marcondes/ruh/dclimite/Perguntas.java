package br.com.marcondes.ruh.dclimite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Perguntas extends AppCompatActivity{
    // Variveis

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
        setContentView(R.layout.activity_main);

    }
}
