package uanderson.com.br.curso.android_studio;

import androidx.appcompat.app.AppCompatActivity;

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

    }//method onCreated

    public void somar() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 + num2)));
    }
    public void subtrair() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 - num2)));
    }

    public void multiplicar() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 * num2)));
    }

    public void dividir() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        tv_resultado.setText(String.format("%.2f", (num1 / num2)));
    }

    public void opera(View button){
            if (button.getId() == R.id.btn_soma){
                somar();
            } else if (button.getId() == R.id.btn_subtrai) {
                subtrair();
            } else if (button.getId() == R.id.btn_multiplica) {
                multiplicar();
            }else {
                dividir();
            }
    }
    /*
        Nesta abordagem criamos um method e associamos a todos os botões
        da nossa view e através do "id" de cada um fazemos a verificação
        para saber qual foi o clicado e então chamar o method correspondenete
        a operação desejada. Pode ser utilizar o if else ou switch case.
     */


}//class

/*
TUDO está declarado/possui uma instância na class R

R.  layout      .activity_main
R,  categoria  , item que desejo ter acesso/utilizar
Button - componente do tipo View

 */