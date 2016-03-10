/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompok6;

/**
 *
 * @author Citra
 */
public class Kelompok {
    private String nama;
	private Mahasiswa[] anggota;
	private Mahasiswa ketua;
	public int indekskelompok;
	
	public Kelompok{
		this.nama="default";
	}
	
	public void setNama (String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	
	public void setAnggota (Mahasiswa m){
		
	}
	public Mahasiswa getAnggota(int i){
		return anggota[i];
	}
	
	public void setKetua (Mahasiswa m){
		this.ketua=m;
	}
	public Mahasiswa getKetua(){
		return ketua;
	}
}
