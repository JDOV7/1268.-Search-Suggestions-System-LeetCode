package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchSuggestionsSystem1268 {

    public void SearchSuggestionsSystem1268() {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> aList = new ArrayList();
        Arrays.sort(products);
        StringBuffer sAdd = new StringBuffer();
        for (int i = 0; i < searchWord.length(); i++) {
            ArrayList<String> aWords = new ArrayList<String>();
            sAdd.append(searchWord.charAt(i));
            for (int j = 0; j < products.length; j++) {
                if (sAdd.charAt(0) < products[j].charAt(0)) {
                    break;
                }
                if (products[j].startsWith(sAdd.toString()) == true) {
                    aWords.add(products[j]);
                }
            }
            aList.add(sortAndRemove(aWords));
        }
        for (Object product : aList) {
            System.out.println(product);
        }
    }

    public ArrayList<String> sortAndRemove(ArrayList<String> aLits) {
        ArrayList<String> aTemp = new ArrayList<String>();
        Collections.sort(aLits);
        if (aLits.size() > 3) {
            aTemp.add(aLits.get(0));
            aTemp.add(aLits.get(1));
            aTemp.add(aLits.get(2));
            return aTemp;
        }
        return aLits;
    }
}
//["mobile","mouse","moneypot","monitor","mousepad"]
//"mouse"
//["havana"]
//"havana"
//["bags","baggage","banner","box","cloths"]
//"bags"
//["havana"]
//"tatiana"
//["aguacate","agua","aaguada","empanda","aguinaldo"]
//"agua"
//[]
//["mnbvcl","nvbvxl","rtrrtvvlb","dsdvfldfg","sdldf","lusfsfsf","fsvsdlu","sdfflu,"refslu","sfluna","sfflun","sdfvsdlun","sdfdvslun","lunsgerd","sdgdfdluna","sdgdfgsfsluna,"gggtgeluna","luna"]
//luna
