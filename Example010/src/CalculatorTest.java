import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
// junit is a testing framework
    private calc calc;
    @BeforeEach{

        public void init(){

    }
}
    @Test
    public void testAdditionTwoPositives(){
        calc c = new calc();


        double answer =c.add(10,20);


        assertEquals(30,answer);

    }
    @Test
    public void testAdditionOnePositiveOneNegative(){

        calc c = new calc();


        double answer =c.add(-10,10);


        assertEquals(0,answer);

    }@Test
    public void testAdditionBothNegative(){

        calc c = new calc();


        double answer =c.add(-10,-10);


        assertEquals(-20,answer);

    }public void testAdditionLargeValues(){

        calc c = new calc();


        double answer =c.add(-100,-100);


        assertEquals(-200,answer);

    }

}