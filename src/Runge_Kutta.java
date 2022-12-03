import java.lang.*;
import java.util.Scanner;
public class Runge_Kutta
{
    static public double f(double x, double y)
    {
        return(x*x+x*y+y*y);
    }
    public static void main(String args[])
    {

        double x0, y0, h, xf;
        double  k1, k2,k3,k4,K;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial point x0, y0, h, xf");
        x0=sc.nextFloat();
        y0=sc.nextFloat();
        h=sc.nextFloat();
        xf=sc.nextFloat();
        while(x0<=xf)
        {
            System.out.println("x0 = "+x0+"  y0 = "+y0);
            k1=f(x0,y0);
            k2=f(x0+0.5*h, y0+0.5*k1);
            k3=f(x0+0.5*h, y0+0.5*k2);
            k4=f(x0+h,y0+k3);
            K=(k1+2*k2+2*k3+k4)/6;
            y0=y0+h*K;
            x0=x0+h;
            //System.out.println("x0 : "+x0+"\ny0 : "+y0+"\nK : "+K+"\n\n");
        }
    }
}
