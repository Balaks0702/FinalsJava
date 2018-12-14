import java.time.LocalDate;

public class Car implements Comparable<Car>
{
    private String brand, model;
    private int year, kilometers;
    private double price;

    public Car( int year, String brand, String model, int kilometers, double price)
    {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setKilometers(kilometers);
        setPrice(price);
    }

    //method to get the brand
    public String getBrand() { return brand; }

    //method to check the validation of brand
    public void setBrand(String brand)
    {
        if( brand.length() > 0 && brand.length() <=30 )
            this.brand = brand;
        else
            throw new IllegalArgumentException("The length of brand must be in the range of 0-30 characters");
    }

    //method to get the model
    public String getModel() { return model; }

    //method to check the validation of model
    public void setModel(String model)
    {
        if( model.length() > 0 && model.length() <=30)
            this.model = model;
        else
            throw new IllegalArgumentException("The length of model must be in the range of 0-30 characters");
    }

    //method to get the year
    public float getYear() { return year; }

    //method to check the validation of the year
    public void setYear(int year)
    {
        int nowYear = LocalDate.now().getYear();

        if(year >= 1902 && year <= (nowYear+1))
            this.year = year;
        else
            throw new IllegalArgumentException("The year must be in the range of 1902 and present year +1 ");
    }

    //method to get the kilometers
    public float getKilometers() { return kilometers; }

    //method to validate the kilometer
    public void setKilometers(int kilometers)
    {
        if(kilometers >=0)
            this.kilometers = kilometers;
        else
            throw new IllegalArgumentException("The kilometers must be greater than 0");
    }

    //method to get the price
    public double getPrice() { return price; }

    //method to validate the price
    public void setPrice(double price)
    {
        if(price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("The price must be greater than 0");
    }

    //method to sort the car by a-z brand then model and then low to high kilometers
    @Override
    public int compareTo(Car car)
    {
        if (brand.equals(car.getBrand())
                && model.equals(car.getModel())
                && kilometers == car.kilometers)
            return 0;

        if (brand.compareTo(car.getBrand()) == 0)
            if(model.compareTo(car.getModel()) == 0)
                if(this.getKilometers() > car.getKilometers())
                    return -1;
                else
                    return 1;
            else
                return model.compareTo(car.getModel());
        else
            return brand.compareTo(car.getBrand());

    }
}
