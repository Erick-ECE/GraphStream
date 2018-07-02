
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.*;
import org.graphstream.algorithm.generator.*;
import java.util.Random;



public class practica1 {
	
	public static void main(String[] args) {

    Graph graph = new SingleGraph("Random");
    
    Generator gen = new RandomGenerator(2);
    gen.addSink(graph);
    gen.begin();
    for(int i=0; i<100; i++)
        gen.nextEvents();
    gen.end();

    Random randomGenerator = new Random();
   
    for(Node n:graph) {
    	
    	int x = randomGenerator.nextInt(255);
    	int y = randomGenerator.nextInt(255);
    	int z = randomGenerator.nextInt(255);
    

    	if (n.getDegree()< 1) {
    		n.addAttribute("ui.style", "fill-color: rgb("+x+","+y+","+z+");");
    	}
    	else {
    		n.addAttribute("ui.style", "fill-color: rgb(255,0,0);");
    		}
    	
	}
	
    graph.display();

	}
}