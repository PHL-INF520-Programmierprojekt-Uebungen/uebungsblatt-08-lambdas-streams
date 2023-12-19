# Übungsblatt: Lambdas und Java Streams API
[Link to English version](./README_en.md)

In diesem Übungsblatt lernen Sie, Lambdas und die Java Streams API zu verwenden, um verschiedene Aufgaben zu lösen.

## Übung: Filtern und Abbilden (`Map`) mit Lambdas und Streams 1 (`NumberStreams`)

### Anforderungen

1. Implementieren Sie Ihre Lösung in einer einzigen Java-Datei.
2. Verwenden Sie geeignete Variablennamen und folgen Sie den Clean-Code-Prinzipien.
3. Ihre Lösung sollte keine hartkodierten Werte enthalten.
4. Es ist nicht erlaubt, die ursprünglichen Listen von Ganzzahlen und Strings zu ändern.
5. Definieren und verwenden Sie geeignete Lambdas, um die gewünschte Ausgabe zu erzielen.

### Aufgaben

Implementieren Sie Ihre Lösung in der `main`-Methode der Klasse `Main` im Paket `de.phl.programmingproject.numberstreams`.

Sie haben eine Liste von Ganzzahlen und eine Liste von Strings und Sie möchten einige Operationen mit ihnen unter Verwendung von Lambdas und Streams durchführen. 
Ihre Aufgabe besteht darin, ein Java-Programm zu schreiben, das Folgendes tut:

1. Erstellen Sie eine Liste von Ganzzahlen mit den folgenden Werten: 2, 15, 24, 29, 36, 44, 52, 61, 68, 80.
    * Verwenden Sie die Methode `Arrays.asList(...)` zum Erstellen der Liste.
2. Verwenden Sie einen Lambda-Ausdruck, um alle geraden Zahlen aus der Liste zu filtern (d.h. zu entfernen).
3. Verwenden Sie einen Lambda-Ausdruck, um jede ungerade Zahl in der Liste auf ihr Quadrat abzubilden (`mappen`).
4. Verwenden Sie einen Stream, um die resultierende Liste der quadrierten ungeraden Zahlen auszugeben.
5. Erstellen Sie eine neue Liste von Ganzzahlen mit den folgenden Werten: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.
    * Verwenden Sie **nicht** einfach die Methode `Arrays.asList(...)`, da Sie die Liste später ändern müssen.
        * Stattdessen können Sie sie mit `new ArrayList<>(Arrays.asList(...))` "wrappen" oder eine leere Liste erstellen und die Werte nacheinander hinzufügen.
6. Verwenden Sie einen Stream und einen Lambda-Ausdruck, um zu überprüfen, ob alle Werte durch 10 teilbar sind, und geben Sie das Ergebnis aus.
7. Fügen Sie der zweiten Liste eine ungerade Zahl hinzu und wiederholen Sie Aufgabe 6.
8. Erstellen Sie eine neue Liste von Strings mit den folgenden Werten: "apple", "banana", "cherry", "date", "elderberry".
    * Verwenden Sie die Methode `Arrays.asList(...)` zum Erstellen der Liste.
9. Verwenden Sie einen Lambda-Ausdruck, um alle Strings herauszufiltern (d.h. zu entfernen), die mit dem Buchstaben "c" beginnen. Geben Sie die resultierende Liste aus.
10. Verwenden Sie einen Lambda-Ausdruck, um jeden String in der gefilterten Liste auf ihre Länge abzubilden (zu `mappen`).
11. Verwenden Sie einen Stream, um die resultierende Liste der String-Längen auszugeben.

## Übung: Filtern und Abbilden mit Lambdas und Streams 2 (`Products`)

### Anforderungen

1. Implementieren Sie Ihre Lösung in einer einzigen Java-Datei.
2. Verwenden Sie geeignete Variablennamen und folgen Sie den Clean-Code-Prinzipien.
3. Ihre Lösung sollte keine hartkodierten Werte enthalten.
4. Sie dürfen die ursprüngliche Liste von Produkten nicht ändern.
5. Definieren und verwenden Sie geeignete Lambdas, um die gewünschte Ausgabe zu erzielen.
6. Verwenden Sie die geeigneten Operationen in der Java Streams API, um die gewünschte Ausgabe zu erzielen.

### Aufgaben

Implementieren Sie Ihre Lösung in der `main`-Methode der Klasse `Main` im Paket `de.phl.programmingproject.products`.

Sie haben eine Liste von `Product`-Objekten mit ihren Namen (`name`), Preisen (`price`) und Kategorien (`category`), und Sie möchten einige Operationen mit ihnen unter Verwendung von Lambdas und Streams durchführen. 
Ihre Aufgabe besteht darin, ein Java-Programm zu schreiben, das Folgendes tut:

1. Erstellen Sie eine Liste von `Product`-Objekten mit den folgenden Werten:

``` Java
[
{ name: "Apple", price: 1.20, category: "Fruit" },
{ name: "Banana", price: 0.80, category: "Fruit" },
{ name: "Orange", price: 1.00, category: "Fruit" },
{ name: "Carrot", price: 0.50, category: "Vegetable" },
{ name: "Broccoli", price: 1.80, category: "Vegetable" },
{ name: "Chicken", price: 3.50, category: "Meat" },
{ name: "Beef", price: 5.20, category: "Meat" },
{ name: "Salmon", price: 6.30, category: "Fish" },
{ name: "Tuna", price: 4.80, category: "Fish" },
{ name: "Milk", price: 2.00, category: "Dairy" },
{ name: "Cheese", price: 3.40, category: "Dairy" },
{ name: "Yoghurt", price: 1.50, category: "Dairy" },
]
```
2. Erstellen Sie einen Stream und verwenden Sie einen Lambda-Ausdruck, um alle Produkte mit einem Preis von weniger als 2,00 herauszufiltern.
3. Verwenden Sie einen Lambda-Ausdruck, um jedes Produkt in der Liste auf einen String abzubilden, die den Namen und die Kategorie getrennt durch einen Doppelpunkt enthält.
4. Verwenden Sie einen Stream, um die resultierende Liste von Product-Strings auszugeben.
5. Erstellen Sie einen neuen Stream und verwenden Sie einen Lambda-Ausdruck, um alle Produkte herauszufiltern, die nicht in der Kategorie "Dairy" (Milchprodukte) sind und einen Preis von 2,00 oder mehr haben.
6. Zählen Sie die Produkte und geben Sie das Ergebnis aus.