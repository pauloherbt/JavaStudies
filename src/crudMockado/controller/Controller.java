package crudMockado.controller;

import crudMockado.model.entities.User;

import java.util.List;

public class Controller {
    private FormInput formInput;
    private UserInput userInput;
    public Controller() {
        userInput = new UserInput();
        formInput = new FormInput();
        userInput.setForm(formInput.getForm());
    }

    public void createUser() {
        userInput.createUser();
    }

    public void createQuestion() {
        formInput.createQuestion();
    }

    public List<User> listAllUsers() {
        return userInput.listAllUsers();
    }
    public void deleteQuestion(int questionIndex){
        if(questionIndex<=4)
            throw new RuntimeException("Dont allowed delete this question");
        questionIndex--; //tem que ser -1 pois vamos trabalhar com o indice do array
        formInput.deleteQuestion(questionIndex);
        userInput.deleteAnswer(questionIndex);
         //atualiza o txt
    }
}
