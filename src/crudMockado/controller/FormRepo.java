package crudMockado.controller;

import crudMockado.model.entities.Form;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FormRepo {
    private final File file;
    private Form form;

    public FormRepo() {
        file = new File("src/crudMockado/in_out/formulario.txt");
    }
    public void createQuestion(String question){
        StringBuilder sb = new StringBuilder().append(question);
        form.getQuestions().add(sb.toString());
        createForm();//calcula automaticamente qual numero da pergunta

    }
    public void deleteQuestion(int questionIndex){
        if(questionIndex<form.getQuestions().size()){
            form.getQuestions().remove(questionIndex);
            createForm();
        }
    }
    public String showForm(){
        StringBuilder sb = new StringBuilder("Formulário:\n");
        for (String question : form.getQuestions()) {
            sb.append(question).append("\n");
        }
        return sb.toString();
    }
    public void createForm(){
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file))){
            int count=1;
            for (String question : form.getQuestions()) {
                bf.write(count++ +" - "+question+"\n");
            }
        } catch (IOException e) {
            System.out.println((e.getMessage()));
        }
    }
    public void initializeForm() {
        List<String> questions = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while(bf.ready()) {
                String line = bf.readLine();
                questions.add(line.substring(4)); //pula os 4 caracter inicial
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        form.setQuestions(questions);
    }
    public void setForm(Form form) {
        this.form = form;
    }
}
