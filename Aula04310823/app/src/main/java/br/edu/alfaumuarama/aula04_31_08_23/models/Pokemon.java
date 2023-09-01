package br.edu.alfaumuarama.aula04_31_08_23.models;

import br.edu.alfaumuarama.aula04_31_08_23.Config;

public class Pokemon {

    public String nome;
    public String url;

    public String imagem(){
       return "";
   }
    public int id(){
        if (url != null){
           String codigo = url.replace(Config.linkService, "") .replace("/", "");
           return Integer.parseInt(codigo);
        }
        return 0;
    }


}
