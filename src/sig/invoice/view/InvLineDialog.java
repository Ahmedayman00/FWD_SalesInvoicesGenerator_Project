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
 * @author Ahmed Ayman
 */
public class InvLineDialog extends JDialog{
    private JTextField nameItem;
    private JTextField countItems;
    private JTextField priceItems;
    private JLabel itemName;
    private JLabel itemCount;
    private JLabel itemPrice;
    private JButton okButton;
    private JButton cancelButton;
    
    public InvLineDialog(Frame frame) {
        nameItem = new JTextField(20);
        itemName = new JLabel("Item Name");
        
        countItems = new JTextField(20);
        itemCount = new JLabel("Item Count");
        
        priceItems = new JTextField(20);
        itemPrice = new JLabel("Item Price");
        
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createLineOK");
        cancelButton.setActionCommand("createLineCancel");
        
        okButton.addActionListener(frame.getListener());
        cancelButton.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemName);
        add(nameItem);
        add(itemCount);
        add(countItems);
        add(itemPrice);
        add(priceItems);
        add(okButton);
        add(cancelButton);
        
        pack();
    }

    public JTextField getNameItem() {
        return nameItem;
    }

    public JTextField getCountItems() {
        return countItems;
    }

    public JTextField getPriceItems() {
        return priceItems;
    }
}
