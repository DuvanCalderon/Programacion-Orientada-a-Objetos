/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

public class Ejercicio4 {
        public static void main(String[] args) {
        short edjuan, edalbert, edana, edmama;
        
        edjuan = 9;
        edalbert = (short) (2*(edjuan/3));
        edana = (short) (4*(edjuan/3));
        edmama = (short) (edjuan + edalbert + edana);
        
        System.out.println("La edad de Juan es = " + edjuan);
        System.out.println("La edad de Alberto es = " + edalbert);
        System.out.println("La edad de Ana es = " + edana);
        System.out.println("La edad de la mama es = " + edmama);
        
        }
    
    
}
