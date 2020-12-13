
package root.screens.sysadminhome;

import root.Navigable;
import root.Screen;

public class SysAdminHomeView extends Screen {

    /**
     * Creates new form SysAdminHomeView
     * @param nav navigator used to switch between screens
     */
    public SysAdminHomeView(Navigable nav) {
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

        manageUserBtn = new javax.swing.JButton();
        manageWorkspaceBtn = new javax.swing.JButton();
        manageSiteBtn = new javax.swing.JButton();
        manageMaterialBtn = new javax.swing.JButton();
        manageTypologyBtn = new javax.swing.JButton();
        manageCompetenceBtn = new javax.swing.JButton();
        manageProcedureBtn = new javax.swing.JButton();
        assignCompetenceToMaintainerBtn = new javax.swing.JButton();
        assignProcedureBtn = new javax.swing.JButton();
        associateSMPBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();

        manageUserBtn.setText("Manage User");
        manageUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserBtnActionPerformed(evt);
            }
        });

        manageWorkspaceBtn.setText("Manage Workspace");
        manageWorkspaceBtn.setEnabled(false);

        manageSiteBtn.setText("Manage Site");
        manageSiteBtn.setEnabled(false);

        manageMaterialBtn.setText("Manage Material");
        manageMaterialBtn.setEnabled(false);

        manageTypologyBtn.setText("Manage Typology");
        manageTypologyBtn.setEnabled(false);

        manageCompetenceBtn.setText("Manage Competence");
        manageCompetenceBtn.setEnabled(false);

        manageProcedureBtn.setText("Manage Procedure");
        manageProcedureBtn.setEnabled(false);

        assignCompetenceToMaintainerBtn.setText("Assign competence to a maintainer");
        assignCompetenceToMaintainerBtn.setEnabled(false);

        assignProcedureBtn.setText("Assign procedure");
        assignProcedureBtn.setEnabled(false);

        associateSMPBtn.setText("Associate SMP");
        associateSMPBtn.setEnabled(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("System Administrator Home");

        infoLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 102, 102));
        infoLabel.setText("This screen shows all the system administrator main actions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(manageTypologyBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageCompetenceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageProcedureBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assignCompetenceToMaintainerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(manageMaterialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageSiteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageWorkspaceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assignProcedureBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(associateSMPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(infoLabel)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel)
                .addGap(27, 27, 27)
                .addComponent(manageUserBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageWorkspaceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageSiteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageMaterialBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageTypologyBtn)
                .addGap(18, 18, 18)
                .addComponent(manageCompetenceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageProcedureBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignCompetenceToMaintainerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignProcedureBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(associateSMPBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignCompetenceToMaintainerBtn;
    private javax.swing.JButton assignProcedureBtn;
    private javax.swing.JButton associateSMPBtn;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton manageCompetenceBtn;
    private javax.swing.JButton manageMaterialBtn;
    private javax.swing.JButton manageProcedureBtn;
    private javax.swing.JButton manageSiteBtn;
    private javax.swing.JButton manageTypologyBtn;
    private javax.swing.JButton manageUserBtn;
    private javax.swing.JButton manageWorkspaceBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}