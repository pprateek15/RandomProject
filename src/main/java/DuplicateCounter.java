import java.util.HashMap;

public class DuplicateCounter {


    static String str ="This is a counter program This program works This a a a";
    public static void main(String[] args) {
        HashMap hm =new HashMap();
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

