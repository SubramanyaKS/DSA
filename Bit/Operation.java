public class Operation {
   public static void main(String[] args) {
        System.out.println(getIthBit(11, 1));
        System.out.println(clearIthBit(10, 1));
   }
   public static int getIthBit(int n, int i){
        int bitMask= (1<<i);
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
   }
   public static int setIthBit(int n, int i){
        int bitMask= (1<<i);
        return n | bitMask;   
    }
    public static int clearIthBit(int n, int i){
        int bitMask= ~(1<<i);
        return n & bitMask;   
    }
    public static int clearIBit(int n, int i){
        int bitMask= ((~0)<<i);
        return n & bitMask;   
    }
    public static int updateIthBit(int n, int i, int newBit){
        n=clearIthBit(n, i);
        int bitMask= (newBit<<i);
        return n | bitMask;
    }

}