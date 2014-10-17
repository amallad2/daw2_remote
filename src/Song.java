/**
 * Song.java
 * @author Sergio Gomez
 * @version 1.0
 * @date 17/10/2014  
 * 
 */ 

public class Song {
	
	//ATRIBUTES
	private String name;
	private int duration;
	
	// CONTRUCTORS
	
	public Song (String name,int duration){
		this.name=name;
		this.duration=duration;
		
	}
	
	//ACCESSORS
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration=duration;
	}
	
	//METHODS
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(name);
		sb.append("Duration: ");
		sb.append(duration);
		return sb.toString();
	}
	
	public boolean equals(Object obj){
		boolean res;
		if (this==obj) res=true;
		else {
			if(obj instanceof Song){
				Song other = (Song) obj;
				if (this.name.equals(other.name)) res=true;
				else res=false;
			}
			else res=false;
		}
	return res;
	}
}
