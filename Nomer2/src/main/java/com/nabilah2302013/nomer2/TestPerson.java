/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Ayu", "Bandung", "081234567", "ayu@email.com");
        Student s = new Student("Budi", "Jakarta", "081298765", "budi@gmail.com", Student.MAHASISWA_BARU);
        Employee e = new Employee("Citra", "Surabaya", "089123456", "citra@kantor.com", "Kantor A", 7000000, new MyDate(10, 4, 2020));
        Faculty f = new Faculty("Deni", "Semarang", "082345678", "deni@fakultas.com", "Fakultas TI", 8000000, new MyDate(1, 1, 2019), "08.00-16.00", "Lektor");
        Staff st = new Staff("Eka", "Yogyakarta", "085612345", "eka@staff.com", "Administrasi", 6000000, new MyDate(15, 2, 2021), "S.Kom");

        // Polymorphism: semua toString dipanggil sesuai objeknya
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }
}

