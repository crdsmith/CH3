package ac.za.cput;

import java.util.HashSet;
import java.util.Set;
/**

 */
public class SetExample {
    private Set<Integer> numbers = new HashSet();

    public SetExample(){
        numbers.add(3);
        numbers.add(27);
        numbers.add(9);
        numbers.add(30);
        numbers.add(93);
        numbers.add(13);
    }

    public String getNumber(int number)
    {
        System.out.println("Numbers:");
        System.out.println(numbers);

        if(numbers.contains(number))
        {
            System.out.println("The number you picked is in the list");
            return "The number you picked is in the list";
        }
        else
            System.out.println("The number is not in the list");
            return "The number is not in the list";

    }



}