package exercises.programacaofuncional.ex1;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio
*/
public class Application {
    public static void main(String[] args) {
        JFileChooser jf= new JFileChooser();
        jf.showOpenDialog(null);
        File file = jf.getSelectedFile();
        List<Product> products=new ArrayList<>();
        try(BufferedReader bf=new BufferedReader(new FileReader(file))){
            while(bf.ready()){
                String[] fields=bf.readLine().split(",");
                products.add(new Product(fields[0],Double.parseDouble(fields[1])));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        double average = products.stream().map(Product::getPrice).reduce(0.0,(a,b)->a+b)/ products.size();
        System.out.println(average);
        products.stream().filter(p-> p.getPrice()<average)
                .map(p->p.getName())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
