package booklist;

import java.util.*;

public class Booklist {
	
	public static void main(String args[]) {
		DB so = new DB();
		so.getCon();
		
		so.sqlRun();
		System.out.println();
		
		so.cusSel();
		System.out.println();
		
		//System.out.println(so.bList());
		
		so.bList();
		System.out.println();
		
	}
}
