package crudMockado.controller;

import crudMockado.model.entities.Form;
import crudMockado.model.entities.User;

import java.util.List;

public class Controller {
    private FormRepo formRepo;
    private UserRepo userRepo;
    private Form form;
    public Controller() {
        userRepo = new UserRepo();
        formRepo = new FormRepo();
        form = new Form();
        userRepo.setForm(form);
        formRepo.setForm(form);
        formRepo.initializeForm();
    }

    public User createUser(List<String>answers)  { //validacoes
        String name = answers.getFirst(), email = answers.get(1);
        int age = Integer.parseInt(answers.get(2));
        if(name.length()<11)//limite de 10 caracter
            sendException("nome curto demais");
        if(!email.contains("@"))
            sendException("email invalido");
        if(age<19)
            sendException("necessario ser maior de 18 anos");
        if(!answers.get(3).contains("."))
            sendException("é necessario separar a altura com .");

         return userRepo.createUser(answers);
    }
    private void sendException(String msg){ //aborta a criacao do usuario e nao salva no arquivo
        throw new IllegalArgumentException(msg);
    }
    public void createQuestion(String question) {
        formRepo.createQuestion(question);
    }
    public String showForm(){
        return formRepo.showForm();
    }

    public List<User> listAllUsers() {
        return userRepo.listAllUsers();
    }
    public List<User> listAllUsersByName(String name){
        return userRepo.listAllUsersByName(name);
    }
    public void deleteQuestion(int questionIndex) throws IllegalArgumentException{
        if(questionIndex<=4)
            throw new IllegalArgumentException("can not delete this question");
        questionIndex--; //tem que ser -1 pois vamos trabalhar com o indice do array
        formRepo.deleteQuestion(questionIndex);
        userRepo.deleteAnswer(questionIndex);
         //atualiza o txt
    }
    public Form getForm() {
        return form;
    }
}
