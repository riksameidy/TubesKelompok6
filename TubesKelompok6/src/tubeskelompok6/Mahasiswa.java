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
public class Mahasiswa extends Orang{
	private long nim;
	private String fakultas;
	private String jurusan;
	
	public void setNim(long nim){
		this.nim=nim;
	}
	
	public long getNim(){
		return nim;
	}
	
	public void setFakultas(String fakultas){
		this.fakultas=fakultas;
	}
	
	public String getFakultas(){
		return fakultas;
	}
	
	public void setJurusan(String jurusan){
		this.jurusan=jurusan;
	}
	
	public String getJurusan(){
		return jurusan;
	}
	
	public void mengerjakanTugas(Tugas t){
		
	}
	
	public void gabungKelompok(Kelompok k, int indeks){
		
	}
	
	public void lihatNilai(Nilai n){
		
	}
}
