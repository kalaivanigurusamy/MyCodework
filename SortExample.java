package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<String> text = new ArrayList<String>();
		text.add("HCL");
		text.add("CTS");
		text.add("Aspire");
		text.add("Wipro");
		Collections.sort(text);
		System.out.println(text.size());
		for (int i = text.size() - 1; i >= 0; i--) {
            System.out.print(text.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }

	}

}
