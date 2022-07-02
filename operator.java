// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class operator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        scan.close();
        int[] arr = new int[2];
        for(int i=0; i<2; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int dish = arr[1]-arr[0];
        System.out.println(dish);
    }
}
