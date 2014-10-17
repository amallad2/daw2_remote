/**
 * Artist.java
 * @author Irene Blanco Fabregat
*/


public class Artist {
// ATRIBUTES -------------------------------------------------------	
	private String name;
	private String surname;
	private int age;
	private String location;

// CONSTRUCTORS ----------------------------------------------------
	public Artist (String name, String surname, int age, String location){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.location = location;
	}
	
// ACCESSORS -------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String getSurname) {
		this.surname = surname;
	}
	
	public int age getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
// METHODS ---------------------------------------------------------	
	public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append("ARTIST");
			sb.append("\nName: ");
			sb.append(name);
			sb.append("\nSurname: ");
			sb.append(surname);
			sb.append("\nAge: ");
			sb.append(age);
			sb.append("\nLocation: ");
			sb.append(location);
			
			return sb.toString();
	}
}
