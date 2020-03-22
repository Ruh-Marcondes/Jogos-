package br.com.marcondes.ruh.dclimite.bancodedados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {

    private SQLiteDatabase db;
    private BancoDadosCriar banco;

    public BancoController (Context context){
        banco = new BancoDadosCriar(context);
    }

    public String insereDado(String pergunta, String resposta, String dificuldade,
                             String alternativa2, String alternativa3, String alternativa4){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(BancoDadosCriar.pergunta,pergunta);
        valores.put(BancoDadosCriar.resposta,resposta);
        valores.put(BancoDadosCriar.alternativa2,alternativa2);
        valores.put(BancoDadosCriar.alternativa3,alternativa3);
        valores.put(BancoDadosCriar.alternativa4,alternativa4);
        valores.put(BancoDadosCriar.dificuldade,dificuldade);

        resultado = db.insert(BancoDadosCriar.TABELA,null,valores);
        db.close();

        if (resultado == -1){
            return "Erro ao inserir registro";
        }else {
            return "Registro inserido com sucesso";
        }
    }
}
