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
    }
}
