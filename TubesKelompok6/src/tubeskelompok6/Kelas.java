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
public class Kelas {
    	private String nama;
	private Matakuliah matakuliah;
	private Mahasiswa[] anggota;
	private Tugas[] tugas; 
	public int jumMahasiswa=0;
	public int jumTugas=0;

	
	public Kelas{
		this.nama="default";
	}
	
	public void setNama (String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	
	public void setMatakuliah (Matakuliah m){
		matakuliah=m;
	}
	public Matakuliah getMatakuliah(){
		return matakuliah;
	}
	
	public void setMahasiswa (Mahasiswa m){
		
	}
	public Mahasiswa getMahasiswa(int i){
		return anggota[i];
	}
	
	public void setTugas (Tugas t){
		
	}
	public Tugas getTugas(int i){
		return tugas[i];
	}
	
	public void addMahasiswa (Mahasiswa m){
		anggota[jumMahasiswa]=m;
		jumMahasiswa++;
	}
	
	public void addTugas (Tugas t){
		Tugas[jumTugas]=t;
		jumTugas++;
	}
	
	public Mahasiswa searchMahasiswa(long nim, Mahasiswa m){
		while (int i=0; i<anggota.length; i++){
			if(m.getNim()==nim){
				return m;
			}
		}
	}
	
	public Kelompok searchKelompok(int i, Kelompok k){
		while (int i=0; i<kelompok.length; i++){
			if(){
				return ;
			}
		}
	}
	
	public Tugas searchTugas(int i){
		while (int i=0; i<tugas.length; i++){
			if(){
				return t;
			}
		}
	}
}
