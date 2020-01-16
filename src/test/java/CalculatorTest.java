//MorganNkosi
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

   @Test
    void add() {
        calculator addition = new calculator();
        int sum = addition.add(1,4);
        assertEquals(5,sum);
    }

   @Test
    void multiply() {
        calculator multiply = new calculator();
        int sum = multiply.multiply(1,4);
        assertEquals(4,sum);
    }

    @Test
    void multipleAdd() {
        calculator add = new calculator();
        int sum = add.multipleAdd(1,4,2);
        assertEquals(7,sum);
    }

    @Test
    void multipleProduct() {
        calculator product = new calculator();
        int sum = product.multipleProduct(1,4,2);
        assertEquals(8,sum);
    }
}
