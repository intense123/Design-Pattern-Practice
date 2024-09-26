// Abstract Product: Furniture
interface Chair {
    void sit();
}

interface Sofa {
    void lieDown();
}

interface CoffeeTable {
    void placeCoffee();
}

// Concrete Products: Modern style
class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a modern chair");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Lying down on a modern sofa");
    }
}

class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on a modern coffee table");
    }
}

// Concrete Products: Victorian style
class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Lying down on a Victorian sofa");
    }
}

class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on a Victorian coffee table");
    }
}

// Concrete Products: ArtDeco style
class ArtDecoChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on an Art Deco chair");
    }
}

class ArtDecoSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Lying down on an Art Deco sofa");
    }
}

class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on an Art Deco coffee table");
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

// Concrete Factories for each style
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}

// Client Code
public class FurnitureShopSimulator {
    public static void main(String[] args) {
        // Create a Modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.sit();
        modernSofa.lieDown();
        modernCoffeeTable.placeCoffee();

        // Create a Victorian furniture set
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        victorianChair.sit();
        victorianSofa.lieDown();
        victorianCoffeeTable.placeCoffee();
    }
}
