package crudMockado.controller;

import crudMockado.model.entities.Form;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormInput {
    private File file;
    private BufferedReader bf;
    private Form form;

    public FormInput() {
        file = new File("src/crudMockado/in_out/formulario.txt");
        form = new Form();
        try {
            bf = new BufferedReader(new FileReader(file));
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readFile() throws IOException {
        List<String> questions = new ArrayList<>();
        while(bf.ready()){
            questions.add(bf.readLine());
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
