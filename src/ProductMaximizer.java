import java.util.*;

//author Mohamad Juma
public class ProductMaximizer {


    public static Map<ArrayList<Integer>, Integer> giveTheTwoNumsAndProduct(ArrayList<Integer> arrayList){
        Map<ArrayList<Integer> ,Integer> neuMap = new HashMap<ArrayList<Integer>, Integer>();

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(arrayList.get(0));
        result.add(arrayList.get(1));
        neuMap.put(result,result.get(0) * result.get(1));

        return  neuMap;

    }

    public static Map<ArrayList<Integer>, Integer> giveTheTwoNumsFromTwoArraysAndProduct(ArrayList<Integer> firstList,ArrayList<Integer> secondList ){

        Map<ArrayList<Integer> ,Integer> neuMap = new HashMap<ArrayList<Integer>, Integer>();

        Collections.sort(firstList);
        Collections.reverse(firstList);

        Collections.sort(secondList);
        Collections.reverse(secondList);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(firstList.get(0));
        result.add(secondList.get(0));

        neuMap.put(result,result.get(0) * result.get(1));

        return neuMap;

    }

    public static void main(String[] args) {
        ArrayList<Integer> fistList = new ArrayList<>(Arrays.asList(10,2,13,8,9,16,4));

        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(3,14,8 ,20, 15, 33));

        System.out.println(giveTheTwoNumsAndProduct(fistList));
        System.out.println(giveTheTwoNumsFromTwoArraysAndProduct(fistList,secondList));
    }
}
