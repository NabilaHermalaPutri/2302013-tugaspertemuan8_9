/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String email;

    public Person(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + nama;
    }
}

