### Etapy implementacji

- [x]Etap 1: Szkielet projektu
Utworzenie projektu Kotlin + Spring Boot + MongoDB
 

- []Etap 2: Model + Repozytoria 
Stock, StockRepository
  - zaimplementuj potrzebne medody
StockSnapshot, StockSnapshotRepository
  - zaimplementuj potrzebne metody

- []Etap 3: Komunikacja z API
  - nawiąż połaczenie z API FMP - HTTP interface
    - wyświetl dane (JSON)
    - utwórz odpowiednie klasy DTO do przetwarzania danych

- []Etap 4: Service + logika biznesowa
  - modelowanie danych - obliczanie PS Forward, upside itd
  - zapis danych do MongoDB

- []Etap 5: CLI (Spring Shell)
Komendy: update, list, filter, history

- []Etap 6: Rozbudowa
  - []Etap 6.1 LOGIKA 
    - ZASTANÓW SIĘ, JAK DOKŁADNIE OCENIAĆ SPÓŁKĘ
      (Przydatne notatki na dysku google i/lub pulpicie)
    
  - []Etap 6.2 dodatkowe funkcjonalności
      Analizy i agregacje (średnie, mediany, wykresy)
      Middleware do harmonogramu zadań (Scheduler)
      Wykresy
      Export do CSV i PDF