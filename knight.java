public class knight {
    public static void main (String[] args) {
        int X = 3;
        int Y = 3;
        int count = 0;
        
        if(X+2<=8 && Y+1<=8){count+=1;}
        if(X+2<=8 && Y-1>0){count+=1;}
        if(X-2>0 && Y-1>0){count+=1;}
        if(X-2>0 && Y+1<=8){count+=1;}
        if(X+1<=8 && Y+2<=8){count+=1;}
        if(X-1>0 && Y+2<=8){count+=1;}
        if(X+1<=8 && Y-2>0){count+=1;}
        if(X-1>0 && Y-2>0){count+=1;}
        
        System.out.println(count) ;
    }
}
