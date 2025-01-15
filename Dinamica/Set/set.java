
import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        
        HashSet<Integer> hash = new HashSet<Integer>();

        int repetidos = 0;

        for (int i = 0; i < 10; i++) {
            int n = i % 3;

            if (!hash.add(n)){
                repetidos++;
            }
        }
        System.out.println(repetidos);
        
        hash.add(10);
        hash.add(300);
        hash.add(8);
        if (hash.add(10)){

        }

        System.out.println(hash.toString());
    }
}
