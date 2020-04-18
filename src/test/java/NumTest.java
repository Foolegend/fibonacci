import com.zte.lgf.Num;

public class NumTest {
    public static void main(String[] args){
        Num num1 = new Num("9999");
        Num num2 = new Num("");
        System.out.println(num1.add(num2));
        num1 = new Num("9999");
        num2 = new Num("1");
        System.out.println(num1.add(num2));
        num1 = new Num("");
        num2 = new Num("1");
        System.out.println(num1.add(num2));

        num1 = new Num("0000");
        num2 = new Num("1");
        System.out.println(num1.add(num2));
    }
}
