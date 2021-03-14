
package form;


public class Form {

    
    public static void main(String[] args) throws InterruptedException {
         Splash s =new Splash();
         s.main(args);
         
     
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
  
    }
    
}
