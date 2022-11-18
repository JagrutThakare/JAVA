package Chapter9.Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        A c = new Client();
        c.show(55);

        Client newClient = new Client();

        newClient.example();
        A.example2();
        
        
    }
}

class Client implements A {

    @Override // annotations
    public void show(int parameter) {
        System.out.println("The parameter is " + parameter);
    }
    
}