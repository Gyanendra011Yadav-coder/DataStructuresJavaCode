package GraphDataStructure;

public class graphMainClass {
    public static void main(String[] args) {
        BreathFirstSearch bg = new BreathFirstSearch(8);
        bg.addNode(50);
        bg.addNode(10);
        bg.addNode(200);
        bg.addNode(20);
        bg.addNode(15);
        bg.addNode(30);
        bg.addNode(5);
        bg.addNode(300);
        bg.addEdge(0,1);
        bg.addEdge(0,2);
        bg.addEdge(1,4);
        bg.addEdge(1,5);
        bg.addEdge(2,3);
        bg.addEdge(4,5);
        bg.addEdge(4,6);
        bg.addEdge(5,7);
        bg.breathForstSearch();







    }
}
