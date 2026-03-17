package TiposDeDados.aula07;
class main{
    public static void main(String[] args) {
        String nome, missao, statusmissao;
        int idade, nivelDificuldade;
        boolean status;
        nome = "naruto";
        idade = 19;
        missao = "ser o melhor";
        nivelDificuldade = 5;
        status = false;
        if (status){
            statusmissao = "Missao Completa!!";
        }else {
            statusmissao = "Missao incompleta!";
        }
        System.out.println(
                " O nome do Ninja: " + nome +
                        " idade : " + idade +
                        " sua missão : " + missao +
                        " Nivel de Dificuldade :" + nivelDificuldade +
                        " Status: "+ statusmissao
        );
        nome = "fulano";
        idade = 19;
        missao = "ser o melhor";
        nivelDificuldade = 5;
        status = true;
        if (status){
            statusmissao = "Missao Completa!!";
        }else {
            statusmissao = "Missao incompleta!";
        }
        System.out.println(
                " O nome do Ninja: " + nome +
                        " idade : " + idade +
                        " sua missão : " + missao +
                        " Nivel de Dificuldade :" + nivelDificuldade +
                        " Status: "+ statusmissao
        );
        nome = "pedro";
        idade = 19;
        missao = "ser o melhor";
        nivelDificuldade = 5;
        status = false;
        if (status){
            statusmissao = "Missao Completa!!";
        }else {
            statusmissao = "Missao incompleta!";
        }
        System.out.println(
                        " O nome do Ninja: " + nome +
                        " idade : " + idade +
                        " sua missão : " + missao +
                        " Nivel de Dificuldade :" + nivelDificuldade +
                        " Status: "+ statusmissao
        );



    }
}
