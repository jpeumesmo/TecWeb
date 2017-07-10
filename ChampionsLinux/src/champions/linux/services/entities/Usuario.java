package champions.linux.services.entities;

public class Usuario {
	String email;
	String password;
	String nome;
	
	public Usuario(String email,String password){
		this.email = email;
		this.password = password;
	}
	
	public boolean equals(Object user){
		if ( this.email.equals(((Usuario)user).getEmail()) && 
				this.password.equals(((Usuario)user).getPassword()) ){
			return true;
		} else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
