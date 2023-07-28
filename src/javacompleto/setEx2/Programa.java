package javacompleto.setEx2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Instrutor ins= new Instrutor();
        Scanner sc= new Scanner(System.in);
        System.out.println("quantos alunos na turma A?");
        int n=sc.nextInt();
        ins.addTurmaA(salvarAlunos(n));
        System.out.println("Quantos na turma B?");
        n=sc.nextInt();
        ins.addTurmaB(salvarAlunos(n));
        System.out.println("quantos na turma C?");
        n= sc.nextInt();
        ins.addTurmaC(salvarAlunos(n));
        System.out.println("quantidade total de alunos do instrutor:");
        System.out.println(ins.getTotalDeAlunos());
    }
    private static Aluno[] salvarAlunos(int n){
        Scanner sc=new Scanner(System.in);
        Aluno[] alunos=new Aluno[n];
        for (int i = 0; i < n;i++) {
            System.out.println("id do aluno: "+(i+1));
            int id= sc.nextInt();
            alunos[i]=new Aluno(id);
        }
        return alunos;
    }
}
