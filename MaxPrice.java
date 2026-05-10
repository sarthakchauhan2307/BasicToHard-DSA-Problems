import java.util.ArrayList;
import java.util.Collections;

class MaxPrice {

    public static void main(String[] args) {

        int n = 4;
        int k = 2;

        ArrayList<String> list = new ArrayList<>();

        list.add("500:Electronics");
        list.add("400:Electronics");
        list.add("300:Electronics");
        list.add("200:Sports");
        list.add("150:Beauty");
        list.add("100:Beauty");

        // Sort descending
        Collections.sort(list);
        Collections.reverse(list);

        int ele = 0;
        int spo = 0;
        int beau = 0;

        int total = 0;
        int selected = 0;

        for (int i = 0; i < list.size(); i++) {

            if (selected == n) {
                break;
            }

            String item = list.get(i);

            String[] parts = item.split(":");

            int price = Integer.parseInt(parts[0]);
            String category = parts[1];

            // Electronics
            if (category.equals("Electronics") && ele < k) {

                total += price;
                ele++;
                selected++;
            }

            // Sports
            else if (category.equals("Sports") && spo < k) {

                total += price;
                spo++;
                selected++;
            }

            // Beauty
            else if (category.equals("Beauty") && beau < k) {

                total += price;
                beau++;
                selected++;
            }
        }

        System.out.println("Maximum Price = " + total);
    }
}