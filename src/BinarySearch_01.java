public class BinarySearch_01 {

    public static void main(String args[])
    {
        int[] a = {1,1,1,1};

        System.out.println(binsearch(a,0,a.length-1));
    }
    public static int binsearch(int[] a,int start,int end)
    {
        int mid = (start+end)/2;
        if(a[mid]==0&&(mid==0||a[mid-1]==1))
            return mid;
        else if(a[mid]==1&&(mid==a.length-1||a[mid+1]==0))
            return mid+1;
        else if(a[mid]==0)
            return binsearch(a,start,mid-1);
        else if(a[mid]==1)
            return binsearch(a,mid+1,end);
        return mid;
    }
}
