public class loops_day_6 {
    public static void main(String[] args) {
        //outer loop
        for(int i=1; i<=4; i++){
            //inner loophttps://github.com/saisahithya0920/loops_day_6.git
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //****
            //after giving of system.out.println after the inner loop it 
            //will take to next line
            System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}