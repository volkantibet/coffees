import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisAdapter  {

	public static void main(String[] args) throws RemoteException  {
		
		KPSPublicSoapProxy kbsPublic=new KPSPublicSoapProxy();
		boolean result=kbsPublic.TCKimlikNoDogrula(
				Long.parseLong("Tc kimlik no"),
				"AD",
				"SOYAD",
				1988 //dogum yili
				);
		System.out.println("dogrulama: "+(result ?"basarili":"basarisiz"));

	}

}
