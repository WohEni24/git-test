package hu.webler;

public class loop2 {

    public static void main(String[] args) {

        // for i + tab meg nyomása előhozza az alap loop fügvényt

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        System.out.println("-----------------");

        for (int i = 0; i < 5; i += 2) { // az i+2 nem működik, mert értéket kell neki adni az +=-vel
            System.out.println(i);

        }
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(i++);

        }
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++)
            System.out.println(++i);

        System.out.println("-----------------");

        int[] numbers = {10, 20, 30, 40};

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i);

        }
        System.out.println("-----------------");

        for (int i = 1; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("-----------------");
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("-----------------");
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[1]);

        }

        }


    }
