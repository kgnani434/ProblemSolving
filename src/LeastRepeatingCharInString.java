import java.util.Map;
import java.util.stream.Collectors;

public class LeastRepeatingCharInString {
    public static void main(String[] args){
        String name="abcdbckdkabcdaeg";
//        char[] chars = name.toCharArray();
//        for (Character c : chars){
//            if(map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            }else{
//                map.put(c,1);
//            }
//        }
//        System.out.println(name);
//        char[] result = new char[name.length()];
//        int prevCount=1;
//        int numberOfLeastRepeatingCharacter = 0;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            Character k = entry.getKey();
//            Integer v = entry.getValue();
//            if (prevCount == v) {
//                result[numberOfLeastRepeatingCharacter++] = k;
//                prevCount = v;
//            }
//
//
//        }System.out.println("Number of Least Repeating Character in given String : " +numberOfLeastRepeatingCharacter);
//        for (int i=0;i<numberOfLeastRepeatingCharacter;i++){
//            System.out.println(result[i]);
//        }
//        map.entrySet();
        String result = name.chars().mapToObj(i->Character.toString((char)i))
                .collect(Collectors.toMap(k->k,v->1,Integer::sum))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println(result);
    }
}
