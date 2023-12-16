package crudMockado.controller;

import crudMockado.model.entities.Form;
import crudMockado.model.entities.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private User user;
    private Form form;
    private static int count;

    public UserInput() {

    }
   public void createUser(){
        Scanner sc = new Scanner(System.in);
        List<String> answers = new ArrayList<>();
        int counter =1;
       for (String question : form.getQuestions()) {
           System.out.println(counter++ + " - " + question);
           answers.add(sc.nextLine());
       }
       List<String> addAnswers = answers.subList(4,answers.size()); //para evitar um if-else so peguei a sublist apartir da 5 pergunta indice 4
        user = new User(answers.getFirst(), answers.get(1)
                ,Integer.parseInt(answers.get(2)),Double.parseDouble(answers.get(3)),addAnswers);
        count++;
        saveUserInFile();
        System.out.println(user);
    }
    public List<User> listAllUsers(){
        String dirPath = "src/crudMockado/in_out/users";
        List<File> files = Arrays.stream(new File(dirPath).listFiles()).sorted((a,b)-> a.getName().compareToIgnoreCase(b.getName())).toList();
        List<User> userList = new ArrayList<>();
        for (File file : files) {
            userList.add(readFileAndGetUser(file));
        }
        //userList.sort((a,b)-> a.getName().compareToIgnoreCase(b.getName()));
        return userList;
    }
    private User readFileAndGetUser(File file){
        List<String>values = new ArrayList<>();
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while (bf.ready()){
                values.add(bf.readLine());
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> additionalAnswers = values.size()>4?values.subList(4, values.size()) : null; //sublista pulando os 4 obrigatorios
        return new User(values.getFirst(), values.get(1),Integer.parseInt(values.get(2)),Double.parseDouble(values.get(3)),additionalAnswers);
    }
    public void deleteAnswer(int index){
        File[] files = new File("src/crudMockado/in_out/users").listFiles();
        for (File file : files) {
             user = readFileAndGetUser(file);
            if(user.getadditionalAnswer()!=null){
                user.getadditionalAnswer().remove(index - 4); //pois o additional answer comeca do 0, eh uma sublist da original
                updateUserInFile(file.getPath());
            }
        }
    }
    public void setForm(Form form) {
        this.form = form;
    }
    private void updateUserInFile(String path) {
        File file = new File(path);
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {
            StringBuilder sb = fillUserInfo();
            bf.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private StringBuilder fillUserInfo(){
        StringBuilder sb = new StringBuilder(user.getName()).append("\n").append(user.getEmail()).append("\n")
                .append(user.getAge()).append("\n").append(user.getHeight()).append("\n");
        for (String s : user.getadditionalAnswer()) {
            sb.append(s).append("\n");
        }
        return sb;
    }
    private void saveUserInFile(){
        String path = "src/crudMockado/in_out/users";
        new File(path).mkdir();
        File[] files = new File(path).listFiles();
        int indexOfNextFile =files.length+1;
        path +="/"+ indexOfNextFile+"-"+user.getName().replaceAll("\\s", "").toUpperCase()+".txt";
        File out = new File(path);
        try {
            out.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            bw.write(fillUserInfo().toString());
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
