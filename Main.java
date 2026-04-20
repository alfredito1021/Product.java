public class Main
{
    public static void main(String[] args)
    {  
         Enemy goblin = new Enemy();
        goblin.name = "Goblin";
        goblin.health = 30;
        goblin.damage = 5;
        goblin.x = 100;
        goblin.y = 200;
        goblin.moveTo(150,600);
        goblin.takeDamage(5);
        goblin.takeDamage(10);
        goblin.takeDamage(15);


        System.out.println(goblin.name + " appears !");
        System.out.println("HP: " + goblin.health);
        System.out.println("Position: (" + goblin.x + ", " + goblin.y + ")");
        System.out.println("Alive ?" + isAlive());

    }
}