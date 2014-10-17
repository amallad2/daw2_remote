public class place{
	
	private String pais;
	private String ciudad;
	private String localidad;
	
	public place(){
		
	}
	
	public place(String pais,String ciudad,String localidad){
		setPais(pais);
		setCiudad(ciudad);
		setLocalidad(localidad);
	}
	
	public String getPais(){
		return this.pais;
	}
	
	public void setPais(String pais){
		this.pais=pais;
	}
	
	public String getCiudad(){
		return this.pais;
	}
	
	public void setCiudad(String ciudad){
		this.ciudad=ciudad;
	}
	public String getLocalidad(){
		return this.localidad;
	}
	
	public void setLocalidad(String localidad){
		this.localidad=localidad;
	}
	
	public String toString(){
			StringBuilder sb=new StringBuilder();
			sb.append("Place :( ");
			sb.append("Pais : ");
			sb.append(pais);
			sb.append("; Ciudad : ");
			sb.append(ciudad);
			sb.append("; Localidad : ");
			sb.append(localidad);
			sb.append(")");
			
			return sb.toString();
	}
	
}
