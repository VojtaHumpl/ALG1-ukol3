package humpl;

import java.util.Scanner;

/**
 *
 * @author vojta
 */
public class TestICO {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        int ico = sc.nextInt();
        int tmpIco = ico;
        
        int x0,x1,x2,x3,x4,x5,x6,x7;       // lepší pole
                
        
        x7 = tmpIco % 10;
        tmpIco /= 10;
        x6 = tmpIco % 10;
        tmpIco /= 10;
        x5 = tmpIco % 10;
        tmpIco /= 10;
        x4 = tmpIco % 10;
        tmpIco /= 10;
        x3 = tmpIco % 10;
        tmpIco /= 10;
        x2 = tmpIco % 10;
        tmpIco /= 10;
        x1 = tmpIco % 10;
        tmpIco /= 10;
        x0 = tmpIco;
        
        int result1 = x0 * 8 + x1 * 7 + x2 * 6 + x3 * 5 + x4 * 4 + x5 * 3 + x6 * 2;
        int result2 = result1 % 11;
        
        if(result2 == 0)
            if(x7 == 1)
                System.out.println("ICO je správně");
            else
                System.out.println("ICO je nesprávné");
        else if(result2 == 1)
            if(x7 == 0)
                System.out.println("ICO je správně");
            else
                System.out.println("ICO je nesprávné");
        else if (x7 == (11 - result2))
            System.out.println("ICO je správně");
        else
            System.out.println("ICO je nesprávné");
            
        
    }
    
}
