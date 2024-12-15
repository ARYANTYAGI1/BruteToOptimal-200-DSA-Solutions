public class P4MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int arr []= {1,0,2,0,0,1,3,0};
        moveAllZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    // Approach 1: Using Extra Space and Two Loops
    public static void moveAllZeroes(int arr[]){
        int n = arr.length;
        int count = 0;
        int temp[]= new int [n];
        for(int i = 0; i<n;i++){
            if(arr[i]!=0){
                temp[count++]=arr[i];
            }
        }
        while(count<n){
            temp[count++]=0;
        }
        for(int i= 0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    //Approach 2:
}
