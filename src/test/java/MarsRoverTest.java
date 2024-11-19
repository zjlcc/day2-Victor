import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover(){
        //given
        MarsRover marsRover = new MarsRover();
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
    @Test
    public void should_face_east_when_turn_right_given_orient_north(){
        //given
        MarsRover marsRover = new MarsRover(1, 0, "N");
        //when
        marsRover.turnRight();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:0:E", status);
    }
    @Test
    public void should_face_north_when_turn_right_given_orient_west(){
        //given
        MarsRover marsRover = new MarsRover(1, 0, "W");
        //when
        marsRover.turnRight();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:0:N", status);
    }
    @Test
    public void should_face_west_when_turn_right_given_orient_south(){
        //given
        MarsRover marsRover = new MarsRover(1, 0, "S");
        //when
        marsRover.turnRight();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:0:W", status);
    }
    @Test
    public void should_face_south_when_turn_right_given_orient_east(){
        //given
        MarsRover marsRover = new MarsRover(1, 0, "E");
        //when
        marsRover.turnRight();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:0:S", status);
    }
    @Test
    public void should_x_increase_face_east_when_move_forward_given_orient_east(){
        //given
        MarsRover marsRover = new MarsRover(1, 1, "E");
        //when
        marsRover.moveForward();
        String status = marsRover.getStatus();
        //then
        assertEquals("2:1:E", status);
    }
    @Test
    public void should_x_reduce_face_west_when_move_forward_given_orient_west(){
        //given
        MarsRover marsRover = new MarsRover(1, 1, "W");
        //when
        marsRover.moveForward();
        String status = marsRover.getStatus();
        //then
        assertEquals("0:1:W", status);
    }
    @Test
    public void should_y_increase_face_north_when_move_forward_given_orient_north(){
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");
        //when
        marsRover.moveForward();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:2:N", status);
    }
    @Test
    public void should_y_reduce_face_south_when_move_forward_given_orient_south(){
        //given
        MarsRover marsRover = new MarsRover(1, 1, "S");
        //when
        marsRover.moveForward();
        String status = marsRover.getStatus();
        //then
        assertEquals("1:0:S", status);
    }
    @Test
    public void should_x_reduce_face_west_when_execute_M_command_given_orient_west(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        marsRover.executeCommand("M");
        String status = marsRover.getStatus();
        //then
        assertEquals("-1:0:W", status);
    }
    @Test
    public void should_face_west_when_execute_L_command_given_orient_north(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.executeCommand("L");
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:W", status);
    }
    @Test
    public void should_face_west_when_execute_R_command_given_orient_south(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.executeCommand("R");
        String status = marsRover.getStatus();
        //then
        assertEquals("0:0:W", status);
    }
}
