// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class choco {
    public static void main (String[] args) {
        String[] input;
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int len = Integer.parseInt(num);
        input = scan.nextLine().split(" ");
        scan.close();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}