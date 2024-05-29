package com.example.telalogin;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;
    private RadioGroup opcaoSexo;

    //RadioButton
    private RadioButton sexoMaculino, sexoFeminio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        //CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminio = findViewById(R.id.radioButtonF);
        sexoMaculino = findViewById(R.id.radioButtonM);
        opcaoSexo  = findViewById(R.id.radioGroupSexo);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }

    public void radioButton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i ) {
                
            }
        });

        /*
        if (sexoMaculino.isChecked()) {
            textoResultado.setText(" Maculino ");
        } else if (sexoFeminio.isChecked()) {
            textoResultado.setText(" Feminio ");

        }

         */
    }
    public void enviar(View view) {

        //radioButton();

       // checkBox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText( " nome: " + nome + " email: " + email );

         */
    }


    public void checkBox(){

        String texto = "";
        if (checkVerde.isChecked() ){
            texto = "Verde selecionado - ";

        }
        if (checkBranco.isChecked() ){
            texto = texto + "Branco selecionado - ";

        }
        if (checkVermelho.isChecked() ){
            texto = texto + "Vermelho selecionado - ";

        }
        textoResultado.setText(texto);

    }


    public void limpar( View view ){

        campoNome.setText("");
        campoEmail.setText("");

    }

}