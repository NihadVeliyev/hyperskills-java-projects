package Projects.ClockFactory;

public class ClockFactory {
    public static void main(String[] args) {

    }
    private boolean produceToyClock;

    public ClockFactory(boolean produceToyClock) {
        this.produceToyClock = produceToyClock;
    }
    public Clock produce(String type) {
        String normalizedType=type.toUpperCase().trim();
        if (type.equals("SAND")) {
            return new SandClock();
        } else if (type.equals("DIGITAL")) {
            return new DigitalClock();
        } else if (type.equals("MECH")){
            return new MechanicalClock();
        } else if (produceToyClock){
            return new ToyClock();
        }
        return null;
    }
}
