

import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
    }
	
	public void add(Keyword keyword){
		lst.add(keyword);
		System.out.println("Done");
    }
	
	//quick sort
	public void sort(){
		quickSort(0, lst.size()-1);
	}
	
	
	private void quickSort(int leftbound, int rightbound){
		//implement quickSort algorithm
		int pivot=leftbound;
		int r=rightbound;
		if(leftbound<rightbound) {
			for(int i=leftbound+1;i<=rightbound;i++) {
				if(lst.get(i).count<lst.get(pivot).count) {
					swap(pivot,i);
					pivot=i;
				}
				else {
					swap(i, rightbound);
					i--;
					rightbound--;
				}
			}
			quickSort(0, pivot-1);
			quickSort(pivot+1, r);
		}
	}
	
	
	private void swap(int aIndex, int bIndex){
		Keyword temp = lst.get(aIndex);
		lst.set(aIndex, lst.get(bIndex));
		lst.set(bIndex, temp);
	}
	
	public void output(){
		//TODO: write output and remove all element logic here...
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<lst.size();i++){
			Keyword k = lst.get(i);
			if(i>0)sb.append(" ");
			sb.append(k.toString());
		}
		
		System.out.println(sb.toString());	
	}
}
