public class Plane {
    private String planeID;
    private int totalEnginePower;

    public Plane(String planeID, int totalEnginePower) {
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlaneID() {
        return this.planeID;
    }

    public int getTotalEnginePower() {
        return this.totalEnginePower;
    }

    public void takeOff() {
        System.out.println(planeID
                + " Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }

    public void land() {
        System.out.println(planeID + " Flying");
    }

    public void fly() {
        System.out.println(planeID
                + " Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}
