
public class Ogrenci implements IKisiBilgileri
{

	private String adSoyad;
	private String ePosta;
	private String telefon;
	
	
	@Override
	public String getAdSoyad() {
		// TODO Auto-generated method stub
		return adSoyad;
	}
	@Override
	public void setAdSoyad(String adSoyad) {
		// TODO Auto-generated method stub
		this.adSoyad = adSoyad;
	}
	@Override
	public String getEPosta() {
		// TODO Auto-generated method stub
		return ePosta;
	}
	@Override
	public void setEPosta(String ePosta) {
		// TODO Auto-generated method stub
		this.ePosta = ePosta;
	}
	@Override
	public String getTelefon() {
		// TODO Auto-generated method stub
		return telefon;
	}
	@Override
	public void setTelefon(String telefon) {
		// TODO Auto-generated method stub
		this.telefon = telefon;
	}
	
	
	

}
