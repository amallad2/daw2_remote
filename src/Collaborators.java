import java.io.*;


public class Collaborator {
	private int id; 
	private String name;
	private String surname;
	private int age;

	public User(int id, String name, String surname, int age){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public User() {
	}

	public String getName() {
	    return this.name;
	}

	public String getSurname() {
	    return this.surname;
	}

	public int getAge() {
	    return this.age;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void setSurname(String surname) {
	    this.surname = surname;
	}

	public void setAge(int age) {
	    this.age = age;
	}
	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String toString(){
		return "+id: " + this.id + "\n+Name: " + this.name + "\n+Surname: " + this.surname + "\n+age:" + this.age;
	}
	
	public static void main(String argv[]) {
		try {
			int id, age; id = age = -1;
			String name, surname; name = surname = "";
			boolean readingError;
			do {
				try{
					BufferedReader buffer = 
								new BufferedReader(
									new InputStreamReader(System.in));
					System.out.println("id:");
					id = Integer.parseInt(buffer.readLine());
					System.out.println("Name:");
					name = buffer.readLine();
					System.out.println("Surname:");
					surname = buffer.readLine();
					System.out.println("age:");
					age = Integer.parseInt(buffer.readLine());
					readingError = false;
				}catch(Exception e){
					System.out.println("Incorrect value!!");
					readingError = true;
				}
			} while(readingError);
			Collaborator c = new User(id, name, surname, age);
			System.out.println(c.toString());
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
