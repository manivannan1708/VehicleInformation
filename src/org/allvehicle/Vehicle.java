package org.allvehicle;
//QUESTION 9: part no:01

import java.awt.List;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("*Motors*");

	}

	public static void main(String[] args) {
		Vehicle e = new Vehicle();
		TwoWheeler t = new TwoWheeler();
		ThreeWheeler tw= new ThreeWheeler();
		FourWheeler fw=new FourWheeler();
		e.VehicleNecessery();
		java.util.List<String> li = new LinkedList<String>();
		Map<String,String> m = new LinkedHashMap<String,String>();
		li.add("mani");
		m.put("mani", "1136");
		t.bike();
		t.cycle();
		tw.auto();
		fw.bus();
		fw.car();
		fw.lorry();
		System.out.println(t);

	}

}
