package entities;

/**
 * Should have the logic to create product objects
 */
public class ProductFactory {
    
    public Product createProduct(String category){

        switch(category.toLowerCase()){
         
            case "electronics":
            return new ElectronicProduct();
        
            case "clothing":
            return new ClothingProduct();
        

            default :
            throw new IllegalArgumentException("Invalid Category"+ category);
        
    }
}

}
