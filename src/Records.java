public class Records {
	int recordsNumber;
	String powerofLove;
	String thePretender;
	String holyDiver;
	int date;
	
	public Records(int recordsNumber, String powerofLove, String thePretender, String holyDiver,int date){
		this.recordsNumber = recordsNumber;
		this.powerofLove = powerofLove;
		this.thePretender = thePretender;
		this.holyDiver = holyDiver;
		this.date=date;
	}

	public int getrecordsNumber() {
	    return this.recordsNumber;
	}

	public String getpowerofLove() {
	    return this.powerofLove;
	}

	public String getthePretender() {
	    return this.thePretender;
	}
	public String getholyDiver() {
	    return this.holyDiver;
	}

	public int getdate() {
	    return this.date;
	}

	public void setrecordsNumber(int recordsNumber) {
	    this.recordsNumber = recordsNumber;
	}

	public void setpowerofLove(String powerofLove) {
	    this.powerofLove = powerofLove;
	}

	public void setthePretender(String thePretender) {
	    this.thePretender = thePretender;
	}
	public void setholyDiver(String holyDiver) {
	    this.holyDiver = holyDiver;
	}

	public void setdate(int date) {
	    this.date = date;
	}
	public String toString(){
		return "+recordsNumber: " + this.recordsNumber + "\n+powerofLove: " + this.powerofLove + "\n+thePretender: " + this.thePretender + "\n+holyDiver:" + this.holyDiver + "+date: " + this.date;
	}
	
}
