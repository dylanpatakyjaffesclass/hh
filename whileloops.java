public class whileloops
{
    
    public void run() {
        
        int i = 0;
        int k = 7;
        int a = 0;
        int b = 0;
        
        while (i < 15) {
            System.out.println("i is " + i + " but less than 15");
            i++;
        }
        
        while (k > 5) {
            System.out.println("i is " + i);
            k--;
        }
        
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and b is " + b);
            a++;
            b++;
        }
    }
    
    public static void main(String[] args)
    {
        whileloops hw = new whileloops();
        hw.run();
    }
}
