package com.mycompany.programacion1;

public class Programacion2 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de Seguridad", 33, "Peque�o Demonio");
        homero.greeting();
        
        
    }
    static class Character{
        String name;
        String ocupation;
        int age;
        String phrase;

        public Character(String name, String ocupation, int age, String phrase) {
            this.name = name;
            this.ocupation = ocupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
        void greeting(){
            System.out.println(this.phrase);
        }
    }
            
}
