/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompok6;

/**
 *
 * @author ASUS
 */
public abstract class Orang {
	private String nama;
	private String alamat;
	private long notelp;
	private String email;
	private String password;
	
	
	public abstract void bisabernafas();
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	
	public String getAlamat(){
		return alamat;
	}
	
	public void setNotelp(long notelp){
		this.notelp=notelp;
	}
	
	public long getNotelp(){
		return notelp;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getPassword(){
		return password;
	}
	
}
