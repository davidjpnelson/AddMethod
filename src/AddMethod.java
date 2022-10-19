// A program that uses the Vehicle Class

class AddMethod{
  public static void main(String[] args) {
    Vehicle coupe = new Vehicle(); // create a Vehicle object named coupe
    Vehicle minivan = new Vehicle(); //create a Vehicle object named minivan



    //assign values to fields in coupe
    coupe.passengers = 2;
    coupe.fuelcap = 14;
    coupe.mpg = 35;

    //assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelcap = 18;
    minivan.mpg = 21;

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.println("A coupe carries " + coupe.passengers + " passengers.");
    coupe.range();

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.println("A minivan carries " + minivan.passengers + " passengers.");
    minivan.range();
  }
}