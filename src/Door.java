import java.security.PublicKey;

public class Door {

    //Class attributes

    private boolean isClosed; // if the door is close this will be true, otherwise it's false
    private boolean isLocked;
    private String key;

    public Door(String key){
        this.isClosed = true;
        this.isLocked = true;
        this.key = key;
    }

    public boolean getIsLock(){
        return this.isLocked;
    }

    public boolean getIsClosed(){
        return this.isClosed;
    }

    /**
     * This is a private method because it is only used within the class and it is not
     * part of the public interface of the class
     *
     * @param key
     * @return
     */
    private boolean  keyIsValid(String key){
        return this.key.compareTo(key) == 0;
    }

    /**
     *
     * @param key
     * @return
     */
    public boolean unlock(String key){
        boolean successfullyUnlockedTheDoor = false;
        if(this.isLocked && this.keyIsValid(key)){
            this.isLocked = false;
            successfullyUnlockedTheDoor = true;
        }
        return successfullyUnlockedTheDoor;
    }

    public boolean open(){
        boolean successfullyOpenedDoor = false;
        if(!this.isLocked){
            this.isClosed= false;
            successfullyOpenedDoor= true;
        }
        return successfullyOpenedDoor;
    }

    public boolean lock(String key){
        boolean successfullyLockedTheDoor = false;
        if(this.isClosed && !this.isLocked && this.keyIsValid(key)){
            this.isLocked = true;
            successfullyLockedTheDoor = true;
        }
        return successfullyLockedTheDoor;
    }

    public boolean close(){
        boolean successfullyClosedDoor = false;
        if(!this.isLocked){
            this.isClosed = true;
            successfullyClosedDoor= true;
        }
        return successfullyClosedDoor;
    }


}
