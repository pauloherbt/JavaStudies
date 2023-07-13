package exercises.mapEx1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Urna {
    private Set<Candidato> candidatos;
    private static Integer urna=0;
    public Urna() {
        candidatos=new HashSet<>();
        urna++;
    }
    public void addCandidatos(String nome,int qtd){
        candidatos.add(new Candidato(nome,qtd));
    }
    public void gerarRelatorio(){
        File relatorio=createFile();
       try( BufferedWriter bw=new BufferedWriter(new FileWriter(relatorio))){
           for (Candidato candidato : candidatos) {
               bw.write(candidato.getNome()+";"+candidato.getQtdVotos());
               bw.newLine();
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    private File createFile(){
        File dir= new File("src/exercises/mapEx1/output");
        File relatorio=null;
        dir.mkdir();
            relatorio=new File(dir,"urna"+urna+".txt");
            try{
                relatorio.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        return relatorio;
    }
    public Set<Candidato> getCandidatos() {
        return candidatos;
    }

}
