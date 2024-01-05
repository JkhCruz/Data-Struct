/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskperformance;

/**
 *
 * @author jkhcr
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskPerformance extends JFrame {

    private JTextField Field1;
    private JTextField Field2;
    private JTextArea area;
    
    public TaskPerformance() {
        setTitle("Task Performance");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
       
        JPanel inputPanel = new JPanel(new BorderLayout());

        Field1 = new JTextField();
        Field2 = new JTextField();
        JButton Button = new JButton("+");
        area = new JTextArea(5, 20);
        area.setEditable(false);
        Field1.setPreferredSize(new Dimension(150, 30));
        Field2.setPreferredSize(new Dimension(150, 30));
        Button.setPreferredSize(new Dimension(100, 20));
        
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumbers();
            }
        });

        inputPanel.add(Field1, BorderLayout.WEST);
        inputPanel.add(Button, BorderLayout.CENTER);
        inputPanel.add(Field2, BorderLayout.EAST);

        JPanel clearPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton clearButton = new JButton("Clear");

        clearButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        
        clearPanel.add(clearButton);

  
        add(inputPanel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        add(clearPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void addNumbers() {
        try {
               double num1 = Double.parseDouble(Field1.getText());
            double num2 = Double.parseDouble(Field2.getText());
            double result = num1 + num2;


            area.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            area.setText("Invalid input. Please enter valid numbers.");
        }
    }

    private void clearFields() {
     
        Field1.setText("");
        Field2.setText("");
        area.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskPerformance();
            }
        });
    }
}