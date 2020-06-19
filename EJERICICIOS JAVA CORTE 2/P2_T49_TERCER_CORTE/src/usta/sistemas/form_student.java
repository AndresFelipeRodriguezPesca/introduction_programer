package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//AUTHOR: Andres Felipe Rodriguez
//DATE:2020/06/19
//DESCRIPTION: This software shows the students' grade projects

public class form_student extends JFrame {
    JTextField text_name, text_lastname, text_faculty;

    public  form_student () {
        setLayout(new BorderLayout());

        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Nuevo estudiante ", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);

        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Nombre: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("Apellido: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("Facultad: "));
        panel_central.add(text_faculty = new JTextField(""));


        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setFont(new Font("Arial", 0, 20));
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                f_crear_nuevo_estudiante(e);
            }
        });
        panel_inferior.add(boton_crear);
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void f_crear_nuevo_estudiante (java.awt.event.ActionEvent evt) {

        final JDialog ventana_emergente = new JDialog(this, "Save data", true);
        if (text_name.getText().length() < 4 ||
                text_lastname.getText().length() < 4 ||
                text_faculty.getText().length() < 4) {
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo 4 caracteres"));
        } else {

            file_Data_student file_data_student1 = new file_Data_student();
            boolean rpta = file_data_student1.f_add_student(text_name.getText(), text_faculty.getText(),text_name.getText(),text_lastname.getText());
            if (rpta == true) {
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
            } else {
                ventana_emergente.add(new JLabel("los datos NO se pueden guardar en el archivo C:/exercise/andres.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}
