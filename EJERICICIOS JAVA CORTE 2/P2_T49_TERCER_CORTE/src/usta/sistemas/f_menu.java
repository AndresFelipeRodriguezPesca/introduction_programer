package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//AUTHOR: Andres Felipe Rodriguez
//DATE:2020/06/19
//DESCRIPTION: This software shows the students' grade projects

public class f_menu extends JFrame {

    public f_menu() {

        JLabel label_menu = new JLabel("SAC version JAVA", SwingConstants.CENTER);
        label_menu.setBounds(200, 10, 200, 50);
        label_menu.setFont(new Font("Arial",0,20));
        add(label_menu);
        JLabel label_maker = new JLabel("Creado por: Felipe Rodriguez ", SwingConstants.LEFT);
        label_maker.setBounds(5, 300, 500, 20);
        label_maker.setFont(new Font("Arial",0,20));
        add(label_maker);
        JButton boton_iniciar = new JButton("INICIAR");
        boton_iniciar.setBounds(250, 150, 120, 40);
        boton_iniciar.setFont(new Font("Arial",0,20));
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                f_principal f_principal1 = new f_principal();
                setVisible(false);
            }
        });
        add(boton_iniciar);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
