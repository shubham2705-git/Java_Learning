package ArrayEasyLevel;

    public class AddNumbersOfString {
        public static void print(String s){
                String str = "abc12cde4bc6";
                int sum = 0;
                int num = 0;

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch >= '0' && ch <= '9') {
                        num = num * 10 + (ch - '0');
                    }
                    else {
                        sum += num;
                        num = 0;
                    }
                }
                sum += num;
                System.out.println(sum);
            }
        public static void main(String[] args) {
            String s = "ABC13ADCS123";
            print(s);
        }
    }
