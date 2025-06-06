package est.ups.edu.ejercicios.ejercicio2;

import java.awt.*;
import java.awt.event.*;

public class RegistroCalificaciones extends Frame {

    TextField cedula, nombre, apellido;
    Button botonGuardar;

    public RegistroCalificaciones() {
        setTitle("Registro de Calificaciones");
        setSize(400, 250);
        setLayout(new BorderLayout());

        Panel panelSuperior = new Panel(new FlowLayout());
        panelSuperior.add(new Button("Agregar"));
        panelSuperior.add(new Button("Modificar"));
        panelSuperior.add(new Button("Eliminar"));
        add(panelSuperior, BorderLayout.NORTH);

        Panel panelCentral = new Panel(new GridLayout(3, 2));
        panelCentral.add(new Label("Cédula:"));
        cedula = new TextField(20);
        panelCentral.add(cedula);

        panelCentral.add(new Label("Nombre:"));
        nombre = new TextField(20);
        panelCentral.add(nombre);

        panelCentral.add(new Label("Apellido:"));
        apellido = new TextField(20);
        panelCentral.add(apellido);

        add(panelCentral, BorderLayout.CENTER);

        Panel panelInferior = new Panel(new FlowLayout());
        botonGuardar = new Button("Guardar");
        Button btnCancelar = new Button("Cancelar");

        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cédula: " + cedula.getText());
                System.out.println("Nombre: " + nombre.getText());
                System.out.println("Apellido: " + apellido.getText());
            }
        });

        panelInferior.add(botonGuardar);
        panelInferior.add(btnCancelar);
        add(panelInferior, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistroCalificaciones();
    }
}