package exercicio2.baricio.com.exercicio2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnCalcular){
            //Toast.makeText(this,"Calculando",Toast.LENGTH_LONG).show();
            EditText txtPeso = (EditText)findViewById(R.id.txtPeso);
            EditText txtAltura = (EditText)findViewById(R.id.txtAltura);

            Double peso = Double.valueOf(txtPeso.getText().toString());
            Double altura = Double.valueOf(txtAltura.getText().toString());

            Double imc = peso / (altura * 2);

            Intent i = new Intent(this,TelaResultadoActivity.class);
            i.putExtra("imc",imc);
            startActivity(i);


        }


    }
}
