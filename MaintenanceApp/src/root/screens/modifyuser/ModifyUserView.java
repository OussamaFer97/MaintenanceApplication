/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.screens.modifyuser;
import javax.swing.ButtonModel;
import root.Navigable;
import root.Screen;
import root.screens.modifyuser.User.UserType;

/**
 *
 * @author giand
 */
public class ModifyUserView extends Screen {

    private final ModifyUserModel model;
    
    /**
     *
     * @param nav
     * @param model
     */
    public ModifyUserView(Navigable nav, ModifyUserModel model) {
        super(nav);
        this.model = model;
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

        roleInputGroup = new javax.swing.ButtonGroup();
        backBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        surnameInput = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        cfLabel = new javax.swing.JLabel();
        cfInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        roleLabel = new javax.swing.JLabel();
        rolePlannerInput = new javax.swing.JRadioButton();
        roleMaintainerInput = new javax.swing.JRadioButton();
        modifyBtn = new javax.swing.JButton();
        initCfLabel = new javax.swing.JLabel();
        initCf = new javax.swing.JLabel();

        backBtn.setText("back");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("MODIFY USER");

        nameLabel.setText("name");

        surnameLabel.setText("surname");

        cfLabel.setText("cf");

        addressLabel.setText("address");

        emailLabel.setText("email");

        usernameLabel.setText("username");

        passwordLabel.setText("password");

        roleLabel.setText("role");

        roleInputGroup.add(rolePlannerInput);
        rolePlannerInput.setSelected(true);
        rolePlannerInput.setText("Planner");

        roleInputGroup.add(roleMaintainerInput);
        roleMaintainerInput.setText("Maintainer");

        modifyBtn.setText("Modify");

        initCfLabel.setText("user cf:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameInput)
                    .addComponent(surnameInput)
                    .addComponent(cfInput)
                    .addComponent(addressInput)
                    .addComponent(emailInput)
                    .addComponent(usernameInput)
                    .addComponent(passwordInput)
                    .addComponent(modifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(56, 56, 56)
                                .addComponent(titleLabel))
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(cfLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rolePlannerInput)
                                .addGap(31, 31, 31)
                                .addComponent(roleMaintainerInput))
                            .addComponent(addressLabel)
                            .addComponent(emailLabel)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(roleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(initCfLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(initCf)))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initCfLabel)
                    .addComponent(initCf))
                .addGap(18, 18, 18)
                .addComponent(cfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolePlannerInput)
                    .addComponent(roleMaintainerInput))
                .addGap(31, 31, 31)
                .addComponent(modifyBtn)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cfInput;
    private javax.swing.JLabel cfLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel initCf;
    private javax.swing.JLabel initCfLabel;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.ButtonGroup roleInputGroup;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JRadioButton roleMaintainerInput;
    private javax.swing.JRadioButton rolePlannerInput;
    private javax.swing.JTextField surnameInput;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    public String getAddressInput() {
        return addressInput.getText();
    }

    public String getCfInput() {
        return cfInput.getText();
    }

    public String getEmailInput() {
        return emailInput.getText();
    }

    public String getNameInput() {
        return nameInput.getText();
    }

    public String getPasswordInput() {
        return passwordInput.getText();
    }

    public String getRoleInput() {
        rolePlannerInput.setActionCommand("P");
        roleMaintainerInput.setActionCommand("M");
        return roleInputGroup.getSelection().getActionCommand();
    }

    public String getSurnameInput() {
        return surnameInput.getText();
    }

    public String getUsernameInput() {
        return usernameInput.getText();
    }

    public void addBackButtonListener(java.awt.event.ActionListener al){
        backBtn.addActionListener(al);
    }
    
    public void addModifyButtonListener(java.awt.event.ActionListener al){
        modifyBtn.addActionListener(al);
    }
    
    public boolean fillForm(){
        if(model == null){
            return false;
        }
        
        initCf.setText(model.getInitCf());
        cfInput.setText(model.getCf());
        nameInput.setText(model.getName());
        surnameInput.setText(model.getSurname());
        addressInput.setText(model.getAddress());
        emailInput.setText(model.getEmail());
        usernameInput.setText(model.getUsername());
        passwordInput.setText(model.getPassword());
        roleMaintainerInput.setSelected(model.getRole().toString().equals("M"));
        roleMaintainerInput.setSelected(model.getRole().toString().equals("P"));
        
        return true;
    }

}
