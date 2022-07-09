package thread.atomic_operations;

public class Main {

    public static class Metrics {
        private long count = 0;
        private double average = 0.0;

        public void addSample(long sample) {
            double currentSum = average * count;
            count++;
            average = (currentSum + sample) / count;
        }

        public double getAverage() {
            return average;
        }

    }

}
