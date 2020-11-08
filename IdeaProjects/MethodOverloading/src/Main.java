public class Main {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(14));
        calcFeetAndInchesToCentimeters(13, 1);
        calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0){
            if(inches >= 0 && inches <= 12){
                double sum = (feet * 12) + inches;
                System.out.println(feet + " feet " + inches + " inches = " +(sum * 2.54)+ "Centimeters");
                return (sum * 2.54);

            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) (inches / 12);
            double inches2 = (int) (inches % 12);
            System.out.println(inches + " inches = " + feet + " Feet " + inches2 + " inches");
            return (inches / 12);
        }
        else {
            return -1;
        }
    }
}
