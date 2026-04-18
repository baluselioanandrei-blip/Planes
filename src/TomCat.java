public class TomCat extends FighterPlanes {
    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void refuel() {
        System.out.println(getPlaneID()
                + " Initiating refueling procedure - Locating refueller - Catching up -Refueling - Refueling complete");
    }
}
