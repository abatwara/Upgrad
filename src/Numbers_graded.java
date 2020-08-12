
import java.util.*;

class Number {
   private double realPart,imaginaryPart;

    public Number(double real, double imaginary) {
        setRealPart(real);
        setImaginaryPart(imaginary);
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }


}

class Complex extends Number {
    public Complex(double real, double imaginary) {
        super(real, imaginary);
    }

    public void checkComplex()
{
    if(this.getImaginaryPart()!=0)
    {
        System.out.println("The given number is complex");
        if(this.getRealPart()!=0) {
            System.out.println(this.getRealPart() + "+i" + this.getImaginaryPart());
        }
        else
        {
            System.out.println("i"+this.getImaginaryPart());
        }
    }
    else
    {
        System.out.println("The given number is real");
        System.out.println(this.getRealPart()+"+i"+this.getImaginaryPart());
    }
}
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double real, double imaginary) {
        super(real, imaginary);
    }

    public void checkPurelyImaginaryNumber() {
        if (this.getRealPart() == 0&&this.getImaginaryPart()!=0) {
            System.out.println("The number is purely imaginary");

        } else {
            System.out.println("The number is not purely imaginary");
        }
    }
}

public class Numbers_graded {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}

