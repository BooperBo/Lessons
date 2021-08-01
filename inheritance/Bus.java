package inheritance;

public class Bus extends FuelAuto {

    private int passengersNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengersNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
        System.out.println("Bus was init");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
    }

    public void pickUpPassengers(int passengersNum) {
        this.passengersNumber += passengersNum;
        System.out.println("Picking up " + passengersNum + " passengers");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengersNumber = 0;
        System.out.println("Passengers released");
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }


}
