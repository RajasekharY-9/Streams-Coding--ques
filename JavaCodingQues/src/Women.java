import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Women {

    String name;
    String dept;
    Long salary;

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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Women(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Women> list= Arrays.asList(new Women("Rani","HR", 21000L),
                new Women("Dharu","HR", 22000L),
                new Women("Pooja","Accounts", 23000L),
                new Women("Sita","Accounts", 24000L));
        Map<String, Double> resp = list.stream().collect(Collectors.groupingBy(Women::getDept, Collectors.averagingLong(Women::getSalary)));

        resp.forEach((x,y)->{
            System.out.println(x + " " +y);
        });
    }
}
