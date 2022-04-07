package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {

            metod(-7);
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
       public static void metod(int a)throws Exception{
        if (a < 1) throw new Exception("get correct number");

        int fuct=1;

          for (int i = 1; i < 5; i++) {
             fuct *= a;
              System.out.println(fuct);
        }

    }
    }

