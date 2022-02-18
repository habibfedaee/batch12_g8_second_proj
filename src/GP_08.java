public class GP_08 {
    public static void main(String[] args) {
        // 8: find the min and max number in an array
        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int min=array[0]; int max=array[0];
        for(int i=0; i< array.length; i++){
            if(array[i]<min){
                min=array[i];
            } else if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
