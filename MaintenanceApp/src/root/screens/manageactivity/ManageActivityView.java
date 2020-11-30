package root.screens.manageactivity;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import root.Navigable;
import root.Screen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ManageActivityView extends Screen {

    /**
     * Creates new form MantainanceActivityView
     */
    public ManageActivityView(Navigable nav) {
        super(nav);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        manageActivityTitleLabel = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        activitiesTableScroll = new javax.swing.JScrollPane();
        activitiesTable = new javax.swing.JTable(new DefaultTableModel());
        selectIdLabel = new javax.swing.JLabel();
        deleteSelectedBtn = new javax.swing.JButton();
        modifySelectedBtn = new javax.swing.JButton();

        manageActivityTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageActivityTitleLabel.setText("MANAGE ACTIVITY");

        selectBtn.setText("Select");

        backBtn.setText("back");

        activitiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Branch office", "Area", "Typology", "Estimated time", "Week", "Interruptible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activitiesTableScroll.setViewportView(activitiesTable);

        deleteSelectedBtn.setText("Delete Selected");

        modifySelectedBtn.setText("Modify Selected");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activitiesTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                    .addComponent(selectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modifySelectedBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSelectedBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectIdLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(266, 266, 266)
                                .addComponent(manageActivityTitleLabel)))
                        .addGap(0, 336, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageActivityTitleLabel)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activitiesTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteSelectedBtn)
                    .addComponent(modifySelectedBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectBtn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activitiesTable;
    private javax.swing.JScrollPane activitiesTableScroll;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteSelectedBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageActivityTitleLabel;
    private javax.swing.JButton modifySelectedBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JLabel selectIdLabel;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTable getActivitiesTable(){
        return activitiesTable;
    }
    
    public javax.swing.JLabel getSelectedIdLabel(){
        return selectIdLabel;
    }
    
    public void addSelectButtonListener(ActionListener al){
        selectBtn.addActionListener(al);
    }
    
    public void addBackButtonListener(ActionListener al){
        backBtn.addActionListener(al);
    }
    
    public void addModifySelectedButtonListener(ActionListener al){
        modifySelectedBtn.addActionListener(al);
    }
    
    public void addDeleteSelectedButtonListener(ActionListener al){
        deleteSelectedBtn.addActionListener(al);
    }
    
}
