package ac.za.cput;
import java.util.HashMap;
import java.util.Map;
/**
 *
 */
public class MapExample {
    private Map<String,String> students = new HashMap();

    public MapExample()
    {
        students.put("Cyclopse", "Scott Summers");
        students.put("Phoenix", "Jean Grey");
        students.put("Psylock", "Elizabeth Braddock");
        students.put("Angel", "Warren Worthington");

    }

    public String getStudent(String alias)
    {
        System.out.println("Alias \t\tName");
        for (Map.Entry entry : students.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
        System.out.println("\nThe name of the student is: " + (String)students.get(alias));
        String choice = (String)students.get(alias);
        return choice;
    }
}

