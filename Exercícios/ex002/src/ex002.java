import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        float x, y, z;

        x = sc.nextFloat();
        y = sc.nextFloat();
        z = x + y;

        System.out.printf("A soma dos valor %.1f e %.1f resulta em %.1f", x, y, z);
        
        sc.close();
    }
}
