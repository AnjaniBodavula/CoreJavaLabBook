package com.cg.eis.ui;

import com.cg.eis.ex2.Book;
import com.cg.eis.ex2.CD;
import com.cg.eis.ex2.JournalPaper;
import com.cg.eis.ex2.Video;

public class Library {

	public static void main(String[] args) {
		Book book1=new Book("B100","Python",18,"Oracle");
		System.out.println(book1);
		JournalPaper jp1=new JournalPaper("J101","OOPS",6,"Oracle",1990);
		System.out.println("======================================================================");
		System.out.println(jp1);
		Video video1=new Video("V101","Python Programming Class",14,9,"Oracle","Teaching",1990);
		System.out.println("======================================================================");
		System.out.println(video1);
		CD cd1=new CD("C102","Python Tutorials",7,20,"Oracle","Teaching");
		System.out.println("======================================================================");
		System.out.println(cd1);
	}

}