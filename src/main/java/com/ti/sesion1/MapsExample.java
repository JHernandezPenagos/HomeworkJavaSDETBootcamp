package com.ti.sesion1;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
      /*  Map<String,Integer> numsMap = new HashMap<>();  // <Clave o key es String, Valor o Value Int>

        numsMap.put("a", 100);
        numsMap.put("b", 200);
        numsMap.put("c", 300);
        numsMap.put("d", 400);

        System.out.println(numsMap.size());

         // entrySet es la forma en como va traer los datos dentro de mi mapa
        for (Map.Entry<String,Integer> subMapNum:numsMap.entrySet()) {
            System.out.println(subMapNum.getKey() + ": " + subMapNum.getValue() );
        }*/

      /*  // Identificar cuales users hay + Acceder a su key y probablemente a su valor
        Map<String,String> users = new HashMap<>();
        users.put("Admin", "Señor Barriga");
        users.put("NormalUser", "Kiko");
        users.put("SuperUser", "Don Ramon");
        users.put("Guest", "Doña Florinda");

// Secuencia para iterar todos los datos:
        for(Map.Entry<String, String> user: users.entrySet()){
            if (user.getKey().equals("Admin")){
                System.out.println("The Admin value is: " + user.getValue());
            }
            System.out.println(user.getKey());

        }*/

      /*Map<Integer,Double> gamePrices = new LinkedHashMap<>();

        gamePrices.put(1, 30.00);
        gamePrices.put(2, 43.50);
        gamePrices.put(3, 55.99);
        gamePrices.put(4, 12.25);
        gamePrices.put(5, 00.00);
        gamePrices.put(6, 100.00);
        gamePrices.put(6, 100.00);

        System.out.println(gamePrices.size());

        for(Map.Entry<Integer,Double> gamePrice: gamePrices.entrySet()){
            System.out.println("The primary key in the DB is: " + gamePrice.getKey() + "and the prices is $" + gamePrice.getValue());
        }*/

        Map<String, List<String>> dropDownInfo = new LinkedHashMap<>();
        List<String> listFruit = new ArrayList<>();
        listFruit.add("Pineapple");
        listFruit.add("Banana");
        listFruit.add("Apple");
        listFruit.add("Blueberry");

        dropDownInfo.put("Fruits", listFruit);

        for (Map.Entry<String, List<String>> fruit: dropDownInfo.entrySet()) {
            System.out.println("My " + fruit.getKey() + "contains " + fruit.getValue());
            fruit.getValue().forEach(x-> {
                if (x.equals("Banana")){
                    System.out.println("I found the Banana");
                }
            });
        }







    }
}
