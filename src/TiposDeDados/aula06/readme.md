# Tipos de Dados Primitivos e Não Primitivos

Este exemplo demonstra o uso de **tipos de dados em Java**, diferenciando variáveis que armazenam textos, números e valores lógicos. O objetivo é criar um pequeno programa que represente informações de um personagem (ninja), utilizando variáveis para armazenar seus dados.

No programa são utilizados:

- `String` (tipo não primitivo) para armazenar texto, como nome e vila.
- `int` (tipo primitivo) para armazenar números inteiros, como idade.
- `boolean` (tipo primitivo) para representar um valor lógico que indica se o personagem está vivo ou morto.

Com base no valor booleano, o programa define o estado do personagem e exibe uma frase com todas as informações.

## Exemplo de código

```java
package TiposDeDados.aula06;

public class Main {
    public static void main(String[] args) {

        String nome, vila, estado;
        int idade;
        boolean vivoOuMorto;

        nome = "Naruto";
        vila = "Uchiha";
        idade = 14;
        vivoOuMorto = false;

        if (vivoOuMorto) {
            estado = "vivo";
        } else {
            estado = "morto";
        }

        System.out.printf(
            "O nome é %s, tem %d anos, mora em %s e está %s.%n",
            nome, idade, vila, estado
        );
    }
}