import java.util.HashSet;
import java.util.Set;

public class ch11_11a
{
    /*Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
    their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both). For
    example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].*/

    public void run()
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(symmetriceSetDifference(set1,set2));
    }

    //makes a new set with only difference Integer.
    public Set<Integer> symmetriceSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> setDifference = new HashSet<>(set1);

        // sets can´t have the same value twice, we can then remove those Integer and then remaining numbers in the new set (setDifference)
        setDifference.removeAll(set2);
        set2.removeAll(set1);
        setDifference.addAll(set2);

        return setDifference;
    }
}
