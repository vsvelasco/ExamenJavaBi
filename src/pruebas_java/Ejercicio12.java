/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas_java;

/**
 *
 * @author xm1ayy
 */
public class Ejercicio12 {

    public static void main(String[] args) {

    int x = 0;
    try {
        System.out.println("1");
        if (x <= 0) throw new IllegalArgumentException();
        System.out.println("2");
    } catch (Exception e) {
        System.out.println("3");
        return;
    } finally {
        System.out.println("4");
    }
}

