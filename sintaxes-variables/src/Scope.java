public class Scope {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int age = 20;
        int peopleQuantity = 3;

        boolean lonely;

        if (peopleQuantity >= 2) {
            lonely = true;
        } else {
            lonely = false;
        }

        System.out.println("Valor de acompanhado = " + lonely);

        if (age >= 18 && lonely) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente voce nao pode entrar");
        }
    }
}
