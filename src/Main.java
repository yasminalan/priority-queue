import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta("Murat", IllnessCompliance.YANIK));
        acilservis.offer(new Hasta("Ali", IllnessCompliance.BAS_AGRISI));
        acilservis.offer(new Hasta("Ayse", IllnessCompliance.APANDIST));
        acilservis.offer(new Hasta("Fatma", IllnessCompliance.YANIK));
        acilservis.offer(new Hasta("Ahmet", IllnessCompliance.BAS_AGRISI));

        int i = 1;

        while(!acilservis.isEmpty()) {
            System.out.println("*********************");
            System.out.println(i + ". sirada: ");
            System.out.println(acilservis.poll());
            System.out.println("*********************");
            i++;
        }
    }
}