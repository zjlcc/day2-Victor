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
    @Test
    public void should_face_west_when_turn_left_given_orient_north(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.turnLeft();
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:W", status);
    }
    @Test
    public void should_face_east_when_turn_left_given_orient_south(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.turnLeft();
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:E", status);
    }
    @Test
    public void should_face_south_when_turn_left_given_orient_west(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        marsRover.turnLeft();
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:S", status);
    }
    @Test
    public void should_face_north_when_turn_left_given_orient_east(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.turnLeft();
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:N", status);
    }
}
