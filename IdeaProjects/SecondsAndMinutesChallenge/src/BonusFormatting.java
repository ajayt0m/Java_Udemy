public class BonusFormatting {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
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
            return formatting(hours,minutes,seconds);
        }
        else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);
        }
        else{
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String formatting(int hours, int minutes, int seconds){
        String hoursString = String.valueOf(hours) + "h ";
        String minutesString = String.valueOf(minutes) + "m ";
        String secondsString = String.valueOf(seconds) + "s";
        if(hours < 10){
            hoursString = "0" +hours+ "h ";
        }
        if(minutes < 10){
            minutesString = "0" +minutes+ "m ";
        }
        if(seconds < 10){
            secondsString = "0" +seconds+ "s ";
        }
        return hoursString + minutesString + secondsString;
    }
}
