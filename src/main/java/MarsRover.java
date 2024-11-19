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
        turnLeftMap.put("N","W");
        turnLeftMap.put("W","S");
        turnLeftMap.put("S","E");
        turnLeftMap.put("E","N");
        turnRightMap = new HashMap<>();
        turnRightMap.put("N","E");
        turnRightMap.put("E","S");
        turnRightMap.put("S","W");
        turnRightMap.put("W","N");
    }

    public MarsRover(){
        direction = "N";
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
}
