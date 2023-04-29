package test;

import domain.Generador;
import java.util.Random;

public class TestGenerador {
    public static void main(String[] args) {
        int numero;
        //Random ran = new Random(System.currentTimeMillis());
        for(int i=0 ; i<10; i++)
        {
            //numero = ran.nextInt(100);
            numero = (int)(Math.random()*10+1);
            System.out.println(numero);
        }
    }
    
}
