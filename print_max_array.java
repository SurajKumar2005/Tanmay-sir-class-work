public class print_max_array {
    public static int print_max(int arr[],int idx , int max)
    {
        if(idx > arr.length-1)
        return max;
        if(arr[idx] > max)
        {
            max = arr[idx];
        
        }
        return print_max(arr, idx+1, max);
    }
    public static void main(String[] args) {
        int[] arr = {9,11,2,45,-1,6,3};
        int max = print_max(arr,0,Integer.MIN_VALUE);
        System.out.println(max);
    }
}
