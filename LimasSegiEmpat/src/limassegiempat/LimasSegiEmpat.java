/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limassegiempat;

/**
 *
 * @author ctray
 */

public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Constructor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    // Constructor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Getter untuk luas alas
    public double getLuasAlas() {
        return luasAlas;
    }

    // Getter untuk luas selubung limas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Menghitung luas limas segiempat
    public double hitungLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Menghitung volume limas segiempat
    public double hitungVolume() {
        return (1.0 / 3.0) * luasAlas * tinggi;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    // Setter untuk luas selubung limas
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}