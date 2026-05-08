# Diagrama de Casos d'Ús

```mermaid
usecaseDiagram
    actor "Client" as c
    actor "Empleat" as e

    package "Sistema Bancari" {
        usecase "Consultar Saldo" as UC1
        usecase "Obrir Compte Corrent" as UC2
        usecase "Sol·licitar Targeta" as UC3
        usecase "Gestionar Fons Inversió" as UC4
    }

    c --> UC1
    c --> UC3
    e --> UC2
    e --> UC4
    UC3 ..> UC2 : <<extend>> (Només si és CC)
```

**Explicació**:
- El **Client** pot consultar el saldo i sol·licitar una targeta.
- L'**Empleat** és qui realitza l'obertura de comptes i gestiona els fons d'inversió.
- La sol·licitud de targeta "estén" el cas d'ús d'obertura de compte (o requereix que n'hi hagi un de corrent).
