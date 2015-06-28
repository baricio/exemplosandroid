package com.baricio.instagramfake.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baricio.instagramfake.R;
import com.baricio.instagramfake.task.DownloadImageTask;
import com.baricio.instagramfake.to.TOAmigo;
import com.baricio.instagramfake.to.TOPublicacao;
import com.baricio.instagramfake.to.TORede;


/**
 * Created by Fabricio on 21/06/2015.
 */
public class AmigoAdapter extends BaseAdapter {

    private TORede rede;
    private Context context;

    public AmigoAdapter(TORede rede, Context context) {
        this.rede = rede;
        this.context = context;
    }

    @Override
    public int getCount() {
        return rede.getLista().size();
    }

    @Override
    public Object getItem(int position) {
        return rede.getLista().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TOPublicacao tp = rede.getLista().get(position);

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item_list, null);

        int qdt = 0;

            final ImageView imagem = (ImageView) v.findViewById(R.id.imagem);
            TextView txtDescricao = (TextView) v.findViewById(R.id.descricao);

            TextView txtData = (TextView) v.findViewById(R.id.data);


            DownloadImageTask d = new DownloadImageTask(){
                @Override
                protected void onPostExecute(Bitmap bitMap){
                    imagem.setImageBitmap(bitMap);
                }
            };

            d.execute(tp.getImagem());

        if (tp.getLikes().size() > 0) {

            txtData.setText("Data : "+tp.getData());
            txtDescricao.setText(tp.getDescricao());

            //USUARIOS QUE CURTIRAM
            TextView txtUsuario1 = (TextView) v.findViewById(R.id.usuario);

            String nome = "";
            for (TOAmigo amigo : tp.getLikes()) {
                qdt ++;
                if (amigo.getUsuario()!= null) {
                    nome += "  |  " + amigo.getUsuario() ;
                    txtUsuario1.setText(nome);
                }
            }
        }

        return v;
    }
}
