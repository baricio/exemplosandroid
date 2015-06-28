package exercicio2.baricio.com.exercicio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TelaResultadoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);


        Double imc = getIntent().getDoubleExtra("imc",0);
        showMessage(imc);
    }

    private void showMessage(Double imc){

        String message;
        if(imc < 17){
            message = "Muito Abaixo do peso";
        }else if(imc >=17 && imc <=18.49){
            message = "Abaixo do peso";
        }else if(imc >=18.5 && imc <=24.99){
            message = "Peso Normal";
        }else if(imc >=25 && imc <=29.99){
            message = "Acima do peso";
        }else if(imc >=30 && imc <=34.99){
            message = "Obesidade I";
        }else if(imc >=35 && imc <=39.99){
            message = "Obesidade II (Severa)";
        }else{
            message = "Obesidade III (Mórbida)";
        }
        TextView txtCalculoPeso = (TextView) findViewById(R.id.txtCalculoPeso);
        txtCalculoPeso.setText(message);
    }


}
