import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class MyFirstProgramJava {
    public static void main(String[] args) throws InterruptedException {
        // ANSI escape codes for colors
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String cyan = "\u001B[36m";

        // Mendapatkan waktu saat ini
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        String greeting;

        if (hour >= 5 && hour < 12) {
            greeting = "Selamat Pagi";
        } else if (hour >= 12 && hour < 15) {
            greeting = "Selamat Siang";
        } else if (hour >= 15 && hour < 18) {
            greeting = "Selamat Sore";
        } else {
            greeting = "Selamat Malam";
        }

        typeText(green + greeting + "! Tuan!" + reset);
        typeText(yellow + "Tolong beritahu nama anda Tuan:" + reset);

        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        
        typeText(blue + "Halo Tuan " + userName + "! Senang bertemu denganmu." + reset);
        typeText(green + "Apa ada yang bisa dibantu, Tuan " + userName + "?" + reset);
        typeText(yellow + "Pilih salah satu opsi berikut yah Tuan:" + reset);
        typeText(blue + "1. Aku Mau Lihat Fun Fact dari Java");
        typeText("2. Aku Mau Lihat versi Java yang saya gunakan" + reset);
        
        System.out.print("Masukkan pilihan (1/2): ");
        int choice = myObj.nextInt();
        
        // Array fun facts
        String[] funFacts = {
            "dulu Tuan, Java dibuat karena programmer dulu sangat membenci bahasa pemrograman C, sehingga Java Dibuat.",
            "Jadi Tuan, Java awalnya bernama Oak sebelum diubah menjadi Java.",
            "Tau tidak Tuan, Java digunakan oleh lebih dari 3 miliar perangkat di seluruh dunia.",
            "jadi Tuan, Moto dari Java adalah 'Write Once, Run Anywhere' yang berarti kode Java bisa dijalankan di berbagai sistem operasi tanpa perlu modifikasi Tuan.",
            "Java memiliki maskot bernama Duke Tuan, karakter yang berbentuk segitiga dengan tangan dan kaki yang dibuat oleh tim Sun Microsystems pada 1990-an Tuan",
            "Tau tidak Tuan Aplikasi NASA dan Mars Rover Menggunakan pemograman Java",
            "Tau tidak Tuan Minecraft di buat menggunakan Java oleh Developer Bernama Notch, dan Minecraft Java masih banyak Di mainkan Sampai Sekarang Tuan"
        };
        
        if (choice == 1) {
            Random random = new Random();
            String selectedFunFact = funFacts[random.nextInt(funFacts.length)];
            typeText(cyan + "jadi Tuan Fun Fact dari Java: " + selectedFunFact + reset);
        } else if (choice == 2) {
            String javaVer = System.getProperty("java.version");
            typeText(red + "Versi Java yang sedang Tuan gunakan adalah: " + javaVer + reset);
        } else {
            typeText(red + "Pilihan tidak valid. Silakan coba lagi." + reset);
        }
        
        myObj.close();
    }
    
    // Method untuk efek typing
    public static void typeText(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(50); // Delay 50ms per karakter
        }
        System.out.println();
    }
}
