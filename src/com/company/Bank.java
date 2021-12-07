package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Bank implements Serializable {
    List<User> allUsers = new ArrayList<>();
    BankMenu bankMenu=new BankMenu();

    void serializeUsers(List<User> allUsers)  {
        try(ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream("Users.dat"))) {
            objOutputStream.writeObject(allUsers);
        }
        catch (IOException e ){
            System.out.println("Can't write to file");
        }
    }
    void  deserializeUsers(){
        File file= new File("Users.dat");
        if (file.exists() && file.isDirectory()){
        System.out.println("Exists");}
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
                return true;
            }
        return false;
    }

    public void doRegister(User user){
        allUsers.add(user);
        serializeUsers(allUsers);


    }
}
