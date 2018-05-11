import java.util.*; 

class HashEntry {
	String key; 
	int value;
	HashEntry next;


	HashEntry () {//default constructor 

	key = ""; 
	value = 0; 
	next = null; 


	}

	HashEntry(String key, int value) {// constructor 
		this.key = key;
		this.value = value; 
		this.next = null;
	}
}

