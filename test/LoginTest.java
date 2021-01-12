/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A
 */
public class LoginTest {
     
    
   
   

    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLogin() {
       Login Login=new Login();
       boolean flag=Login.Login("","");
        assertTrue("logged in with right details", flag);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testLoggin() {
       Login Loggin=new Login();
       boolean flag=Loggin.Login("","");
        assertFalse("logged in with wrong details", flag);
       
        // TODO review the generated test code and remove the default call to fail.
        
    }
   

     
    /**
     * Test of main method, of class Login.
     */
   
    
}
