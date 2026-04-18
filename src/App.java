public class App {
    public static void main(String[] args) throws Exception {
        Plane boeing1 = new Boeing("1", 1120, 660);
        Plane mig1 = new MIG("2", 274);
        Plane tomcat1 = new TomCat("3", 300);
        Plane concorde1 = new Concorde("4", 676, 128);

        concorde1.getTotalEnginePower();
        concorde1.takeOff();
        concorde1.fly();
        ((Concorde) concorde1).goSuperSonic();
        concorde1.land();

        boeing1.getTotalEnginePower();
        boeing1.takeOff();
        boeing1.fly();
        boeing1.land();

        mig1.getTotalEnginePower();
        mig1.takeOff();
        mig1.fly();
        ((FighterPlanes) mig1).launchMissile();
        ((MIG) mig1).highSpeedGeometry();
        mig1.land();

        tomcat1.getTotalEnginePower();
        tomcat1.takeOff();
        tomcat1.fly();
        ((FighterPlanes) mig1).launchMissile();
        ((TomCat) tomcat1).refuel();
        tomcat1.land();
    }
}
