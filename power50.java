import java.util.Arrays;

public class power50 {
    public static void main(String[] args) {
        String[] name1 = { "riki", "Manidip" };
        String[] name2 = { "riki", "Manidip" };
        // Arrays.equals(name1);
        // boolean result = name1.equals(name2);
        // System.out.println(result);
        boolean result = Arrays.equals(name1, name2);
        System.out.println(result);

    }
}
