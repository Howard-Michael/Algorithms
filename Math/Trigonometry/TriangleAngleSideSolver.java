package Math.Trigonometry;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class TriangleAngleSideSolver {
    public static double a, b, c, A, B, C;
   
    public static void main(String[] args) {
        TriangleAngleSideSolver t = new TriangleAngleSideSolver();
        
        //enter the sidess and angles
        Scanner scanner = new Scanner(System.in);
        System.out.println("   *   ");
        System.out.println("a ***  b");
        System.out.println(" ***** ");
        System.out.println("*******");
        System.out.println("   c   ");
        System.out.println();
        System.out.println("For unknowns put '0'");
        System.out.print("What length is side a? ");
        a = scanner.nextDouble();
        System.out.print("What length is side b? ");
        b = scanner.nextDouble();
        System.out.print("What length is side c? ");
        c = scanner.nextDouble();
        System.out.print("What angle is opposite side a (in degrees)? ");
        A = scanner.nextDouble();
        System.out.print("What angle is opposite side b (in degrees)? ");
        B = scanner.nextDouble();
        System.out.print("What angle is opposite side c (in degrees)? ");
        C = scanner.nextDouble();
        
        
        if(A>0 && B>0 && C==0 || A>0 && B==0 && C>0 || A==0 && B>0 && C>0){ //1 side 2 angles
            t.findAngleWithTwoAngle();
            t.findSideWithTwoAngleSide();
            t.findSideWithTwoAngleSide();
        } else{ //2 sides 1 angle
            t.findSideWithTwoSideAngle();
            t.findAngleWithTwoSideAngle();
            t.findAngleWithTwoAngle();
            t.findSideWithTwoAngleSide();
        }
        
        System.out.println();
        System.out.println(a + ", " + b + ", " + c + ", " + A + ", " + B + ", " + C);
    }
    
    public void findAngleWithTwoAngle(){
        if(A>0 && B>0 && C==0)
            C = 180 - A - B;
        else if(A>0 && C>0 && B==0)
            B = 180 - A - C;
        else if(B>0 && C>0 && A==0)
            A = 180 - B - C;
    }
    
    public void findSideWithTwoSideAngle(){
        //law of cosines
        if(b>0 && c>0 && A>0 && a==0) //a^2 = b^2 + c^2 - 2*b*c*Cos(A)
            a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - 2*b*c*Math.cos(Math.toRadians(A)));
        else if(a>0 && c>0 && B>0 && b==0) //b^2 = a^2 + c^2 - 2*a*c*Cos(B)
            b = Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - 2*a*c*Math.cos(Math.toRadians(B)));
        else if(a>0 && b>0 && C>0 && c==0) //c^2 = a^2 + b^2 - 2*a*b*Cos(C)
            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(C)));
        else
            System.out.println("law of cosines did nothing");
    }
    
    public void findAngleWithTwoSideAngle(){
        //law of sins
        //sin(A) / a = sin(B) / b = sin(C) / c
        if(A==0){
            if(B>0 && a>0 && b>0)
                A = Math.toDegrees(Math.asin(a * Math.sin(Math.toRadians(B)) / b));
            else if(C>0 && a>0 && c>0)
                A = Math.toDegrees(Math.asin(a * Math.sin(Math.toRadians(C)) / c));
        } else if (B==0){
            if(A>0 && a>0 && b>0)
                B = Math.toDegrees(Math.asin(b * Math.sin(Math.toRadians(A)) / a));
            else if(C>0 && b>0 && c>0)
                B = Math.toDegrees(Math.asin(b * Math.sin(Math.toRadians(C)) / c));
        } else if (C==0){
            if(A>0 && a>0 && c>0)
                C = Math.toDegrees(Math.asin(c * Math.sin(Math.toRadians(A)) / a));
            else if(B>0 && b>0 && c>0)
                C = Math.toDegrees(Math.asin(c * Math.sin(Math.toRadians(B)) / b));
        }
    }
    
    public void findSideWithTwoAngleSide(){
        //law of sins
        //sin(A) / a = sin(B) / b = sin(C) / c
        if(a==0){
            if(B>0 && A>0 && b>0)
                a = b * Math.sin(Math.toRadians(A)) / Math.sin(Math.toRadians(B));
            else if(C>0 && A>0 && c>0)
                a = c * Math.sin(Math.toRadians(A)) / Math.sin(Math.toRadians(C));
        } else if (b==0){
            if(A>0 && a>0 && B>0)
                b = a * Math.sin(Math.toRadians(B)) / Math.sin(Math.toRadians(A));
            else if(C>0 && B>0 && c>0)
                b = c * Math.sin(Math.toRadians(B)) / Math.sin(Math.toRadians(C));
        } else if (c==0){
            if(A>0 && a>0 && C>0)
                c = a * Math.sin(Math.toRadians(C)) / Math.sin(Math.toRadians(A));
            else if(B>0 && b>0 && C>0)
                c = b * Math.sin(Math.toRadians(C)) / Math.sin(Math.toRadians(B));
        }
    }
}
