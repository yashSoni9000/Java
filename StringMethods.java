public class StringMethods {
    public static void main(String[] args){
        String s=" Java Boi";
        String sDuplicate=" Java Boi";
        int strLength=s.length();
        System.out.println(strLength);

        String strUpperCase=s.toUpperCase();
        System.out.println(strUpperCase);

        String strLowerCase=s.toLowerCase();
        System.out.println(strLowerCase);

        String strTrim=s.trim();
        System.out.println(strTrim);

        String strSubstring=s.substring(2);
        System.out.println(strSubstring);

        String strSubstringWithEnd=s.substring(2,5);
        System.out.println(strSubstringWithEnd);

        String strReplace=s.replace('J','V');// output = " Vava Boi"
        System.out.println(strReplace);

        boolean strStartsWith=s.startsWith("J",1);// output = true
//        boolean strStartsWith=s.startsWith("J",0);// output = false
        System.out.println(strStartsWith);

        boolean strEndswith=s.endsWith("oi");// output = true
        System.out.println(strEndswith);

        char strChar=s.charAt(1);// output = J
        System.out.println(strChar);

        int strIndexOf=s.indexOf("av");// output = 2
        System.out.println(strIndexOf);

        int strLastIndexOf=s.lastIndexOf("oi");
        System.out.println(strLastIndexOf);

        boolean strEquals=s.equals(sDuplicate);
        System.out.println(strEquals);

        int strCompareTo=s.compareTo(sDuplicate);
        System.out.println(strCompareTo);

        String strValueOf=s.valueOf(1);
        System.out.println(strValueOf);
    }
}
