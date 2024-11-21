public class Welcome {
    public static void main(String[] args) {
        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime:
        //¡Hola <name>, bienvenida a Java!
        System.out.println("Array coders:");
        String[] coders = {"Cristina", "Eva", "Miller", "Ángel", "Antonio"};

        for(int i = 0; i < coders.length; i++) {
            System.out.println("'Hola " + coders[i] + ", bienvenide a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números:
        //10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        System.out.println("Array números I:");
        int[] numbers = {5, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10 || numbers[i] == 30 || numbers[i] == 50 || numbers[i] == 70 || numbers[i] == 90) {
                System.out.println(numbers[i]);
            }
        }

        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado
        System.out.println("Array números II:");
        numbers = new int[] {10, 7, 23, 45};

        for(int i : numbers) {
            System.out.println(i * 2);
        }

        //Crea un array de tipo char que contenga las vocales en minúsculas
        //y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        System.out.println("Array carácteres: ");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char i : vowels) {
            System.out.println(Character.toUpperCase(i));
        }
    }
}