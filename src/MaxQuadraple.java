import java.util.*;

public class MaxQuadraple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max =  maxProdQuad(n,arr);
        if(max == -1)
            System.out.println("No Maximum Product Quadruple");
        else
            System.out.println(max);

    }
    static int maxProdQuad(int n, int[] arr){

        if(n<4)
            return -1;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,max4=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,min3=Integer.MAX_VALUE,min4=Integer.MAX_VALUE;
        int product = 1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max4 = max3;
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
             if(arr[i]<max1&&arr[i]>max2)
            {
                max4 = max3;
                max3 = max2;
                max2 = arr[i];
            }
            if(arr[i]<max2&&arr[i]>max3)
            {
                max4 = max3;
                max3 = arr[i];

            }
            if(arr[i]<max3&&arr[i]>max4)
            {
                max4 = arr[i];
            }
            if(arr[i]<min1)
            {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = arr[i];

            }
            if(arr[i]>min1&&arr[i]<min2)
            {
                min4 = min3;
                min3 = min2;
                min2 = arr[i];
            }
            if(arr[i]>min2&&arr[i]<min3)
            {
                min4 = min3;
                min3 = arr[i];

            }
            if(arr[i]>min3&&arr[i]<min4)
            {
                min4 = arr[i];
            }
        }
        int x = max1*max2*max3*max4;
        int y = min1*min2*min3*min4;
        int z = max1*max2*min1*min2;

        if(x>y&&x>z)
            product =  x;
        else if(y>x&&y>z)
            product =  y;
        if(z>y&&z>x)
            product =  z;

        return product;
    }
}
