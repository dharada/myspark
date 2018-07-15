import java.util.Date;

public  class Helper {

    public enum INTERVAL {
        SECONDLY, MINUTELY, HOURLY, DAILY
    }

    public static long getCurrentTime() {
        Date kore = new Date(System.currentTimeMillis());
        return kore.getTime() / 1000;

    }

    public static long setTimeOffset(long input, Helper.INTERVAL interval){
        int seconds_60 = 60;
        long seconds = input;

        switch (interval) {
            case SECONDLY:
                seconds -= 1;
                break;
            case MINUTELY:
                seconds -= seconds_60;
                break;
            case HOURLY:
                seconds -= (seconds_60 * 60);
                break;
            case DAILY:
                seconds -= (seconds_60 * 60 * 24);
                break;
        }

        return seconds;
    }
}
