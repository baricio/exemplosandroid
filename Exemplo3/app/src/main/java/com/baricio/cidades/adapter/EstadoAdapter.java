package com.baricio.cidades.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.baricio.cidades.R;
import com.baricio.cidades.to.TOEstado;

import java.util.List;

/**
 * Created by Fabricio on 25/06/2015.
 */

public class EstadoAdapter  extends BaseAdapter
{
    private List<TOEstado> lista;
    private Context context;

    public EstadoAdapter(List<TOEstado> lista, Context context)
    {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return lista.size(); // informa quantos elementos tem na lista
    }

    @Override
    public Object getItem(int position)
    {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)  // desenha os elementos da tela
    {
        TOEstado estado = lista.get(position);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item_list, null);

        TextView txtEstado = (TextView)v.findViewById(R.id.txtEstado);
        txtEstado.setText(estado.getNome());

        return v;
    }
}
