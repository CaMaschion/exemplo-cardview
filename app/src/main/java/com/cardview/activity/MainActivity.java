package com.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cardview.R;
import com.cardview.adapter.PostagemAdapter;
import com.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager );

        //outras formas de layout

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //recyclerPostagem.setLayoutManager( layoutManager );

        //configurar adapter
        this.prepararPostagem();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter( adapter );

    }

    public void prepararPostagem(){

        Postagem p = new Postagem("Leo Martins", "Nas nuvens", R.drawable.imagem1);
        this.postagens.add (p);


        p = new Postagem("Hotel LM", "Viaje e aproveite nossos descontos", R.drawable.imagem2);
        this.postagens.add (p);

        p = new Postagem("Maria Luiza", "#Paris!!!", R.drawable.imagem3);
        this.postagens.add (p);


        p = new Postagem("Marcos Paulo", "Que foto linda", R.drawable.imagem4);
        this.postagens.add (p);
    }
}