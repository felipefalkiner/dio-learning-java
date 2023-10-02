package edu.falk.segundasemana;

public class MyClass {
    // https://glysns.gitbook.io/java-basico/sintaxe/anatomia-das-classes
    public static void main(String[] args) {

        String primeiroNome = "Felipe";
        String segundoNome = "Falkiner";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    // declaracao de função/metódo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        // return primeiroNome + " " + segundoNome;
        return "Resultado do metódo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
