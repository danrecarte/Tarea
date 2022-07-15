
package com.mycompany.tarea2;
import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
     Scanner Teclado = new Scanner(System.in) ;   
     String operacion;
     int num1 = 0,num2 = 0,num3 = 0;
    
     System.out.println("Digite una operacion basica");
     operacion= Teclado.next();
     
     char [] op = operacion.toCharArray(); //servira para revisar si tiene los digitos
     System.out.println(op);
     
     
     //asignacion de las variables segun el string
     //pude haberlo hecho con el arreglo pero pensaba que debia usarlo poco
    if (Character.isDigit(op[0])){
     num1= operacion.charAt(0)-'0';
    }
    if (Character.isDigit(op[2])){
     num2=operacion.charAt(2)-'0';
    }
    
    
    switch(operacion.charAt(1)){
        case '+' -> num3= (num1+num2);
        
        case '/' -> num3= (num1/num2);
            
        case '-' -> num3= (num1-num2);
            
        case '*' -> num3= (num1*num2);
            
    }
          System.out.println("La respuesta es" +num3);
    }}
