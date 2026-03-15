package TiposDeDados.aula06;
public class main{
    public static void main(String[] args) {
        String nome, vila, estado;
        int idade;
        boolean vivooumorto;
        nome = "Naruto";
        vila = "uchina";
        idade = 14;
        vivooumorto = false;

        if (vivooumorto == true){
            estado = "vivo";
        }else {
            estado = "morto";
        }
        System.out.printf("O nome é %s, tem %d, mora em %s, é esta %s%n", nome, idade,vila,estado);
    }
}