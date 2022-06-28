// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class rms{
    public static void main (String[] args) {
        String[] input;
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int len = Integer.parseInt(num);
        input = scan.nextLine().split(" ");
        scan.close();
        if(len==0){
            System.out.println(len);
        }else{
            int[] arr = new int[len];
            for(int i=0; i<len; i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            float sum = 0;
            for(int i=0; i<len; i++){
                sum += arr[i]*arr[i];
            }
            float leng = len;
            double mean = sum/leng;
            double root = Math.sqrt(mean);
            // System.out.println(sum);
            // System.out.println(leng);
            // System.out.println(mean);
            // System.out.println(root);
            System.out.format("%.6f",root);
        }
        
    }
}
