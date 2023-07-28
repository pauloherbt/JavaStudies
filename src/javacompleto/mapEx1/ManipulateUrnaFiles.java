package javacompleto.mapEx1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ManipulateUrnaFiles {
    private Set<Urna> urnas;

    public ManipulateUrnaFiles() {
        urnas=new HashSet<>();
    }
    public HashMap<Candidato,Integer> contabilizarVotos(){
        HashMap<Candidato,Integer> total=new HashMap<>();
        for (Urna urna : urnas) {
            for (Candidato candidato : urna.getCandidatos()) {
                int novoTotal=candidato.getQtdVotos();
                if(total.containsKey(candidato))
                    novoTotal+=total.get(candidato);
                total.put(candidato,novoTotal);
            }
        }
        return total;
    }
    public void gerarRelatorioTotal(){
        File relatorio=createFile();
        try( BufferedWriter bw=new BufferedWriter(new FileWriter(relatorio))){
            for (Urna urna : urnas) {
                for (Candidato candidato:urna.getCandidatos()) {
                    bw.write(candidato.getNome()+";"+candidato.getQtdVotos());
                    bw.newLine();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private File createFile(){
        File dir= new File("src/exercises/mapEx1/output");
        File relatorio=null;
        dir.mkdir();
        relatorio=new File(dir,"total.txt");
        try{
            relatorio.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        return relatorio;
    }
    public void addUrna(Urna urna){
        urnas.add(urna);
    }
}
