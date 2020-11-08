public class Main {
    public static void main(String [] args){
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >=0 && seconds <= 59)){
            seconds = (minutes * 60) + seconds;
            int hours = seconds / 3600;
            seconds = seconds % 3600;
            minutes = seconds / 60;
            seconds = seconds % 60;
            return hours+ "h " +minutes+ "m " +seconds+ "s";
        }
        else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);
        }
        else{
            return "Invalid Value";
        }
    }
}
