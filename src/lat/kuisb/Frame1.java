/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat.kuisb;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {
    public Frame1() {
        setTitle("Pilih Kategori Perlombaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pilih kategori perlombaan:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Animasi", "Menulis Surat"});
        JButton button = new JButton("Next");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) comboBox.getSelectedItem();
                Frame2 frame2 = new Frame2(selectedCategory);
                frame2.setVisible(true);
                dispose();
            }
        });

        panel.add(label);
        panel.add(comboBox);
        panel.add(button);

        add(panel);
    }
}

