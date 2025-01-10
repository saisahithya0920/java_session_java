public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        student std1 = new student();
        std1.name = "sai";
        std1.id = 90;
        std1.classname = "g2";
        std1.dept = "cse";
        System.out.println(std1.name);
        System.out.println(std1.id);
        System.err.println(std1.classname);
        System.err.println(std1.dept);
    }
    
}
