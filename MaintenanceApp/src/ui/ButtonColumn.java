package ui;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 * Rappresents a JTable column that should countain buttons.
 * It supports only one listener of type ButtonColumnActionListener
 */
public class ButtonColumn {
    private ButtonColumnActionListener al;
    private final Integer width;
    private final boolean hideHeaderValue;
    
    /**
     * Creates an instance of ButtonColumn
     * @param tc the JTable column that should countain buttons
     * @param hideHeaderValue indicates if the column header name should be hidden
     * @param width indicates the column width
     */
    public ButtonColumn(TableColumn tc, boolean hideHeaderValue, Integer width) {
        this.hideHeaderValue = hideHeaderValue;
        this.width = width;
        
        setColumnData(tc);
    }
    
    /**
     * Creates an instance of ButtonColumn with default width
     * @param tc the JTable column that should countain buttons
     * @param hideHeaderValue indicates if the column header name should be hidden
     */
    public ButtonColumn(TableColumn tc, boolean hideHeaderValue) {
        this(tc, hideHeaderValue, null);
    }
    
    /**
     * Creates an instance of ButtonColumn with default width and visible
     * header name
     * @param tc the JTable column that should countain buttons
     */
    public ButtonColumn(TableColumn tc) {
        this(tc, false, null);
    }
    
    /**
     * Set settings to a table column.
     * @param tc the column to set
     */
    private void setColumnData(TableColumn tc) {
        tc.setCellRenderer(new Renderer());
        tc.setCellEditor(new Editor());
        
        if (width != null) {
            tc.setMinWidth(width);
            tc.setMaxWidth(width);
        }
        
        if (hideHeaderValue)
            tc.setHeaderValue("");
    }
    
    /**
     * Add the previous settings to a new table column. All columns share the 
     * same ButtonColumnActionListener.
     * @param tc the column to add
     */
    public void addTo(TableColumn tc) {
        setColumnData(tc);
    }
    
    /**
     * Register a listener to all the colunmn
     * @param al the action listener to register
     */
    public void setActionListener(ButtonColumnActionListener al) {
        this.al = al;
    }
    
    /**
     * Used to render the button in the column cells
     */
    private class Renderer implements TableCellRenderer {
        private final JButton btn;

        public Renderer() {
            btn = new JButton();
            btn.setOpaque(true);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            btn.setText((value == null) ? "" : value.toString());
            return btn;
        }
    }
    
    /**
     * Used to render the button and handle the user interactions
     */
    private class Editor extends DefaultCellEditor {
        private String label;
        private boolean isPushed;
        private int editingRow;
        private final JButton btn;
        
        public Editor() {
            super(new JCheckBox());
            btn = new JButton();
            btn.setOpaque(true);
            btn.addActionListener((e) -> {
                fireEditingStopped();
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            btn.setText(label);
            editingRow = row;
            isPushed = true;
            return btn;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed && al != null) {
                EventQueue.invokeLater(() -> {
                    al.actionPerformed(editingRow);
                });
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }
    }
}
