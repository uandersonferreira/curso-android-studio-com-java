package uanderson.com.br.curso.android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double num1 = 0, num2 = 0;
    private Button btn_somar, btn_subtrair, btn_multiplicar, btn_dividir;
    private TextView tv_resultado;
    private EditText et_valor1, et_valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Relaciona o código a view/tela


        // Associando os elementos da view ao código java que irá manipular eles.
        btn_somar = findViewById(R.id.btn_soma);
        btn_subtrair = findViewById(R.id.btn_subtrai);
        btn_multiplicar = findViewById(R.id.btn_multiplica);
        btn_dividir = findViewById(R.id.btn_divide);

        tv_resultado = findViewById(R.id.tv_resultado);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);
        /*
            Fazendo a associação de eventos de cliques nos botões através do proprio .xml
            android:onClick="dividir"
            Creio que esteja depreciado, pois aprece riscado, mas não deixa de ser uma forma válida
            de fazer a associação.
         */


/*        btn_somar.setOnClickListener(new View.OnClickListener() {
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
        });*/
    }//method onCreated

    public void somar(View view) {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 + num2)));
    }
    public void subtrair(View view) {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 - num2)));
    }

    public void multiplicar(View view) {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 * num2)));
    }

    public void dividir(View view) {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 / num2)));
    }


}//class

/*
TUDO está declarado/possui uma instância na class R

R.  layout      .activity_main
R,  categoria  , item que desejo ter acesso/utilizar
Button - componente do tipo View

 */