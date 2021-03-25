package ua.lviv.trainapplogos;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void SetItem(List list, String str) {
		list.add(str);
	}
	
	public static void main(String[] args) {
		//Task1:
		System.out.println(">> Task1");
		List<Integer> intL = new ArrayList<>();
		SetItem(intL, "Some string");
		System.out.println(intL.get(0));
		
		//Task2:
		System.out.println(">> Task2");
		Map <Integer, String> map = new Map<>();
		
		map.AddItem(1, "Benz");
		map.AddItem(1, "Uncle"); //adding forbidden
		map.AddItem(3, "Santiago");
		map.AddItem(2, "Motocycletos");
		map.AddItem(5, "Suares");
		map.AddItem(7, "Gonsales");
		map.AddItem(4, "Pedro");
		map.AddItem(8, "Lucitta");
		map.AddItem(6, "Amigo");
		map.AddItem(99, "Benz");
		
		System.out.println("\n> Initial map: ");
		map.OutputMap();
		
		map.RemoveByKey(5); //remove Suares
		map.RemoveByValue("Benz"); //remove Benz, keys: 1 and 99 
		// 6 items of map remains
		System.out.println("\n> Output Set of keys:");
		map.OutputKeys();
		
		System.out.println("\n> Output List of values:");
		map.OutputValues();
		
		System.out.println("\n> Output Map:");
		map.OutputMap();
	}
}
