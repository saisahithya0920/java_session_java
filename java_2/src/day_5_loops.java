public class day_5_loops {
    public static void main(String[] args) {
        String c = "trainings";
        System.out.println(c.length());
        System.out.println(c.charAt(0));
        //h

        //substring
        System.out.println(c.substring(3, 9));
        System.out.println(c.substring(0, 3));
        System.out.println(c.substring(2, 9));
        System.out.println(c.substring(2, 3));
        System.out.println("hello".equals("Hello"));
        System.out.println(c.substring(c.length() - 1));
        System.out.println(c.substring(c.length() - 3));
        System.out.println("a" + "b");
        String result = 1 + "b";
        System.out.print(result);
        System.out.println("hello" + (2 + 2));

        //for loop
        for(int count = 1; count <=10; count++){
            System.out.println("hehehe");
        }
    }
}
