import java.time.LocalDate;

public class Sellers {
    private String name;
    private LocalDate birthdate;                  //Datum narození prodejce
    private int numberOfContracts;                //Počet dosud sjednaných smluv
    private double setTotalCarrotSoldInTons;      //Celkové množství prodané mrkve v tunách
    private String address;                       //Název města, kde prodejce sídlí
    private String licensePlate;                  //Registrační značka vozidla („SPZ“)
    private double FuelConsumption;               //Spotřeba firemního vozidla v litrech na 100km

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public double getSetTotalCarrotSoldInTons() {
        return setTotalCarrotSoldInTons;
    }

    public void setSetTotalCarrotSoldInTons(double setTotalCarrotSoldInTons) {
        this.setTotalCarrotSoldInTons = setTotalCarrotSoldInTons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getFuelConsumption() {
        return FuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        FuelConsumption = fuelConsumption;
    }
}
