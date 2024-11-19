import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:N", status);
    }
}
