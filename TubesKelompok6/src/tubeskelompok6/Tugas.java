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
public class Tugas {
    private Kelompok[] kelompokl;
	private String nama;
	private int bobotNilai;
	private String[] jawaban;
	public int nomorsoal;
	public int indekskelompok;
	public String sifatTugas;
	public String[] soal;
	
	public Tugas{
		this.nama="default";
	}
	
	public void setNama (String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	
	public void setKelompok (Kelompok k){
		
	}
	public Kelompok getKelompok(int i){
		return kelompok[i];
	}
	
	public void setBobot (int b){
		this.bobotNilai=b;
	}
	public int getBobot(){
		return bobotNilai;
	}
	
	public void setJawaban (String j){
		
	}
	public String getJawaban(int i){
		return jawaban[i];
	}
	
	public void addJawaban (String s){
		
	}
	
	public void addSoal (String s, int bobotNilai){
		
	}
}
