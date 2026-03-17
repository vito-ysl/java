package TiposDeDados.aula06;

import java.util.Locale;

public class main{
    public static void main(String[] args) {
        /*
        Dados nao Primitivos: String, Array, Class e Enum.
        Objetivo: Cria um ninja, e atribuir metodos a ele.
         */
        String nomeNinja = "Naruto";
        String nomeNinjaUpperCase= nomeNinja.toUpperCase(); //colocar tudo em CAPSLOCK
        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();

        System.out.println("O nome do Ninja: "+ nomeNinjaUpperCase);
        System.out.println("Esse ninja e da: "+ aldeiaLowerCase);
    }
}
