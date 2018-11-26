import java.util.Stack;

public class DuplicateCtrStack {

    static String str ="This is a counter program This program works This a a a";
    public static void main(String[] args) {

        Stack st =new Stack();
        String [] strArr = str.split(" ");
        for (String s : strArr){
            if(st.contains(s)){
                System.out.println(s);
            }else{
                st.push(s);
            }
        }
    }
}
