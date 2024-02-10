package com.string;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String s="java";
		System.out.println(s.hashCode());
		
		String s1="java";
		
		System.out.println(s.hashCode());
		
		String s3=new String("java");
		System.out.println(s3.hashCode()); //when we debag but here crate two object 1 object in heap and 2 scp 
		// if scp java is not presnt that time crate but present point to this java and id of s3 is diifert
		
		char ch[]= {'j','a','v','a'};
		System.out.println(ch.hashCode()); //hashcode is different here because of char
		
		String s4=new String(ch);   // converted char to string but hashcod is same of s,s1,s3 like 
		System.out.println(s4.hashCode());
		
		//when concat
		s1.concat("programs");
		System.out.println("without assihn variable or refrace "+s1); //here output is java. String is not changed but new String crated javaprograms
		 //but here s1 point to scp of java so output is java 
		// note : in concat two object crated 1st heap 2 is scp when refance is assigned lik below code s1=s1.concat 
		
		
		s1=s1.concat("programs");
		System.out.println("refance assigned that time s1 point to new string not old string here String is not change only point to value changed "+s1);


		String s6="javaprograms";
		System.out.println("Here s1 and s6 hashcode same but id is differnt bucause of s1 point to heap to point scp so s1 rfer heap id and S6 dirctly point out so id different of s1 and s6 but hashcod is same "+s6);
		System.out.println("dirct throut literal"+s6.hashCode());
		
		
	}

}
