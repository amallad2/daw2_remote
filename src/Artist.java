/**
 * Artist.java
 * @author Irene Blanco Fabregat
*/
import java.io.*;

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
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
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


public static void main(String argv[]) {
		try {
			int  age; age = -1;
			String name, surname, location; name = surname = location = "";
			boolean readingError;
			do {
				try{
					BufferedReader buffer = 
								new BufferedReader(
									new InputStreamReader(System.in));
					System.out.println("Name:");
					name = buffer.readLine();
					System.out.println("Surname:");
					surname = buffer.readLine();
					System.out.println("age:");
					age = Integer.parseInt(buffer.readLine());
					System.out.println("Location:");
					location = buffer.readLine();
					
					readingError = false;
				}catch(Exception e){
					System.out.println("Incorrect value!!");
					readingError = true;
				}
			} while(readingError);
			Artist a = new Artist(name, surname, age, location);
			System.out.println(a.toString());
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}