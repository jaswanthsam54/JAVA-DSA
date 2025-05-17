class star {
    int[] arr = {1,5,3};
    int x = 50;
    int ans  = -1;
    public void num1 (){
        for (int i = 0 ; i <arr.length;i++){
            if(arr[i] ==x){
                ans = i;                
            }
        }
    }
    public void num2 () {
        System.out.println("found " + x + " at Index " +ans);
    }
}
public class search {
    public static void main(String[] args) {
        star obj = new star();
        obj.num1();
        obj.num2();
    }   
}
