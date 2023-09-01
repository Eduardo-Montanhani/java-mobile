package br.edu.alfaumuarama.aula03_17_08_23;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContatoActivity extends AppCompatActivity {
    EditText edtAssunto, edtTexto;
    Button btnEnviar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inforamando para o java qual tela (XML) ele vai controlar
        setContentView(R.layout.activity_contato);

        //vinculando os objetos do java com as telas(xml)
        edtAssunto = findViewById(R.id.edtAssunto);
        edtTexto =findViewById(R.id.edtTexto);
        btnEnviar = findViewById(R.id.btnEnviar);

        //criando um listener para executar quando clicar no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });

    }
        private void enviar(){
            try {
                String[] emailPara = new String[] {"paramim@email.com.br"};
                String corpoMensagem = "Email enviado via app Android<br />" + edtTexto.getText();

                Intent telaEmail = new Intent(Intent.ACTION_SEND);
                telaEmail.setType("text/html");

                telaEmail.setType("message/rfc822");

                //titulo do email
                telaEmail.putExtra(Intent.EXTRA_SUBJECT,edtAssunto.getText().toString());
                //texto do email
                telaEmail.putExtra(Intent.EXTRA_TEXT,corpoMensagem);
                //para quem vou enviar
                telaEmail.putExtra(Intent.EXTRA_EMAIL, emailPara);

                startActivity(Intent.createChooser(telaEmail, "Enviar o Email"));

            }
            catch (Exception ex){

            }
        }
    }

