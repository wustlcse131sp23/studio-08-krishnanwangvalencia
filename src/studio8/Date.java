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
	
	
	public Date(int day,int month, int year, boolean holiday) {
		this.day=day;
		this.month=month;
		this.year=year;
		this.holiday=holiday;
	}
		
	/**
	 * Returns date
	 */
	public String toString() {
		return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
	}

    public static void main(String[] args) {
    	Date one= new Date(25,12,2005,true);
    	Date two= new Date(12,4,2022,false);
    	
    }

}
