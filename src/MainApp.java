import java.io.*;

public class MainApp {

	private static Artist arrayArtists[] = new Artist[10];
	private static int numArtists = 0;
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args){
		int option = showMenu();
		while(option != 0){
			switch(option){
				case 1:
					Artist a = addNewArtist();
					arrayArtists[numArtists] = a;					
					numArtists++;
					break;
				case 2:
					boolean readingError;
					do{ 
						System.out.println("Which artist? (insert array index)");
						BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
						try{
							int index = Integer.parseInt(buffer.readLine());
							modifyArtist(arrayArtists[index]);
							readingError = false;
						}catch(Exception e){
							System.out.println("There is no artist in the given index");
							readingError = true;
						}
					}while(readingError);
					break;
				case 3:
					numArtists = 0;
					break;
				case 0:
					break;
			}
			option = showMenu();
		}

	}

	/**
	 * Displays a menu and returns option selected
	 * @return option selected
	 */
	public static int showMenu() {
		int result = -1;
		boolean readingError = true;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(readingError){
			System.out.println("\tMenu");
			System.out.println("==========");
			System.out.println("1. - Add new Artist");
			System.out.println("2. - Modify existing Artist");
			System.out.println("3. - Delete Artist (TODO)");
			System.out.println("0. - Exit");
			try{
				String option = buffer.readLine();	
				result = Integer.parseInt(option);
				readingError = false;
			}catch(Exception e){
				readingError = true;
			}
		}		
		return result;
	}

	/**
	 * Asks user for Artist properties and creates a new one
	 * @return
	 */
	public static Artist addNewArtist() {
		int age; age = -1;
		String name, surname, location; name = surname = location =  "";
		boolean readingError;
		do {
			try{
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Name:");
				name = buffer.readLine();
				System.out.println("Surname:");
				surname = buffer.readLine();
				System.out.println("Age:");
				age = Integer.parseInt(buffer.readLine());
				System.out.println("Location:");
				location = buffer.readLine();
				
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		return new Artist(name, surname, age, location);
	}

	public static void modifyArtist(Artist artist){
		System.out.println("===== Current user data =====");
		System.out.println(artist.toString());
		System.out.println("===== Insert new data =====");
		Artist newOne = addNewArtist();
		artist.setName(newOne.getName());
		artist.setSurname(newOne.getSurname());
		artist.setAge(newOne.getAge());
		artist.setLocation(newOne.getLocation());
		System.out.println("Changes done!");
	}

}

