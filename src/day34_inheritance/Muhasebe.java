package day34_inheritance;

public class Muhasebe extends Personel {

    /* Muhasebe personel'in child class'i olsun . Bunu Javaya declare etmem lazim . Nasil edecegim ?
	 * Class ismine extends(uzanir) keyword ile parent class'i yazariz. 3. SATIR
	 * 
	 * Personel muhasebenin parent class'idir veya Muhasebe personelin child class'idir.
     */
	
	public int saatUcreti;
	public String statu;
	public int maas; // maas saatucretine baglidir. Bir method olusturup maas'i bulabilirim.
	
	public int maasHesapla() {
		
		maas=saatUcreti*8*30; // 8 saatten 30 gun.
		
		return maas;
	}
}
