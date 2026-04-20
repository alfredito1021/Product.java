public class Product
{
    // Fiels (properties)
    String name;
    double price;
    int quantity;


    //Methods (actions)
    // Notice: no static (static "does not belong to the object")
    public double totalValue()
    {
        return price * quantity;
    }
}