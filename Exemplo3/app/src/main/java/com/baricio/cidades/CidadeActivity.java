package com.baricio.cidades;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.baricio.cidades.adapter.CidadeAdapter;
import com.baricio.cidades.to.TOCidade;

import java.util.ArrayList;
import java.util.List;

public class CidadeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade);

        String estado = getIntent().getStringExtra("estado");

        List<TOCidade> l = new ArrayList<>();
        ListView listCidade = (ListView) findViewById(R.id.listCidades);

        if (estado.equals("São Paulo")){
            l.add(new TOCidade("São Paulo"));
            l.add(new TOCidade("São Caetano"));
            l.add(new TOCidade("Santos"));
        }
        else if (estado.equals("Rio de Janeiro")){
            l.add(new TOCidade("Rio de Janeiro"));
            l.add(new TOCidade("Trindade"));
            l.add(new TOCidade("Parati"));
        }
        else if (estado.equals("Minas Gerais")){
            l.add(new TOCidade("Belo Horizonte"));
            l.add(new TOCidade("Divinopolis"));
            l.add(new TOCidade("Uberlandia"));
        }
        else if (estado.equals("Acre")){
            l.add(new TOCidade("Acrelandia"));
            l.add(new TOCidade("Assis Brasil"));
            l.add(new TOCidade("Capixaba"));
        }
        CidadeAdapter adapter = new CidadeAdapter(l,this);
        listCidade.setAdapter(adapter);
    }

}
