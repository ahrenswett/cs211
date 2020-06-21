package ExecutionCompare;

public class TimeChecker {
    static double startTime, endTime, totalTime;

    public static void main(String[] args) {
        startTime = System.currentTimeMillis();

        //
        // some statements
        //

        endTime = System.currentTimeMillis();
        totalTime = (endTime - startTime) / 1000.0;   // in second
    }
}
