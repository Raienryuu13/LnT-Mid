/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmusang;

import java.util.Scanner;

public class Motorcycle extends Kendaraan{
    private int jumlah_helm;
    private Scanner scanner;

    public Motorcycle(int jumlah_helm, String brand, String nama, String license_number, int top_speed, int gas_cap, int wheel, String type) {
        super(brand, nama, license_number, top_speed, gas_cap, wheel, type);
        this.jumlah_helm = jumlah_helm;
    }

    public int getJumlah_helm() {
        return jumlah_helm;
    }

    public void setJumlah_helm(int jumlah_helm) {
        this.jumlah_helm = jumlah_helm;
    }

    @Override
    void carSelling() {
        scanner = new Scanner(System.in);
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getNama());
        System.out.println("License Plate: " + getLicense_number());
        System.out.println("Type: " + getType());
        System.out.println("Gas Capacity: " + getGas_cap());
        System.out.println("Top Speed: " + getTop_speed());
        System.out.println("Wheel(s): " + getWheel());
        System.out.println("Helm: " + getJumlah_helm());
        System.out.println(getNama() + " is standing!");
        while(true){
            System.out.print("Input Helm price : ");
            try{
                int helm_price = Integer.parseInt(scanner.nextLine());
                System.out.println("Price: " + (helm_price * getJumlah_helm()));
                break;
            }catch(NumberFormatException e){
                
            }
        }
    }
   
}
