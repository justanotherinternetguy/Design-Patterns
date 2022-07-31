public class FactoryDesignPattern {
  public static void main (String[] args) {
    TransportationFactory transportationFactory = new TransportationFactory();

    Transportation Transportation1 = transportationFactory.getTransportation("CAR");
    Transportation1.drive();

    Transportation Transportation2 = transportationFactory.getTransportation("BOAT");
    Transportation2.drive();

    Transportation Transportation3 = transportationFactory.getTransportation("PLANE");
    Transportation3.drive();
  }
}
