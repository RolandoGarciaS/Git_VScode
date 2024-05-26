package AlgoritmosOrdenamiento;

import java.util.ArrayList;


public class Burbuja {
    public ArrayList<Integer> ordenar(ArrayList<Integer> numeros){
        if(numeros.isEmpty()){
            return numeros;
        }else{
            boolean ordenado = true;
            do {
                ordenado = true;
                for (int i = 0; i < numeros.size() - 1; i++) {
                    if(numeros.get(i) > numeros.get(i + 1)){
                        int aux = numeros.get(i + 1);
                        numeros.set(i + 1, numeros.get(i));
                        numeros.set(i, aux);
                        ordenado = false;
                    }
                }
            }while(!ordenado);
            return numeros;
        }
    }
}
