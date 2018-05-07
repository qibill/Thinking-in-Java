package com.qibill;

public class Parcel2 {

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

	public Destination to(String dest) {
		return new Destination(dest);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readlabel());
	}

	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
}
