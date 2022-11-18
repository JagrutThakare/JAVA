package methods;

public class Introduction {
    public static void main(String[] args) {
       
        int firstNum = 34;
        int secondNum = 23;
        int result = maxOf(firstNum, secondNum);

        char b = (char)maxOf(33, 97);
        System.out.println(result+ b);
        System.out.println(b);
        Hi();
    
    }

    static int maxOf(int a,int b) {  
        // if(a>b) {
        //     return a;
        // } else {
        //     return b;
        // }
        // OR

        return a>b? a:b;

    }

    
    static void Hi() {
        System.out.println("Hi \nGood Morning.");
    }
}
 