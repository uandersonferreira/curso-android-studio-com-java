package uanderson.com.br.curso.android_studio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Relaciona o código a view/tela

        // Associando os elementos da view ao código java que irá manipular eles.
        Button btn = (Button) findViewById(R.id.button);
        TextView tv_nome = (TextView) findViewById(R.id.tv_nome);
        EditText et_nome = (EditText) findViewById(R.id.et_nome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegando o conteúdo do editText e passando para o TextView
                String nome = et_nome.getText().toString();
                tv_nome.setText(nome);
            }
        });
    }//method
}//class

/*
TUDO está declarado/possui uma instância na class R

R.  layout      .activity_main
R,  categoria  , item que desejo ter acesso/utilizar

 */