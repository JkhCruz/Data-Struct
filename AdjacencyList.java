import java.util.*;
public class AdjacencyList{
    public static void main(String[] args) {
        ArrayList<ArrayList>AdList = new ArrayList<>();
        char[]vertice = {'A', 'B', 'C', 'E', 'F', 'G'};
        int num = 7;
        for(int i = 0; i <num; i++){
            AdList.add(new ArrayList<>());
        }
        AdList.get(0).add('B');
        AdList.get(1).add('A');
        AdList.get(1).add('C');
        AdList.get(2).add('B');
        AdList.get(2).add('D');
        AdList.get(3).add('C');
        AdList.get(3).add('E');
        AdList.get(3).add('F');
        AdList.get(3).add('G');
        AdList.get(4).add('C');
        AdList.get(4).add('D');
        AdList.get(4).add('E');
        AdList.get(4).add('F');
        AdList.get(5).add('D');
        AdList.get(5).add('E');
        AdList.get(6).add('D');
        
        int y = 0;
        for(int i = 0; i <num; i++, y++){
            System.out.println(vertice[y] + ": " + AdList.get(i));
        }
    }
}