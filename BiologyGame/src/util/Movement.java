package util;

import java.util.ArrayList;

import application.Main;
import entities.Sprite;

public class Movement {

	private ArrayList<String> inputList = new ArrayList<>();
	private String lastInput;
	private String currentKey;
	private Sprite s;
	
	public static final String NO_KEY = "NO KEY";

	public Movement(Sprite s) {
		this.s = s;
		lastInput = "";
		currentKey = "";
	}

	public void move() {
		Main.getScene().setOnKeyPressed(e -> {
			String code = e.getCode().toString();
			if (!inputList.contains(code)) {
				inputList.add(code);
				currentKey = code;
			} else {

			}

		});

		Main.getScene().setOnKeyReleased(e -> {
			String code = e.getCode().toString();
			if (inputList.contains(code)) {
				lastInput = code;
				inputList.remove(code);
			} else {

			}
		});

		if (inputList.contains("W")) {
			s.setVelY(-3);
		}
		if (inputList.contains("S")) {
			s.setVelY(3);
		}
		if (inputList.contains("A")) {
			s.setVelX(-3);
		}
		if (inputList.contains("D")) {
			s.setVelX(3);
		}
		
		if(!inputList.contains("W") && !inputList.contains("S")) {
			s.setVelY(0);
		}
		if(!inputList.contains("A") && !inputList.contains("D")) {
			s.setVelX(0);
		}
		
		if(inputList.isEmpty()) {
			currentKey = NO_KEY;
		}
		
	

	}
	


	public String getCurrentKey() {
		return currentKey;
	}

	public void setCurrentKey(String currentKey) {
		this.currentKey = currentKey;
	}

	public ArrayList<String> getInputList() {
		return inputList;
	}

	public void setInputList(ArrayList<String> inputList) {
		this.inputList = inputList;
	}

	public String getLastInput() {
		return lastInput;
	}

	public void setLastInput(String lastInput) {
		this.lastInput = lastInput;
	}

	public Sprite getS() {
		return s;
	}

	public void setS(Sprite s) {
		this.s = s;
	}

}
