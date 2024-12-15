public class P6CheckArrayIsSortedRotated {
    public static boolean check(int arr[]){
        int count = 0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        if(count<=1) return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        boolean res = check(arr);
        System.out.println(res);
    }
}