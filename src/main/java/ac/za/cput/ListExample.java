package ac.za.cput;
import java.util.ArrayList;
import java.util.List;

/**

 */
public class ListExample {

    private List listCars = new ArrayList();

     public  ListExample()
    {
        listCars.add("BMW M2");
        listCars.add("Mercedes  A45");
        listCars.add("Ford Focus RS");
        listCars.add("Audi RS3");
    }

    public String getCar(int index)
    {
        System.out.println("Index \tName");
        for (int l = 0; l < listCars.size(); l++) {
            System.out.printf("\n%d\t%s", l, listCars.get(l));
        }
        System.out.println("\nThe car you picked is: " + String.valueOf(listCars.get(index)));
        String choice = String.valueOf(listCars.get(index));
        return choice;
    }



}
