/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nabilah2302013.nomer1;

/**
 *
 * @author Lenovo
 */
public class ObjekGeometris {
    private String warna = "putih";
    private boolean filled = false;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String warna, boolean filled) {
        this.warna = warna;
        this.filled = filled;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Warna: " + warna + ", Terisi: " + filled;
    }
}
