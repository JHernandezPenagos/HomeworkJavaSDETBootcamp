package com.ti.sesion1;

public class ConditionalIFStructures {
    public static void main(String[] args) {
        String hero = "Spider-man";
        String loki = "";

       /* if(hero.equals("Iron-Man")){  // Cualquier otro heroe que no era Iron-Man, se va a transformar en Loki como tal
            loki = "Mandarin";
            System.out.println(loki);
        } else {
            loki = "Loki";
        }

        System.out.println(loki);*/

        loki = (hero.equals("Iron-Man"))?("Mandarin"):("Loki");

        System.out.println("Result = " + loki);



    }
}
