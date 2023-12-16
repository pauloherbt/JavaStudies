package crudMockado.view;

import crudMockado.controller.Controller;
import crudMockado.model.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInicial {
    public static void open(){
        StringBuilder sb = new StringBuilder();
        Controller controller = new Controller();
        sb.append("MENU INICIAL\n PEAGA'S CRUD \n");
        sb.append("SELECIONE UMA OPCAO (DIGITE O NUMERO EQUIVALENTE)\n");
        sb.append("1-Cadastrar Usuario\n");
        sb.append("2-Listar Todos os Usuarios\n");
        sb.append("3-Cadastrar Pergunta no formulario\n");
        sb.append("4-Deletar Pergunta no formulario\n");
        sb.append("5-Ver formulario\n");
        sb.append("6-Buscar Usuario por nome\n");
        sb.append("7-SAIR");
        int entry=0;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println(sb);
            try{
                switch (entry=Integer.parseInt(sc.nextLine())){
                    case 1:
                        List<String> answers = new ArrayList<>();
                        int counter =1;
                        for (String question : controller.getForm().getQuestions()) {
                            System.out.println(counter++ + " - " + question);
                            answers.add(sc.nextLine());
                        }
                        System.out.println(controller.createUser(answers)); //imprime o user que foi criado
                        break;
                    case 2:
                        List<User> userList = controller.listAllUsers();
                        StringBuilder sb2 = new StringBuilder("Usuarios\n");
                        for (int i = 0; i < userList.size() ; i++) {
                            sb2.append(i + 1).append(" - ").append(userList.get(i).getName()).append("\n");
                        }
                        System.out.println(sb2);
                        break;
                    case 3:
                        System.out.println("Digite sua pergunta:");
                        String resp = sc.nextLine();
                        controller.createQuestion(resp);
                        break;
                    case 4:
                        System.out.println("Qual pergunta deseja excluir?");
                        int questionIndex = Integer.parseInt(new Scanner(System.in).nextLine());
                        controller.deleteQuestion(questionIndex);
                        break;
                    case 5:
                        System.out.println(controller.showForm());
                        break;
                    case 6:
                        System.out.println("Digite um nome:");
                        List<User> userList2 = controller.listAllUsersByName(sc.nextLine());
                        StringBuilder sb3 = new StringBuilder("Usuarios:\n");
                        for (int i = 0; i < userList2.size() ; i++) {
                            sb3.append(i + 1).append(" - ").append(userList2.get(i).getName()).append("\n");
                        }
                        System.out.println(sb3);

                    default:
                        if(entry!=7){
                            System.out.println("Digite uma opcao valida");
                        }
                }
            }catch (NumberFormatException e){
                System.out.println("Digite uma opcao valida");
            }
            catch (IllegalArgumentException ie){
                System.out.println(ie.getMessage());
            }
        }while (entry!=7);

    }
}
