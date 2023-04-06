package studio8;

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean holiday;
	
	
	public int Day() {
		return this.day;
	}
	
	public int Month() {
		return this.month;
	}
	public int Year() {
		return this.year;
	}
	public boolean Holiday() {
		if(holiday) {
			return this.holiday;
		}
		else {
			return false;
		}
	}
	/**
	 * Returns date
	 */
	public String toString() {
		return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
	}

    public static void main(String[] args) {
    	
    }

}
