package String;

public class Strings {
    public static void main(String[] args) {
        String name = "Jagrut";

        String name2 = "Jagrut";

        String anotherName = new String("Jagrut");

        System.out.println(name);

        System.out.println(anotherName);

        System.out.println(name == anotherName);

        System.out.println(name == name2);

        name = "Anuj";// Strings are immutable so even if I assigned a new value
                      // to name String the old string Jagrut will still be there in memory.

        System.out.println(name);

    }
}
