package Day_7;

import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String msg) {
        super(msg);
    }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String msg) {
        super(msg);
    }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;
    void getTime() throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new InvalidHourException("Hour is not greater than 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new InvalidMinuteException("Minute is not greater than 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new InvalidSecondException("Second is not greater than 60");
        }
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

class TimeExceptionDemo {
    public static void main(String[] args) {
        Time t = new Time();
        try {
            t.getTime();
        }
        catch (InvalidHourException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
        catch (InvalidMinuteException e) {
            System.out.println("Exception occurred: " + e);
        }
        catch (InvalidSecondException e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
