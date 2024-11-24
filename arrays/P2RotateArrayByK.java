public class P2RotateArrayByK {
    // Approach 1 : Using Extra Array 
    public static void rotate(int arr[], int k){
        int n = arr.length;
        k=k%n;
        int temp[]=new int[n];
        for(int i= 0; i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        // push Back to same array
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

    }

    // Approch 2: Reverse whole Array, Reverse first K elements, revrse reamaing K elements
    public static void rotate2(int arr[], int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        // rotate(arr, k);
        rotate2(arr, k);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
