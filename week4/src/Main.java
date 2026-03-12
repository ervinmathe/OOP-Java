import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import week2.BankAccount;
import week3.Customer;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> persons = readFromCSVFile("OOP-Java/week4/src/lab4_input.csv");
        for (Customer person : persons) {
            System.out.println(person.toString());
        }
    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if (line.startsWith("Customer")) {
                    System.out.println("Customer found: " + line);
                    Customer customer = new Customer(line.split(",")[1], line.split(",")[2]);
                    System.out.println("*** Customer created: " + customer + "*****");
                    while (scanner.hasNextLine()) {
                        String line2 = scanner.nextLine();
                        if (line2.isEmpty()) {
                            break;
                        } else if (line2.startsWith("Account")) {
                            String accountNumber = line2.split(",")[1];
                            double balance = Double.parseDouble(line2.split(",")[2]);
                            BankAccount account = new BankAccount(accountNumber, balance);
                            customer.addAccount(account);
                        } else {
                            break;
                        }

                    }
                    persons.add(customer);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("This is the end of the file" + persons.size());
        return persons;
    }
}
