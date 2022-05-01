
import java.util.Scanner;

public class LineComparison
{
    public double twopointdistance(int x1,int y1,int x2,int y2){
       return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }

    public static void main(String[] args) {
        System.out.println("Enter The coordinates of 2 points");
        LineComparison distance=new LineComparison();
        Scanner e=new Scanner(System.in);
        Scanner f=new Scanner(System.in);
        Scanner g=new Scanner(System.in);
        Scanner h=new Scanner(System.in);
       int a=e.nextInt();
       int b=f.nextInt();
       int c=g.nextInt();
       int d=h.nextInt();
       double dista=distance.twopointdistance(a,b,c,d);
        System.out.println("Distance between 2 Coordinates="+ dista);
    }
}
