
import java.util.LinkedHashMap;

public class DuplicateCtrLinkedHM {


        static String str ="This is a counter program This program works This a a a";
        public static void main(String[] args) {
            LinkedHashMap hm =new LinkedHashMap();
            String [] strArr = str.split(" ");

            for (String s : strArr){
                if(hm.containsKey(s)) {
                    hm.put(s,(Integer)hm.get(s)+1);
                    if((Integer)hm.get(s)<3) {
                        System.out.println(s);
                    }
                }else{
                    hm.put(s,1);
                }

            }
            System.out.println(hm);
            System.out.println("Size="+hm.size());

        }
    }



