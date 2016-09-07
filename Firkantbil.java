/*    Firkantbil.java Super Happy Go Go Team 2016 - 09 - 06
* v-0.1.0
* Program som styrer en bil med 2 motorer. Bilen skal oppføre seg slik:
* 1. kjør framover
* 2. Sving høyre
* 3. Sving høyre
* 4. Sving høyre
* 5. Stoppe

* Bilen oppfører seg på følgende måte:
* 1. Kjører frem
* 2. Svinger 95 grader høyre
* 3. Kjører frem
* 4. Svinger 95 grader høyre
* 5. Kjører frem
* 6. Svinger 95 grader høyre
* 7. Kjører frem
* 8. Stopper
*/

import lejos.hardware.motor.*;
import lejos.hardware.lcd.*;

public class Firkantbil
{
  public static void main (String[] args)  throws Exception
  {
     Motor.B.setSpeed(450);  // sett hastighet (toppfart = 900)
	 Motor.C.setSpeed(450);

     // Kjør framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kjør framover
     Motor.C.forward();  // Start motor C - kjør framover
     Thread.sleep(2000); // Vent i 1000 ms før vi går videre i koden

     // Sving
     LCD.clearDisplay();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kjør framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kjør framover
     Motor.C.forward();  // Start motor C - kjør framover
     Thread.sleep(2000); // Vent i 1000 ms før vi går videre i koden

     // Sving
     LCD.clear();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kjør framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kjør framover
     Motor.C.forward();  // Start motor C - kjør framover
     Thread.sleep(2000); // Vent i 1000 ms før vi går videre i koden

     // Sving
     LCD.clear();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kjør framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kjør framover
     Motor.C.forward();  // Start motor C - kjør framover
     Thread.sleep(2000); // Vent i 1000 ms før vi går videre i koden
  }
}

/* Programmet svinger litt for mye.
* Det anbefales å svinge ved å bruke kommandoen: Rotate, ikke Forward*/