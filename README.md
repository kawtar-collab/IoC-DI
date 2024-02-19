# Rapport - Partie 1: Introduction au Inversion of Control (IoC) et Dependency Injection (DI)

## Introduction
Ce rapport présente la première partie du projet, qui vise à explorer les concepts d'Inversion of Control (IoC) et de Dependency Injection (DI) en utilisant Java et le Framework Spring. L'objectif principal est de comprendre comment IoC et DI améliorent la modularité et la flexibilité des applications.

## Objectifs
1. **Créer l'interface IDao**: Définir une interface avec une méthode `getDate` pour obtenir la date.
2. **Implémenter l'interface IDao**: Créer une classe `DaoImpl` qui implémente l'interface `IDao` et fournit une implémentation de la méthode `getDate`.
3. **Créer l'interface IMetier**: Définir une interface avec une méthode `calcul` pour effectuer un calcul.
4. **Implémenter l'interface IMetier avec couplage faible**: Créer une classe `MetierImpl` qui implémente l'interface `IMetier` et utilise le couplage faible pour obtenir une instance de `IDao`.
5. **Injection des dépendances**:
   - **Par instanciation statique**: Créer et fournir manuellement les dépendances nécessaires.
   - **Par instanciation dynamique**: Utiliser un mécanisme pour fournir les dépendances à l'exécution.
   - **En utilisant le Framework Spring**:
     - **Version XML**: Configurer les dépendances dans un fichier XML.
     - **Version annotations**: Utiliser les annotations de Spring pour configurer les dépendances.

## Implémentation
Le projet contient les classes suivantes:

- `IDao.java`: L'interface définissant la méthode `getDate`.
- `DaoImpl.java`: L'implémentation de `IDao` fournissant une implémentation de `getDate`.
- `IMetier.java`: L'interface définissant la méthode `calcul`.
- `MetierImpl.java`: L'implémentation de `IMetier` utilisant le couplage faible pour obtenir une instance de `IDao`.


## Conclusion
Cette partie du projet a permis de mettre en pratique les concepts fondamentaux d'IoC et de DI. L'utilisation de différentes méthodes d'injection de dépendances a permis de comprendre les avantages et les inconvénients de chaque approche. La prochaine étape consistera à approfondir ces concepts en explorant des cas d'utilisation plus complexes et en utilisant des fonctionnalités avancées du Framework Spring.

Pour plus de détails sur l'utilisation de Spring pour l'injection de dépendances, veuillez consulter la documentation officielle de Spring.

---
Auteur: [KHALLOUQ Kawtar II-BDCC2]


