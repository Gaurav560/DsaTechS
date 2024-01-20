package Day19Jan24Gaurav;

//program to add two complex numbers
public class ComplexNumbers {



    //instantiating two integer variables for two parts of complex numbers

    int realPart,imaginaryPart;

   //injecting values in the Complex number through Parameterized Constructor
    public ComplexNumbers(int r, int i){
        this.realPart=r;
        this.imaginaryPart=i;
    }

    //defining a method to print complex number
public  static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2){
        ComplexNumbers result=new ComplexNumbers(0,0);
        //adding real part
        result.realPart=c1.realPart+c2.realPart;
        //adding complex parts
    result.imaginaryPart=c1.imaginaryPart+c2.imaginaryPart;

        return result;
}

    public void showOnConsole(){
        System.out.println("Added Complex Number is: " +this.realPart+" +i"+this.imaginaryPart );

    }

    //main method
    public static void main(String[] args) {

        ComplexNumbers c4=new ComplexNumbers(2,3);
        ComplexNumbers c5=new ComplexNumbers(4,5);
     ComplexNumbers finalResult=add(c4,c5);
        finalResult.showOnConsole();


    }

}







