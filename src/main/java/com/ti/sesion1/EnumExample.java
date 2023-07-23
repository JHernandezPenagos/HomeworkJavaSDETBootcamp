package com.ti.sesion1;

public class EnumExample {

    /*// anteriormente asi se utilizaba, no se necesitaba instanciar ni nada
    // a partir de Java 2 se crean los enums
    static final String URL = "www.pagina.com"; // para definir que es una constante tiene que ir en mayus
    static final String API = "www.pagina.com";

    public static void main(String[] args) {
        System.out.println(URL); // se aislan las variables de fuentes de codigo
    }*/
    public static void main(String[] args) {
        int today = WeekDays.WEDNESDAY.ranking;

        System.out.println(today);
        System.out.println(WeekDays.SATURDAY.event);

        System.out.println(selectBrowser(Browsers.FIREFOX));
    }

    private static String selectBrowser (Browsers b){
        String browserSelected = switch (b){
            case EDGE -> "Opening Edge browser";
            case CHROME -> "Opening Chrome browser";
            case FIREFOX -> "Opening Firefox browser";
            default -> "Bad option";
        };
        return browserSelected;
    }

}
