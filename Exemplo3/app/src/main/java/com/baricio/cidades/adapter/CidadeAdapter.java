package com.baricio.cidades.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.baricio.cidades.R;
import com.baricio.cidades.to.TOCidade;

import java.util.List;

/**
 * Created by Fabricio on 25/06/2015.
 */
public class CidadeAdapter  extends BaseAdapter {

    private List<TOCidade> lista;
    private Context context;

    public CidadeAdapter(List<TOCidade> lista, Context context)
    {
        this.lista = lista;
        this.context = context;
    }



    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TOCidade c = lista.get(position);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item_list, null);

        TextView txtCidade = (TextView)v.findViewById(R.id.txtEstado);
        txtCidade.setText(c.getNome());

        return v;
    }
}
