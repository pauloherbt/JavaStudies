package crudMockado.controller;

import crudMockado.model.entities.Form;
import crudMockado.model.entities.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private User user;
    private Form form;
    private static int count;

    public UserInput() {
        form = new FormInput().getForm();
    }
   public void createUser(){
        Scanner sc = new Scanner(System.in);
        List<String> answers = new ArrayList<>();
        for (String question : form.getQuestions()) {
            System.out.println(question);
            answers.add(sc.nextLine());
        }
        user = new User(answers.getFirst(), answers.get(1)
                ,Integer.parseInt(answers.get(2)),Double.parseDouble(answers.get(3)));
        count++;
        saveUserInFile();
        System.out.println(user);
    }
    public List<User> listAllUsers(){
        String dirPath = "src/crudMockado/in_out/users";
        File[] files = new File(dirPath).listFiles();
        List<User> userList = new ArrayList<>();
        List<String> values;
        for (File file : files) {
            values = new ArrayList<>();
            try{
                BufferedReader bf = new BufferedReader(new FileReader(file));
                while (bf.ready()){
                    values.add(bf.readLine());
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            userList.add(new User(values.getFirst(), values.get(1),Integer.parseInt(values.get(2)),Double.parseDouble(values.getLast())));
        }
        return userList;
    }
    private void saveUserInFile(){
        String path = "src/crudMockado/in_out/users";
        new File(path).mkdir();
        path +="/"+count+"-"+user.getName().replaceAll("\\s", "").toUpperCase()+".txt";
        File out = new File(path);
        try {
            out.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            bw.write(user.getName()+"\n");
            bw.write(user.getEmail()+"\n");
            bw.write(String.valueOf(user.getAge())+"\n");
            bw.write(String.valueOf(user.getHeight()));
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
