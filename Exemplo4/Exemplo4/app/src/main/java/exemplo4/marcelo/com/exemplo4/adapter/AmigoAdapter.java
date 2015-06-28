package exemplo4.marcelo.com.exemplo4.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import exemplo4.marcelo.com.exemplo4.R;
import exemplo4.marcelo.com.exemplo4.task.DownloadImagemTask;
import exemplo4.marcelo.com.exemplo4.to.TOAmigo;
import exemplo4.marcelo.com.exemplo4.to.TORede;

/**
 * Created by Administrador on 16/05/2015.
 */
public class AmigoAdapter extends BaseAdapter {

    private TORede rede;
    private Context context;

    public AmigoAdapter(TORede rede, Context context){
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

        TOAmigo t = rede.getLista().get(position);
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item_rede, null);

        final ImageView i = (ImageView) v.findViewById(R.id.avatar);

        DownloadImagemTask d = new DownloadImagemTask() {
            @Override
            protected void onPostExecute(Bitmap bitmap) {
                i.setImageBitmap(bitmap);
            }
        };

        d.execute(t.getAvatar());

        TextView txtAmigo = (TextView)v.findViewById(R.id.nome);
        txtAmigo.setText(t.getUsuario());

        return v;
    }
}
