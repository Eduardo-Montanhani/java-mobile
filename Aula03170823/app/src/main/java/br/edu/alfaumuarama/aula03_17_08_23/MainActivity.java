package br.edu.alfaumuarama.aula03_17_08_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //vinculando o objeto button do java com a tela (xml)
       btnContato = findViewById(R.id.btnContato);

       //Criando um lister para verificar quando clicar no botao
       btnContato.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               abrirTelaContato();
           }
       });
    }

    private void abrirTelaContato() {
        //criando o caminho(URL) para a tela de  contato
        Intent telaContato = new Intent(MainActivity.this, ContatoActivity.class);
        //abrindo a tela de contato(executando p caminho criado acima)
        startActivity(telaContato);
    }
}