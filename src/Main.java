public class Main {

    public static void main(String[] args) {

        Door mainDoor = new Door("acb123");

//        DoorUserInterface doorUI = new DoorUserInterface(mainDoor);
//        doorUI.requestKeyToUserAndOpenTheDoor();

        DoorUserInterfaceWithDialogs doorWindowUI = new DoorUserInterfaceWithDialogs(mainDoor);
        doorWindowUI.requestKeyToUserAndOpenTheDoor();


//        System.out.println("The door is locked: " + mainDoor.getIsLock());
//        System.out.println("The door is closed: " + mainDoor.getIsClosed());
//
//        System.out.println("Result of unlocking the door with a wrong key: " + mainDoor.unlock("0987l"));
//        System.out.println("Result of opening the door: " + mainDoor.open());
//
//        System.out.println("Result of unlocking the door with a right key: " + mainDoor.unlock("acb123"));
//        System.out.println("Result of opening the door: " + mainDoor.open());
    }
}
