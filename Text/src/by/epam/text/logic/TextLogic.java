package by.epam.text.logic;

import java.util.Scanner;

import by.epam.text.entity.*;

public class TextLogic {

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public String changeText(Text t, String s) {
		String s1 = t.getBody().getSent() + "\n" + s;
		return s1;
	}

	public Text addText1(Text t, String s) {
		t.getBody().setSent(s);
		return t;
	}
}
