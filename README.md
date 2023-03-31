Programare avansata pe obiecte - proiect

Fiecare student va lucra la un proiect individual. Proiectul este structurat în mai multe etape.
Condiția de punctare a proiectelor:
• să nu prezinte erori de compilare
• să se implementeze cerințele date
Termene de predare:
• Etapa I: saptamana 3 – 7 aprilie
• Etapa II: saptamana 24 – 28 mai

Etapa I
1) Definirea sistemului
Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care se pot face în cadrul
sistemului și o lista cu cel puțin 8 tipuri de obiecte.

2) Implementare
Sa se implementeze în limbajul Java o aplicație pe baza celor definite la primul punct.
Aplicația va conține:
• clase simple cu atribute private / protected și metode de acces
• cel puțin 2 colecții diferite capabile să gestioneze obiectele definiteanterior (eg: List, Set, Map,
etc.) dintre care cel puțin una sa fie sortata – se vor folosi array-uri uni- /bidimensionale în cazul în care
nu se parcurg colectiile pana la data checkpoint-ului.
• utilizare moștenire pentru crearea de clase adiționale și utilizarea lor încadrul colecțiilor;
• cel puțin o clasă serviciu care sa expună operațiile sistemului
• o clasa Main din care sunt făcute apeluri către servicii

Etapa II
1) Extindeți proiectul din prima etapa prin realizarea persistentei utilizând o baza de date relationala
si JDBC.
Să se realizeze servicii care sa expună operații de tip create, read, update si delete pentru cel puțin 4
dintre clasele definite. Se vor realiza servicii singleton generice pentru scrierea și citirea din baza de
date.
2) Realizarea unui serviciu de audit
Se va realiza un serviciu care sa scrie într-un fișier de tip CSV de fiecare data când este executată una
dintre acțiunile descrise în prima etapa. Structura fișierului: nume_actiune, timestamp 
