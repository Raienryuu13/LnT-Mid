/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmusang;

public class Car extends Kendaraan{
    private int entertainment_system;

    public Car(int entertainment_system, String brand, String nama, String license_number, int top_speed, int gas_cap, int wheel, String type) {
        super(brand, nama, license_number, top_speed, gas_cap, wheel, type);
        this.entertainment_system = entertainment_system;
    }

    public int getEntertainment_system() {
        return entertainment_system;
    }

    public void setEntertainment_system(int entertainment_system) {
        this.entertainment_system = entertainment_system;
    }

    @Override
    void carSelling() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getNama());
        System.out.println("License Plate: " + getLicense_number());
        System.out.println("Type: " + getType());
        System.out.println("Gas Capacity: " + getGas_cap());
        System.out.println("Top Speed: " + getTop_speed());
        System.out.println("Wheel(s): " + getWheel());
        System.out.println("Entertainment System: " + getEntertainment_system());
        System.out.println("Turning on entertainment system...");
        if(getType().equals("Supercar")){
            System.out.println("Boosting!");
        }
    }
}
