package com.ti.sesion1;

public class SwitchSentence {
    static String hero = "Spider-Man";
    static String loki = "";  // toda una linea de codigo se le va a asignar a una variable

    public static void main(String[] args) {
      /*  switch(hero){
            case "Iron-Man":
                loki = "Mandarin";
            case "Spider-Man":
                loki = "Venom";
            case "Hulk":
                loki = "Abomination";
            case "Daredevil":
                loki = "Kingpin";
            default:
                loki = "Loki";
        };*/

    /*    switch(hero){
            case "Iron-Man" -> {loki = "Mandarin";}
            case "Spider-Man" -> {loki = "Venom";}
            case "Hulk" -> {loki = "Abomination";}
            case "Daredevil" -> {loki = "Kingpin";}
            default -> {loki = "Loki";}*/

        loki = switch (hero){
            case "Iron-Man" -> "Mandarin";
            case "Spider-Man" -> "Venom";
            case "Hulk" -> "Abomination";
            case "Daredevil" -> "Kingpin";
            default -> "Loki";
        };

        System.out.println(loki);
    }
}
