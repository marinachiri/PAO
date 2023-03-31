

### Etapa I (7 aprilie):
1. Definirea sistemului:
   -  [x] Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care
se pot face în cadrul sistemului și o lista cu cel puțin 8 tipuri de obiecte. 
2.  Implementare: Să se implementeze în limbajul Java o aplicație pe baza celor definite la punctul 1. Aplicația va conține:
    - [x] Clase simple cu atribute private / protected și metode de acces
    - [x] Cel puțin 2 colecții diferite capabile să gestioneze obiectele definite anterior (List, Set, Map, etc.) dintre care cel puțin una sa fie sortata
    - [x] Se vor folosi array-uri uni/bidimensionale in cazul in care nu se parcurg colectiile pana la data checkpoint-ului.
    - [x] Utilizare moștenire pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor;
    - [x] Cel puțin o clasa serviciu care sa expună operațiile
    - [x] O clasa main din care sunt făcute apeluri către servicii

## Aplicație Bancară
(conturi, extras de cont, tranzactii, carduri, servicii)

### Actiuni / Interogari:
 - Creare client (creare_client)
 - Creare card (create_card)
 - Afisare date client (get_customer)
 - Extras de cont total client (get_customer_amount)
 - Afisare conturi client (get_customer_accounts)
 - Afisare cont client (get_customer_account)
 - Incarcare cont client (load_customer_account)
 - Creare tranzactie (create_transaction)
 - Creare cont bancar (create_customer_account)
 - Creare cont economii (create_customer_savings_account)
 - Inchidere cont bancar (close_customer_account)
 - Afisare istoric tranzactii (get_customer_transactions)

### Obiecte:
 - Account (+ AccountFactory)
   - SavingsAccount
 - Card (+ CardFactory)
   - Visa
   - MasterCard
 - Transaction
 - Customer (+ CustomerFactory)
   - Address
 - MainService
 - Main

