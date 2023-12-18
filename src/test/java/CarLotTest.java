import org.example.Car;
import org.example.CarLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarLotTest {
    private CarLot carLot;

    @BeforeEach
    public void setUp() {
        carLot = new CarLot();
    }
    @Test
    public void carLotConstructorTest(){
        
        assertEquals(0, carLot.getCars().size());

    }
    @Test
    public void addCarTest(){
        
        String car = "Honda";
        carLot.addCar(car);
        assertEquals(1, carLot.getCars().size());
        assertEquals(car, carLot.getCars().get(0));
    }
    @Test
    public void displayCarTest(){
       
        String car1 = "Honda";
        String car2 = "Chevy";
        String car3 = "Tesla";
        carLot.addCar(car1);
        carLot.addCar(car2);
        carLot.addCar(car3);
        carLot.displayCars();
        assertEquals(3, carLot.getCars().size());
        assertTrue(carLot.getCars().contains(car1));
        assertTrue(carLot.getCars().contains(car2));
        assertTrue(carLot.getCars().contains(car3));
    }

    @Test
    public void removeCarTest(){
       
        String car1 = "Honda";
        String car2 = "Chevy";
        String car3 = "Tesla";
        carLot.addCar(car1);
        carLot.addCar(car2);
        carLot.removeCar(car3);

        carLot.displayCars();
        assertEquals(2, carLot.getCars().size());
        assertTrue(carLot.getCars().contains(car1));
        assertTrue(carLot.getCars().contains(car2));

    }
}
