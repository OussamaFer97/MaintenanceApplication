
package root.screens.createuser;

import java.awt.event.ActionListener;
import root.Navigable;
import root.Screen;


public class UserView extends Screen {

    /**
     * Creates new form UserView
     * @param nav
     */
    public UserView(Navigable nav) {
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

        roleButtonGruop = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        cfLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        cfInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        roleLabel = new javax.swing.JLabel();
        roleInputMaintainer = new javax.swing.JRadioButton();
        roleInputPlanner = new javax.swing.JRadioButton();
        nameLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        surnameInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("CREATE USER");

        backBtn.setText("back");

        cfLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cfLabel.setText("CF");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        roleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roleLabel.setText("Role");

        roleButtonGruop.add(roleInputMaintainer);
        roleInputMaintainer.setText("Maintainer");

        roleButtonGruop.add(roleInputPlanner);
        roleInputPlanner.setSelected(true);
        roleInputPlanner.setText("Planner");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        surnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surnameLabel.setText("Surname");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressLabel.setText("Address");

        createBtn.setText("Create");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordInput)
                    .addComponent(emailInput)
                    .addComponent(nameInput)
                    .addComponent(surnameInput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roleInputPlanner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roleInputMaintainer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(24, 24, 24)
                                .addComponent(titleLabel))
                            .addComponent(cfLabel)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(emailLabel)
                            .addComponent(addressLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addressInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cfInput, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleInputPlanner)
                    .addComponent(roleInputMaintainer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cfInput;
    private javax.swing.JLabel cfLabel;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.ButtonGroup roleButtonGruop;
    private javax.swing.JRadioButton roleInputMaintainer;
    private javax.swing.JRadioButton roleInputPlanner;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTextField surnameInput;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
   // Input Getter
    public String getCf(){
        return cfInput.getText();
    }
    
    public String getUsername(){
        return userInput.getText();
    }
    
    public String getPassword(){
        String pass = "";
        char[] passChar = passwordInput.getPassword();
        for(int i = 0; i< passChar.length ;i++){
            pass += passChar[i];
        }
        return pass;
    }
    
    public String getRole(){
        roleInputPlanner.setActionCommand("P");
        roleInputMaintainer.setActionCommand("M");
        return roleButtonGruop.getSelection().getActionCommand();
    }    
    
    public String getName(){
        return nameInput.getText();
    }
    
    public String getSurname(){
        return surnameInput.getText();
    }
    
    public String getEmail(){
        return emailInput.getText();
    }
    
    public String getAddress(){
        return addressInput.getText();
    }
    
    public void addCreateButtonListener(ActionListener al) {
        createBtn.addActionListener(al);
    }
    
    public void addBackButtonListener(ActionListener al){
        backBtn.addActionListener(al);
    }
}
