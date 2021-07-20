import java.io.*;
import java.util.*;

public class MyClass {
    public static int[] numeros = new int[]{7,4,11,3,6,9,2,5,8,3,7,10,1,3,7,4,9,5};
    public static void main(String args[]) {
     Map<Integer, Integer> map = new HashMap();
     //1. ordenar los numeros
     Arrays.sort(numeros);
     for(int numero: numeros){
         System.out.println(numero);
         map.put(numero, map.containsKey(numero)?map.get(numero)+1:1);
     }
     //2. Contar cuantas veces esta cada numero en el array
     for(int numer: numeros){
         System.out.println("el numero "+ numer + " esta " + map.get(numer) + " veces en el vector" );
     }
    }
}
