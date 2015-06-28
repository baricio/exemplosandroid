package com.baricio.instagramfake;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ListView;

import com.baricio.instagramfake.adapter.AmigoAdapter;
import com.baricio.instagramfake.task.RedeTask;
import com.baricio.instagramfake.to.TORede;

public class MainActivity extends Activity {

    private ProgressDialog pd;
    private ListView listAmigos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAmigos = (ListView) findViewById(R.id.listAmigos);
        obterRede();
    }

    public void obterRede() {

        pd = new ProgressDialog(this);
        pd.setMessage("Carregando...");
        pd.show();

        RedeTask r = new RedeTask() {
            @Override
            protected void onPostExecute(TORede toRede) {

                pd.hide();

                if (toRede != null) {

                    AmigoAdapter adapter = new AmigoAdapter(toRede, MainActivity.this);
                    listAmigos.setAdapter(adapter);

                }

            }
        };

        r.execute("");

    }


}
