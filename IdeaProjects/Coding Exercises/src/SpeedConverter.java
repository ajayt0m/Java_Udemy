public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long miles = Math.round(kilometersPerHour/1.609);
            return miles;
        }
    }
    public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour < 0){
                System.out.println("Invalid Value");
            }
            else {
                long miles = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
            }
        }
}