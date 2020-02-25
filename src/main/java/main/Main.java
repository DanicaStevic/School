
package main;

import student.Student;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Napravljena je klasa Student");
        String message = "Poruka";
        
    Student Petar = new Student( "Petar" , "Petrovic", 1990);
    Petar.Info();
    }
    
}
