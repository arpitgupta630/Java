// import java.util.*; // contains Collections framework

public class doremonBigLight {
    public static void main (String[] args) {
        int gHeight = 4;        // 5
        int sHeight = 2;        // 4
        int gVelocity = 2;      // 1
        int sVelocity = 4;      // 6
        
        long startTime = System.currentTimeMillis();
        long waitTime = 1000;
        long endTime = startTime + waitTime;
    
        while(System.currentTimeMillis() < endTime){
            gHeight += gVelocity;
            sHeight += sVelocity;
            if (gHeight == sHeight){
                System.out.println("Yes");
            }
        }
        System.out.println("No");
    }
}

