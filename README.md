# Pràctica 5.1: Disseny Orientat a Objectes - Gestió Bancària

## 1. Objectiu del Projecte
Aquest projecte simula el disseny d'una aplicació de gestió bancària utilitzant principis de Disseny Orientat a Objectes (DOO). S'ha realitzat l'anàlisi gramatical de l'enunciat per identificar classes, atributs i relacions, s'han generat diagrames UML i s'ha implementat l'esquelet en Java amb la seva documentació corresponent.

## 2. Estructura del Projecte
- `src/`: Conté el codi font Java amb les classes i les etiquetes JavaDoc.
- `diagrames/`: Conté els diagrames UML (Classes, Casos d'Ús, Seqüència, Comunicació i Activitat).
- `documentacio/`: Conté la documentació HTML generada automàticament per JavaDoc.

## 3. Disseny Orientat a Objectes (Anàlisi Booch)
### Identificació de Classes i Atributs
- **Persona (Abstracta)**: Atributs comuns com DNI, nom, adreça i telèfon.
- **Client**: Estén Persona. Representa el client que pot ser titular de comptes.
- **Empleat**: Estén Persona. Treballa en una sucursal.
- **Sucursal**: ID i adreça.
- **CompteBancari (Abstracta)**: Número de compte, saldo, data obertura, tipus d'interès.
- **CompteCorrent**: Estén CompteBancari. Pot tenir targetes, fons i carteres de valors.
- **CompteTermini**: Estén CompteBancari. Té un atribut per al nombre de mesos.
- **TargetaCredit**: Tipus (Visa/MC), número, titular, caducitat.
- **FonsInversio**: Nom, import, rendibilitat, dates.
- **CarteraValors**: Composta per diversos Valors.
- **Valor**: Nom, títols, preu cotització.

### Relacions i Justificació
- **Herència**: S'aplica entre `Persona` -> `Client/Empleat` i `CompteBancari` -> `CompteCorrent/CompteTermini` per reutilitzar atributs i mètodes comuns.
- **Associació**: Un `Empleat` té una associació amb `Sucursal`. Un `CompteBancari` està associat amb un o més `Clients`.
- **Agregació**: El `CompteCorrent` té una llista de `TargetaCredit`, `FonsInversio` i `CarteraValors`. S'usa agregació perquè aquests productes poden existir independentment del cicle de vida d'una instància específica de compte en certs contexts de negoci (tot i que aquí depenen funcionalment del CC).
- **Composició**: La `CarteraValors` i `Valor`. Un valor forma part integral de la cartera.

### Relacions que NO han aparegut
- **Interfície / Implementació**: No s'ha definit cap interfície formal (com per exemple una interfície `Producte` o `Operable`), tot i que seria una millora possible per al sistema.
- **Dependència**: No s'han representat relacions de dependència (on una classe utilitza una altra de forma transitòria, per exemple, en un paràmetre d'un mètode sense mantenir-ne una referència com a atribut).

## 4. Patrons de Disseny (Recerca)
### Què són els Patrons de Disseny?
Són solucions reutilitzables a problemes comuns que apareixen en el disseny de programari. No són dissenys acabats, sinó plantilles o guies sobre com resoldre un problema en diferents situacions.

### Objectiu
L'objectiu principal és estandarditzar el codi, facilitar-ne la comprensió per part d'altres desenvolupadors i millorar la mantenibilitat i escalabilitat del sistema.

### Avantatges i Inconvenients
- **Avantatges**: Reutilització de solucions provades, llenguatge comú entre desenvolupadors, codi més flexible.
- **Inconvenients**: Poden afegir complexitat innecessària si el problema és simple (sobre-enginyeria), requereixen experiència per ser aplicats correctament.

### Patrons més utilitzats actualment
1. **Singleton**: Garanteix que una classe tingui una única instància.
2. **Factory**: Defineix una interfície per crear objectes però deixa que les subclasses decideixin quina classe instanciar.
3. **Observer**: Defineix una dependència un-a-molts perquè quan un objecte canvia d'estat, els seus dependents siguin notificats.
4. **Strategy**: Permet definir una família d'algorismes i intercanviar-los en temps d'execució.
5. **Builder**: Separa la construcció d'un objecte complex de la seva representació.

## 5. Com generar la documentació
Per generar la documentació JavaDoc de nou, executeu des de l'arrel:
```bash
javadoc -d documentacio -sourcepath src -subpackages com.banc.gestio
```
