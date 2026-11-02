package stringoviVjezbe;

public class Student {
	
/*Zadatak 1 – Obrada podataka o studentu (10 poena)
Podaci su predstavljeni stringom sljedećeg oblika:
ST2024-045;Petar Petrovic;8.75;3
Gdje su:
• ST2024-045 – broj indeksa
• Petar Petrovic – ime i prezime
• 8.75 – prosječna ocjena
• 3 – godina studija
Napisati statičku metodu dajPodatke(String unos) koja iz proslijeđenog stringa izdvaja broj indeksa,
ime i prezime, prosječnu ocjenu i godinu studija. Metoda treba da vrati string u JSON-sličnom
formatu.

 	public static String dajPodatke(String unos) {
		String niz[] = unos.split(";");
		String brInd = niz[0];
		String imePrezime = niz[1];
		String prosjecnaOcjena = niz[2];
		String godinaStudija = niz[3];
		
		
	return "{'broj indeksa': '"+brInd+"','ime i prezime':'"+imePrezime+"','prosjecna ocjena':'"+prosjecnaOcjena+"','godina studija':'"+godinaStudija+"'}";*/
		
	
	
/*	Zadatak 2 – Obrada podataka o automobilu (10 poena)
Podaci su predstavljeni stringom sljedećeg oblika:
PG-AB123|Volkswagen Golf|2018|1598|110
Gdje su:
• PG-AB123 – registarska oznaka
• Volkswagen Golf – marka i model
• 2018 – godina proizvodnje
• 1598 – zapremina motora u cm³
• 110 – snaga motora u konjskim snagama (KS)
Napisati statičku metodu obradiAutomobil(String podaci) koja izdvaja sve informacije i pretvara
snagu motora iz konjskih snaga u kilovate. Metoda treba da vrati string u JSON-sličnom formatu.
Koristiti formulu: P(kW) = P(KS) × 0.7355. Rezultat prikazati na dvije decimale.
  
   public static String obradiAutomobil(String podaci) {
	String[] niz = podaci.split("\\|");
	String regOznaka = niz[0];
	String markaIModel = niz[1];
	String godina = niz[2];
	String zapremina = niz[3];
	int snagaKS = Integer.parseInt(niz[4]);
	
	double snagaKW = snagaKS * 0.7355;
	
	return "{'registarska oznaka':'"+regOznaka+"','marka i model':'"+markaIModel+"','godina registracije':'"+godina+"','zapremina motora':'"+zapremina+"','snaga motora':'"+snagaKW+"'}";*/

	
	
/*	Zadatak 3 – Obrada podataka sa senzora (10 poena)
Podaci su predstavljeni stringom sljedećeg oblika:
SEN05#T=298.15#H=65#P=101325
Gdje su:
• SEN05 – identifikacioni broj senzora
• T=298.15 – temperatura u kelvinima
• H=65 – relativna vlažnost u procentima• P=101325 – atmosferski pritisak u paskalima
Napisati statičku metodu obradiSenzor(String poruka) koja izdvaja podatke i vraća string u
JSON-sličnom formatu.
Temperaturu pretvoriti u stepene Celzijusa: T(°C) = T(K) − 273.15. Pritisak pretvoriti u hektopaskale:
P(hPa) = P(Pa) / 100.

	public static String obradiSenzor(String poruka) {
		 
		String[] niz = poruka.split("#");
		String brojSenzora = niz[0];
		String temp = niz[1].substring(2);
		String vlaznost = niz[2].substring(2);
		String pritisak = niz[3].substring(2);
		
	    double tempKelvin = Double.parseDouble(temp);
	    double tempCelz = tempKelvin - 273.15;
	    double Pritisak = Double.parseDouble(pritisak);
	    double pritisakH = Pritisak / 100;
				
	return "{'broj senzora':'"+brojSenzora+"','temperatura u kelvinima':'"+tempKelvin+"','temperatura u celzijusima':'"+tempCelz+"','vlaznost':'"+vlaznost+"','pritisak':'"+Pritisak+"','pritisak u hektopaskalima':'"+pritisakH+"'}";*/
	
	
	
	/*Zadatak 4 – Obrada podataka o avionskom letu (10 poena)
Podaci su predstavljeni stringom sljedećeg oblika:
YM204;TGD;BEG;14:35;16:10;850
Gdje su:
• YM204 – oznaka leta
• TGD – aerodrom polaska
• BEG – aerodrom dolaska
• 14:35 – vrijeme polaska
• 16:10 – vrijeme dolaska
• 850 – dužina leta u kilometrima
Napisati statičku metodu obradiLet(String podaci) koja izdvaja informacije i izračunava trajanje leta u
minutima. Metoda vraća string u JSON-sličnom formatu.
Pretpostaviti da se polazak i dolazak odvijaju istog dana, u istoj vremenskoj zoni.  
	     
	    public static String obradiLet(String podaci) {
	    	String[] niz = podaci.split(";");
	    	String oznakaLeta = niz[0];
	    	String polazak = niz[1];
	    	String dolazak = niz[2];
	        String vrijemeP = niz[3];
	        String vrijemeD = niz[4];
	    	String kilometri = niz[5];
	    	// odvajanje sati i minuta za polazak i dolazak
	    	String[] p = vrijemeP.split(":");
	        String[] d = vrijemeD.split(":");
	        // pretvaranje odvojene stringove(sate i minute) u vrijednost
	        int satiP = Integer.parseInt(p[0]);
	        int minutiP = Integer.parseInt(p[1]);
	        int satiD = Integer.parseInt(d[0]);
	        int minutiD = Integer.parseInt(d[1]);
	        // trajanje = dolazak - polazak
	        int trajanje = (satiD * 60 + minutiD) - (satiP * 60 + minutiP);
	    	
	    	
	        return "{'oznaka leta':'"+oznakaLeta+"','polazak':'"+polazak+"','dolazak':'"+dolazak+"','vrijeme polaska':'"+vrijemeP+"','vrijeme dolaska':'"+vrijemeD+"','kilometri':'"+kilometri+"','trajanje leta u minutima':'"+trajanje+"'}";*/
	
	/*Zadatak 5 – Obrada bankarske transakcije (10 poena)
Podaci su predstavljeni stringom sljedećeg oblika:
TXN2025-0045|ME25505000012345678951|1250.75|EUR|2025-11-04
Gdje su:
• TXN2025-0045 – identifikacioni broj transakcije
• ME25505000012345678951 – broj računa
• 1250.75 – iznos transakcije
• EUR – valuta
• 2025-11-04 – datum transakcije
Napisati statičku metodu obradiTransakciju(String podaci) koja izdvaja sve podatke i izračunava
proviziju banke u iznosu od 1,5% transakcije. Metoda vraća string u JSON-sličnom formatu.
Proviziju zaokružiti na dvije decimale. 
	
	         public static String obradiTransakciju(String podaci) {
	        	 String[] niz = podaci.split("\\|");
	        	 String id = niz[0];
	        	 String brRacuna = niz[1];
	        	 String iznosTran = niz[2];
	        	 double transakcija = Double.parseDouble(iznosTran);
	        	 String valuta = niz[3];
	        	 String datum = niz[4];
	        	 
	        	 double provizija = transakcija * 0.015;
	        	 provizija = Math.round(provizija * 100.0) / 100.0;
	        	  return "{'id transakcije':'"+id+"','broj racuna':'"+brRacuna+"','iznos':'"+iznosTran+"','valuta':'"+valuta+"','datum':'"+datum+"','provizija':'"+provizija+"'}";*/
	/*Zadatak 6 – Obrada vremenske prognoze (15 poena)
	Podaci su predstavljeni stringom sljedećeg oblika:MET01-20251104-0830-T29515-H078-P101325-W045
	Gdje su:
	• MET01 – oznaka meteorološke stanice
	• 20251104 – datum mjerenja (YYYYMMDD)
	• 0830 – vrijeme mjerenja (HHMM)
	• T29515 – temperatura u kelvinima pomnožena sa 100
	• H078 – relativna vlažnost u procentima
	• P101325 – atmosferski pritisak u paskalima
	• W045 – brzina vjetra u km/h
	Napisati statičku metodu obradiPrognozu(String poruka) koja izdvaja podatke i vraća string u
	JSON-sličnom formatu.
	Izvršiti sljedeće konverzije: (1) temperaturu iz kelvina u stepene Celzijusa; (2) pritisak iz paskala u
	hektopaskale; (3) brzinu vjetra iz km/h u m/s; (4) datum prikazati u formatu DD.MM.YYYY.*/
	
	             public static String obradiPrognozu(String poruka) {
	            	 String[] niz = poruka.split("-");
	            	 String oznaka = niz[0];
	            	 String datum = niz[1];
	            	 String vrijeme = niz[2];
	            	 String tempKel = niz[3].substring(1);
	            	 String vlaznost = niz[4].substring(1);
	            	 String pritisakPas = niz[5].substring(1);
	            	 String brzinaVjetra = niz[6].substring(1);
	            	 String noviDatum = datum.substring(6, 8) + "." + datum.substring(4, 6) + "." + datum.substring(0, 4);
	            	 double temp = Double.parseDouble(tempKel);
	     	         double tempC = temp + 273.15;
	     	    	 double pritisak = Double.parseDouble(pritisakPas);
	     	    	 double pritisakH = pritisak / 100.0;
	     	    	 double brzinaH = Double.parseDouble(brzinaVjetra);
	     	    	 double brzina = brzinaH / 3.6;
	     	    	 return "{'stanica':'"+oznaka+"','datum':'"+noviDatum+"','vrijeme':'"+vrijeme+"','temperatura u kelvinima':'"+tempKel+"','temperatura u celzijusima':'"+tempC+"','vlaznost':'"+vlaznost+"','pritisak u paskalima':'"+pritisakPas+"','pritisak u hektopaskalima':'"+pritisakH+"','brzina vjetra u km/h':'"+brzinaH+"','brzina vjetra u m/s':'"+brzina+"'}";
	            	 
	        	 }
	        	 
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(obradiStudenta(student));
		
		
        //String podaci = "PG-AB123|Volkswagen Golf|2018|1598|110";
        //System.out.println(obradiAutomobil(podaci));
		
		
		//String poruka = "SEN05#T=298.15#H=65#P=101325";
		//System.out.println(obradiSenzor(poruka));
		
		//String podaci = "YM204;TGD;BEG;14:35;16:10;850";
		//System.out.println(obradiLet(podaci));
		
		//String podaci = "TXN2025-0045|ME25505000012345678951|1250.75|EUR|2025-11-04";
		//System.out.println(obradiTransakciju(podaci));
		
		String poruka = "MET01-20251104-0830-T29515-H078-P101325-W045";
		System.out.println(obradiPrognozu(poruka));
	}
	

}
