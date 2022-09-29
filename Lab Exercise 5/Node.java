public class Node {

    String LeagueOfLegendstOrg;
    Node TopLane;
    Node Support;
    
    public Node(String LeagueOfLegendsOrg) 
    {
        this.LeagueOfLegendsOrg = LeagueOfLegendsOrg;
        TopLane = null;
        Support = null;
        
    }