package algorithms.Conversions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * A program that will convert a number from one base to another base.
 * a != A checkbox is if you want to lower case values to be different than upper case values. That will give you a total base of 62.
 * 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
 * If unchecked then the lower case and upper case letters will be treated as the same value. Which will give you a total of 36 bases.
 * 
 * @author Michael
 */
public class AnyBasetoAnyBaseGUI {
    
    public static void main(String[] args) {
        //Create the frame and set window settings
        JFrame frame;
        JPanel pan;
        frame = new JFrame("Base Convertor");
        pan = createGUI();
        frame.getContentPane().setLayout(new GridLayout(1,1));
        frame.getContentPane().add(pan);
        frame.setSize(400,400);    
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static JPanel createGUI(){
        //Creates all of the labels and textfields
        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("Starting Base");
        JLabel l2 = new JLabel("Ending Base");
        JLabel l3 = new JLabel("Value");
        JLabel l4 = new JLabel("Converted Value");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        t1.setBounds(50,50,100,20);
        l1.setBounds(50,25,100,20);
        t2.setBounds(225,50,100,20);
        l2.setBounds(225,25,100,20);
        t3.setBounds(125, 100, 100, 20);
        l3.setBounds(125, 75, 100, 20);
        t4.setBounds(125,175,100,20);
        l4.setBounds(125, 150, 100, 20);
        t4.setEditable(false);
        
        //Checkbox to see if lower case should be treated the same as upper case
        JCheckBox aA = new JCheckBox("a != A");
        aA.setBounds(125,125,100,20);
        
        //Create the button
        JButton b=new JButton("Convert");  
        b.setBounds(100,200,150,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //checks if the text is valid (ie not empty) then send it to be converted
                if(isValid(t1.getText(), t2.getText(), t3.getText(), aA.isSelected())){
                    convert(t1.getText(), t2.getText(), t3.getText(), t4, aA.isSelected());
                } 
            }
            });
        
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(t1);
        panel.add(t2);
        panel.add(t3);
        panel.add(t4);
        panel.add(aA);
        panel.add(b);
        
        panel.setLayout(null);
        return panel;
        
    }
    
    public static boolean isValid(String t1, String t2, String t3, boolean selected){
        boolean isValid = true;
        
        //Checks if any box is empty
        if("".equals(t1) || "".equals(t2) || "".equals(t3)){
            JOptionPane.showMessageDialog(null, "At least one box is empty.");
            isValid = false;
        }
        
        if(!selected){
            if(Integer.parseInt(t2) > 36){
                JOptionPane.showMessageDialog(null, "The max base is 36 when 'a' == 'A'.");
                isValid = false;
            }
        }
        
        if(selected){
            if(Integer.parseInt(t2) > 62){
                JOptionPane.showMessageDialog(null, "The max base is 62.");
                isValid = false;
            }
        }
        
        if(Integer.parseInt(t2) < 2 || Integer.parseInt(t1) < 2){
            JOptionPane.showMessageDialog(null, "The min base is 2.");
            isValid = false;
        }else{
        //Checks all of the charaters to make sure the are within the limits of the base given
        for(int i = 0; i < t3.length(); i++){
            char temp = t3.charAt(i);
            int asc = temp;
            int base = Integer.parseInt(t1);
            if(asc >= 48 && asc <= 57){
                //0 to 9
                if(asc >= 48 + base){
                    JOptionPane.showMessageDialog(null, "The value of " + temp + " is invalid.");
                    isValid = false;
                }     
            }else if(asc >= 65 && asc <= 90){
                //A to Z
                if(asc >= 65 + base - 10){
                    JOptionPane.showMessageDialog(null, "The value of " + temp + " is invalid.");
                    isValid = false;
                }
            }else if(asc >= 97 && asc <= 122){
                //a to z
                if(asc >= 97 + base - 10){
                    JOptionPane.showMessageDialog(null, "The value of " + temp + " is invalid.");
                    isValid = false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Char!");
                isValid = false;
            }
        }
        }
        
        return isValid;
    }
    
    public static void convert(String t1, String t2, String val, JTextField t4, boolean selected){
        //changes the bases to ints
        int x = Integer.parseInt(t1);
        int y = Integer.parseInt(t2);
        
        int dec = 0;
        StringBuilder str = new StringBuilder();
        String conver;
        
        //if the initial base isn't decimal then covert the value to decimal
        if(x != 10){
            //loop through each char, find the ascii value then convert to decimal
            for(int i = 0; i < val.length(); i++){
                char temp = val.charAt(val.length() - i - 1);
                int asc = temp;
                if(asc >= 48 && asc <= 57)
                    dec =dec + ((asc - 48) * (int) Math.pow(x,i));
                else if(asc >= 65 && asc <= 90)
                    dec = dec + ((asc - 65 + 10) * (int) Math.pow(x, i));
                else if(asc >= 97 && asc <= 122){
                    if(selected)
                        dec = dec + ((asc - 97 + 36) * (int) Math.pow(x, i));
                    else
                        dec = dec + ((asc - 97 + 10) * (int) Math.pow(x, i));
                }
                else
                    System.out.println("Invalid char"); //Should never reach here
            }
        }else{
            dec = Integer.parseInt(val);
        }
        int orgdec = dec;
        
        //if the final base isn't decimal convert to the base
        if(y != 10){    
            //convert decimal to the value of the final base 
            while(dec > 0 ){
                int mod = dec % y;
                dec = dec / y;
                if(mod >=0 && mod <= 9)
                    str.insert(0, (char)(mod+48));
                else if (mod >= 10 && mod <= 35){
                    //str.insert(0, (char)(mod+65-10)); //upper case letters
                    str.insert(0, (char)(mod+97-10)); //lower case letters
                } else if (mod>=36 && mod <=62)
                    str.insert(0, (char)(mod+65-36)); //upper case letters
                else
                    System.out.println("Max Final Base is 36");
            }
            conver = str.toString();
        }else{
            conver = Integer.toString(orgdec);
        }
        
        t4.setText(conver);
    }
}
