
public class Source1 {

    public static void main(String args[]) {
        int[] votes = {2,1,4,3};
        merge(votes,0,1,votes.length-1);
        for(int i=0;i<votes.length;i++) {
            System.out.println(votes[i]);
        }
    }
    public static int[] merge(int[] numb, int start, int mid, int end) {
        int left = start; //inital index of first subarray
        int right = mid + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] temp = new int[numb.length];
        while (left <= mid && right <= end) {
            if (numb[left] >= numb[right]) {
                temp[k] = numb[left];
                k++;
                left++;
            } else {
                temp[k] = numb[right];
                k++;
                right++;
            }
        }
        // Copy the remaining elements on left half , if there are any
        while (left <= mid) {
            temp[k] = numb[left];
            k++;
            left++;
        }
        // Copy the remaining elements on right half , if there are any
        while (right <= end) {
            temp[k] = numb[right];
            k++;
            right++;
        }
        // Copy the remaining elements from array t back the numbers array
        left = start;
        k = 0;
        while (left <= end) {
            numb[left] = temp[k];
            left++;
            k++;
        }
        return numb;
    }

}