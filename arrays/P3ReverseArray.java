public class P3ReverseArray {

    //Approach: 1 Brute Force Using Extra Space
    public static void reverse(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    //Approach:2 Using Two Pointers
    public static void reverse2(int arr[]){
        int n= arr.length;
        int start=0;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,3,0,2,9,3};
        reverse(arr);
        System.out.println("Reverse Through Approach 1:" );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Through Approach 2:" );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
