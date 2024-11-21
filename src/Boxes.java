import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        /* ¡Nos mudamos de piso! Vamos a crear un pequeño programa que nos ayude a saber en que caja
        pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 4. Bolsos
        Caja 5. Zapatos
        Caja 6. Cosas de verano
        Caja 7. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar?
        //(la respuesta deberá aparecer en la terminal en la misma línea)

        //Crea un programa que te devuelva lo siguiente:
        //<cosas> están en la caja <índice> en el caso de no existir que devuelva:
        // <cosas> no las empacaste, oops!

        String[] cosas = {"Libros", "Utensilios de cocina", "Artículos de baño", "Bolsos", "Zapatos", "Cosas de verano", "Cosas de invierno"};

        Scanner input = new Scanner(System.in);
        System.out.print("Hola, soy tu asistente de la organización ¿Qué deseas buscar?");
        String cosa = input.next();
        boolean found = false;

        for (int i = 0; i < cosas.length; i++) {
            if (cosa.equalsIgnoreCase(cosas[i])) {
                System.out.println(cosa + " están en la caja " + i + ".");
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println(cosa + " no las empacaste, oops!");
        }


        input.close();
    }
}
