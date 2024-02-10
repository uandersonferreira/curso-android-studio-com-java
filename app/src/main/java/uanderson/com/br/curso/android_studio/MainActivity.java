package uanderson.com.br.curso.android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double valueTaca, valuePrato, valueGarfo, valueFaca, valueTotal;
    private EditText editTextTaca, editTextPrato, editTextGarfo, editTextFaca;
    private CheckBox checkBoxTaca, checkBoxPrato, checkBoxGarfo, checkBoxFaca;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Relaciona o código a view/tela

        // Associando os elementos da view ao código java que irá manipular eles.
        editTextTaca = findViewById(R.id.et_taca);
        editTextPrato = findViewById(R.id.et_prato);
        editTextGarfo = findViewById(R.id.et_garfo);
        editTextFaca = findViewById(R.id.et_faca);

        checkBoxTaca = findViewById(R.id.cb_tacas);
        checkBoxPrato = findViewById(R.id.cb_pratos);
        checkBoxGarfo = findViewById(R.id.cb_garfos);
        checkBoxFaca = findViewById(R.id.cb_facas);

        buttonCalcular = findViewById(R.id.btn_calcular);

        textViewResultado = findViewById(R.id.tv_resultado);

        //Associando manualmente valores a cada variavel dos "objeto"
        valueTaca = 0.25;
        valuePrato = 0.20;
        valueGarfo = 0.15;
        valueFaca = 0.15;
        valueTotal = 0.0;


        //Estou setando um novo valor: pego o valor atual do checkbox e concateno com o valor R$ do "objeto" - Taças: R$ + 0.25
        checkBoxTaca.setText(checkBoxTaca.getText().toString() + valueTaca);
        checkBoxPrato.setText(checkBoxPrato.getText().toString() + valuePrato);
        checkBoxGarfo.setText(checkBoxGarfo.getText().toString() + valueGarfo);
        checkBoxFaca.setText(checkBoxFaca.getText().toString() + valueFaca);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcucar();
            }
        });

    }//method onCreated

    public void calcucar(){
        valueTotal = 0.0;

        if (checkBoxTaca.isChecked()){
            valueTotal += valueTaca * Double.parseDouble(editTextTaca.getText().toString());
        }
        if (checkBoxPrato.isChecked()) {
            valueTotal += valuePrato * Double.parseDouble(editTextPrato.getText().toString());
        }
        if (checkBoxGarfo.isChecked()) {
            valueTotal += valueGarfo * Double.parseDouble(editTextGarfo.getText().toString());
        }
        if (checkBoxFaca.isChecked()) {
            valueTotal += valueFaca * Double.parseDouble(editTextFaca.getText().toString());
        }
        textViewResultado.setText("Valor total: R$ " + valueTotal);

    }
    /*
        Verificando manualmente cada um dos checkBox implementados e realizando o cálculo.
     */

}//class

