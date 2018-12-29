import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 赵佟
 * @Date: 2018/12/29 14:08
 * @Description:
 */
public class GiteTest {
    public static void main(String[] args) {
        System.out.println("hello  " );
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream()
                .forEach(s-> System.out.println(s));
    }
}
