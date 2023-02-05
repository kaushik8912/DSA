public class Check_ArraySort {
    static boolean isSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
       }
        if(arr[i]>arr[i+1]){
            return false;
            }
     else   
    return isSort(arr, i+1);   
  
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,8,9};
        boolean res=isSort(arr, 0);
        System.out.println(res);
    }
}
