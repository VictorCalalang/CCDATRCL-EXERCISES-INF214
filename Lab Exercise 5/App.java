public class BinaryTree
{
	public static void main(String[] args) throws Exception {
		
		Node TopLane = new Node("Top Lane: (Kled)");
		Node Jungler = new Node("Jungler: (Sejuani)"); 
		Node MidLane = new Node("Mid Lane: (Sylas)"); 
		Node ADC = new Node("ADC: (Caitlyn)"); 
		Node Support = new Node("Support: (Thresh)");
    

        TopLane.top = Kled;
        Support.bottom = Thresh;
        Support.bottom = Caitlyn;
        MidLane.middle = Sylas;
        Jungler.left = Sejuan;

        System.out.println("\nPre-order Traversal ");
        traversePreOrder(TopLane);
        
        System.out.print("\n");
        System.out.println("\nIn-order Traversal ");
        traverseInOrder(TopLane);
        
        System.out.print("\n");
        System.out.println("\nPost-order Traversal ");
        traversePostOrder(TopLane);
	}
	
    
    static void traversePreOrder(Node element) {
        if (element != null) {
            System.out.print(element.LeagueOfLegendstOrg+ " ");
            traversePreOrder(element.TopLane);
            traversePreOrder(element.Support);
        }
    }
    
    static void traverseInOrder(Node element) {
        if (element != null) {
            traverseInOrder(element.TopLane);
            System.out.print(element.LeagueOfLegendstOrg+ " ");
            traverseInOrder(element.Support);
        }
    }
    
    static void traversePostOrder(Node element) {
        if (element != null) {
            traversePostOrder(element.TopLane);
            traversePostOrder(element.Support);
            System.out.print(element.LeagueOfLegendsOrg+ " ");
        }
    }
    
}