package quickSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    private int[] arr;
    private int numElementos;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public void setNumElementos() throws IOException {
        System.out.println("Ingresa el número de elementos del arreglo");
        numElementos = Integer.parseInt(bf.readLine());
        this.arr = new int[numElementos];
    }
    
    public void setElementos() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ".- Teclea un número: ");
            arr[i] = Integer.parseInt(bf.readLine());
        }
    }
    
    // Ordenar por QuickSort
    public int[] ordenarQuickSort() {
        return quickSort2(arr, 0, arr.length - 1);
    }
    
    public int[] quickSort2(int numeros[], int izq, int der) {
        if ( izq >= der ) {
            return arr;
        }
        int i = izq;
        int d = der;
        
        if ( izq != der ) {
            int pivote;
            int aux;
            pivote = izq;
            
            while ( izq != der ) {
                while ( arr[der] >= arr[pivote] && izq < der ) {
                    der--;
                }
                
                while ( arr[der] < arr[pivote] && izq < der ) {
                    izq++;
                }
            }
            
            
        
        } 
    
    } 
    
}
