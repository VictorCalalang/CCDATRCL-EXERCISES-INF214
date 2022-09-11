public class Main {
    public static void main(String[] args){
        
        //Creating Stack Object
        Stack donut = new Stack(5);
        
        System.out.println("Customize your burger by stacking!\n");
        
        //Make your donut
        donut.push("dough");
        donut.push("glaze");
        donut.push("sprinkles");
        donut.push("nuts");
        
        //How many layers?
        System.out.print("\nYour donut has " +donut.size());
        System.out.println(" layers.");
        
        //What is the top layer of the donut?
        System.out.println("\nOn top of the donut is " +donut.peek());
        
        //Remove the top layer of the donut.
        burger.pop();
        
        //Review your donut.
        System.out.println("\nYour donut now is:");
        donut.printStack();

    }
}