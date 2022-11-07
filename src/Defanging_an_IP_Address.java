//1108
public class Defanging_an_IP_Address {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    //Another way
//    class Solution {
//        public String defangIPaddr(String address) {
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i<address.length();i++)
//            {
//                if(address.charAt(i)=='.')
//                {
//                    sb.append("[.]");
//                }
//                else
//                {
//                    sb.append(address.charAt(i));
//                }
//            }
//            return sb.toString();
//        }
//    }
    public static void main(String[] args) {
        String address = "1.1.1.1";

        String result = defangIPaddr(address);

        System.out.println(result);
    }
}
