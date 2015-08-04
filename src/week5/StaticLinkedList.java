package week5;

public class StaticLinkedList {

	public static LinkedList<Integer> reverse(LinkedList<Integer> l){
		int left = 0;
		int right = l.size()-1;
		
		Node <Integer> temp = new Node<>();
		while (left < right){
			temp.data = l.getElement(left).data;
			l.getElement(left).data = l.getElement(right).data;
			l.getElement(right).data = temp.data;

			left++;
			right--;
		}
		return l;
	}

	
	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		for (int i = 0; i< l.size(); i++){
			for (int j = i; j< l.size(); j++){
				if (l.getData(i) < l.getData(j)){
					Integer temp = l.getData(i);
					l.set(i, l.getData(j));
					l.set(j, temp);
				}
			}	
		}
        
        return l;
    }
	
	
	public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b){
		for (int i = 0; i < b.size(); i++) {
			a.addLast(b.getData(i));
		}
		
		return StaticLinkedList.sort(a);
	}
		
	}

