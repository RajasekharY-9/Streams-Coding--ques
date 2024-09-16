import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    String name;
    List<String> phNo;

    public Person(String name, List<String> phNo) {
        this.name = name;
        this.phNo = phNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhNo() {
        return phNo;
    }

    public void setPhNo(List<String> phNo) {
        this.phNo = phNo;
    }

    public static void main(String[] args) {
        Person p1=new Person("Raja",Arrays.asList("9865321456l","9865321450l"));
        Person p2=new Person("Raja",Arrays.asList("1265321456l","4465321450l"));
        Person p3=new Person("Raja",Arrays.asList("2265321456l","7765321450l"));
        Person p4=new Person("Raja",Arrays.asList("6865321456l","9965321450l"));
        List<Person> list= Arrays.asList(p1,p2,p3,p4);

        List<String> collect = list.stream().flatMap(x -> x.getPhNo().stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
