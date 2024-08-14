package custom;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import javax.swing.table.*;

public class CustomTable {

    // Personalizar
    public static void personalizeTable(JTable table) {
        personalizeScrollBar(table);
        configureTableHeader(table);
        customizeTable(table);
    }

    public static void personalizeScrollBar(JTable table) {
        JScrollPane scrollPane = (JScrollPane) table.getParent().getParent();

        final int SCROLL_BAR_ALPHA_ROLLOVER = 100;
        final int SCROLL_BAR_ALPHA = 50;
        final int THUMB_SIZE = 8;
        final Color THUMB_COLOR = Color.BLACK;

        scrollPane.setBackground(Color.WHITE);
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected JButton createDecreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                int alpha = isThumbRollover() ? SCROLL_BAR_ALPHA_ROLLOVER : SCROLL_BAR_ALPHA;
                int orientation = ((JScrollBar) c).getOrientation();
                int x = thumbBounds.x;
                int y = thumbBounds.y;

                int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width;
                width = Math.max(width, THUMB_SIZE);

                int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height : THUMB_SIZE;
                height = Math.max(height, THUMB_SIZE);

                Graphics2D graphics2D = (Graphics2D) g.create();
                graphics2D.setColor(new Color(THUMB_COLOR.getRed(), THUMB_COLOR.getGreen(), THUMB_COLOR.getBlue(), alpha));
                graphics2D.fillRect(x, y, width, height);
                graphics2D.dispose();
            }
        });

        scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected JButton createDecreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                int alpha = isThumbRollover() ? SCROLL_BAR_ALPHA_ROLLOVER : SCROLL_BAR_ALPHA;
                int orientation = ((JScrollBar) c).getOrientation();
                int x = thumbBounds.x;
                int y = thumbBounds.y;

                int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width;
                width = Math.max(width, THUMB_SIZE);

                int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height : THUMB_SIZE;
                height = Math.max(height, THUMB_SIZE);

                Graphics2D graphics2D = (Graphics2D) g.create();
                graphics2D.setColor(new Color(THUMB_COLOR.getRed(), THUMB_COLOR.getGreen(), THUMB_COLOR.getBlue(), alpha));
                graphics2D.fillRect(x, y, width, height);
                graphics2D.dispose();
            }
        });

        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(5, 5));
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(5, 5));
        scrollPane.getVerticalScrollBar().setBackground(Color.WHITE);

        scrollPane.getHorizontalScrollBar().setBackground(new Color(242, 242, 242));
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(20);
    }

    public static void configureTableHeader(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setOpaque(true);
        header.setBackground(Color.WHITE); // Color del fondo del header
        header.setFont(new Font("sansserif", Font.BOLD, 12));
        header.setForeground(new Color(102, 102, 102));
        header.setBorder(new EmptyBorder(10, 5, 10, 5)); // Espacio entre el header y el scroll
        TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();

        // Crear un renderizador personalizado para el header
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Alinear al centro

        // Asignar el renderizador personalizado a cada columna
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    public static void customizeTable(JTable table) {
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(false); // Ocultar las líneas verticales
        table.setGridColor(new Color(230, 230, 230));
        table.setRowHeight(40);
        table.getTableHeader().setReorderingAllowed(false);

        // Obtener el JScrollPane que contiene la tabla
        JScrollPane scrollPane = (JScrollPane) table.getParent().getParent();
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Pintar el borde de blanco

        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel cell = (JLabel) super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, column);
                cell.setHorizontalAlignment(JLabel.CENTER); // Alinear el contenido al centro
                cell.setBackground(Color.WHITE);
                setBorder(null); // Esta línea quita el borde de la celda
                if (isSelected) {
                    cell.setForeground(new Color(15, 89, 140));
                } else {
                    cell.setForeground(new Color(102, 102, 102));
                }
                return cell;
            }
        });
    }

}
