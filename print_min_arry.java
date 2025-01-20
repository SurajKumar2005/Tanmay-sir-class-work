public class print_min_arry {
    public static int print_min(int arr[],int idx , int min)
    {
        if(idx > arr.length-1)
        return min;
        if(arr[idx] < min)
        {
            min = arr[idx];
        
        }
        return print_min(arr, idx+1, min);
    }
    public static void main(String[] args) {
        int[] arr = {9,11,2,45,-1,6,3};
        int min = print_min(arr,0,Integer.MAX_VALUE);
        System.out.println(min);
    }
}
