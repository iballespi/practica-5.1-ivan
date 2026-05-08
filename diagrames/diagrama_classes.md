# Diagrama de Classes - Gestió Bancària

```mermaid
classDiagram
    class Persona {
        <<abstract>>
        #String dni
        #String nom
        #String adreca
        #String telefon
    }

    class Client {
    }

    class Empleat {
        -Sucursal sucursal
    }

    class Sucursal {
        -String id
        -String adreca
    }

    class CompteBancari {
        <<abstract>>
        #String numeroCompte
        #Date dataObertura
        #double saldo
        #double tipusInteres
        #List~Client~ clients
    }

    class CompteCorrent {
        -List~TargetaCredit~ targetes
        -List~FonsInversio~ fonsInversio
        -List~CarteraValors~ carteresValors
    }

    class CompteTermini {
        -int nombreMesos
    }

    class TargetaCredit {
        -String tipus
        -String numero
        -String titular
        -Date dataCaducitat
    }

    class FonsInversio {
        -String nom
        -double importInversio
        -double rendibilitat
        -Date dataObertura
        -Date dataVenciment
    }

    class CarteraValors {
        -List~Valor~ valors
    }

    class Valor {
        -String nom
        -int nombreTitols
        -double preuCotitzacio
    }

    Persona <|-- Client
    Persona <|-- Empleat
    Empleat --> Sucursal : treballa en
    CompteBancari <|-- CompteCorrent
    CompteBancari <|-- CompteTermini
    CompteBancari "1" o-- "1..*" Client : titulars
    CompteCorrent "1" o-- "0..*" TargetaCredit : té
    CompteCorrent "1" o-- "0..*" FonsInversio : associat
    CompteCorrent "1" o-- "0..*" CarteraValors : associat
    CarteraValors "1" *-- "1..*" Valor : compost per
```

## Justificació del Disseny
1. **Herència**: S'ha utilitzat una classe abstracta `Persona` per evitar duplicitat entre `Client` i `Empleat`. De la mateixa manera, `CompteBancari` és abstracta ja que tot compte ha de ser o bé `Corrent` o `A Termini`.
2. **Associació**: Els comptes tenen una llista de clients (titulars).
3. **Agregació**: Un compte corrent pot tenir targetes o fons, però aquests poden existir (o el compte pot no tenir-ne cap).
4. **Composició**: La `CarteraValors` està composta per `Valor`. Si s'elimina la cartera, els valors associats a aquesta instància específica perden el seu context dins del compte.
