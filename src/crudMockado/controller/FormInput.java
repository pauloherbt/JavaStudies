package crudMockado.controller;

import crudMockado.model.entities.Form;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormInput {
    private File file;
    private BufferedReader bf;
    private Form form;

    public FormInput() {
        file = new File("src/crudMockado/in_out/formulario.txt");
        form = new Form();
        readFile();
    }
    public void createQuestion(){
        StringBuilder sb = new StringBuilder().append(new Scanner(System.in).nextLine()); //calcula automaticamente qual numero da pergunta
        form.getQuestions().add(sb.toString());
        createForm();

    }
    public void deleteQuestion(int questionIndex){
        if(questionIndex<form.getQuestions().size()){
            form.getQuestions().remove(questionIndex);
            createForm();
        }
        else
            System.out.println("Type a valid option");

    }
    public void createForm(){

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file))){
            int coount=1;
            for (String question : form.getQuestions()) {
                bf.write(coount++ +" - "+question+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readFile() {
        List<String> questions = new ArrayList<>();
        try {
            bf = new BufferedReader(new FileReader(file));
            while(bf.ready()) {
                String line = bf.readLine();
                questions.add(line.substring(4));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        form.setQuestions(questions);
    }

    public Form getForm() {
        return form;
    }

    public static void main(String[] args) {
        FormInput formInput = new FormInput();
        System.out.println(formInput.getForm().getQuestions());
    }
}
