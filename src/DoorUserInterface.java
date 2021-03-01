import java.util.Scanner;

public class DoorUserInterface {

    private Door door;

    public DoorUserInterface(Door door){
        this.door = door;
    }

    public void requestKeyToUserAndOpenTheDoor(){
        this.door.unlock(this.requestKeyToUser());
        this.door.open();
        System.out.println("The door is open: " + !this.door.getIsClosed());
    }

    private String requestKeyToUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the key to unlock the door: ");
        return scanner.next();
    }
}
