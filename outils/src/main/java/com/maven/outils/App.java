package com.maven.outils;

import org.hibernate.Session;

import com.maven.outils.utilHib.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  Session session = HibernateUtil.getSessionFactory().openSession();
    	  
          session.beginTransaction();
   
          
       
    }
}
