package root.screens.verifyactivity;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import root.Navigable;
import root.Screen;
import root.entities.Activity;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class VerifyActivityView extends Screen {
    static final String PREFIX = "\t• ";
    final VerifyActivityModel model;
    
    /**
     * Creates new form VerifyActivityView according to the activity type and data
     * @param nav navigator used to switch between screens
     * @param model used to show the activity informations
     */
    public VerifyActivityView(Navigable nav, VerifyActivityModel model) {
        super(nav);
        this.model = model == null ? createDummyModel() : model;
        initComponents();
        
        if (model == null) {
            EventQueue.invokeLater(() -> {
                super.showErrorMsg("Activity not found", "Unable to fetch activity");
                nav.goHome();
            });
        } else if (model.getType() == Activity.ActivityType.PLANNED) {
            descTextArea.setEditable(false);
            timeTextField.setEditable(false);
            timeTextField.setBorder(BorderFactory.createEmptyBorder());
            // hide: date, interruptable
            dateLabel.setVisible(false);
            dateValueLabel.setVisible(false);
            ewoLeftContainer.setVisible(false);
            materialContainer.setVisible(false);
        } else {
            smpContainer.setVisible(false);  // hide smp button and label
            noteTextArea.setEditable(false);  // only scheduled activity can edit notes
            titleLabel.setText("Verify EWO");  // set title text
            // set date text
            LocalDate today = LocalDate.now();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE d", Locale.ENGLISH);
            dateValueLabel.setText(today.format(fmt));
            // set interruptible text
            interruptLabel.setText("This activity " + (model.isInterruptible() ? "can" : "can't") + " be interrupted");
        }
    }
    
    private VerifyActivityModel createDummyModel() {
        Activity activity = new Activity(0, "", "", "", "", 0, false, 0, "", null);
        return new VerifyActivityModel(activity, null);
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
        javax.swing.JLabel idLabel = new javax.swing.JLabel();
        idValueLabel = new javax.swing.JLabel();
        javax.swing.JLabel noteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteTextArea = new javax.swing.JTextArea();
        javax.swing.JLabel areaLabel = new javax.swing.JLabel();
        areaValueLabel = new javax.swing.JLabel();
        javax.swing.JLabel typologyLabel = new javax.swing.JLabel();
        typologyValueLabel = new javax.swing.JLabel();
        javax.swing.JLabel timeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        skillList = new javax.swing.JList<>();
        javax.swing.JLabel weekLabel = new javax.swing.JLabel();
        weekValueLabel = new javax.swing.JLabel();
        javax.swing.JLabel descLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        dateLabel = new javax.swing.JLabel();
        dateValueLabel = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        smpContainer = new javax.swing.JPanel();
        javax.swing.JLabel smpLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel smpLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 190), new java.awt.Dimension(0, 190), new java.awt.Dimension(32767, 190));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 190), new java.awt.Dimension(0, 190), new java.awt.Dimension(32767, 190));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 190), new java.awt.Dimension(0, 190), new java.awt.Dimension(32767, 190));
        ewoLeftContainer = new javax.swing.JPanel();
        skillsSelect = new javax.swing.JComboBox<>();
        addSkillBtn = new javax.swing.JButton();
        interruptLabel = new javax.swing.JLabel();
        materialContainer = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        materialList = new javax.swing.JList<>();
        materialInput = new javax.swing.JTextField();
        remMaterialBtn = new javax.swing.JButton();
        addMaterialBtn = new javax.swing.JButton();

        backBtn.setText("back");

        homeBtn.setText("home");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Verify Activity");

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idLabel.setForeground(new java.awt.Color(102, 102, 102));
        idLabel.setText("ID");

        idValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idValueLabel.setText("" + model.getId());

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(102, 102, 102));
        noteLabel.setText("Workspace note");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        noteTextArea.setColumns(20);
        noteTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        noteTextArea.setLineWrap(true);
        noteTextArea.setRows(5);
        noteTextArea.setText(model.getNotes());
        noteTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(noteTextArea);

        areaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        areaLabel.setForeground(new java.awt.Color(102, 102, 102));
        areaLabel.setText("Area");

        areaValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        areaValueLabel.setText(model.getArea());

        typologyLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        typologyLabel.setForeground(new java.awt.Color(102, 102, 102));
        typologyLabel.setText("Typology");

        typologyValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        typologyValueLabel.setText(model.getTypology());

        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(102, 102, 102));
        timeLabel.setText("Estimated intevetion time");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Skills needed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        skillList.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        skillList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        skillList.setModel(model.getSkillsModel());
        skillList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(skillList);

        weekLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weekLabel.setForeground(new java.awt.Color(102, 102, 102));
        weekLabel.setText("Week number");

        weekValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weekValueLabel.setText("" + model.getWeek());

        descLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        descLabel.setForeground(new java.awt.Color(102, 102, 102));
        descLabel.setText("Intervention description");

        forwardBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forwardBtn.setText("FORWARD");

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descTextArea.setColumns(20);
        descTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descTextArea.setLineWrap(true);
        descTextArea.setRows(5);
        descTextArea.setText(model.getDescription());
        descTextArea.setWrapStyleWord(true);
        descTextArea.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(descTextArea);

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(102, 102, 102));
        dateLabel.setText("Date");

        dateValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateValueLabel.setText("null");

        timeTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timeTextField.setText("" + model.getTime());

        smpLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        smpLabel1.setForeground(new java.awt.Color(51, 51, 51));
        smpLabel1.setText("Standard Maintenance");

        smpLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        smpLabel2.setForeground(new java.awt.Color(51, 51, 51));
        smpLabel2.setText("Procedure File");

        smpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/download-solid.png"))); // NOI18N
        smpBtn.setEnabled(false);

        javax.swing.GroupLayout smpContainerLayout = new javax.swing.GroupLayout(smpContainer);
        smpContainer.setLayout(smpContainerLayout);
        smpContainerLayout.setHorizontalGroup(
            smpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(smpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smpLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smpLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        smpContainerLayout.setVerticalGroup(
            smpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(smpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(smpContainerLayout.createSequentialGroup()
                        .addComponent(smpLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smpLabel2))
                    .addComponent(smpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        skillsSelect.setModel(model.getRemainingSkillsModel());

        addSkillBtn.setText("add");

        interruptLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        interruptLabel.setText("0");

        javax.swing.GroupLayout ewoLeftContainerLayout = new javax.swing.GroupLayout(ewoLeftContainer);
        ewoLeftContainer.setLayout(ewoLeftContainerLayout);
        ewoLeftContainerLayout.setHorizontalGroup(
            ewoLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ewoLeftContainerLayout.createSequentialGroup()
                .addComponent(skillsSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSkillBtn))
            .addComponent(interruptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ewoLeftContainerLayout.setVerticalGroup(
            ewoLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ewoLeftContainerLayout.createSequentialGroup()
                .addGroup(ewoLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillsSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSkillBtn))
                .addGap(18, 18, 18)
                .addComponent(interruptLabel))
        );

        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Materials needed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        materialList.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        materialList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        materialList.setModel(model.getMaterialsModel());
        materialList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(materialList);

        materialInput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        remMaterialBtn.setText("remove");

        addMaterialBtn.setText("add");

        javax.swing.GroupLayout materialContainerLayout = new javax.swing.GroupLayout(materialContainer);
        materialContainer.setLayout(materialContainerLayout);
        materialContainerLayout.setHorizontalGroup(
            materialContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialContainerLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(materialContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(materialContainerLayout.createSequentialGroup()
                        .addComponent(addMaterialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remMaterialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addComponent(materialInput))
                .addContainerGap())
        );
        materialContainerLayout.setVerticalGroup(
            materialContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(materialContainerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(materialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(materialContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remMaterialBtn)
                    .addComponent(addMaterialBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel)
                                .addGap(115, 115, 115)
                                .addComponent(homeBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(typologyValueLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noteLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(typologyLabel)
                                                    .addComponent(areaLabel)
                                                    .addComponent(weekLabel)
                                                    .addComponent(idLabel)
                                                    .addComponent(areaValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(weekValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dateValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(timeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descLabel)
                                    .addComponent(smpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ewoLeftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(materialContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(forwardBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(backBtn)
                    .addComponent(homeBtn))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idValueLabel)
                                        .addGap(13, 13, 13)
                                        .addComponent(weekLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weekValueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(areaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(areaValueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(typologyLabel))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typologyValueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(timeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateValueLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(smpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ewoLeftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))))
                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(materialContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forwardBtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void addBackBtnListener(ActionListener al) {
        backBtn.addActionListener(al);
    }
    
    public void addHomeBtnListener(ActionListener al) {
        homeBtn.addActionListener(al);
    }
    
    public void addForwardBtnListener(ActionListener al) {
        forwardBtn.addActionListener(al);
    }
    
    public void addSmpBtnListener(ActionListener al) {
        smpBtn.addActionListener(al);
    }
    
    public void addSkillAddBtnListener(ActionListener al) {
        addSkillBtn.addActionListener(al);
    }
    
    public void addMaterialAddBtnListener(ActionListener al) {
        addMaterialBtn.addActionListener(al);
    }
    
    public void addMaterialRemoveBtnListener(ActionListener al) {
        remMaterialBtn.addActionListener(al);
    }
    
    /**
     * Clear the material name text input and returns the deleted value
     * @return user input
     */
    public String popMaterialInputValue() {
        String val = materialInput.getText().trim();
        materialInput.setText("");
        return val;
    }
    
    /**
     * Return the selected skill in the compo box
     * @return name of the selected skill
     */
    public String getSelectedSkill() {
        return (String)skillsSelect.getSelectedItem();
    }
    
    /**
     * Returns the current value of the estimated time text input
     * @return estimated time value
     */
    public String getTimeValue() {
        return timeTextField.getText();
    }
    
    /**
     * Return the current text of the TextArea of the notes
     * @return text
     */
    public String getTextAreaNotes() {
        return noteTextArea.getText();
    }
    
    /**
     * Return the current text of the TextArea of the notes
     * @return text
     */
    public String getTextAreaDescription() {
        return descTextArea.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMaterialBtn;
    private javax.swing.JButton addSkillBtn;
    private javax.swing.JLabel areaValueLabel;
    protected final javax.swing.JButton backBtn = new javax.swing.JButton();
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateValueLabel;
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JPanel ewoLeftContainer;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    protected final javax.swing.JButton forwardBtn = new javax.swing.JButton();
    protected final javax.swing.JButton homeBtn = new javax.swing.JButton();
    private javax.swing.JLabel idValueLabel;
    private javax.swing.JLabel interruptLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel materialContainer;
    private javax.swing.JTextField materialInput;
    private javax.swing.JList<String> materialList;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JButton remMaterialBtn;
    private javax.swing.JList<String> skillList;
    private javax.swing.JComboBox<String> skillsSelect;
    protected final javax.swing.JButton smpBtn = new javax.swing.JButton();
    private javax.swing.JPanel smpContainer;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typologyValueLabel;
    private javax.swing.JLabel weekValueLabel;
    // End of variables declaration//GEN-END:variables
}
