import java.util.ArrayList;
import java.util.Collections;

public class start {
    public static void main(String[] args) {
        ArrayList<Integer> divisorOf52 = new ArrayList<Integer>();
        divisorOf52.add(1);
        divisorOf52.add(2);
        divisorOf52.add(4);
        divisorOf52.add(13);
        divisorOf52.add(26);

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorOf52);

        System.out.println("The element in random Number: " + randomNumbers);
        System.out.println("The number of element in the random Number: " + randomNumbers.size());

        for(int i=0; i < randomNumbers.size(); i++ ){
            for(int j = i + 1; j < randomNumbers.size(); j++){
                if(randomNumbers.get(i).equals(randomNumbers.get(j))){
                    randomNumbers.remove(j);

                }
            }
        }
        System.out.println("The element in random Number after removing duplicates " + randomNumbers);
        System.out.println("The number elements in the random Number after removing duplicates: " + randomNumbers.size());

        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println("Elements in randomNumbers after sorting in descending order: " + randomNumbers);
    }
}
