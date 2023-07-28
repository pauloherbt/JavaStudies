package javacompleto.setEx1;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogControl {
   private File file;
   private Set<User> set;
    public LogControl() {
        JFileChooser jf = new JFileChooser();
        this.set=new HashSet<>();
        jf.showOpenDialog(null);
        file=jf.getSelectedFile();
        readFile();
    }
    private void readFile(){
        try(BufferedReader bf= new BufferedReader(new FileReader(file))){
            while (bf.ready()){
                String line= bf.readLine();
                String[] fields= line.split(" ");
                set.add(new User(fields[0],fields[1]));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void usersAmount(){
        System.out.println("Total users: "+set.size());
    }

    public static void main(String[] args) {
        LogControl lg= new LogControl();
        lg.usersAmount();
    }
}
