import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SorterTests {

    @Test
    public void CompareInputOutput(){
        int[] i = {17, 1, 96, 4, 58, 2, 100, 99, 9998, 18};
        int[] expectedArray = {1, 2, 4, 17, 18, 58, 96, 99, 100, 9998};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void CheckTheFirstSymbol(){
        int[] i = {17, 1, 96, 4, 58, 2, 100, 99, 9998, 18};
        Sorter.sort(i);
        int first = i[0];
        Assertions.assertEquals(first, 1);
    }

    @Test
    public void CheckTheLastSymbol(){
        int[] i = {17, 1, 96, 4, 58, 2, 100, 99, 9998, 18};
        Sorter.sort(i);
        int last = i[9];
        Assertions.assertNotEquals(last, 1);
    }

    @Test
    public void nonexistentSymbol(){
        int[] i = new int[25];
        Sorter.sort(i);
        int non = i[4];
        Assertions.assertNotNull(non);
    }

    @Test
    public void nonexistentSymbol2(){
        int[] i = new int[25];
        Sorter.sort(i);
        Assertions.assertNull(null);
    }
}