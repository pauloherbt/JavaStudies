package javacompleto.setEx2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Instrutor {
    private Set<Aluno> turmaA,turmaB,turmaC;

    public Instrutor() {
        this.turmaA = new HashSet<>();
        this.turmaB = new HashSet<>();
        this.turmaC = new HashSet<>();
    }

    public void addTurmaA(Aluno aluno) {
        this.turmaA.add(aluno);
    }
    public void addTurmaA(Aluno[] aluno) {
        this.turmaA.addAll(Arrays.asList(aluno));
    }
    public void addTurmaB(Aluno aluno) {
        this.turmaB.add(aluno);
    }

    public void addTurmaC(Aluno aluno) {
        this.turmaC.add(aluno);
    }
    public int getTotalDeAlunos (){
       Set<Aluno> total= new HashSet<>(turmaA);
       total.addAll(turmaB);
       total.addAll(turmaC);
       return total.size();
    }

    public void addTurmaB(Aluno[] alunos) {
        turmaB.addAll(Arrays.asList(alunos));
    }

    public void addTurmaC(Aluno[] alunos) {
        turmaC.addAll(Arrays.asList(alunos));
    }
}
