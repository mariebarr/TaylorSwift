import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

//HASH TABLE USED TO SEARCH FOR WINNER OF GAME. SCRAP HEAP


public class Hash {
	
	private int table_size;
	private int size;
	private HashEntry[] table; //make hashentry class
	public Player[] table1;
	
	public Hash(){
		size = 0;
		table_size = 0;
	}

	public Hash(int points) {
		size = 0;
		table_size = points;
		table = new HashEntry[table_size]; 
		for (int i=0; i<table_size; i++) 
			table[i] = null;
	}

	public int get_size() {
		return size;
	}
	
	private int myhash(String x) {//gives hash value for string
		int hashVal = x.hashCode();
		hashVal %= table_size;
		if(hashVal < 0) 
			hashVal += table_size;
		return hashVal; 
	}


	public int get_value(String key) { // gets value of a key
		int hash = (myhash(key) % table_size);
		if (table[hash] == null) 
			return -1;

		else {
			HashEntry entry = table[hash]; 
			while(entry != null && !entry.key.equals(key)) 
				entry = entry.next;
			if(entry == null) 
				return -1;
			else return entry.value;
		}
	}
	
			
	public void insert(String key, int value) {
		int hash = (myhash(key) % table_size);
		if(table[hash] == null) 
			table[hash] = new HashEntry(key, value);
		else {
			HashEntry entry = table[hash]; 
			while (entry.next != null && !entry.key.equals(key)) 
				entry = entry.next;
			if (entry.key.equals(key)) 
				entry.value = value;
			else 
				entry.next = new HashEntry(key, value);
		}
		size++;
	}

public Player first_place() {
	Player winner = new Player(); 
	for (Player name: table1 ) {
		if (name.score > winner.score) winner = name; 

	}
	return winner; 
}


}
