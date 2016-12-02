/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import datenKlassen.Aenderungsmeldung;
import datenKlassen.Station;
import datenKlassen.StationAenderung;
import funktionaleKlassen.EinwegClientkommunikator;
import funktionaleKlassen.NeuesObjektListener;
import funktionaleKlassen.ZweiwegeClientkommunikator;
import java.io.IOException;
import java.net.UnknownHostException;


public class Kommunikation {
    
    
    
    public static void main(String args[]) {
          GUI gui = new GUI();
   gui.setVisible(true);
		try {
			/*
			 * Implementierung der Inneren Klasse siehe unten.
			 */
			Kommunikation.KomTestimplements listener = new KomTestimplements();

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

    
    


    
    
    
    
    
    
    

private static class KomTestimplements implements
			NeuesObjektListener<Station> {
		/*
		 * Implementierung der Methode aus dem Interface. Im Hintergrund lauft
		 * der Thread, der immer neue stationen empfaengt. Deshalb ist es
		 * notwendig die Implementierung so vorzunehmen, dass keine
		 * Zugriffskonflikte entstehen koennen.
		 */
		public void neuesAustauschobjekt(Station station) {
			/*
			 * Die Station, die uns neu uebergeben wurde wird hier nur
			 * ausgegeben.
			 */
			System.out.println(station.getStationID() + " "
					+ station.getVorgabewert());
			/*
			 * Hier werden falls vorhanden die Aktuellen Tageswerte ausgegeben.
			 */
			for (String key : station.getAktuelleWerte().keySet()) {
				System.out.println("\t"
						+ key
						+ " "
						+ station.getAktuelleWerte().get(key)
								.getAktuellerWert()
						+ " / "
						+ station.getAktuelleWerte().get(key).getAbweichung()
						+ " ==> "
						+ station.getAktuelleWerte().get(key)
								.getRelativeAbweichung());
			}
		}
}	}