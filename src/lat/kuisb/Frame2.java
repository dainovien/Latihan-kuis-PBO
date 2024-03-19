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

public class Frame2 extends JFrame {
    private String category;

    public Frame2(String category) {
        this.category = category;
        setTitle("Isi Informasi Peserta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Nama:");
        JTextField nameField = new JTextField(20);
        JLabel schoolLabel = new JLabel("Asal Sekolah:");
        JTextField schoolField = new JTextField(20);
        JLabel scoreLabel = new JLabel("Nilai:");
        JTextField scoreField = new JTextField(5);
        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double score = Double.parseDouble(scoreField.getText());
                if (score < 0 || score > 100) {
                    JOptionPane.showMessageDialog(null, "Nilai harus dalam rentang 0 hingga 100", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Di sini Anda dapat memproses nilai sesuai kategori
                    // Untuk sementara, hanya menampilkan pesan
                    JOptionPane.showMessageDialog(null, "Informasi Peserta Telah Disimpan", "Info", JOptionPane.INFORMATION_MESSAGE);
                    Frame3 frame3 = new Frame3();
                    frame3.setVisible(true);
                    dispose();
                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(schoolLabel);
        panel.add(schoolField);
        panel.add(scoreLabel);
        panel.add(scoreField);
        panel.add(nextButton);

        add(panel);
    }
}

