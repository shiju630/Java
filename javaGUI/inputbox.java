import javax.swing.*;
//import java.awt.event.ActionListener;

class inputbox extends JFrame /*implements ActionListener*/{

    public static void main(String[] args) {
        
        String numStr1 = JOptionPane.showInputDialog("enter number1");
        Integer numInt1 = Integer.parseInt(numStr1);
        JOptionPane.showMessageDialog(null, "You Entered " + numInt1);

         // creates instance of JFrame, JTextField, JButton 
         JFrame frame1 = new JFrame(); 
         JTextField txt1 = new JTextField("Enter text here"); 
         JButton button2 = new JButton("button2"); 

         // x axis, y axis, width, height 
         txt1.setBounds(180, 50, 200, 50); 
         button2.setBounds(180, 140, 100, 50); 
   
         frame1.add(txt1); 
         frame1.add(button2); 
   
         frame1.setSize(500, 300) ; //400 width and 500 height of frame1 
           
         frame1.setLayout(null); //uses no layout managers 
         frame1.setVisible(true); //makes the frame visible 

         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         button2.addActionListener(this); 

         public void actionPerformed(ActionEvent e) 
         { 
            if(e.getSource() == button2){

            } 
         }
         */
    }

}