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

public class Frame3 extends JFrame {
    public Frame3() {
        setTitle("Hasil Akhir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton showResultButton = new JButton("Tampilkan Hasil Akhir");
        JButton modifyButton = new JButton("Ubah Nilai");
        JButton exitButton = new JButton("Keluar");

        showResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Di sini Anda dapat menampilkan hasil akhir
                // Untuk sementara, hanya menampilkan pesan
                JOptionPane.showMessageDialog(null, "Menampilkan Hasil Akhir", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frame2 = new Frame2(""); // Menggunakan kelas Frame2 untuk mengubah nilai
                frame2.setVisible(true);
                dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(showResultButton);
        panel.add(modifyButton);
        panel.add(exitButton);

        add(panel);
    }
}

