import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

@Before
    public void before(){
    waterBottle = new WaterBottle();
}

@Test
    public void hasCorrectVolume(){
    assertEquals(100, waterBottle.getVolume());

}

@Test
    public void canDecreaseVolume(){
    waterBottle.decrease();
    assertEquals(90, waterBottle.getVolume());
}

@Test
    public void canEmpty(){
    waterBottle.empty();
    assertEquals(0, waterBottle.getVolume());
}

@Test
    public void canFill(){
    waterBottle.fill();
    assertEquals(100, waterBottle.getVolume());
}
}
