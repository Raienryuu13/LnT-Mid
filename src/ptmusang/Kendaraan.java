/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmusang;

abstract class Kendaraan {
    private String brand, nama, license_number;
    private int top_speed, gas_cap, wheel;
    private String type;

    public Kendaraan(String brand, String nama, String license_number, int top_speed, int gas_cap, int wheel, String type) {
        this.brand = brand;
        this.nama = nama;
        this.license_number = license_number;
        this.top_speed = top_speed;
        this.gas_cap = gas_cap;
        this.wheel = wheel;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public int getGas_cap() {
        return gas_cap;
    }

    public void setGas_cap(int gas_cap) {
        this.gas_cap = gas_cap;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    abstract void carSelling();
}
