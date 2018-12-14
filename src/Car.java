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

    public String getBrand() { return brand; }

    public void setBrand(String brand)
    {
        if( brand.length() > 0 && brand.length() <=30 )
            this.brand = brand;
        else
            throw new IllegalArgumentException("The length of brand must be in the range of 0-30 characters");
    }

    public String getModel() { return model; }

    public void setModel(String model)
    {
        if( model.length() > 0 && model.length() <=30)
            this.model = model;
        else
            throw new IllegalArgumentException("The length of model must be in the range of 0-30 characters");
    }

    public float getYear() { return year; }

    public void setYear(int year)
    {
        int nowYear = LocalDate.now().getYear();

        if(year >= 1902 && year <= (nowYear+1))
            this.year = year;
        else
            throw new IllegalArgumentException("The year must be in the range of 1902 and present year +1 ");
    }

    public float getKilometers() { return kilometers; }

    public void setKilometers(int kilometers)
    {
        if(kilometers >=0)
            this.kilometers = kilometers;
        else
            throw new IllegalArgumentException("The kilometers must be greater than 0");
    }

    public double getPrice() { return price; }

    public void setPrice(double price)
    {
        if(price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("The price must be greater than 0");
    }

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
