import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNums {

    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,11,23,55,16,176);
        //Print num start with 1
        arr.stream().filter(a->a.toString().startsWith("1")).forEach(System.out::println);
    }
}
