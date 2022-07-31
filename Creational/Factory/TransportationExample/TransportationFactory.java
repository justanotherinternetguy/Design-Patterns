public class TransportationFactory {
  // getTransportation method to return object type
  

  public Transportation getTransportation(String transportationType) {
    if (transportationType == null) {
      return null;
    }

    if (transportationType.equalsIgnoreCase("CAR")) {
      return new Car();
    } else if (transportationType.equalsIgnoreCase("BOAT")) {
      return new Boat();
    } else if (transportationType.equalsIgnoreCase("PLANE")) {
      return new Plane();
    }

    return null;
  }
}
