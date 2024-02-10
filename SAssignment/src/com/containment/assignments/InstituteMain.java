package com.containment.assignments;


//2. WAP to use containment for following hierarchy. Fill all data and print all
//data: (id is a integer number, name is a String)
//Class Institute
//id
//name
//Branch
//id
//name
//Subject
//id
//name
//Topic
//id
//name
//SubTopic
//id
//name
//Question
//id
//name


import java.util.Scanner;



public class InstituteMain {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void enterDetalis(Institute i )
	{
		System.out.println("Enter Institute id:  ");
		i.setIid(sc.nextInt());
		
		System.out.println("Enter Institute Name : " );
		i.setIname(sc.next());
		
		// Here Branch object
		Branch b=new Branch();
		
		System.out.println("Enter Branch id:  ");
		b.setBid(sc.nextInt());
		
		System.out.println("Enter Branch Name : ");
		b.setBname(sc.next());
		
		i.setBranch(b); // i=Institute object  This Branch reference passing to Institute Constructor
		
		// Here Subject object
	     Subject s=new Subject();
	     
	     System.out.println("Enter Subject id:  ");
	     s.setId(sc.nextInt());
	     
	     System.out.println("Enter Subject Name:  ");
	     s.setName(sc.next());
	     
	     b.setSubject(s); // b=Branch object This Subject reference passing to Branch Constructor
	      
	     //Here Topic object
	     Topic t= new Topic();
	     
	     System.out.println("Enter Topic id:  ");
	     t.setTid(sc.nextInt());
	     
	     System.out.println("Enter Topic Name:  ");
	     t.setTname(sc.next());
	     
	     s.setTopic(t);// t=Topic Object This Topic reference passing to Subject of Constructor
	     
	     //here SubTopic object
	     SubTopic st=new SubTopic();
	     
	     System.out.println("Enter SubTopic id:  ");
	     st.setSid(sc.nextInt());
	     
	     System.out.println("Enter SubTopic Name:  ");
	     st.setSname(sc.next());
	     
	     t.setSubtopic(st);// t=Topic Object. ThiS SubTopic reference passing to Topic of Constructor
	     
	     //Here Question 
	     
	     Question q=new Question();
	     
	     
	     System.out.println("Enter Question id:  ");
	     q.setQid(sc.nextInt());
	     
	     System.out.println("Enter Question Name:  ");
	     q.setQname(sc.next());
	     
	     st.setQuestion(q); // q=Question Object. ThiS Question reference passing to SubTopic of Constructor
	     
	     
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Institute ins = new Institute();
		
		enterDetalis(ins); // Passing ins Object To Statics method enterDetalis

		
		System.out.println("Enter Institute id:  "+ins.getIid());

		System.out.println("Enter Institute Name : "+ins.getIname());
		

		System.out.println("Enter Branch id:  "+ins.getBranch().getBid());

		System.out.println("Enter Branch Name : "+ins.getBranch().getBname());
		
		

		System.out.println("Enter Subject id:  "+ins.getBranch().getSubject().getId());

		System.out.println("Enter Subject Name:  "+ins.getBranch().getSubject().getName());
		

		System.out.println("Enter Topic id:  "+ins.getBranch().getSubject().getTopic().getTid());

		System.out.println("Enter Topic Name:  "+ins.getBranch().getSubject().getTopic().getTname());
		

		System.out.println("Enter SubTopic id:  "+ins.getBranch().getSubject().getTopic().getSubtopic().getSid());

		System.out.println("Enter SubTopic Name:  "+ins.getBranch().getSubject().getTopic().getSubtopic().getSname());
		
		

		System.out.println("Enter Question id:  "+ins.getBranch().getSubject().getTopic().getSubtopic().getQuestion().getQid());

		System.out.println("Enter Question Name:  "+ins.getBranch().getSubject().getTopic().getSubtopic().getQuestion().getQname());
	
		
		
		

	}

}
