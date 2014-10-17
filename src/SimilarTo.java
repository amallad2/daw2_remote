public class SimilarTo{
	
	//Atributtes
	private String name1;
	private String name2;
	
	
	//Constructor
	public SimilarTo(){
	
	}
	
	public SimilarTo (String name1, String name2){
		this.name1=name1;
		this.name2=name2;
	}
	
	//Accessors
	public String getName1(){
		return name1;
	}
	
	public void setName1(String name1){
		this.name1=name1;
	}
	
	public String getName2(){
		return name2;
	}
	
	public void setName2(String name2){
		this.name2=name2;
	}
	
	//Methods
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Name1: ");
		sb.append(name1);
		sb.append("Name2: ");
		sb.append(name2);
		return sb.toString();
	}
	
	public boolean equals(Object obj){
		boolean res;
		if (this == obj) res=true;
		else{
			if(obj instanceof SimilarTo){
				SimilarTo other = (SimilarTo) obj;
				if (this.name1.equals(other.name1) && this.name2.equals(other.name2)) res=true;
				else res=false;
			}
			else res=false;
		}
		return res;
	}
}
