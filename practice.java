import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class practice {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i=1; i<=testCase; i++){
            int arrLength = scan.nextInt();
            int[] arr = new int[arrLength];
            for(int j=0; j<arrLength; j++){
                arr[j] = scan.nextInt();
            }
            Arrays.sort(arr);
            System.out.print(arr[arrLength-1] + " " + arr[arrLength-2] + " " + arr[arrLength-3] + "\n");
            for(int k=0; k<arrLength; k++){
                System.out.print(arr[k]+" ");
            }
        }
    }
}