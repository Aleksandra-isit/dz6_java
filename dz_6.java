import java.util.*;

/*
Реализовать множество (set) с помощью TreeMap.
Создать метод add, добавляющий элемент в ваше множество.
 */
/*
Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
Объявить и инициализировать TreeSet использующий ваш компаратор.
Добавить несколько эллементов в сет и вывести в консоль.
*/

class Helper implements Comparator<Integer> {

    // Method
    // To compare two strings
    public int compare(Integer i1, Integer i2)
    {
        return i2.compareTo(i1);
    }
}

public class dz_6 {
    public Map<Integer, Integer> map = new HashMap<>();
    public Set<Integer> set;
    public TreeSet<Integer> treeSet = new TreeSet<Integer>(new Helper());
    public void mapAdd(int x)
    {
        map.put(x, 5);
    }

    public int mapSize()
    {
        return map.size();
    }

    public void setFromMap()
    {
        set = map.keySet();
        //treeSet = map.keySet();
        treeSet.add(-1);
        treeSet.add(43);
        treeSet.add(1);
        treeSet.add(123);
        treeSet.add(35);
    }

    public void printSet()
    {
        treeSet.forEach(value -> System.out.println("key: " + value));
    }



}
