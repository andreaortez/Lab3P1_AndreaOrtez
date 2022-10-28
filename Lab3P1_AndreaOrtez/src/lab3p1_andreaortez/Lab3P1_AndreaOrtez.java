
package lab3p1_andreaortez;

import java.util.Scanner;

public class Lab3P1_AndreaOrtez {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       int opcion;
       do{
            System.out.println("-- MENU --");
            System.out.println("1-> Diptongo");
            System.out.println("2-> Sumatoria PI");
            System.out.println("3-> Time Clock");
            System.out.println("4-> Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println();
                    System.out.println("-- DIPTONGO EN PROCESO --");
                    String palabra;
                    System.out.print("Ingrese una palabra: ");
                    palabra = leer.next().toLowerCase();
                    int cont=1;
                    
                    for (int i=0; i<palabra.length(); i++){
                        char vocal = palabra.charAt(i);
                        if (i+1<palabra.length()){
                        char vocal2 = palabra.charAt(i+1);
                        
                        if (vocal=='a' || vocal=='e'|| vocal=='i' || vocal=='o' || vocal=='u'){
                            if (vocal2=='a' || vocal2=='e'|| vocal2=='i' || vocal2=='o' || vocal2=='u'){
                            cont++;
                            }
                        }else{
                                cont=1;}
                    }//Fin proceso  
                    }
                    if (cont==2){
                        System.out.println("La palabra tiene diptongo");
                    }else{
                        System.out.println("La palabra NO tiene diptongo");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("-- SUMATORIA PI EN PROCESO --");
                    System.out.print("Ingrese el limite: ");
                    double k = leer.nextInt();
                    double π=0;
                    
                    for (double n=0; n<k; n++){
                        π += 4*(((Math.pow(-1,n)))/((2*n)+1));
                    }//Fin proceso
                    
                    System.out.println("Resultado: " + π);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("-- TIME CLOCK PI EN PROCESO --");
                    System.out.print("Ingrese un tamaño IMPAR: ");
                    int tamaño = leer.nextInt();
                    double x;
                    int y;
                    x = tamaño%2;
                    
                    if (x==0){
                        System.out.print("Ingrese un tamaño IMPAR: ");
                        tamaño = leer.nextInt();
                    }
                    
                    y = (tamaño+1)/2;
                    System.out.println();
                    
                    for (int i=0; i<y; i++){
                        for (int j=0; j<tamaño; j++){
                            if(j>=i && j<tamaño-i){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }//Fin espacios
                        System.out.println();
                    }//Fin proceso
                    for (int i=1; i<y; i++){
                        for (int j=0; j<tamaño; j++){
                            if(j==y-1 || (j<=y-1+i && j>=y-1-i )){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    break;
            }//Fin opciones
        }while (opcion!=4);
    }//Fin main
    
}//Fin clase
