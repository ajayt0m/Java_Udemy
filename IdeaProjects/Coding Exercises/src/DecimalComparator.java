public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2){
        v1 = (int) (v1 * 1000);
        v2 = (int) (v2 * 1000);
        System.out.println(v1);
        System.out.println(v2);
        if(v1 == v2){
            return true;
        }
        else {
            return false;
        }
    }
}
