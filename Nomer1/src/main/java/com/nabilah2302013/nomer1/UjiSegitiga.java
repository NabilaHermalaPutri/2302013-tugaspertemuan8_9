/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class UjiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi-sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double sisi3 = input.nextDouble();

        // Input warna dan status filled
        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();
        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean filled = input.nextBoolean();

        // Buat objek segitiga dan atur atribut warna dan filled
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setFilled(filled);

        // Output
        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isFilled());
    }
}

