/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmusang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Car> dataCar;
    private static ArrayList<Motorcycle> dataMotorcycle;
    private static Scanner scanner;
    
    private static boolean isStringUpperCase(String str){
        char[] charArray = str.toCharArray();
        for(int i=0; i < charArray.length; i++){
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        scanner = new Scanner(System.in);
        
        dataCar = new ArrayList<>();
        dataMotorcycle = new ArrayList<>();
        
        while(true){
            System.out.println("SELAMAT DATANG DI PT MUSANG");
            System.out.println("1. Input Data Kendaraan");
            System.out.println("2. View Data Kendaraan");
            System.out.println("3. Exit");
            System.out.print(">> ");
            String pilihan = scanner.nextLine();
            
            switch (pilihan) {
                case "1":
                    {
                        String type, brand, name, license;
                        int top_speed, gas_capacity, wheel;
                        String type2;
                        int e_system_or_helm;
                        while(true){
                            System.out.print("Input type [Car | Motorcycle]: ");
                            type = scanner.nextLine();
                            if(type.equals("Car") || type.equals("Motorcycle")){
                                break;
                            }
                        }   while(true){
                            System.out.print("Input brand [>= 5]: ");
                            brand = scanner.nextLine();
                            if(brand.length() >= 5){
                                break;
                            }
                        }   while(true){
                            System.out.print("Input name [>= 5]: ");
                            name = scanner.nextLine();
                            if(name.length() >= 5){
                                break;
                            }
                        }   while(true){
                            System.out.print("Input license: ");
                            license = scanner.nextLine();
                            String split[] = license.split(" ");
                            if(split.length == 3){
                                if(split[0].length() == 1 && isStringUpperCase(split[0])){
                                    try{
                                        int parse = Integer.parseInt(split[1]);
                                        if(parse >= 0){
                                            if(split[2].length() >= 1 && split[2].length() <= 3 && isStringUpperCase(split[2])){
                                                break;
                                            }
                                        }
                                    }catch(NumberFormatException e){

                                    }
                                }
                            }
                        }   while(true){
                            System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
                            try{
                                top_speed = Integer.parseInt(scanner.nextLine());
                                if(top_speed >= 100 && top_speed <= 250){
                                    break;
                                }
                            }catch(NumberFormatException e){

                            }
                        }   while(true){
                            System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
                            try{
                                gas_capacity = Integer.parseInt(scanner.nextLine());
                                if(gas_capacity >= 30 && gas_capacity <= 60){
                                    break;
                                }
                            }catch(NumberFormatException e){

                            }
                        }   if(type.equals("Car")){
                            while(true){
                                System.out.print("Input wheel [4 <= wheel <= 6]: ");
                                try{
                                    wheel = Integer.parseInt(scanner.nextLine());
                                    if(wheel >= 4 && wheel <= 6){
                                        break;
                                    }
                                }catch(NumberFormatException e){

                                }
                            }

                            while(true){
                                System.out.print("Input type [SUV | Supercar | Minivan]: ");
                                type2 = scanner.nextLine();
                                if(type2.equals("SUV") || type2.equals("Supercar") || type2.equals("Minivan")){
                                    break;
                                }
                            }

                            while(true){
                                System.out.print("Input entertainment system amount [>= 1]: ");
                                try{
                                    e_system_or_helm = Integer.parseInt(scanner.nextLine());
                                    if(e_system_or_helm >= 1){
                                        break;
                                    }
                                }catch(NumberFormatException e){

                                }
                            }
                            dataCar.add(new Car(e_system_or_helm, brand, name, license, top_speed, gas_capacity, wheel, type2));
                            System.out.println("ENTER to return");
                            scanner.nextLine();
                        }else {
                            while(true){
                                System.out.print("Input wheel [2 <= wheel <= 3]: ");
                                try{
                                    wheel = Integer.parseInt(scanner.nextLine());
                                    if(wheel >= 2 && wheel <= 3){
                                        break;
                                    }
                                }catch(NumberFormatException e){

                                }
                            }

                            while(true){
                                System.out.print("Input type [Automatic | Manual]: ");
                                type2 = scanner.nextLine();
                                if(type2.equals("Automatic") || type2.equals("Manual")){
                                    break;
                                }
                            }

                            while(true){
                                System.out.print("Input helm [>= 1]: ");
                                try{
                                    e_system_or_helm = Integer.parseInt(scanner.nextLine());
                                    if(e_system_or_helm >= 1){
                                        break;
                                    }
                                }catch(NumberFormatException e){

                                }
                            }
                            dataMotorcycle.add(new Motorcycle(e_system_or_helm, brand, name, license, top_speed, gas_capacity, wheel, type2));
                            System.out.println("ENTER to return");
                            scanner.nextLine();
                        }   
                    }
                    break;
                case "2":
                    {
                        int no = 1;
                        System.out.println("------------------------------------------");
                        System.out.printf("|%-3s|%-15s|%-20s|\n", "No", "Type", "Name");
                        System.out.println("------------------------------------------");
                        for (int i = 0; i < dataCar.size(); i++) {
                            System.out.printf("|%-3d|%-15s|%-20s|\n", no, dataCar.get(i).getType(), dataCar.get(i).getNama());
                            no++;
                        }
                        
                        for (int i = 0; i < dataMotorcycle.size(); i++) {
                            System.out.printf("|%-3d|%-15s|%-20s|\n", no, dataMotorcycle.get(i).getType(), dataMotorcycle.get(i).getNama());
                            no++;
                        }
                        
                        int number_vehicle;
                        while(true){
                            System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
                            try{
                                number_vehicle = Integer.parseInt(scanner.nextLine());
                                if(number_vehicle == 0){
                                    break;
                                }else if(number_vehicle > 0){
                                    if(number_vehicle <= (dataCar.size() + dataMotorcycle.size())){
                                        if(number_vehicle > dataCar.size()){
                                            number_vehicle -= dataCar.size();
                                            number_vehicle -= 1;
                                            dataMotorcycle.get(number_vehicle).carSelling();
                                        }else{
                                            number_vehicle -= 1;
                                            dataCar.get(number_vehicle).carSelling();
                                        }
                                    }
                                }
                            }catch(NumberFormatException e){

                            }
                        }
                    }
                    break;
                case "3":
                    System.exit(0);
                default:
                    break;
            }
            
            System.out.println("");
        }
    }
}
