package com.program;
//Created by 21343017_Aldhy
public class L4_Elevator {
    public boolean doorOpen=false;
    public int currenFloor=5;
    public final int TOP_FLOOR=5;
    public final int BOTTOM_FLOOR=1;

    public void openDoor(){
        System.out.println("Opening door");
        doorOpen=true;
        System.out.println("Door is.");
    }

    public void closeDoor(){
        System.out.println("Closing door");
        doorOpen=false;
        System.out.println("Door is close.");
    }

    public void goUp(){
        System.out.println("Going up one floor.");
        currenFloor++;
        System.out.println("Florr : "+currenFloor);
    }

    public void goDown(){
        System.out.println("Going down one floor.");
        currenFloor--;
        System.out.println("Florr : "+currenFloor);
    }    

    public void setFloor(int desiredFlorr){
        while(currenFloor != desiredFlorr){
            if(currenFloor<desiredFlorr){
                goUp();
            }
            else{
                goDown();
            }
        }
    }

    public int getFloor(){
        return currenFloor;
    }

    public boolean checDoorStatus(){
        return doorOpen;
    }

}
