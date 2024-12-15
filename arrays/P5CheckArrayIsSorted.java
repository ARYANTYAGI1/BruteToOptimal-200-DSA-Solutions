public class P5CheckArrayIsSorted {
    public static boolean kSorted(int arr[], int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
    }
    return true;
}
    public static void main(String[] args) {
        int arr[]={1,2,4,1,5};
        int n= arr.length;
        boolean res = kSorted(arr,n);
        System.out.println(res);
    }
}
