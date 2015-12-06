package euler5;
public class Euler5 {
    public static void main(String[] args) {
        int i = 20;
        while (condition(i)){
            i += 2; //don't care about odd numbers
        }
        System.out.println(i);
    }
    
    public static boolean condition(int i){
        boolean b = false;
        for (int j = 1; j <= 20; j++){
            if (!(i % j == 0)){
                b = true;
                break;
            }
        }
        return b;
    }
}
