import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class CarLot
{
    TreeMap<String, TreeSet<Car>> treeMap;
    Car cars;

    public CarLot(TreeMap<String, TreeSet<Car>> treeMap)
    {
        this.treeMap = treeMap;
    }

    public TreeSet<String> getBrands()
    {
        TreeSet<String> brands = new TreeSet<>();
        brands.add("All Brands");
        brands.add(cars.getBrand());
        return brands;
    }

    public Collection<TreeSet<Car>> getCars(String brands)
    {
        if(brands.equals("All Brands"))
            return treeMap.values();
        return null;
    }

    public void sellCars(Car car)
    {
        getBrands().remove(car);
    }

    public TreeSet<Car> getInventory(String brand)
    {
        return treeMap.get(brand);
    }
}
