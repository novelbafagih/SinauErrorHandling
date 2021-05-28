package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapakah umur anda");
        try {
            int umur = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Masukkanlah angka");
        }
        finally {
//            ini akan dijalankan apapun yang terjadi
            System.out.println("Terimakasih Sudah memberitahu");
        }
    }
}
