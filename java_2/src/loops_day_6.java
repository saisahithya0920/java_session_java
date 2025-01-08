public class loops_day_6 {
    public static void main(String[] args) {
        //outer loop
        for(int i=1; i<=4; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //****
            //after giving of system.out.println after the inner loop it 
            //will take to next line
            System.out.println();
        }
    }
}

