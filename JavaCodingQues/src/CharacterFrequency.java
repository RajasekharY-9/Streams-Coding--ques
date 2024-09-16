import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
//        String s = "Ramesh Ramaswamy";
//        Map<Character, Integer> frequencyMap = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            if (c != ' ') { // ignore spaces
//                frequencyMap.put(c, frequencyMap.get(c)+1);
//                System.out.println("frequencyMap.get(c) :: "+frequencyMap.get(c));
//            }
    //    }
        
//List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        System.out.println();
        List<Integer> list1=List.of(4,1,2,3,6);
        int n=list1.size()+1;
        System.out.println("n : "+n);
        int es=(n*(n+1))/2;
        int as=0;
        for(Integer s1:list1){
            as+=s1;
        }
        System.out.println("es :"+es);
        System.out.println("as : "+as);
        int res=es-as;
        System.out.println("Missing no :: "+res);

    }
}
