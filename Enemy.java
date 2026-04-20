public class Enemy
{
    String name;
    int health;
    int damage;
    int x;
    int y;

    public void takeDamage(int amount)
    {
        health = health - amount;
        System.out.println(name = "takes " + amount + "damage!");
    }
    public void moveTo(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    public boolean isAlive()
    {
        return health > 0;
    }
}