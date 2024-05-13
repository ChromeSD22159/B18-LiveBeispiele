<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Videothek</h3>
<br>

<p align="center">
  <img width="600" height="340" src="img/best-star-wars-meme.webp" />
</p>

#### Beschreibung
Du bist der Inhaber/die Inhaberin einer digitalen Videothek. Du möchtest passend dazu ein Programm entwickeln, das dich beim Verwalten der Filme und beim Abwickeln deines Geschäfts unterstützt.

> #### Hinweise zur Bearbeitung
> - Achte darauf, dass dein Quellcode sauber ist. Besonders die Einrückungen sind wichtig!
> - Verwende Dokumentationskommentare, um deinen Code zu erklären und zu dokumentieren.
> - Teste deinen Code. Er sollte nicht nur kompilieren und ausführbar sein, sondern auch das gewünschte Ergebnis liefern.
> - `Commit & Push` dein Ergebnis am Ende des Tages
<br>

<details>
<summary> <b> Aufgabe 1 - Das Angebot ansehen. </b> </summary>

**Dateien für die Aufgabe:** *Videothek.kt* *Test.kt* 


In der Datei Videothek.kt findest du bereits ein vorhandenes Sortiment. Schau dir an, wie dieses Sortiment aussieht und wie es gespeichert ist. Um sicherzustellen, dass du die Datenstrukturen verstanden hast, füge einen Film deiner Wahl zum Sortiment hinzu. Vergiss nicht, dem Film auch einen Preis, ein Genre und Bewertungen hinzuzufügen.

Außerdem ist bereits Datei namens Test.kt erstellt. Dort kannst du beliebigen Code testen. Nutze sie wie du willst.

</details>

---

<details>
<summary> <b> Aufgabe 2 - Preise für Filme festlegen </b> </summary>

**Dateien für die Aufgabe:** *Random.kt* *Videothek.kt*

Alle Filme haben derzeit denselben Preis von 1,0 €. Schreibe eine Funktion in der Datei `Random.kt`, die einen zufälligen Preis zwischen 2,0 € und 4,99 € generiert.

Passe anschließend das Sortiment in `Videothek.kt` an, sodass jedem Film ein zufälliger Preis zugewiesen wird.

</details>

---

<details>
<summary> <b> Aufgabe 3a - Preisabfrage für einen Film </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*

Implementiere als Nächstes eine Funktion,
die uns für einen beliebigen Film den aktuellen Preis zurückgibt.
Dabei bekommt die Funktion den Filmtitel als Parameter übergeben.

</details>

---

<details>
<summary> <b> Aufgabe 3b - Genre-Abfrage für einen Film </b> </summary>

Implementiere eine Funktion, die für einen beliebigen Film das aktuelle Genre zurückgibt. 
Dabei bekommt die Funktion den Filmtitel als Parameter übergeben.

**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 3c - Bewertung eines Film </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*

Implementiere jetzt eine Funktion, die einen Film erwartet und uns die **durchschnittliche** Bewertung für diesen Film zurückgibt. Beachte, dass jedem Film mehrere Bewertungen zugewiesen werden (1 bis 10 Bewertungen pro Film), die in einer Liste gespeichert sind. Du kannst eine Listenfunktion verwenden, um den Durchschnitt dieser Bewertungen zu berechnen. 

</details>

---

<details>
<summary> <b> Aufgabe 4a - Preis des günstigsten Films </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*

Schreibe eine Funktion, die den Preis des günstigsten Films zurückgibt.

</details>

---

<details>
<summary> <b> Aufgabe 4b - Preis des teuersten Films </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*
  
Schreibe eine Funktion, die den Preis des teuersten Films zurückgibt.

</details>

---

<details>
<summary> <b> Aufgabe 5a - Anzahl aller Filme im Sortiment </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*
  
Schreibe eine Funktion, welche die Anzahl aller Filme im Sortiment zurückgibt.

</details>

---

<details>
<summary> <b> Aufgabe 5b - durchschnittlicher Preis aller Filme</b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*
  
Schreibe eine Funktion, welche den durchschnittlichen Preis der Filme zurückgibt.

</details>

---

<details>
<summary> <b> Aufgabe 6 - Sortiment alphabetisch sortieren </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*

Schreibe eine Funktion, die das Sortiment nach dem Alphabet sortiert zurückgibt.

</details>

---

<details>
<summary> <b> Aufgabe 7 - Einen Film verkaufen </b> </summary>

**Dateien für die Aufgabe:** *Abfragen.kt*

Programmiere eine Kundeninteraktion:  
Schreibe eine Funktion, die das Sortiment ausdruckt und dem Kunden ermöglicht, einen Film auszuwählen (über `readln()`). Der ausgewählte Film soll aus dem Sortiment entfernt werden.

</details>

---

<details>
<summary> <b> Aufgabe 8 - Probelauf </b> </summary>

Zum Schluss soll ein Probelauf für die Videothek durchgeführt werden. Verwende dafür deine erstellten Funktionen!

Befolge in der Datei `main.kt` folgende Schritte:  

- Den Kunden begrüßen.
- Das gesamte Sortiment (alphabetisch sortiert) anzeigen.
- Die Anzahl der Filme und die Preisspanne der Filme dem Kunden anzeigen.
- Den durchschnittlichen Preis der Filme anzeigen.
- Dem Kunden den Preis, das Genre und die durchschnittliche Bewertung eines Films ausdrucken.
  - Der Kunde kann den Film z.B. über die Konsole angeben (entweder als Index oder Name).
- Den Kunden erneut auffordern, einen Film zum Kauf auszuwählen und den ausgewählten Film aus dem Sortiment entfernen.

So könnte die Konsolenausgabe also aussehen:
```text
Willkommen!
Unser Sortiment (alphabetisch sortiert): 
[Die Hard, Harry Potter Teil 1, Indiana Jones, Schindler's List, Star Wars, The Dark Knight, The Godfather, The Lord of the Rings, The Matrix, The Shawshank Redemption]
Wir besitzen 10 Filme und unserer Preisspanne liegt bei 3.04 € bis 5.86 €
Durchschnittlich kosten unsere Filme 4.4959999999999996€
Wählen Sie einen Film für mehr Informationen (geben Sie den Index ein): 
1
Der Film Harry Potter Teil 1 kostet 5.86€, gehört dem Genre Fantasy an und hat eine durchschnittliche Bewertung von 2.0
Unsere Filme:
[The Dark Knight, Indiana Jones, Die Hard, The Shawshank Redemption, Schindler's List, The Godfather, Star Wars, The Matrix, The Lord of the Rings, Harry Potter Teil 1]
Welchen Film wollen Sie kaufen (geben Sie einen Index ein)?
2
Die Hard
Film erfolgreich gekauft: true
```
</details>

---
