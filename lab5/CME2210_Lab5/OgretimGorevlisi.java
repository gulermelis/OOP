
public class OgretimGorevlisi implements IKisiBilgileri, ICalisanBilgileri
{
	private String adSoyad;
	private String ePosta;
	private String telefon;
	private String departman;
	private String gorev;
	
	@Override
	public String getDepartman() {
		// TODO Auto-generated method stub
		return departman;
	}
	@Override
	public void getDepartman(String departman) {
		// TODO Auto-generated method stub
		this.departman = departman;
	}
	@Override
	public String getGorev() {
		// TODO Auto-generated method stub
		return gorev;
	}
	@Override
	public void getGorev(String gorev) {
		// TODO Auto-generated method stub
		this.gorev = gorev;
	}
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
