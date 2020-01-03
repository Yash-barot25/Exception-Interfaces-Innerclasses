package MethodChallenge;

public class MethodOverloading {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(1225, 20));
        System.out.println(getDurationString(+3633366));


    }

    private static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds >= 60) {

            return INVALID_VALUE;

        } else {

          long hours = minutes / 60;
          long remainigMinutes = minutes % 60;
//
//
//            return hours + "h " + remainigMinutes + "m " + seconds + "s";


            String hoursValue = hours + "h ";
            if (hours < 9){
                hoursValue = "0" + hoursValue;
            }

            String minutesValue = remainigMinutes + "m ";
            if (remainigMinutes < 9){
                minutesValue = "0" + minutesValue;
            }

            String secondsValue = seconds + "s";
            if (seconds < 9){
                secondsValue = "0" + secondsValue;
            }

            return hoursValue + minutesValue + secondsValue;

        }
    }

    private static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE;
        } else {

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);

        }


    }


}
