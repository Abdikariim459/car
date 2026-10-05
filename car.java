public class Car {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private Boolean rent;
    public static final String CompanyName="just Rentals";
    public static int totalCars;
    public Car(){
    }
    public Car(String palateNumber, String carModel, double dailyRate){
        this.plateNumber=palateNumber;
        this.carModel=carModel;
        this.dailyRate=dailyRate;
        this.rent=false;
        totalCars++;
    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public String getCarModel(){
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public Boolean getRent() {
        return rent;
    }

    public void setDailyRate(double rate) {
        this.dailyRate = rate;
    }

    public void Rent() {
        rent = true;
    }
    public void displayInfo(){
        System.out.println("plate Number:"+plateNumber);
        System.out.println("model:"+carModel);
        System.out.println("daily rate:"+dailyRate);
        System.out.println("Rented:"+rent);
    }
    public static void displayCompanyName(){
        System.out.println("company"+CompanyName);
    }
    public static void displayTotalCars(){
        System.out.println("total cars"+totalCars);
    }
}
