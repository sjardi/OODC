package Week5.practicum4;

import java.io.*;

public class KlasManager {

	public void klasOpslaan(Klas deKlas) throws IOException {
		/* Voeg hier code toe om parameter 'deKlas' in bestand klas.obj */
		FileOutputStream fos = new FileOutputStream("src/Week5/practicum4/klas.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(deKlas);
		oos.close();
	}

	public Klas klasInladen() throws IOException, ClassNotFoundException {
		Klas deKlas = null;

		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */

		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */

		FileInputStream fis = new FileInputStream("src/Week5/practicum4/klas.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		deKlas = (Klas) obj;
		ois.close();

		return deKlas;
	}
}
