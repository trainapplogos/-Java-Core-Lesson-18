package ua.lviv.trainapplogos;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void SetItem(List list, String str) {
		list.add(str);
	}
	
	public static void main(String[] args) {
		List<Integer> intL = new ArrayList<>();
		SetItem(intL, "Some string");
		System.out.println(intL.get(0));
	}	
}
