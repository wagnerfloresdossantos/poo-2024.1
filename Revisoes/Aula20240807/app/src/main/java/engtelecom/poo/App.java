/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {



    public static void main(String[] args) {

    Bola a = new Bola("futebol", "branca", 10, 20);

    Bola b = new Bola("baskete", "marrom", 15, 25);

    String s = "IFSC";
    String n = "POO";

    if(s.equals(n)){
        System.out.println("São iguais");
    }else {
        System.out.println("diferentes");
    }


    }
}
