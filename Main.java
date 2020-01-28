package ru.penzgtu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = null;
        //Scanner in = new Scanner(System.in);

        File file1 =new File("in.txt");
        try
        {
            boolean created = file1.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("in.txt", false))
        {
            // запись всей строки
            String text = "25";
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        File file2 = new File("in.txt");
        try {
            Scanner input = new Scanner(file2);
            while (input.hasNextLine()){
                line=input.nextLine();
            }
            //System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double a=Integer.parseInt(line);
        double x;

            double x_n = 0.001;
            int i = 1;

            while (i > 0) {
                x = 1.0 / 2.0 * (x_n + a / x_n);
                if (x != x_n)
                {
                x_n = x;
                }
                else
                    {
                System.out.println("Результат="+x);
                i=-1;
                    }
            }


    }
}
