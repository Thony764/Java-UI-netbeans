package custom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuCustom {

// Declara una variable para el JTabbedPane y el índice actual.
    private JTabbedPane stack;
    private int currentIndex;

    // Constructor que inicializa el JTabbedPane y establece el índice actual a -1 (no seleccionado).
    public MenuCustom(JTabbedPane stack) {
        this.stack = stack;
        this.currentIndex = -1;
    }

    // Método para agregar eventos a un array de JPanels.
    public void agregarEventos(JPanel[] opciones) {
        for (int i = 0; i < opciones.length; i++) {
            final int index = i; // Final para usar dentro de la clase interna.
            JPanel opcion = opciones[i]; // Obtiene el JPanel actual del array.
            
            // Agrega un MouseListener a cada JPanel.
            opcion.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Cambia el tab seleccionado en el JTabbedPane y actualiza el índice actual.
                    stack.setSelectedIndex(index);
                    currentIndex = index;
                    // Actualiza los colores de los paneles según el índice seleccionado.
                    actualizarColores(opciones, index);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    // Si el panel no está seleccionado, cambia su color al color de hover.
                    if (currentIndex != index) {
                        opcion.setBackground(new Color(33, 40, 69)); // hover
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    // Si el panel no está seleccionado, restaura su color al color base.
                    if (currentIndex != index) {
                        opcion.setBackground(new Color(24, 30, 54)); // base
                    }
                }
            });
        }
    }

    // Método para actualizar los colores de los paneles.
    private void actualizarColores(JPanel[] opciones, int seleccionado) {
        for (int i = 0; i < opciones.length; i++) {
            if (i == seleccionado) {
                // Si el panel está seleccionado, cambia su color al color presionado.
                opciones[i].setBackground(new Color(49, 60, 105)); // pressed
            } else {
                // Si el panel no está seleccionado, cambia su color al color base.
                opciones[i].setBackground(new Color(24, 30, 54)); // base
            }
        }
    }
}
