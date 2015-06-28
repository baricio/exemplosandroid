package exemplo4.marcelo.com.exemplo4;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import exemplo4.marcelo.com.exemplo4.adapter.AmigoAdapter;
import exemplo4.marcelo.com.exemplo4.task.RedeTask;
import exemplo4.marcelo.com.exemplo4.to.TORede;


public class MainActivity extends ActionBarActivity {

    private ProgressDialog pd;
    private ListView listAmigos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listAmigos = (ListView)findViewById(R.id.listAmigos);
        obterRede();
    }

        public void obterRede(){
           pd = new ProgressDialog(this);
           pd.setMessage("Carregando...");
           pd.show();

            RedeTask r = new RedeTask(){
                @Override
                protected void onPostExecute(TORede toRede){
                    pd.hide();
                    if (toRede != null) {

                        AmigoAdapter adapter = new AmigoAdapter(toRede, MainActivity.this);
                        listAmigos.setAdapter(adapter);
                    }

                }

            };
           r.execute("");
        }


//
}
