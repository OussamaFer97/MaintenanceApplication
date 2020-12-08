package root.screens.manageusers;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import root.Navigable;
import root.Screen;


public class ManageUsersView extends Screen {
    private final DefaultTableModel tableModel;
    private final ManageUsersModel model;
    private final ButtonColumn deleteCol, editCol;

    /**
     * Creates new form ManageUsersView
     * @param nav
     * @param model
     */
    public ManageUsersView(Navigable nav, ManageUsersModel model) {
        super(nav);
        this.model = model;
        String[] columnNames = {"Fiscal Code", "Username", "Name", "Surname", "delete", "edit"};
        Object[][] data = {
            {"AAAA", "Ouss", "Oussama", "Ferchichi", "delete", "edit"},
            {"BBBB", "Ficc", "Alessandro", "Ficca", "delete", "edit"},
            {"AAAA", "Ouss", "Oussama", "Ferchichi", "delete", "edit"},
            {"BBBB", "Ficc", "Alessandro", "Ficca", "delete", "edit"},
            {"AAAA", "Ouss", "Oussama", "Ferchichi", "delete", "edit"},
            {"BBBB", "Ficc", "Alessandro", "Ficca", "delete", "edit"},
            {"AAAA", "Ouss", "Oussama", "Ferchichi", "delete", "edit"},
            {"BBBB", "Ficc", "Alessandro", "Ficca", "delete", "edit"},
            {"AAAA", "Ouss", "Oussama", "Ferchichi", "delete", "edit"},
            {"BBBB", "Ficc", "Alessandro", "Ficca", "delete", "edit"},
        };
        tableModel = new DefaultTableModel(data, columnNames);
        initComponents();
        
        usersTable.getColumn("delete").setMaxWidth(100);
        usersTable.getColumn("edit").setMaxWidth(70);
        
        deleteCol = new ButtonColumn(usersTable.getColumn("delete"), true);
        editCol = new ButtonColumn(usersTable.getColumn("edit"), true);
        
        deleteCol.setActionListener((i) -> {
            super.confirmDialog("Conferma l'azione", "Sei sicuro di voler cancellare " + i);
        });
        editCol.setActionListener((i) -> {
            super.showMsg("Conferma l'azione", "Ancora da implementare");
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();

        backBtn.setText("back");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE USERS");

        usersTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usersTable.setModel(tableModel);
        usersTable.setRowHeight(20);
        usersTable.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(usersTable);

        createBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createBtn.setText("create user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(51, 51, 51)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void addBackActionListener(ActionListener al) {}
    public void addCreateActionListener(ActionListener al) {}
    public void setDeleteUserActionListener(ButtonColumnActionListener al) {}
    public void setEditUserActionListener(ButtonColumnActionListener al) {}
    
    public void removeRow(int rowIndex) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
