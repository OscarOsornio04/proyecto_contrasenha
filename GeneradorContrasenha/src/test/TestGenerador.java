package test;

import domain.Generador;
import java.util.Random;

public class TestGenerador {
    public static void main(String[] args) {
        int numero;
        char letra;
        
        /*
        Valor en codigo ASCII para letras
        A - Z, 65 a 90
        a - z, 97 a 122
        */
        
        //Random ran = new Random(System.currentTimeMillis());

        for(int i=0 ; i<9 ; i++)
        {
            //numero = ran.nextInt(100);
            if(i <= 4)
            {
                numero = (int)(Math.random()*(122-65+1)+65);
                if(numero >= 65 && numero <=90)
                {
                    letra = (char)numero;
                    System.out.println("numero = " + numero + ", ascii = " + letra);
                }
                else if(numero >= 97 && numero <= 122)
                {
                    letra = (char)numero;
                    System.out.println("numero = " + numero + ", ascii = " + letra);
                }
            }
        }
    }
    
}
