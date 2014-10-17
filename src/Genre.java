/**
 * Genere.java
 * @author Ismael Gómez Díaz
 * @version 1.0
 * @param ---
 * @return ---
 * @date 2014/10/17
 */
 
public class Genre {
	
	// ATRIBUTES -------------------------------------------------------
	
	private String genre;
	private String subGenre;
	
	// CONSTRUCTORS ----------------------------------------------------
	
	public Genre(String genre, String subGenre) {
		this.genre = genre;
		this.subGenre = subGenre;
	}
	
	// ACCESSORS -------------------------------------------------------
	
	public String getGenre() {
		return Genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getSubGenre() {
		return subGenre;
	}
	
	public void setSubGenre(String subGenre) {
		this.subGenre = subGenre;
	}
	
	// METHODS ---------------------------------------------------------
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("***** SONGS *****");
		sb.append("Genre: ");
		sb.append(genre);
		sb.append("Subgenre");
		sb.append(subGenre);
		return sb.toString();
	}
	
	/**
	 * equals().
	 * compare this to another object.
	 * two genre are equal to each other if their name are equal
	 */
	public boolean equals(Object obj) {
		boolean res;
		if (this == obj) res = true;
		else {
			if (obj instanceof Genre) {
				Genre other = (Genre) obj;
				if (this.name.equals(other.name)) res = true;
				else res = false;
			}
			else res = false;
		}
		return res;
	}
}
