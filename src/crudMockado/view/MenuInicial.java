package crudMockado.view;

import crudMockado.controller.Controller;
import crudMockado.controller.FormInput;
import crudMockado.controller.UserInput;
import crudMockado.model.entities.User;

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
        sb.append("5-Buscar usuario por nome\n");
        sb.append("6-SAIR");
        int entry=0;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println(sb);
            switch (entry=sc.nextInt()){
                case 1:
                    controller.createUser();
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
                    controller.createQuestion();
                    break;
                case 4:
                    int questionIndex = new Scanner(System.in).nextInt();
                    controller.deleteQuestion(questionIndex);
                    break;
                case 5:

                default:
                    if (entry == 6) {
                        System.out.println("SAINDO");
                    } else {
                        System.out.println("Digite uma opcao valdia");
                    }
            }
        }while (entry!=6);

    }
}
