public class P1SecondLargestElement{


    // Approach: 1 Brute Force Approach using Two Loops
    public static int secondMax(int arr[]){
        int large =arr[0];
        int secondLarge = -1;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }

    // Approach: 2 Optimal Approach Using Single Loop
    public static int secondLarge(int arr[]){
        int large = arr[0];
        int secondLarge = -1;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            } else if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,3,0,2,9,3};
        System.out.println("Second Large Through Approach 1:" + secondMax(arr) );
        System.out.println("Second Large Through Approach 2: " + secondLarge(arr));
    }
}