public class Main {
    public static void main(String[] args){
        //SpeedConverter
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " +miles);
        SpeedConverter.printConversion(10.5);

        //MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        //BarkingDog
        System.out.println(BarkingDog.shouldWakeUp(true, 4));

        //LeapYear
        System.out.println(LeapYear.isLeapYear(-1600));

        //DecimalComparator
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.176,3.175));

        //EqualSumChecker
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));

        //TeenNumberChecker
        System.out.println(TeenNumberChecker.isTeen());
    }
}
