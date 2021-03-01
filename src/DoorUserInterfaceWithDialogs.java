import javax.swing.JOptionPane;
import java.util.Scanner;

public class DoorUserInterfaceWithDialogs {
    private Door door;

    public DoorUserInterfaceWithDialogs (Door door){
        this.door = door;
    }

    public void requestKeyToUserAndOpenTheDoor(){
        this.door.unlock(this.requestKeyToUser());
        this.door.open();
        JOptionPane.showMessageDialog(null,"The door is open: " + !this.door.getIsClosed());
    }

    private String requestKeyToUser(){
        return JOptionPane.showInputDialog("Type the key to unlock the door");
    }
}
