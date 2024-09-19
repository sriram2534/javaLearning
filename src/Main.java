import java.util.*;

public class Main {
    public static HashMap<String, ArrayList<String>> mapper = new HashMap<>();
    public static ArrayList<String> productIds = new ArrayList<>();
    public static ArrayList<String> storeIds = new ArrayList<>();

    public static String[] ids = {"12909", "12910", "12911", "12912", "12913", "12914", "12915", "12908"};
    public static String[] stores = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void main(String[] args) {
        productIds.addAll(Arrays.asList(ids));
        productIds.remove("12916");

        storeIds.addAll(Arrays.asList(stores));

        Collections.sort(productIds);

        // HashMaps
        mapper.put("products", productIds);
        mapper.put("stores", storeIds);

        for(Map.Entry<String, ArrayList<String>> i: mapper.entrySet()) {
            System.out.println( i.getKey() + " : " + i.getValue());
        }

    }
}