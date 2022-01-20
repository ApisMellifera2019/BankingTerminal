package BankingTerminal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var users = new ArrayList<User>();
        users.add(new User("Vic","Ushak", 123,0,5543 ));
        users.add(new User("Roman", "Kolaev", 321,31,321));
        Scanner scanner = new Scanner(System.in);

        while (true) {                                                   //Терминал работает постоянно

            System.out.println("Make your choice");

            System.out.println("[1] Registration");                     //Выбираем регистрацию или авторизацию
            System.out.println("[2] Authorization");

            int choice = scanner.nextInt();                             //Проверяем выбор в меню
            if (choice < 1 || choice > 2)
                continue;

            switch (choice) {
                case 1:
                    User user = new User(null,null,1111,0,0);

                    System.out.println("Enter your name");
                    user.setName(scanner.next());                       //ПОЧЕМУ ПРОПУСКАЕТ NEXTLINE?

                    System.out.println("Enter your surname");
                    user.setSurname(scanner.next());

                    System.out.println("Enter your password");
                    user.setPassword(scanner.nextInt());

                    users.add(user);
                    break;
                case 2:

                    System.out.println("Enter your name");
                    String verificationName = scanner.next();

                    System.out.println("Enter your password");
                    int verificationPassword = scanner.nextInt();

                    for (User u:users) {

                        if((verificationName.equals(u.getName())) && (verificationPassword == u.getPassword())){
                            System.out.println("[1] Viev balance");
                            System.out.println("[2] Put money on the card");
                            System.out.println("[3] Exit");

                            int userChoice = scanner.nextInt();
                            if (userChoice < 1 || userChoice > 3)
                                continue;

                            switch (userChoice) {
                                case 1:
                                    System.out.println("Your balance is " + u.getAccountAmount() + "$");
                                    break;
                                case 2:
                                    System.out.println("Enter amount");
                                    int sum = scanner.nextInt();
                                    System.out.println("You deposited " + sum + "$");
                                    u.setAccountAmount(u.getAccountAmount()+sum);
                                    break;
                            }

                        }
                        }

                    }

            }
        }
    }

