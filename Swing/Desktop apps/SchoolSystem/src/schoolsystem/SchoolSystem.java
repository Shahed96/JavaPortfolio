
package schoolsystem;

/**
 *
 * @author Shahed A.
 */
public class SchoolSystem {

    
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    
}
