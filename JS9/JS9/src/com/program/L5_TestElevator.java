package com.program;
//Created by 21343017_Aldhy
public class L5_TestElevator {
    public static void main(String[] args) {
        L4_Elevator myElevator = new L4_Elevator();

        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();        
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();

    }
}