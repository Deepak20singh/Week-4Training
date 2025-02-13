package javastreams.readuser;

import java.io.*;


public class InputConsole {
    public static void write(String path){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw=new FileWriter(path);
            System.out.print("Enter your name :- ");
            String name= br.readLine();
            System.out.print("Enter your age :- ");
            String age=br.readLine();
            System.out.print("Enter your favourite programming language :- ");
            String language=br.readLine();
            String date="Name :- "+name+" , Age :- "+age+" , Favourite Language :- "+language;
            fw.write(date);
            fw.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
