public class Bigparking implements Prototype {
    
   // private int z, w;
    private Car[][] cars;
    

    int [] con ={2, 4,8}; 
    
  
    public Bigparking(int [] cont) {
       cars = new Car[cont.length][];
       for(int i = 0; i< cont.length; i++){
           Car [] floor = new Car[cont[i]];
           cars[i] = floor;
       }
    }
    
    
   
    public boolean carInParking(int flourNumber, int parkingPlace, Car car) { //проверка есть ли уже машина эта в паркинге
/*    for (int a = 0; a < cars.length; a++) {
        for (int i = 0; i < cars[a].length; i++) { */
            if (cars[flourNumber][parkingPlace] == car) {
                return true;
            }
       
          return false;
    }
    
    public Car takeCar(int carNumber) {

        return findCar(carNumber);

    }

              
              
    private Car findCar(int num) {

        for (int flourNumber = 0; flourNumber < cars.length; flourNumber++) {
            for (int parkingPlace = 0; parkingPlace < cars[flourNumber].length; parkingPlace++) {
                if (cars[flourNumber][parkingPlace] != null) {

                    if (cars[flourNumber][parkingPlace].getNumberCar() == num) {
                        return cars[flourNumber][parkingPlace];

                    }

                }
            }
        }
        return null;
    }
    
    public void addCar(int flourNumber, int parkingPlace, Car car) {
        if (!carInParking(flourNumber, parkingPlace, car)) {

            if (cars[flourNumber][parkingPlace] == null) {
                cars[flourNumber][parkingPlace] = car;
                System.out.println("Место занято под номером " + parkingPlace++);

            }
        }

    }
 
    public void printParking() {
        for (int a = 0; a < cars.length; a++) { 
            for (int i = 0; i < cars[a].length; i++) {
                if (cars[a][i] == null) {
                    System.out.print("empty"+"\t");
                } else {
                    System.out.print(cars[a][i].getName()+"\t");
                }
            }
            System.out.println();
        }
}

    

    private Car[][] getCars() {
        return cars;
    }

   

    @Override
    public Bigparking clone() {
       

        Car[][] cars = this.getCars();

        Car[][] carsClon = new Car[con][];

        for (int a = 0; a < cars.length; a++) { 
            carsClon[0][a] = cars[a][0];

            for (int i = 0; i < cars[a].length; i++) {
                carsClon[a][i] = cars[a][i];
                Bigparking bigparking = new Bigparking();

                return bigparking;
            }
        }

    }
