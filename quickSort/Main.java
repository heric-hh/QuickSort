package quickSort;

import java.io.IOException;

public class Main {
    
    // Funcion para intercambiar elementos
    public static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int particion(int[]arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        
        intercambiar(arr, i + 1, high);
        return (i + 1);
    }
    
    public static void quickSort(int[]arr, int low, int high) {
        if( low < high ) {
            // ip significa indice de particion
            int ip = particion(arr, low, high);
            
            quickSort(arr, low, ip - 1);
            quickSort(arr, ip + 1, high);
        }
    }
    
     public static void imprimeArreglo(int[]arr) {
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " - ");
        }
    }
    
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 2, 4, 1, 7};
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        imprimeArreglo(arr);
    }
}
