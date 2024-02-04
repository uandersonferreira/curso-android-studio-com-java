package uanderson.com.br.curso.android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1 = 0, num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Relaciona o código a view/tela


        // Associando os elementos da view ao código java que irá manipular eles.
        Button btn_somar = (Button) findViewById(R.id.btn_soma);
        Button btn_subtrair = (Button) findViewById(R.id.btn_subtrai);
        Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplica);
        Button btn_dividir = (Button) findViewById(R.id.btn_divide);

        TextView tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        EditText et_valor1 = (EditText) findViewById(R.id.et_valor1);
        EditText et_valor2 = (EditText) findViewById(R.id.et_valor2);

        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("DefaultLocale")
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                tv_resultado.setText(String.format("%.2f", (num1 + num2)));
            }
        });
        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("DefaultLocale")
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                tv_resultado.setText(String.format("%.2f", (num1 - num2)));
            }
        });
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("DefaultLocale")
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                tv_resultado.setText(String.format("%.2f", (num1 * num2)));

            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                tv_resultado.setText(String.format("%.2f", (num1 / num2)));
            }
        });
    }//method
}//class

/*
TUDO está declarado/possui uma instância na class R

R.  layout      .activity_main
R,  categoria  , item que desejo ter acesso/utilizar

 */