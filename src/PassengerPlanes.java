public class PassengerPlanes extends Plane {
    private int maxPassengers;

    public PassengerPlanes(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

}
