package com.baricio.cidades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.baricio.cidades.adapter.EstadoAdapter;
import com.baricio.cidades.to.TOEstado;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listEstado;
    private List<TOEstado> l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEstado = (ListView)findViewById(R.id.listEstados);

        l = new ArrayList<>();
        l.add(new TOEstado("Minas Gerais"));
        l.add(new TOEstado("Rio de Janeiro"));
        l.add(new TOEstado("São Paulo"));
        l.add(new TOEstado("Acre"));

        EstadoAdapter adapter = new EstadoAdapter(l, this);

        listEstado.setAdapter(adapter);
        listEstado.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TOEstado t = l.get(position);
        Intent i = new Intent (this, CidadeActivity.class);
        i.putExtra("estado", t.getNome());
        startActivity(i);
    }
}
