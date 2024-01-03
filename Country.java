import java.util.HashMap;
import java.util.Map;

public class Country {
    private String name;
    private String code;
    private int population;

    private static HashMap<String, Country> list = new HashMap<>();

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCode() {
        return this.code;
    }

    public Country(String name, String code, int population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String toString() {
        return "Name : " + this.name + " , Code : " + this.code + " , Population : " + this.population;
    }

    public static void addToList(Country country) {
        list.put(country.getCode(), country);
    }


    public static Country getCountryByCode(String code) {
        return list.get(code);
    }

    public static void printList() {
        System.out.printf("%-12s%-12s%-14s%n", "Name", "Code", "Population");
        for (Map.Entry<String, Country> item : list.entrySet()) {
            Country country = item.getValue();
            System.out.printf("%-12s%-12s%-14d%n", country.getName(), country.getCode(), country.getPopulation());
        }
    }


    public static void main(String[] args) {
        Country iran = new Country("Iran", "IRN", 80_000_000);
        Country iraq = new Country("Iraq", "IRQ", 60_000_000);
        Country usa = new Country("USA", "USA", 300_000_000);

        addToList(iran);
        addToList(iraq);
        addToList(usa);

        printList();

        Country temp = getCountryByCode("IRN");
        System.out.println(temp);

    }
}