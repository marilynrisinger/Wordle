
import java.util.Arrays;
public class test {
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        mystery(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void mystery(int[] values) {
        for (int i = 1; i < values.length; i += 2) {
            values[i] = values[i - 1];
    
            
        }
    
        values[0] = values[values.length - 1];
    
        
        

    }
    
}   
