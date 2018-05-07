package com.qibill;

public class Parcel1 {

	class Contents {
		
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		
		private String label;

		public Destination(String whererTo) {
			label = whererTo;
		}

		String readlabel() {
			return label;
		}
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readlabel());

	}

	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}
}
