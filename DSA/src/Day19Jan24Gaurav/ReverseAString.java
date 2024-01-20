package Day19Jan24Gaurav;

public class ReverseAString {
    public static void main(String[] args) {
        String name="MyNameIsGaurav";
        int length=name.length();
        char[] ch=new char[length];
        ch=name.toCharArray();
        StringBuilder reversedName= new StringBuilder();
        for (int i =length-1 ; i>=0 ; i--) {
            reversedName.append(ch[i]);
        }
      //  System.out.println(reversedName);
       String finalAnswer= reversedName.toString();
        System.out.println("Reversed String is ::"+finalAnswer);

    }
}
