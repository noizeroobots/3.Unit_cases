import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//written by Aleksey Dolgov

public class SorterTests {

    @Test
    public void CompareInputOutput() {  // Проверка, что наша сортировка работает правильно
        int[] i = {17, 1, 96, 4, 58, 2, 100, 99, 9998, 18};
        int[] expectedArray = {1, 2, 4, 17, 18, 58, 96, 99, 100, 9998};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void EmptyArray() {  // Проверка на пустой массив
        int[] i = {};
        int[] expectedArray = {};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void SingleElement() {  // Проверка на единственный элемент в массиве
        int[] i = {0};
        int[] expectedArray = {0};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void DifferentExtremeValues() {  // Проверка на положительные и отрицательные элементы в одном массиве
        int[] i = {2147483647, 0, -1, -2147483648, 1};
        int[] expectedArray = {-2147483648, -1, 0, 1, 2147483647};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void AllElementsNegative() {  // Проверка на отрицательные элементы в массиве
        int[] i = {-1, -21, -11, -31, -3};
        int[] expectedArray = {-31, -21, -11, -3, -1};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void IdenticalPositiveElements() {  // Проверка на одинаковые положительные элементы в массиве
        int[] i = {7, 7, 7, 7, 7, 7, 7};
        int[] expectedArray = {7, 7, 7, 7, 7, 7, 7};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void IdenticalNegativeElements() {  // Проверка на одинаковые отрицательные элементы в массиве
        int[] i = {-40, -40, -40, -40};
        int[] expectedArray = {-40, -40, -40, -40};
        Sorter.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }
}