package calculator.baricio.com.exemplo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView)findViewById(R.id.txtResultado);

        //Botões de ação
        Button btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
        Button btnMaisMenos = (Button)findViewById(R.id.btnMaisMenos);
        btnMaisMenos.setOnClickListener(this);
        Button btnPorcentagem = (Button)findViewById(R.id.btnPorcentagem);
        btnPorcentagem.setOnClickListener(this);
        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);
        Button btnVezes = (Button)findViewById(R.id.btnVezes);
        btnVezes.setOnClickListener(this);
        Button btnMais = (Button)findViewById(R.id.btnMais);
        btnMais.setOnClickListener(this);
        Button btnMenos = (Button)findViewById(R.id.btnMais);
        btnMenos.setOnClickListener(this);
        Button btnIgual = (Button)findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(this);

        //Botões numerais
        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                txtResultado.setText("0");
                break;
            case R.id.btn1:
                txtResultado.setText("1");
                break;
            case R.id.btn2:
                txtResultado.setText("2");
                break;
            case R.id.btn3:
                txtResultado.setText("3");
                break;
            case R.id.btn4:
                txtResultado.setText("4");
                break;
            case R.id.btn5:
                txtResultado.setText("5");
                break;
            case R.id.btn6:
                txtResultado.setText("6");
                break;
            case R.id.btn7:
                txtResultado.setText("7");
                break;
            case R.id.btn8:
                txtResultado.setText("8");
                break;
            case R.id.btn9:
                txtResultado.setText("9");
                break;
        }
    }
}
