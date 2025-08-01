package Projects.SummingThreads;

 public class RangeSummator extends Thread {

    int fromIncl;
    int toIncl;

    private volatile long result = 0;

    public RangeSummator(int fromIncl, int toIncl) {
        this.fromIncl = fromIncl;
        this.toIncl = toIncl;
    }

    @Override
    public void run() {
        final long currentId = Thread.currentThread().getId();

        long sum = 0;
        for (int i = fromIncl; i <= toIncl; i++) {
            sum += i;
        }

        result = sum;
    }

    public long getResult() {
        return result;
    }
}

