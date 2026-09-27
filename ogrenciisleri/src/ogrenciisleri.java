/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ogrenciisleri {

    public static void main(String[] args) {
        System.out.println("=== STUDENT INFORMATION SYSTEM ===");
        System.out.println("Language Used: Java\n");

        // Öğrenci Listesi
        List<Students> studentList = new ArrayList<>();

        // 1. Öğrenci Kaydı
        Students student1 = new Students(
                UUID.randomUUID(),
                "250504005",
                "12345678901",
                "Tuğbanur",
                "Türkmen",
                LocalDate.of(2006, 1, 8),
                Gender.FEMALE,
                "tugbanur@gmail.com",
                "6493878982983",
                "izmir,turkiye",
                UUID.randomUUID(),
                2025,
                2,
                StudentStatus.ACTIVE,
                "https://hgfeufhiehjf.com",
                OffsetDateTime.now()
        );

        // 2. Öğrenci Kaydı
        Students student2 = new Students(
                UUID.randomUUID(),
                "25050809005",
                "12379678901",
                "Deniz",
                "Yıldız",
                LocalDate.of(2006, 1, 8),
                Gender.MALE,
                "deniz@gmail.com",
                "6493874839983",
                "izmir,turkiye",
                UUID.randomUUID(),
                2025,
                2,
                StudentStatus.ACTIVE,
                "https://hgfeuf8393jf.com",
                OffsetDateTime.now()
        );

        // Listeye Ekleme
        studentList.add(student1);
        studentList.add(student2);

        // Konsola Yazdırma
        System.out.println("Registered Students List:");
        for (Students student : studentList) {
            System.out.println(student);
        }
    }
}