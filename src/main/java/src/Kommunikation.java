/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import datenKlassen.Station;
import funktionaleKlassen.EinwegClientkommunikator;
import java.io.IOException;
import java.net.UnknownHostException;

public class Kommunikation {

	public static void main(String args[]) {
		GUI gui = new GUI();
		gui.setPanel_datelist(false);
		gui.setVisible(true);
		try {
			/*
			 * Benutzung des Einwegclients. Uebergabewerte: IP des Servers,
			 * Objekt, das den Listener implementiert und der Port, der in der
			 * Klasse allerdings als Konstante hinterlegt ist.
			 */
			EinwegClientkommunikator<Station> ew = new EinwegClientkommunikator<Station>(
					"54.89.87.213", gui,
					EinwegClientkommunikator.EINWEGKOMMUNIKATION);
			/*
			 * Sehr wichtig: den Thread starten.
			 */
			ew.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}