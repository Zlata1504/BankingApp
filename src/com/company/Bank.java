package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class Bank extends Loan  {
    List<User> allUsers = new ArrayList<>();
    BankMenu bankMenu=new BankMenu(this);
    private User us=new User();

    void serializeUsers(List<User> allUsers)  {
        try(ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream("Users.dat"))) {
            objOutputStream.writeObject(allUsers);
        }
        catch (IOException e ){
            System.out.println("Can't write to file");
        }
    }
    void deserializeUsers(){
        File file= new File("Users.dat");
        try {
            if (!file.exists() || file.isDirectory()) {
                file.createNewFile();
                serializeUsers(allUsers);
            }
        }
        catch (Exception exc ){
            System.out.println("Can't create file");

        }

        try ( ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("Users.dat"))){
            allUsers=(ArrayList<User>)objectInputStream.readObject();
            for (User user:allUsers){
                System.out.println(user);
            }
        }
        catch (Exception ex){
            System.out.println("Can't read file");
        }
    }

    public void start() {
        deserializeUsers();
        bankMenu.showStartMenu();

    }
    public boolean doLogin(String email,String password) {
        for (User user : allUsers)
            if (user.getEmail().equals(email)&&(user.getPassword().equals(password))){
                us=user;
                return true;
            }
        return false;
    }

    public void doRegister(User user){
        allUsers.add(user);
        serializeUsers(allUsers);
    }
    public void myAccount(){
        System.out.println(us);

    }
    public void myBalance(){
        for (DebitCard balance: us.getListOfCards()){
            System.out.println(balance);
        }
    }
    public void myLoanData(){

    }
    public void orderCard(DebitCard card){
        us.getListOfCards().add(card);
        serializeUsers(allUsers);
        bankMenu.showBankMenu();

    }
    public void takeLoan(Loan loan){
        us.getListOfCredits().add(loan);
        serializeUsers(allUsers);
    }


    }


