import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

//HASH TABLE USED TO SEARCH FOR WINNER OF GAME. SCRAP HEAP


public class Hash {
	
	private int table_size;
	private int size;
	private HashEntry[] table; //make hashentry class

	public Hash(int points) {
		size = 0;
		table_size = points;
		table = new HashEntry[table_size]; 
		for (int i=0; i<table_size; i++) 
			table[i] = null;
	}
















}
