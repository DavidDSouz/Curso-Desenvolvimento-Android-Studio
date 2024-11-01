package com.example.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private TextView txtAutor;
    private TextView txtEditora;
    private TextView txtPaginas;
    private TextView txtLocalizacao;

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

        iniciarComponentesDoLayout();

        criarObjetos();
    }

    private void iniciarComponentesDoLayout() {

        txtAutor = findViewById(R.id.txtAutor);
        txtEditora = findViewById(R.id.txtEditora);
        txtPaginas = findViewById(R.id.txtPaginas);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);
        txtTitulo = findViewById(R.id.txtTitulo);
    }

    public void criarObjetos(){

        Livro objLivro = new Livro();

        objLivro.setAutor("Marco Maddo");
        objLivro.setTitulo("POO Encapsulamento Seguro em Java");
        objLivro.setEditora("Mundial POO");
        objLivro.setPaginas(140);
        objLivro.setLocalizacao("P1P1");

        Log.i("POO","Obj Livro: Autor: "+objLivro.getAutor());
        Log.i("POO","Obj Livro: Titulo: "+objLivro.getTitulo());
        Log.i("POO","Obj Livro: Editora: "+objLivro.getEditora());
        Log.i("POO","Obj Livro: Paginas: "+objLivro.getPaginas());
        Log.i("POO","Obj Livro: Localizacao: "+objLivro.getLocalizacao());


        txtAutor.setText(objLivro.getAutor());
        txtEditora.setText(objLivro.getEditora());
        txtPaginas.setText(objLivro.getPaginas()+"");
        txtLocalizacao.setText(objLivro.getLocalizacao());
        txtTitulo.setText(objLivro.getTitulo());


    }


}