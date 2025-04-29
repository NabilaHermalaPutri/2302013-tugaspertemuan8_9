/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String TAHUN_KEDUA = "Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String noTelp, String email, String status) {
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + nama;
    }
}

