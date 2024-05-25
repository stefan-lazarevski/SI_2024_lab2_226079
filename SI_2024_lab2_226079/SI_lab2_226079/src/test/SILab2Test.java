package si_lab2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void everyBranchTest(){
        // 1
        List<Item> list1 = null;
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listOne, 0));
        // 2
        List<Item> listTwo = new ArrayList<>();
        list2.add(new Item("chicken", "null", 0, 0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listTwo, 0));
        // 3
        List<Item> listThree = new ArrayList<>();
        list3.add(new Item("chicken", "12l1", 0, 0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listThree, 0));
        // 4
        List<Item> listFour = new ArrayList<>();
        list5.add(new Item("chicken", "4505", 389, 0));
        list5.add(new Item("potatoes", "9874", 100, 0));
        assertFalse(SILab2.checkCart(listFour, 100));
        // 5
        List<Item> listFive = new ArrayList<>();
        list6.add(new Item("chicken", "0505", 350, 0.25));
        list6.add(new Item("null", "0874", 320, 0.1));
        assertTrue(SILab2.checkCart(listFive, 1000));
    }

    @Test
    public void multipleConditionTest(){
        // 1
        List<Item> listOne = new ArrayList<>();
        list1.add(new Item("cheese","4505", 200, 0.2));
        assertFalse(SILab2.checkCart(listOne,500));
        // 2
        List<Item> listTwo = new ArrayList<>();
        list2.add(new Item("cheese","4505",330,0));
        assertFalse(SILab2.checkCart(listTwo,500));
        // 3
        List<Item> listThree = new ArrayList<>();
        list3.add(new Item("cheese","0450",330,0.3));
        assertFalse(SILab2.checkCart(listThree,500));
        // 4
        List<Item> listFour = new ArrayList<>();
        list4.add(new Item("cheese","4505",330,0.3));
        assertTrue(SILab2.checkCart(listFour,500));
    }
}