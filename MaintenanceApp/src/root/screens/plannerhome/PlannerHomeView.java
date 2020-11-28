 package root.screens.plannerhome;

import root.Navigable;
import root.Screen;
import root.screenbuilders.CreateActivityBuilder;
import root.screenbuilders.ManageActivityBuilder;


public class PlannerHomeView extends Screen {

    /**
     * Creates new form PlannerHomeView
     * @param nav navigator used to switch between screens
     */
    public PlannerHomeView(Navigable nav) {
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

        titleLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        planActivityBtn = new javax.swing.JButton();
        selectActivityBtn = new javax.swing.JButton();
        manageActivitiesBtn = new javax.swing.JButton();
        assignedTicketsBtn = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Planner Home");

        infoLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 102, 102));
        infoLabel.setText("This screen shows all the planner main actions");

        planActivityBtn.setText("Plan an activity");
        planActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planActivityBtnActionPerformed(evt);
            }
        });

        selectActivityBtn.setText("Select an activity");
        selectActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActivityBtnActionPerformed(evt);
            }
        });

        manageActivitiesBtn.setText("Manage activities");
        manageActivitiesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActivitiesBtnActionPerformed(evt);
            }
        });

        assignedTicketsBtn.setText("Show assigned tickets");
        assignedTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignedTicketsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(assignedTicketsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectActivityBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(planActivityBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageActivitiesBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(53, 53, 53)
                .addComponent(planActivityBtn)
                .addGap(18, 18, 18)
                .addComponent(selectActivityBtn)
                .addGap(18, 18, 18)
                .addComponent(manageActivitiesBtn)
                .addGap(18, 18, 18)
                .addComponent(assignedTicketsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void planActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planActivityBtnActionPerformed
        super.getNav().push(new CreateActivityBuilder());
    }//GEN-LAST:event_planActivityBtnActionPerformed

    private void selectActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActivityBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActivityBtnActionPerformed

    private void manageActivitiesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActivitiesBtnActionPerformed
        super.getNav().push(new ManageActivityBuilder());
    }//GEN-LAST:event_manageActivitiesBtnActionPerformed

    private void assignedTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignedTicketsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignedTicketsBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignedTicketsBtn;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton manageActivitiesBtn;
    private javax.swing.JButton planActivityBtn;
    private javax.swing.JButton selectActivityBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
