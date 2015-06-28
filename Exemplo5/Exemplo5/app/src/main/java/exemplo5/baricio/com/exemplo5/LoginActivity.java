package exemplo5.baricio.com.exemplo5;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import exemplo5.baricio.com.exemplo5.fw.SharedPreferenceHelper;
import exemplo5.baricio.com.exemplo5.task.LoginTask;
import exemplo5.baricio.com.exemplo5.to.TOUsuario;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener{

    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void autentica(){
        TextView txtUsuario = (TextView)findViewById(R.id.txtUsuario);
        TextView txtSenha = (TextView)findViewById(R.id.txtSenha);

        final String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        pd = new ProgressDialog(this);
        pd.setMessage("Autenticando...");
        pd.show();

        LoginTask t = new LoginTask(){
            @Override
            protected void onPostExecute(TOUsuario toUsuario) {
                pd.hide();
                if(toUsuario != null){
                    SharedPreferenceHelper.write(LoginActivity.this,"user_preferences","user",usuario.toString());
                    Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Usuário e/ou senha inválidos",Toast.LENGTH_LONG);
                }
                super.onPostExecute(toUsuario);
            }
        };

    }

    @Override
    public void onClick(View v) {
        autentica();
    }
}
