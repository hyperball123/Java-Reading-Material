package util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class UtilDemo9 {
	public static void main(String[] args) {
		Random r=new Random();
		
		HashMap<Integer, QuestionBank> hm=new HashMap<>();
		hm.put(0, new QuestionBank(16,"aaaaaaaaa"));
		hm.put(1, new QuestionBank(1,"aaaaaaaaa"));
		hm.put(2, new QuestionBank(2,"aaaaaaaaa"));
		hm.put(3, new QuestionBank(3,"aaaaaaaaa"));
		hm.put(4, new QuestionBank(4,"aaaaaaaaa"));
		hm.put(5, new QuestionBank(5,"aaaaaaaaa"));
		hm.put(6, new QuestionBank(6,"aaaaaaaaa"));
		hm.put(7, new QuestionBank(8,"aaaaaaaaa"));
		hm.put(8, new QuestionBank(9,"aaaaaaaaa"));
		hm.put(9, new QuestionBank(10,"aaaaaaaaa"));
		hm.put(10, new QuestionBank(11,"aaaaaaaaa"));
		hm.put(11, new QuestionBank(12,"aaaaaaaaa"));
		hm.put(12, new QuestionBank(13,"aaaaaaaaa"));
		hm.put(13, new QuestionBank(14,"aaaaaaaaa"));
		hm.put(14, new QuestionBank(15,"aaaaaaaaa"));
		
		HashSet hs=new HashSet();
		while(hs.size()<=4) {
			int next=r.nextInt(14);
			hs.add(next);
		}
		Iterator<Integer> iter=hs.iterator();
		while(iter.hasNext()) {
			int next=iter.next();
			System.out.println(hm.get(next));
		}
	}
}

class QuestionBank{
	private int qno;
	private String question;
	public QuestionBank(int qno, String question) {
		this.qno = qno;
		this.question = question;
	}
	
	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuestionBank [qno=" + qno + ", question=" + question + "]";
	}
	
}