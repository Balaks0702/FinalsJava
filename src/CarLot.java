import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class CarLot
{
    TreeMap<String, TreeSet<Car>> treeMap;
    Car cars;

    //carLot constructor
    public CarLot(TreeMap<String, TreeSet<Car>> treeMap)
    {
        this.treeMap = treeMap;
    }

    //method to get all brands
    public TreeSet<String> getBrands()
    {
        TreeSet<String> brands = new TreeSet<>();
        brands.add("All Brands");
        brands.add(cars.getBrand());
        return brands;
    }

    //method to get all cars
    public Collection<TreeSet<Car>> getCars(String brands)
    {
        if(brands.equals("All Brands"))
            return treeMap.values();
        return null;
    }

    //method to sell cars
    public void sellCars(Car car)
    {
        getBrands().remove(car);
    }

    //method to get cars of the particular brand
    public TreeSet<Car> getInventory(String brand)
    {
        return treeMap.get(brand);
    }
}
