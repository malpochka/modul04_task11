package by.epam.text.main;

import by.epam.text.entity.*;
import by.epam.text.logic.*;
import by.epam.text.view.*;

/*Создать объект класса Текст, используя классы предложение и слово.Методы:дополнить текст,
 *  вывести на консоль текст, заголовок текста.*/
public class Main {

	public static void main(String[] args) {
		
		String s;
		String s2;
		String s1="Жизнь в замке.";
		String s3="Замки создавали мощную цепь, связывающую завоеванные феодалом-землевладельцем территории."+"\n"+
				"В средние века укрепленные, не приступные каменные крепости часто встречались в Европе и на Ближнем Востоке.";

		TextLogic logic = new TextLogic();
		TextView view = new TextView();
		
		Text t = new Text(s1,s3);
		
		view.print(t);
		view.print1(t);
		
		System.out.println();
		
		s = logic.enterFromConsole("Введите текст, которым хотите дополнить");
		s2 = logic.changeText(t, s);
		
		Text t1;
		t1 = logic.addText1(t, s2);
		
		System.out.println();
		
		view.print(t);
		view.print1(t1);

	}
}

