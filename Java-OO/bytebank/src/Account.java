public class Account {
    private double balance;
    private int  agency;
    private int number;

    private Client owner;

    private static int total;

    public Account(int agency, int number){
        total++;

        this.agency = agency;
        this.number = number;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        return false;

    }

    public boolean transfer(double value, Account destination){
        if(this.balance >= value){
            this.balance -= value;
            destination.deposit(value);
            return true;
        }
        return false;

    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0 ){
            System.out.println("Numero da conta não pode ser negativo");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if(agency <= 0 ){
            System.out.println("Agencia não pode ser negativa");
            return;
        }
        this.agency = agency;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static int getTotal(){
        return total;
    }
}