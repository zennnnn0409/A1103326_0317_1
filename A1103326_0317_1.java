import java.util.Scanner;

public class array
{
    public static void main(String args[]) 
    {

        Scanner input = new Scanner(System.in);

        System.out.printf("輸入二維陣列 N x M 的N值 : ");
        int n = input.nextInt();
        System.out.printf("輸入二維陣列 N x M 的M值 : ");
        int m = input.nextInt();

        double[][] array = new double[n][m];

        //for迴圈
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                System.out.printf("輸入數值 : ");
                array[a][b] = input.nextDouble();
            }
        }

        //for each
        for(double[] c : array)
        {
            for(double d : c)
            {
                System.out.printf(d + "\t");
            }
            System.out.println();
        }  
    }
}