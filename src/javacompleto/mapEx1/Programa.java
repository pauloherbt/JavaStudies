package javacompleto.mapEx1;

import java.util.HashMap;

public class Programa {
    public static void main(String[] args) {
        Urna urna = new Urna();
        urna.addCandidatos("Alex Blue", 15);
        urna.addCandidatos("Maria Green", 22);
        urna.addCandidatos("Bob Brown", 21);
        urna.gerarRelatorio();
        Urna urna2 = new Urna();
        urna2.addCandidatos("Alex Blue",30);
        urna2.addCandidatos("Bob Brown",15);
        urna2.addCandidatos("Maria Green",27);
        urna2.gerarRelatorio();
        Urna urna3 = new Urna();
        urna3.addCandidatos("Maria Green",22);
        urna3.addCandidatos("Bob Brown",25);
        urna3.addCandidatos("Alex Blue",31);
        urna3.gerarRelatorio();
        ManipulateUrnaFiles toFile= new ManipulateUrnaFiles();
        toFile.addUrna(urna);
        toFile.addUrna(urna2);
        toFile.addUrna(urna3);
        toFile.gerarRelatorioTotal();
        HashMap<Candidato,Integer> hashMap=toFile.contabilizarVotos();
        for (Candidato candidato : hashMap.keySet()) {
            System.out.println(candidato.getNome()+" "+hashMap.get(candidato));
        }
    }
}
