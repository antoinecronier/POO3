package poo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Poo3 {

	public static void main(String[] args) {
		Cosmonaute gens1 = new Cosmonaute("Gargarine", "youri");
		Cosmonaute gens2 = new Cosmonaute("Hugo", "Victor");
		Cosmonaute gens3 = new Cosmonaute("Loeb", "Michel");

		gens1.getEquipements().add(new Equipement("brosse à dent", 3, 0.02));
		gens1.getEquipements().add(new Equipement("vetement", 15, 1.6));

		gens2.getEquipements().add(new Equipement("huile de palme", 30000, 1.0));
		gens2.getEquipements().add(new Equipement("futon", 500, 120.0));

		gens3.getEquipements().add(new Equipement("petit marseillais", 20, 0.61));

		ArrayList<Cosmonaute> cosmoList = new ArrayList<Cosmonaute>();
		cosmoList.add(gens1);
		cosmoList.add(gens2);
		cosmoList.add(gens3);

		Fusee maBelleFusee = new Fusee("space winner");

		Soute soute1 = new Soute("soute1",200.0);
		Soute soute2 = new Soute("soute2",999999.9);

		maBelleFusee.getSoutes().add(soute1);
		//maBelleFusee.getSoutes().add(soute2);

		maBelleFusee.Embarquer(cosmoList);

		maBelleFusee.setCarburant(2000);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1;
		Date d2;

		Destination des1 = null;
		Destination des2 = null;
		try {
			d1 = sdf.parse("21/12/2016");
			d2 = sdf.parse("01/02/2017");
			des1 = new Destination("alpha du centaure", -1000.0, 300.0, d1, 1000);
			des2 = new Destination("Terre", 0.0, 0.0, d2, 1200);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		maBelleFusee.Voyager(des1);
		maBelleFusee.Voyager(des2);

		maBelleFusee.Debarquer();
	}
}
