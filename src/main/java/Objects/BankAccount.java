package Objects;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String anyOwner, int anyBalance){
        this.owner = anyOwner;
        this.balance = anyBalance;
    }

    String getOwner(){
        return this.owner;
    }
    int getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("внесено " + amount);
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("снято " + amount);
    }

    public void printBalance(){
        System.out.println("Владелец: " + owner + " баланс: " + balance);
    }
}
