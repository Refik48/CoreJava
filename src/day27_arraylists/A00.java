package day27_arraylists;

import java.util.ArrayList;
import java.util.List;

public class A00 {

	public static void main(String[] args) {
		// SORU : verilen bir Array'deki
        // tekrarlı elemanları silip
        // tekrarsız bir Array olust istiyoruz
        // Array veya List kullanarak yapınız
        
        
    int arr[]= {1,2,3,5,1,2,4,3,5,1,6,7,1,2,6,4,2};
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            if (!list.contains(arr[i])) {
                
                list.add(arr[i]);

	}
        }
}
}
