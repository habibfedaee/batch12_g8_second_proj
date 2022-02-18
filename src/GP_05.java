public class GP_05 {
    public static void main(String[] args) {
        System.out.println("Swapping two values without third variable");
        int x = 10;
        int y = 20;
        // printing x and y before swapping
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        System.out.println("Swapping");
        // we add x to itself plus y, then
        // we add x minus y to y, then
        // we add x to itself minus y
        x = x + y;
        y = x - y;
        x = x - y;
        // printing result
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
    }
}
