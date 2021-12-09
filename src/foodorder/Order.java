package foodorder;

import javax.swing.*;
import java.awt.event.*;

public class Order extends JFrame implements ActionListener {
    JLabel l, pizzaLabel, burgerLabel, tacosLabel, grandTotalName, grandTotal;
    JLabel pizzaPrice, burgerPrice, tacosPrice;
    JLabel pizzaTotal, burgerTotal, tacosTotal;
    JComboBox burgerSelection, tacosSelection, pizzaSelection;
    JComboBox burgerQuantity, tacoQuantity, pizzaQuantity;

    JButton orderBtn;

    String burgerTypes[] = {"", "Spicy Burger", "All American Burger", "Cheesy Burger", "BBQ Burger"};
    String tacoTypes[] = {"", "Mexican", "Colombian", "Chillean", "Brazilian"};
    String pizzaTypes[] = {"", "American", "Italian", "Pepperoni", "Alfredo", "Spicy Ranch", "BBQ Buzz"};
    String quantityUnits[] = {"0","1","2","3","4","5","6","7","8","9","10",};

    Order() {
        l = new JLabel("Please make order");
        l.setBounds(50, 50, 300, 20);

        //Name
        burgerLabel = new JLabel("Burgers");
        burgerLabel.setBounds(50, 100, 150, 30);

        tacosLabel = new JLabel("Tacos");
        tacosLabel.setBounds(50, 200, 150, 30);

        pizzaLabel = new JLabel("Pizza");
        pizzaLabel.setBounds(50, 300, 150, 30);

        //PRICE
        burgerPrice = new JLabel("0");
        burgerPrice.setBounds(300, 100, 50, 30);

        tacosPrice = new JLabel("0");
        tacosPrice.setBounds(300, 200, 50, 30);

        pizzaPrice = new JLabel("0");
        pizzaPrice.setBounds(300, 300, 50, 30);

        //Quantity
        burgerQuantity = new JComboBox(quantityUnits);
        burgerQuantity.setBounds(350, 100, 50, 30);

        tacoQuantity = new JComboBox(quantityUnits);
        tacoQuantity.setBounds(350, 200, 50, 30);

        pizzaQuantity = new JComboBox(quantityUnits);
        pizzaQuantity.setBounds(350, 300, 50, 30);

        //Total
        burgerTotal = new JLabel("0");
        burgerTotal.setBounds(450, 100, 50, 30);

        tacosTotal = new JLabel("0");
        tacosTotal.setBounds(450, 200, 50, 30);

        pizzaTotal = new JLabel("0");
        pizzaTotal.setBounds(450, 300, 50, 30);

        grandTotal = new JLabel("0");
        grandTotal.setBounds(450, 360, 50, 30);

        grandTotalName = new JLabel("GrandTotal");
        grandTotalName.setBounds(50, 360, 80, 30);

        orderBtn = new JButton("Order");
        orderBtn.setBounds(260, 480, 80, 30);

        burgerSelection = new JComboBox(burgerTypes);
        burgerSelection.setBounds(100, 100, 150, 30);

        tacosSelection = new JComboBox(tacoTypes);
        tacosSelection.setBounds(100, 200, 150, 30);

        pizzaSelection = new JComboBox(pizzaTypes);
        pizzaSelection.setBounds(100, 300, 150, 30);

        add(l);
        add(grandTotalName);
        add(grandTotal);
        add(burgerLabel);
        add(tacosLabel);
        add(pizzaLabel);

        add(pizzaQuantity);
        add(tacoQuantity);
        add(burgerQuantity);

        add(burgerPrice);
        add(tacosPrice);
        add(pizzaPrice);

        add(burgerTotal);
        add(tacosTotal);
        add(pizzaTotal);

        add(orderBtn);
        add(tacosSelection);
        add(burgerSelection);
        add(pizzaSelection);

        setSize(600, 600);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        orderBtn.addActionListener(this);
        burgerSelection.addActionListener(this);
        tacosSelection.addActionListener(this);
        pizzaSelection.addActionListener(this);
        burgerQuantity.addActionListener(this);
        tacoQuantity.addActionListener(this);
        pizzaQuantity.addActionListener(this);
    }

    // 1. Registration/login screen:   login/password, register new user, login,
    // 2. need to register by name, phone number, address
    // 3. Order screen: add more food, dropdown list pizza, price label drinks, button: cancel, submit order
    // 4. Payment screen, card number button pay.

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source instanceof JButton) {
            // Button specific code

        } else if (source instanceof JComboBox) {
            // Combobox specific code
            JComboBox comboBox = (JComboBox) e.getSource();
            String item = (String) comboBox.getSelectedItem();

// "American", "Italian", "Pepperoni", "Alfredo", "Spicy Ranch", "BBQ Buzz"};
            if (item == "American") {
                pizzaPrice.setText("15");
//                int result = 15 * (Integer) pizzaQuantity.getSelectedItem();
            }
            else if (item == "Italian") {
                pizzaPrice.setText("12");
            }
            else if (item == "Pepperoni") {
                pizzaPrice.setText("13");
            }
//"Spicy Burger", "All American Burger", "Cheesy Burger", "BBQ Burger"};
            else if (item == "Spicy Burger") {
                burgerPrice.setText("15");
            }
            else if (item == "All American Burger") {
                burgerPrice.setText("15");
            }
            else if (item == "Cheesy Burger") {
                burgerPrice.setText("15");
            }
            else if (item == "BBQ Burger") {
                burgerPrice.setText("45");
            }
            else if (item == "Mexican") {
                tacosPrice.setText("15");
            }

            else if (item == "1" || item == "2" || item == "3" || item == "4" || item == "5"
            || item == "6" || item == "7" || item == "8" || item == "9" || item == "10") {

                Integer bPrice = Integer.parseInt(burgerPrice.getText());
                Integer bQuantity = Integer.parseInt(String.valueOf(burgerQuantity.getSelectedItem()));
                Integer bTotal = bPrice * bQuantity;

                burgerTotal.setText(bTotal.toString());

                Integer tPrice = Integer.parseInt(tacosPrice.getText());
                Integer tQuantity = Integer.parseInt(String.valueOf(tacoQuantity.getSelectedItem()));
                Integer tTotal = tPrice * tQuantity;

                tacosTotal.setText(tTotal.toString());

                Integer pPrice = Integer.parseInt(pizzaPrice.getText());
                Integer pQuantity = Integer.parseInt(String.valueOf(pizzaQuantity.getSelectedItem()));
                Integer pTotal = pPrice * pQuantity;

                pizzaTotal.setText(pTotal.toString());

                Integer total = bTotal + tTotal + pTotal;
                grandTotal.setText(total.toString());
            }
        }
    }

    public static void main(String[] args) {
//		new Registration();
        new Order();
    }
}
