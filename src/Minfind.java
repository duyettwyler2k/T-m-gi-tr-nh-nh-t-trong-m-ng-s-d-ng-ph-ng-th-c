import java.util.Scanner;

public class Minfind {
    static void minValue(int[]arr){
        int min=arr[0];
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array={1,2,4,5,6,7};
        minValue(array);
    }
}

