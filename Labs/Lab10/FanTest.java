package Labs.Lab10;

public class FanTest {
    public static void main(String[] args){
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 20, "blue");
        fan1.toString();
        fan2.toString();

    }
}
