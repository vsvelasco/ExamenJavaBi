/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas_java;

/**
 *
 * @author xm1ayy
 */
public class Ejercicio11 {
    public static void main (String[]args) {

double y = 4; 
boolean flag = false;
for (int x=3; x<10000000; x=x+2){
if (flag) {
y += ((double)4/x);
flag = false; 
}
else {
y -= ((double)4/x);
flag = true;
}
}
}