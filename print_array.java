public class print_array {
    public static void print_rev(int arr[],int idx , int n)
    {
        if(idx == n)
        return;
        System.out.print(arr[idx] + " ");
        print_rev(arr, idx+1, n);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print_rev(arr,0,arr.length);
    }
}
