import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private String direction;
    private int xCoordinate;
    private int yCoordinate;
    private Map<String, String> turnLeftMap;
    private Map<String, String> turnRightMap;
    private void initTurnMap(){
        turnLeftMap = new HashMap<>();
        turnLeftMap.put(Direction.DIRECTION_N,Direction.DIRECTION_W);
        turnLeftMap.put(Direction.DIRECTION_W,Direction.DIRECTION_S);
        turnLeftMap.put(Direction.DIRECTION_S,Direction.DIRECTION_E);
        turnLeftMap.put(Direction.DIRECTION_E,Direction.DIRECTION_N);
        turnRightMap = new HashMap<>();
        turnRightMap.put(Direction.DIRECTION_N,Direction.DIRECTION_E);
        turnRightMap.put(Direction.DIRECTION_E,Direction.DIRECTION_S);
        turnRightMap.put(Direction.DIRECTION_S,Direction.DIRECTION_W);
        turnRightMap.put(Direction.DIRECTION_W,Direction.DIRECTION_N);
    }

    public MarsRover(){
        direction = Direction.DIRECTION_N;
        initTurnMap();
    }

    public MarsRover(int xCoordinate, int yCoordinate, String direction){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
        initTurnMap();
    }

    public String getStatus() {
        return xCoordinate+":"+yCoordinate+":"+direction;
    }

    public void turnLeft(){
        direction = this.turnLeftMap.get(direction);
    }

    public void turnRight(){
        direction = this.turnRightMap.get(direction);
    }

    public void moveForward(){
        switch (direction) {
            case Direction.DIRECTION_N:
                yCoordinate++;
                break;
            case Direction.DIRECTION_S:
                yCoordinate--;
                break;
            case Direction.DIRECTION_E:
                xCoordinate++;
                break;
            case Direction.DIRECTION_W:
                xCoordinate--;
                break;
        }
    }

    public void executeCommand(String command) {
        if("L".equals(command)) {
            turnLeft();
        }
        if("R".equals(command)){
            turnRight();
        }
        if("M".equals(command)){
            moveForward();
        }
    }
}
