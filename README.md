
# Framework d'injection de dépendances en Java

Ce projet consiste à développer un mini-framework d'injection de dépendances en Java, offrant la possibilité de réaliser l'injection à travers des fichiers XML de configuration ou en utilisant des annotations.

## Introduction

Le framework d'injection de dépendances, également connu sous les acronymes DI (Dependency Injection) ou IoC (Inversion of Control), est un patron de conception utilisé pour implémenter l'inversion de contrôle. Il permet de gérer les dépendances entre les différents composants d'une application de manière efficace et modulaire.

### Qu'est-ce que l'injection de dépendances ?

L'injection de dépendances est un patron de conception utilisé pour gérer les dépendances entre les différentes classes d'une application. Plutôt que de créer directement les instances des classes dont elles dépendent, les classes sont fournies avec leurs dépendances par un conteneur d'injection de dépendances.

### Qu'est-ce que l'inversion de contrôle ?

L'inversion de contrôle est un principe de conception qui consiste à déléguer le contrôle de l'exécution d'une tâche à un composant externe. Dans le contexte de l'injection de dépendances, cela signifie déléguer la responsabilité de la création et de l'assignation des dépendances à un conteneur d'injection de dépendances.

## Fonctionnalités du framework

Le framework d'injection de dépendances développé dans ce projet offre les fonctionnalités suivantes :

1. Injection de dépendances à travers des fichiers XML de configuration en utilisant Jax Binding.
2. Injection de dépendances à travers des annotations.
3. Possibilité d'injection via :
    a. Le constructeur.
    b. Le Setter.
    c. L'attribut (accès direct à l'attribut : Field).

## Utilisation du framework

Pour utiliser le framework d'injection de dépendances, suivez les étapes suivantes :

1. Créez une instance du conteneur d'injection de dépendances.
2. Déclarez vos classes de service en utilisant les annotations fournies par le framework.
3. Déclarez vos classes clientes et utilisez les annotations ou les fichiers XML de configuration pour spécifier les dépendances.
4. Exécutez votre application et observez l'injection de dépendances en action.

## Exemple d'utilisation

Voici un exemple d'utilisation du framework d'injection de dépendances :

```java
// Déclaration d'une classe de service
@Component
public class MyService {
    // Déclaration d'une dépendance à injecter
    @Autowired
    private MyDependency dependency;
    
    // Méthode d'affichage
    public void display() {
        System.out.println("Hello from MyService");
        dependency.doSomething();
    }
}

// Déclaration d'une classe cliente
public class MyClient {
    // Déclaration d'une dépendance à injecter
    @Autowired
    private MyService service;
    
    // Méthode d'exécution
    public void run() {
        service.display();
    }
}

// Point d'entrée de l'application
public class Main {
    public static void main(String[] args) {
        // Création du conteneur d'injection de dépendances
        Injector injector = new Injector();
        
        // Récupération de l'instance de la classe cliente
        MyClient client = injector.getBean(MyClient.class);
        
        // Exécution de la méthode de la classe cliente
        client.run();
    }
}
```

## Conclusion

Le framework d'injection de dépendances développé dans ce projet offre une solution légère et modulaire pour gérer les dépendances au sein de vos applications Java. En utilisant ce framework, vous pouvez simplifier votre architecture et rendre votre code plus facile à maintenir et à évoluer.
