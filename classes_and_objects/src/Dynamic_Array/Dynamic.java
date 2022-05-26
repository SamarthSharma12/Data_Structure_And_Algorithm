package Dynamic_Array;
public class Dynamic {
private int data[];
private int nextindex;
public Dynamic () {
	data = new int[5];
	nextindex = 0;
}
public int size() {
	return nextindex;
}
public void set(int index , int number) {
	if(index > nextindex) {
		return;
	}
	if(index < nextindex) {
		data[index] = number;
	}
	else {
		add(number);
	}
}
public void add (int element) {
	if(nextindex == data.length) {
		restructure();
	}
	data[nextindex] = element;
	nextindex++;
}
private void restructure() {
	int temp[] = data;
	data  = new int [data.length*2];
	for(int i =0 ; i < temp.length;i++) {
		data[i] = temp[i];
	}}
public int get(int index) {
	if(index >= nextindex) {
		return -1;
	}
	return data[index];
}
public boolean isEmpty() {
	if(size() == 0) return true;
	else {
		return false;
	}
}
public int removelast() {
if(size() ==0 ) return -1;
else { 
	int val = data[nextindex-1];
	data[nextindex-1] = 0;
	nextindex--;
	return val;
}
}
}