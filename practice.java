
import java.util.*; // contains Collections framework

public class practice {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String word = scan.nextLine();
        scan.close();
    
        // String[] arr = new String[word.length()];
    
        for(int i=0; i<word.length(); i++){
            if (word.charAt(i) == 0){
                System.out.printf("zero ");
            }else if (word.charAt(i) == '1'){
                System.out.printf("one ");
            }else if (word.charAt(i) == '2'){
                System.out.printf("two ");
            }else if (word.charAt(i) == '3'){
                System.out.printf("three ");
            }else if (word.charAt(i) == '4'){
                System.out.printf("four ");
            }else if (word.charAt(i) == '5'){
                System.out.printf("five ");
            }else if (word.charAt(i) == '6'){
                System.out.printf("six ");
            }else if (word.charAt(i) == '7'){
                System.out.printf("seven ");
            }else if (word.charAt(i) == '8'){
                System.out.printf("eight ");
            }else if (word.charAt(i) == '9'){
                System.out.printf("nine ");
            }
        }
    }
}

