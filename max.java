class maxi {
    int[] arr = {5,3,6,2,8,4};
    int ans = 0 ;
public void maximum() {
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > ans){
            ans = arr[i];
        }
    }
}
    public void answer() {
        System.out.println("Max:" +ans);
    }
}
public class max {
    public static void main(String[] args) {
        maxi obj = new maxi();
        obj.maximum();;
        obj.answer();
    }
}
