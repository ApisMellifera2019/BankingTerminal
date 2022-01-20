package BankingTerminal;

import java.util.Scanner;

public class User {

    private String name;
    private String surname;
    //private int ID = 31*surname.hashCode() + 13 + name.charAt(0);
    private int password;
    private int depositedAmount;
    private int accountAmount;

    public User(String name, String surname, int password, int depositedAmount, int accountAmount) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.depositedAmount = depositedAmount;
        this.accountAmount = accountAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }

    public int getPassword() {
        return password;
    }

    public int getDepositedAmount() {
        return depositedAmount;
    }

    public int getAccountAmount() {
        return accountAmount;
    }

    public String getName() {
        return name;
    }

    //    public void createUser(User us){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//        us.setName(scanner.nextLine());
//        System.out.println("Enter your surname");
//        us.setSurname(scanner.nextLine());
//        System.out.println("Enter your password");
//        us.setPassword(scanner.nextInt());
//    }


}
