public class furnitureshopsimulator {
    public static void main(String[] args) {
        // Create a Modern furniture set
        furniturefactory modernFactory = new modernfurniturefactory();
        chair modernChair = modernFactory.createchair();
        sofa modernSofa = modernFactory.createsofa();
        coffeetable modernCoffeeTable = modernFactory.createcoffeetable();

        modernChair.sit();
        modernSofa.liedown();
        modernCoffeeTable.placecoffee();

        // Create a Victorian furniture set
        furniturefactory victorianFactory = new victorianfurniturefactory();
        chair victorianChair = victorianFactory.createchair();
        sofa victorianSofa = victorianFactory.createsofa();
        coffeetable victorianCoffeeTable = victorianFactory.createcoffeetable();

        victorianChair.sit();
        victorianSofa.liedown();
        victorianCoffeeTable.placecoffee();
    }
}