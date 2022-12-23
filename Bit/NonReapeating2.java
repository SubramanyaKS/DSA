public class NonReapeating2 {
    public static void main(String[] args) {
        int arr[] ={6,7, 3, 5, 4, 5, 3, 4};
        findNon2(arr,arr.length);
    }
    public static void findNon2(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(sum^arr[i]);
        }
        sum=(sum & -sum);
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++){
            if((arr[i] & sum)>0){
                sum1=(sum1^arr[i]);
            }
            else{
                sum2=(sum2^arr[i]);
            }
        }
        System.out.println(sum1+" "+sum2);
    }
}
