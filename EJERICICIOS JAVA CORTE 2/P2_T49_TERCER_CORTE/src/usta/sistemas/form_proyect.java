package usta.sistemas;

import javax.swing.*;
import java.awt.*;
//AUTHOR: Andres Felipe Rodriguez
//DATE:2020/06/19
//DESCRIPTION: This software shows the students' grade projects

public class form_proyect extends JDialog {
    public form_proyect (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());

        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("Lista de proyectos de grado", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);


        String[] columnsNames ={"Nombre", "Codigo", "Facultad", "Director"};
        file_data_grado file_data_proyecto1=new file_data_grado();
        JTable tabla_datos= new JTable(file_data_proyecto1.f_all_data_proyecto(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);

        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);

        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // modal

    }
}
