package BasicMaths;

public class StringPrint {

    public static void print(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            else{
                int a = ch-'0';
                sb.append(a+i);
            }
        }
        String[] s = str.split(" ");
        System.out.println(s);
    }
    public static void main(String[] args) {
        String str = "shubh am 123";
        print(str);
    }
}
