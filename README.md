## Repozitorij laboratorijskih vježbi iz vještine Razvoj skalabilnih informacijskih i komunikacijskih sustava proizvodne razine


Za pokretanje Spring aplikacije pomoću Docker-a potrebno je prvo generirati .jar datoteku naredbom:

```bash
./mvnw install -DskipTests
```

Zatim se sljedećom naredbom generiraju Docker slike i pokreću Docker kontejneri (spring aplikacija i PostgreSQL baza podataka):

```bash
docker-compose up
```

Spring aplikacija nakon toga izložena je na portu 8080. Moguće je provjeriti status aplikacije na /health putanji, podacima o porukama iz baze podataka pristupa se
na putanji /message. Inicijalno će se prikazivati prazno polje, za prikaz podataka potrebno je unijeti podatke u relaciju message baze podataka preko nekog alata za
upravljanje bazama podataka(npr. pgAdmin ili DBeaver).
