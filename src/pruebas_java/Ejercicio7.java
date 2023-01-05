/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas_java;

/**
 *
 * @author xm1ayy
 */
public class Ejercicio7 {
    public static void main (String[]args) {
int suma = 0; 
int y = 1; 
int x = 0; 
while (x<10) {
if (y%2!=0){
suma+= y; 
x++;
System.out.println(y);
}
y++;
    
}
System.out.println(suma);
}
