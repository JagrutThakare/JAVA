package String;

public class FunctionsInStr {
    public static void main(String[] args) {

        String name = "Anuj Kumar Sharma";

        String name2 = "Anuj Kumar Sharma";

        String name3 = "";

        System.out.println(name.equals(name2)); // This one is different from previous == operator used to check strings

        System.out.println(name.charAt(3));

        System.out.println(name.length());

        System.out.println(name.substring(2));

        System.out.println(name.substring(3, 15));

        System.out.println(name.contains("Anuj"));

        System.out.println(name3.isEmpty());

        String name4 = "Anuj";

        name4 += " Kumar";

        System.out.println(name4);

        System.out.println(name4.concat(" Sharma"));

        System.out.println(name4.replace('A', 'c'));

        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";

        String allCars[] = cars.split(",");

        for (String car : allCars) {
            System.out.println(car);
        }

        System.out.println(cars.indexOf('a'));

        System.out.println(cars.indexOf('z'));

        System.out.println(cars.toLowerCase());

        System.out.println(cars.toUpperCase());

        String name5 = "    Anuj    ";

        System.out.println(name5.trim());

    }
}
