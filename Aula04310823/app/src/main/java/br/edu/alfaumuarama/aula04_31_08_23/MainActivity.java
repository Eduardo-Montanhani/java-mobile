package br.edu.alfaumuarama.aula04_31_08_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import br.edu.alfaumuarama.aula04_31_08_23.datasource.BuscarDadosApi;
import br.edu.alfaumuarama.aula04_31_08_23.models.Pokemon;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> listaDados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            listaDados = new BuscarDadosApi().execute(Config.link).get();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        Pokemon pokemon = listaDados.get(0);
        Toast.makeText(this, pokemon.nome, Toast.LENGTH_SHORT).show();

    }
}