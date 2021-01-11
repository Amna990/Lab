/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A
 */
public class NewBookTest {
    
    public NewBookTest() {
    }
    
   

    /**
     * Test of Random method, of class NewBook.
     */
    @Test
    public void testAdd() {
        System.out.println("");
        NewBook newbook = new NewBook();
        boolean flag = newbook.Add("179","Maths","2","john","3","6");
        assertTrue("Book Added",flag);
       
    }

    /**
     * Test of main method, of class NewBook.
     */
    
    
}
