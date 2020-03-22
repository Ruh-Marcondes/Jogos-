package br.com.marcondes.ruh.dclimite.bancodedados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDadosCriar extends SQLiteOpenHelper {

    private static final String Nome_Banco = "DCLimite";
    //tabela perguntas
    protected static final String TABELA = "Perguntas";
    private static final String ID = "_id";
    protected static final String pergunta = "perguntas";
    protected static final String resposta = "resposta";
    protected static final String dificuldade = "dificuldade";
    protected static final String alternativa2 = "alternativa2";
    protected static final String alternativa3 = "alternativa3";
    protected static final String alternativa4 = "alternativa4";
    private static final int VERSAO = 1;

    public BancoDadosCriar(Context context) {
        super(context,Nome_Banco,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE " + TABELA+"("+
                ID + "int not null auto_increment,"+
                pergunta +"VARCHAR(250) NOT NULL,"+
                resposta+"VARCHAR(100) NOT NULL,"+
                dificuldade+"ENUM('F','M','D') NOT NULL,"+
                alternativa2+"VARCHAR(100) NOT NULL,"+
                alternativa3+"VARCHAR(100) NOT NULL,"+
                alternativa4+"VARCHAR(100) NOT NULL,"+
                "PRIMARY KEY ("+ID+"));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+TABELA);
            onCreate(db);
    }
}
