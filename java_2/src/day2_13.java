public class day2_13 {
        //recursion
        //1 2 3 4 5
        public static void printNumbers(int num) { //num = 5
            //base case to terminate the function
            if(num == 0){
                return;
            }
            printNumbers(num - 1);  // Recursive call first
            System.out.println(num); // Print after the recursive call
        }
        
        public static void main(String[] args) {
            int num = 5;
            printNumbers(num);
        }
    }
    

