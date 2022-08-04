package day5;

public class account {

    private String id;
    private String name;
    private int balance;

    public static void main(String[]args){

     account ac=new account();
     ac.cridit(100);
     ac.debit(150);
     






    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int cridit(int amount){
       return this.balance+amount;
    }
    public int debit(int amount){
        if (amount<=this.balance){
        return this.balance-amount;}
        else{
                System.out.println("Amount execeeded balance");
                return balance;
            }



    }
    public int transferTo(account anather,int amount){
        if (amount<=this.balance){
            return amount+anather;}
        else{
            System.out.println("amount exceeded balance");
            return balance;
        }

        }
    }
}


