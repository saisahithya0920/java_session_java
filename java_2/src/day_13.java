public class day_13 {
    //recursion
    //5 4 3 2 1
    public static void printNumbers(int num) { //num = -1
        //base case to treminate the function
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNumbers(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        printNumbers(num);
    }
    //hello
    //stack overflow
}
