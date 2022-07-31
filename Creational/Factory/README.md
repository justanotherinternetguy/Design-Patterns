# Factory
* Provides an interface for creating objects (superclass)
* Allows subclasses to actually determine the datatype of objects to be created

### Components

* Factory Design Pattern itself --> asks --> TransportationFactory --> to create --> `interface` Transportation

* `interface` Transportation
  - `void` drive()

  - Car, Boat, Plane `implements` Transportation
    - `void` drive()
