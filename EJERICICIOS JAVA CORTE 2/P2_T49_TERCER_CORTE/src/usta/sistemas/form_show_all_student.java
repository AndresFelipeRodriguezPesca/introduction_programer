package usta.sistemas;

import javax.swing.*;
import java.awt.*;
//AUTHOR: Andres Felipe Rodriguez
//DATE:2020/06/19
//DESCRIPTION: This software shows the students' grade projects

public class form_show_all_student extends JDialog{
    public  form_show_all_student (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());

        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("Lista de estudiantes", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);

        String[] columnsNames ={"Nombre", "Apellido","Facultad"};
        file_Data_student file_data_student1=new file_Data_student();
        JTable tabla_datos= new JTable(file_data_student1.f_all_data_students(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);

        setSize(800,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();

    }
}
