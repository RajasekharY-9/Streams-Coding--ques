import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Man {
    String name;
    String dept;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Man(String name, String dept, int age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public static void main(String[] args) {

        List<Man> man= Arrays.asList(new Man("John","HR",19),
                new Man("Bhanu","Accounts",21),
                new Man("Raanu","Security",29),
                new Man("Ponu","HR",26));
        Map<String, Long> resp = man.stream().collect(Collectors.groupingBy(Man::getDept, Collectors.counting()));
        resp.forEach((x,y)->{
            System.out.println(x+" - "+y);
        });
    }
}
