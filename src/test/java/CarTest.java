import org.example.Car;
import org.example.CarLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Honda");
    }
    @Test
    public void singleParameterConstructorTest(){
        String expected = "Car name: Honda";
        String actual = car.toString();

        assertEquals(expected,actual);

    }


    @Test
    public void getCarNameTest01(){
        String expected = "Honda";
        String actual = car.getCarName();
        assertEquals(expected, actual);
    }

    @Test
    public void carCarLotAssociationTest() {

        CarLot carLot = new CarLot();
        car.setCarLot(carLot);
        assertEquals(carLot, car.getCarLot());
    }
}
