import java.util.Date;

public class Operators {
    public static void main(String[] args) {

        //Classificação de Operadores
        String name = "Leandro";
        int old = 22;
        double weight = 68.5;
        char gender = 'M';
        boolean organDonor = false;
        Date birthDate = new Date();

        //Aritiméricos
        double sum = 10.5 + 15.7;
        int subtraction = 113 - 25;
        int multiplication = 20 * 7;
        int division = 15 / 3;
        int module = 18 % 3;
        double result = (10 * 7) + (20 / 4);

        // Operador de adição em váriavéis do tipo texto
        String fullName = "LINGUAGEM" + "JAVA";

        int number = 5;

        //Imprimindo o numero negativo
        System.out.println(-number);

        //incrementando numero em mais 1 numero, imprime 6
        number++;
        System.out.println(number);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(number++);// ops algo de errado não está certo

        System.out.println(number);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++number);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        //Condição ternária

        int a, b;

        a = 5;
        b = 6;

       /* //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF / ELSE
        String result2;
        if (a == b)
            result2 = "verdadeiro";
        else
            result2 = "falso";*/

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String result2 = (a == b) ? "verdadeiro" : "falso";

        System.out.println(result2);

        // Operadores relacionais
        int number1 = 1;
        int number2 = 2;

        boolean yesOrNo = number1 == number2;

        System.out.println("Primeiro número é igual ao segundo? " + yesOrNo);

        yesOrNo = number1 != number2;

        System.out.println("Primeiro número é diferente do segundo? " + yesOrNo);

        yesOrNo = number1 > number2;

        System.out.println("Primeiro númeor é maior que o segundo? " + yesOrNo);

        String name1 = "Leandro";
        String name2 = new String("Leandro");

        System.out.println(name1.equals(name2));

        //Lógicos

        boolean condicao1 = true;

        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
        expressões.
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
