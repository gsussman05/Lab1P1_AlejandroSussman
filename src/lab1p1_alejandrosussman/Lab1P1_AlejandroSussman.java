/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_alejandrosussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Lab1P1_AlejandroSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("BINEVENIDO A LA CALCULADORA DE PROMEDIOS");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();
        System.out.println("Ingrese la nota de la primera evaluacion: ");
        int nota1 = sc.nextInt();
        System.out.println("Ingrese la nota de la segunda evaluacion: ");
        int nota2 = sc.nextInt();
        System.out.println("Ingrese la nota de la tercera evaluacion: ");
        int nota3 = sc.nextInt();
        double promedio;
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota promedio del alumno " + name + "es de: " + promedio);
    }

}
