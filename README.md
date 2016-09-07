# Firkantbil_ferdig
Endelig versjon

Logg:

5.9.2016  
Målsettning:  
Ha en bil som kjører fremover
_______
Utført arbeid:

Får til å kjøre forhåndsskrevne koder.  
Klarer ikke til å lage .class og .jar-filer.   
Får til å lage .class og .jar filer og overføre dem til EV3   
      Test 1: Bilen kjører kun i sirkler Endrer innstillinger for hvilke motorer som får kraft  
      Test 2: Bilen svinger ikke nok Endrer fra «Rotate» til «EngineA.Forward(); EngineB.stop();»   
      Test 3: Bilen svinger for mye Tweaker «Thread.Sleep», til bilen svinger ønsket mengde  
      Test 4: Bilen svinger ca. 95 grader, men fullfører en firkant.  

Utfordringer: 
Klarer ikke å kompilere korrekt (Får ingen .class fil)  
-	Fix: Legge til «-classpath "C:\Program Files\leJOS EV3\lib\ev3\ev3classes.jar; C:\Program Files\leJOS EV3\lib\ev3\dbusjava.jar" $File» i parameters til «Javac»

Notater:  
Hvis vi skulle løst oppgaven med å endre: «Rotate()», til «RotateTo(tall)». 

Sluttilstand: 
Vi kom lengre enn antatt, og programmet er ferdigskrevet. 

