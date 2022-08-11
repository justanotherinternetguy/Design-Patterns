# Prototype Design Pattern

* Copy existing objects w/o making your code dependent on their classes

> Have class
> Want to create exact copy of it
> Try to create object of same class and copy over all methods of original object
> Fails b/c you can't just copy it from the outside
> More dependencies on the class

* Prototype delegates cloning to actual objects that are being cloned
  - Usually interface just has one `clone` method

* The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. 

