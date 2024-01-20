package Day19Jan24Gaurav;

public class ReverseAStringMethod2 {
    public static void main(String[] args) {
        String str="MyNameIsGaurav";

        //we can use either StringBuilder or StringBuffer as both have inbuilt reverse methods
        StringBuilder stringBuilder=new StringBuilder();
stringBuilder.append(str);
stringBuilder.reverse();
      String newString= stringBuilder.toString();
        System.out.println(newString);
    }

}
