package Projects.SummingThreads;

import java.util.Scanner;

public static void MainSummingThreads (String[] args) throws InterruptedException {

    Scanner scanner = new Scanner(System.in);

    int from1Incl = scanner.nextInt(); // left limit of the first range
    int to1Incl = scanner.nextInt();   // right limit of the first range

    int from2Incl = scanner.nextInt(); // left limit of the second range
    int to2Incl = scanner.nextInt();   // right limit of the second range

    RangeSummator summator1 = new RangeSummator(from1Incl, to1Incl); // first summator
    RangeSummator summator2 = new RangeSummator(from2Incl, to2Incl); // second summator

    summator1.start();
    summator2.start();

    summator1.join();
    summator2.join();

    long partialSum1 = summator1.getResult();
    long partialSum2 = summator2.getResult();

    long sum = partialSum1 + partialSum2;

    System.out.println(sum);
}

public void main() {
}