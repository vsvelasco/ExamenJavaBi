/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas_java;

/**
 *
 * @author xm1ayy
 */
public class Ejercicio1 {
 abstract static class MineBase {
abstract void amethod();
static int i; 

}
public static class Mine extends MineBase {
public static void main (String argv[]){
int [] ar = new int [5];
for(i = 0; i < ar.length; i ++)
System.out.println(ar[i]);
}
public void amethod(){}

    
}

