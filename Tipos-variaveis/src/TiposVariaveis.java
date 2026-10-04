public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //double salarioMinimo = 2500.00; // double é um tipo de dado que armazena números decimais

        short numeroCurto = 1; // short é um tipo de dado que armazena números inteiros pequenos
        int numeroNormal = numeroCurto; // int é um tipo de dado que armaz
        short numeroCurto2 = (short) numeroNormal; // casting, convertendo int para short

        int numero = 5; // int é um tipo de dado que armazena números inteiros
         numero = 10; 

        System.out.println(numero); // imprime o valor da variável numero


        final double VALOR_DE_PI = 3.14; // final é uma palavra reservada que indica que a variável não pode ser alterada
        System.out.println(VALOR_DE_PI); // imprime o valor da variável VALOR_DE_PI
        // VALOR_DE_PI = 15; // erro, não é possível alterar o valor de uma variável final


        


    }
}
