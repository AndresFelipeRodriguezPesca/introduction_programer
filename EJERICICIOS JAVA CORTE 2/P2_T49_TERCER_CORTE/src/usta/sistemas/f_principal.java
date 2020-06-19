package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//AUTHOR: Andres Felipe Rodriguez
//DATE:2020/06/19
//DESCRIPTION: This software shows the students' grade projects

public class f_principal extends JFrame {


    public f_principal () {
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());

        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);

        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));

        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setFont(new Font("Arial", 0, 20));
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_student form_estudent1 = new form_student();

            }
        });
        panel_izquierdo.add(boton_formulario1);

        JButton boton_formulario3 = new JButton("Proyectos de grado");
        boton_formulario3.setFont(new Font("Arial", 0, 20));
        boton_formulario3.setBounds(0, 0, 100, 30);
        boton_formulario3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_grado form_grado = new form_grado();

            }

        });

        panel_izquierdo.add(boton_formulario3);
        panel_izquierdo.add(boton_formulario1);
        JButton boton_formulario4 = new JButton("Lista de proyectos de grado ");
        boton_formulario4.setFont(new Font("Arial", 0, 20));
        boton_formulario4.setBounds(0, 0, 100, 30);
        boton_formulario4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                f_abrir_form_proyecto(e);

            }

        });

        panel_izquierdo.add(boton_formulario4);
        JButton boton_formulario2 = new JButton("Lista de estudiantes ");
        boton_formulario2.setFont(new Font("Arial", 0, 20));
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);

            }

        });

        panel_izquierdo.add(boton_formulario2);
        JButton boton_acercade = new JButton("Acerca de");
        boton_acercade.setFont(new Font("Arial", 0, 20));
        boton_acercade.setBounds(0, 0, 100, 50);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                form_acercade form_acercade1 = new form_acercade();

            }
        });

        panel_izquierdo.add(boton_acercade);
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por:Felipe Rodriguez"));
        panel_inferior.setFont(new Font("Arial", 0, 20));
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 642, 900);
        setLocationRelativeTo(null);
    }

    private void f_abrir_form_show_all_student (java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);
    }
        private void f_abrir_form_proyecto(java.awt.event.ActionEvent evt){
            form_proyect form_proyect1v= new form_proyect (this);
        }

}
