/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.invoice.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvHeaderDialog extends JDialog {
    private JTextField customerName;
    private JTextField invDate;
    private JLabel custNameLabel;
    private JLabel invDateLabel;
    private JButton okButton;
    private JButton cancelButton;

    public InvHeaderDialog(Frame frame) {
        custNameLabel = new JLabel("Customer Name:");
        customerName = new JTextField(20);
        invDateLabel = new JLabel("Invoice Date:");
        invDate = new JTextField(20);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createInvOK");
        cancelButton.setActionCommand("createInvCancel");
        
        okButton.addActionListener(frame.getListener());
        cancelButton.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 3));
        
        add(invDateLabel);
        add(invDate);
        add(custNameLabel);
        add(customerName);
        add(okButton);
        add(cancelButton);
        
        pack();
        
    }

    public JTextField getCustomerName() {
        return customerName;
    }

    public JTextField getInvDate() {
        return invDate;
    }
    
}
