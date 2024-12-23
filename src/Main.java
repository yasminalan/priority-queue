import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta("Murat", "Yanik"));
        acilservis.offer(new Hasta("Ali", "Bas agrisi"));
        acilservis.offer(new Hasta("Ayse", "Apandist"));
        acilservis.offer(new Hasta("Fatma", "Yanik"));
        acilservis.offer(new Hasta("Ahmet", "Bas agrisi"));
    }
}