package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean format;
	
	public Time(int hour,int min, boolean format) {
		this.hour=hour;
		this.minute=min;
		this.format=format;
	}
	
/**
 * Returns time in either 12 hour or 24 hour format
 */
	public String toString() {
		String s= String.valueOf(this.minute);
		if(this.minute<10) {
			s= "0"+String.valueOf(this.minute);
		}
		if(format) {
			return String.valueOf((this.hour))+":"+s;
		}else {
			if(this.hour>12) {
				return String.valueOf((this.hour-12))+":"+s+" p.m.";
			}
			else if(this.hour==0) {
				return "12:" +s +" a.m.";
			}
			else {
				return String.valueOf(this.hour)+":"+s+" a.m.";
			}
				
		}
	}
	
	public static boolean isEqual(Time time1, Time time2){
		if (time1.equals(time2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Time first=new Time(0, 04, true);
		Time second= new Time(0, 12, false);
		Time third= new Time(0, 12, true);
//		System.out.println(first.toString());
//		System.out.println(second.toString());
//		System.out.println(isEqual(first,second));
		System.out.println(isEqual(second,third));
		System.out.println(second==third);
		
		
		
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}