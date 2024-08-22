public class Testeidade {
    public static void main(String[] args) {
        int idade;
        idade = 29;
        System.out.println(idade); // imprime idade
        int idadeAnoQuevem = idade + 1;
        System.out.println(idadeAnoQuevem);
        double pi = 3.14;
        int raio = 5;
        double result = 2 * raio * pi;

        System.out.println(result == 31.4 );
        boolean menordeidade = idade >= 18;
        System.out.println(menordeidade);
    }
}