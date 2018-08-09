package com.jspring.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.jspring.annuaire.Person;
import com.jspring.core.report.Print;
import com.jspring.core.report.Report;
 
public class AnnotationTest {

	
	public static void main(String[]args){
		
		Person person=createPerson();
		
		Class<Person>  personClass= Person.class;
		 
		
		
		if(personClass.isAnnotationPresent(Report.class)){
			
			Annotation annotation = personClass.getAnnotation(Report.class);
			Report reportAnnotation = (Report) annotation;
			
			System.out.println("----------------------------------Fiche personne--------------------------- ");

			for(Field field:personClass.getDeclaredFields()){
				if(field.isAnnotationPresent(Print.class)){
					
					Annotation pAnnotation=field.getAnnotation(Print.class);
					Print printAnnotation=(Print)pAnnotation;
					if(printAnnotation.print()==true){
				    	     field.setAccessible(true);
				    	     
				    		 try {
				    			 System.out.println(field.getName()+": "+field.get(person));
							} catch (IllegalArgumentException
									| IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						 
					}
				}
				
			}
			
			System.out.println("------------------------------------------------------------------");

		}
		
	}
	
	
	private static  Person createPerson(){
		
		return new Person("Adam","Dupont","adam@comagny.com");
	}
	
	
	
	 
	
}
