
import java.util.Scanner;

/**
 * To check equality of two lines based on the end points
 */
public class LineComparison
{
    //To calculate length of the line
    public double twopointdistance(int array[]){
        int x1=array[0];
        int x2=array[1];
        int y1=array[2];
        int y2=array[3];
       return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }
    //To get the coordinates from user
    public int[] coordinatescollection(){
        Scanner e=new Scanner(System.in);
        int [] array=new int[4];
        for (int i=0;i<4;i++){
            array [i]=e.nextInt();
        }
         return array;
    }
    //To check the equality of 2 lines
    public String equality(){
        String X="Equal";
        String Y="Not Equal";
        LineComparison d1=new LineComparison();
        LineComparison d2=new LineComparison();
        int [] a1=new int[4];
        int [] a2=new int[4];
        System.out.println("Enter the coordinates of 1st Line:");
        a1=d1.coordinatescollection();
        System.out.println("Enter the coordinates of 2nd Line:");
        a2=d2.coordinatescollection();
        double dista1=d1.twopointdistance(a1);
        double dista2=d2.twopointdistance(a2);
        if (dista1==dista2)
            return X;
        else
            return Y;
    }

    public static void main(String[] args) {
        LineComparison Comp=new LineComparison();
        System.out.println("The two lines are "+ Comp.equality());
    }
}
