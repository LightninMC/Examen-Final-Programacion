/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExamen01;

import java.util.Scanner;

/**
 *
 * @author cocom
 */
public class ExamenEspecialidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Clase miClase = new Clase();
    Scanner entrada = new Scanner(System.in);
    
    miClase.setCod_Esp(entrada.nextLine());
    miClase.setDesc_Esp(entrada.nextLine());
    
    System.out.println(miClase.getCod_Esp());
    System.out.println(miClase.getDesc_Esp());
    }
    
}