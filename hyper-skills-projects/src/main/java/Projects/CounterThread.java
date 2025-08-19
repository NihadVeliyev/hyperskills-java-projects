package Projects;

class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;
        while (true) {
            // TODO: check if the thread was interrupted
            // If yes -> print "It was interrupted" and stop the loop
            // Otherwise, keep incrementing the counter
            if(isInterrupted()){
                System.out.println("It was interrupted");
                break;
            }
            counter++;
        }
    }
}

