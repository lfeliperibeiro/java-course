public class Conditional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int age = 16;
        int peopleQuantity = 3;
        if (age >= 18) {
            System.out.println("voce tem mais de 18 anos");
        } else {
            if(peopleQuantity >= 2){
                System.out.println("Voce nao tem 18, mas pode entrar, pois esta acompanhando");
            } else {
                System.out.println("Infelizmente voce nao pode entrar");
            }
        }
    }
}
