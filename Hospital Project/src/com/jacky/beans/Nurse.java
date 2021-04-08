package com.jacky.beans;

import java.util.Arrays;
import java.util.Iterator;

public class Nurse extends Person {
	private static final int MAX_ROOM_NUMBERS = 2;
	private int[] roomNumbers;

	public Nurse() {
		super();
		roomNumbers = new int[MAX_ROOM_NUMBERS];
	}

	public int[] getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(int[] roomNumbers) {
		this.roomNumbers = roomNumbers;
	}

//	private boolean canAddRoom() {
//		for (int i : roomNumbers) {
//			if (i == 0)
//				return true;
//		}
//		return false;
//	}

	public boolean addRoom(int roomNumber) {
		for (int i = 0; i < roomNumbers.length; i++) {
			if (roomNumbers[i] == 0) {
				roomNumbers[i] = roomNumber;
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return super.toString() + "roomNumbers: " + Arrays.toString(roomNumbers);
	}

}
