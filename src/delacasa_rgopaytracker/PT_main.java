package delacasa_rgopaytracker;
import com.toedter.calendar.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.text.*;
import net.proteanit.sql.*;
/**
 *
 * @author Angelica DC
 */
public class PT_main extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public PT_main() {
        initComponents();
        conn = myconnection.dbConnection();
        setTitle("RGO PayTracker");
        setIconImage();
        setSize(1300, 650);
        setResizable(false);
        StudentTable();
    }
    
    @Override
    public void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            exitConfirmation();
        } else {
            super.processWindowEvent(e);
        }
    }

    public void StudentTable(){
        try{
            String sql="select student_name, student_gender, student_dob, student_mobile, student_email, student_number, school_name, school_location, branch_name, discount_name from student";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            student_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void TransactionTable(){
        
    }
    
    // DO NOT modify this code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        main_panel_header = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        main_title = new javax.swing.JLabel();
        main_pane = new javax.swing.JTabbedPane();
        tab_students = new javax.swing.JPanel();
        student_panel1 = new javax.swing.JPanel();
        student_txt_discount = new javax.swing.JLabel();
        student_txt_studentemail = new javax.swing.JLabel();
        student_txt_studentgender = new javax.swing.JLabel();
        student_txt_studentname = new javax.swing.JLabel();
        student_txt_branch = new javax.swing.JLabel();
        student_txt_schoolname = new javax.swing.JLabel();
        student_txt_studentbday = new javax.swing.JLabel();
        student_txt_studentnumber = new javax.swing.JLabel();
        student_txt_studentmobile = new javax.swing.JLabel();
        student_txt_schoollocation = new javax.swing.JLabel();
        student_combo_branch = new javax.swing.JComboBox<>();
        student_combo_discount = new javax.swing.JComboBox<>();
        student_in_studentemail = new javax.swing.JTextField();
        student_in_studentmobile = new javax.swing.JTextField();
        student_in_schoollocation = new javax.swing.JTextField();
        student_in_studentnumber = new javax.swing.JTextField();
        student_in_schoolname = new javax.swing.JTextField();
        student_in_studentname = new javax.swing.JTextField();
        student_date_chooser = new com.toedter.calendar.JDateChooser();
        student_btn_enter = new javax.swing.JButton();
        student_btn_edit = new javax.swing.JButton();
        student_btn_update = new javax.swing.JButton();
        student_btn_delete = new javax.swing.JButton();
        student_combo_gender = new javax.swing.JComboBox<>();
        student_panel2 = new javax.swing.JPanel();
        student_scrollpane = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        student_btn_search = new javax.swing.JButton();
        student_btn_refresh = new javax.swing.JButton();
        student_in_search = new javax.swing.JTextField();
        tab_transactions = new javax.swing.JPanel();
        trans_panel1 = new javax.swing.JPanel();
        trans_txt_studentname = new javax.swing.JLabel();
        trans_txt_studentnumber = new javax.swing.JLabel();
        trans_txt_trancheamount = new javax.swing.JLabel();
        trans_txt_tranchedate = new javax.swing.JLabel();
        trans_txt_discount = new javax.swing.JLabel();
        trans_txt_balance = new javax.swing.JLabel();
        trans_txt_discountamount = new javax.swing.JLabel();
        trans_in_trancheamount = new javax.swing.JTextField();
        trans_in_studentnumber = new javax.swing.JTextField();
        trans_in_studentname = new javax.swing.JTextField();
        trans_in_discount = new javax.swing.JTextField();
        trans_in_balance = new javax.swing.JTextField();
        trans_in_discountamount = new javax.swing.JTextField();
        trans_date_chooser = new com.toedter.calendar.JDateChooser();
        trans_btn_pay = new javax.swing.JButton();
        trans_btn_edit = new javax.swing.JButton();
        trans_btn_update = new javax.swing.JButton();
        trans_btn_searchUser = new javax.swing.JButton();
        trans_in_searchUser = new javax.swing.JTextField();
        trans_panel2 = new javax.swing.JPanel();
        trans_in_search = new javax.swing.JTextField();
        trans_scrollpane = new javax.swing.JScrollPane();
        trans_table = new javax.swing.JTable();
        trans_btn_search = new javax.swing.JButton();
        trans_btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(129, 650));

        main_panel.setBackground(new java.awt.Color(64, 121, 192));
        main_panel.setPreferredSize(new java.awt.Dimension(1250, 650));

        main_panel_header.setBackground(new java.awt.Color(51, 70, 103));
        main_panel_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                main_panel_headerMouseDragged(evt);
            }
        });
        main_panel_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                main_panel_headerMousePressed(evt);
            }
        });

        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delacasa_rgopaytracker/RGO_LOGOresized.png"))); // NOI18N
        main_logo.setText("jLabel1");

        main_title.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        main_title.setForeground(new java.awt.Color(255, 255, 255));
        main_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_title.setText("RGO PayTracker");

        javax.swing.GroupLayout main_panel_headerLayout = new javax.swing.GroupLayout(main_panel_header);
        main_panel_header.setLayout(main_panel_headerLayout);
        main_panel_headerLayout.setHorizontalGroup(
            main_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panel_headerLayout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_title, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        main_panel_headerLayout.setVerticalGroup(
            main_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(main_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addComponent(main_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_pane.setBackground(new java.awt.Color(51, 70, 103));
        main_pane.setForeground(new java.awt.Color(255, 255, 255));

        tab_students.setBackground(new java.awt.Color(142, 194, 65));

        student_panel1.setBackground(new java.awt.Color(22, 72, 143));

        student_txt_discount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_discount.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_discount.setText("Discount:");

        student_txt_studentemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentemail.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentemail.setText("Student email:");

        student_txt_studentgender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentgender.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentgender.setText("Student gender:");

        student_txt_studentname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentname.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentname.setText("Student name:");

        student_txt_branch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_branch.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_branch.setText("Branch:");

        student_txt_schoolname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_schoolname.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_schoolname.setText("School name:");

        student_txt_studentbday.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentbday.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentbday.setText("Student birthdate:");

        student_txt_studentnumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentnumber.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentnumber.setText("Student number:");

        student_txt_studentmobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_studentmobile.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_studentmobile.setText("Student mobile:");

        student_txt_schoollocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_txt_schoollocation.setForeground(new java.awt.Color(255, 255, 255));
        student_txt_schoollocation.setText("School location:");

        student_combo_branch.setBackground(new java.awt.Color(255, 255, 255));
        student_combo_branch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_combo_branch.setForeground(new java.awt.Color(0, 0, 0));
        student_combo_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Davao", "Koronadal", "GenSan", "CDO", "Butuan" }));

        student_combo_discount.setBackground(new java.awt.Color(255, 255, 255));
        student_combo_discount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_combo_discount.setForeground(new java.awt.Color(0, 0, 0));
        student_combo_discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Group of 10", "Spot Cash", "Repeaters", "Cum Laude", "Magna Cum Laude", "Summa Cum Laude" }));

        student_in_studentemail.setBackground(new java.awt.Color(255, 255, 255));
        student_in_studentemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_studentemail.setForeground(new java.awt.Color(0, 0, 0));
        student_in_studentemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_studentemailActionPerformed(evt);
            }
        });

        student_in_studentmobile.setBackground(new java.awt.Color(255, 255, 255));
        student_in_studentmobile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_studentmobile.setForeground(new java.awt.Color(0, 0, 0));
        student_in_studentmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_studentmobileActionPerformed(evt);
            }
        });

        student_in_schoollocation.setBackground(new java.awt.Color(255, 255, 255));
        student_in_schoollocation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_schoollocation.setForeground(new java.awt.Color(0, 0, 0));
        student_in_schoollocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_schoollocationActionPerformed(evt);
            }
        });

        student_in_studentnumber.setBackground(new java.awt.Color(255, 255, 255));
        student_in_studentnumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_studentnumber.setForeground(new java.awt.Color(0, 0, 0));
        student_in_studentnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_studentnumberActionPerformed(evt);
            }
        });

        student_in_schoolname.setBackground(new java.awt.Color(255, 255, 255));
        student_in_schoolname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_schoolname.setForeground(new java.awt.Color(0, 0, 0));
        student_in_schoolname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_schoolnameActionPerformed(evt);
            }
        });

        student_in_studentname.setBackground(new java.awt.Color(255, 255, 255));
        student_in_studentname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_studentname.setForeground(new java.awt.Color(0, 0, 0));
        student_in_studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_in_studentnameActionPerformed(evt);
            }
        });

        student_date_chooser.setDateFormatString("YYYY-MM-dd");
        student_date_chooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        student_btn_enter.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_enter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_enter.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_enter.setText("Enter");
        student_btn_enter.setBorder(null);
        student_btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_btn_enterActionPerformed(evt);
            }
        });

        student_btn_edit.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_edit.setText("Edit");
        student_btn_edit.setBorder(null);
        student_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_btn_editActionPerformed(evt);
            }
        });

        student_btn_update.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_update.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_update.setText("Update");
        student_btn_update.setBorder(null);
        student_btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_btn_updateActionPerformed(evt);
            }
        });

        student_btn_delete.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_delete.setText("Delete");
        student_btn_delete.setBorder(null);

        student_combo_gender.setBackground(new java.awt.Color(255, 255, 255));
        student_combo_gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_combo_gender.setForeground(new java.awt.Color(0, 0, 0));
        student_combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        javax.swing.GroupLayout student_panel1Layout = new javax.swing.GroupLayout(student_panel1);
        student_panel1.setLayout(student_panel1Layout);
        student_panel1Layout.setHorizontalGroup(
            student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(student_panel1Layout.createSequentialGroup()
                        .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_txt_studentgender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_txt_studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(student_combo_gender, 0, 231, Short.MAX_VALUE)
                            .addComponent(student_in_studentname)))
                    .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_studentbday, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_schoolname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_in_schoolname, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_schoollocation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_in_schoollocation, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_studentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_in_studentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_studentemail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_in_studentemail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_panel1Layout.createSequentialGroup()
                            .addComponent(student_txt_studentmobile)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_in_studentmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(student_panel1Layout.createSequentialGroup()
                            .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(student_txt_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(student_txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(student_combo_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(student_combo_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(student_panel1Layout.createSequentialGroup()
                            .addComponent(student_btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(student_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(student_btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(student_btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        student_panel1Layout.setVerticalGroup(
            student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_studentname)
                    .addComponent(student_in_studentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_studentgender)
                    .addComponent(student_combo_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(student_date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_txt_studentbday))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_in_studentmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_txt_studentmobile))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_in_studentemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_txt_studentemail))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_in_studentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_txt_studentnumber))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_schoolname)
                    .addComponent(student_in_schoolname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_schoollocation)
                    .addComponent(student_in_schoollocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_branch)
                    .addComponent(student_combo_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_txt_discount)
                    .addComponent(student_combo_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(student_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        student_panel2.setBackground(new java.awt.Color(22, 72, 143));

        student_table.setBackground(new java.awt.Color(153, 204, 255));
        student_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_table.setForeground(new java.awt.Color(0, 0, 0));
        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Birthdate", "Mobile", "Email", "ID Number", "School Name", "Location", "Branch", "Discount"
            }
        ));
        student_scrollpane.setViewportView(student_table);

        student_btn_search.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_search.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_search.setText("Search");
        student_btn_search.setBorder(null);

        student_btn_refresh.setBackground(new java.awt.Color(142, 194, 65));
        student_btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student_btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        student_btn_refresh.setText("Refresh");
        student_btn_refresh.setBorder(null);

        student_in_search.setBackground(new java.awt.Color(255, 255, 255));
        student_in_search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_in_search.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout student_panel2Layout = new javax.swing.GroupLayout(student_panel2);
        student_panel2.setLayout(student_panel2Layout);
        student_panel2Layout.setHorizontalGroup(
            student_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addGroup(student_panel2Layout.createSequentialGroup()
                        .addComponent(student_btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(student_btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(student_in_search)))
                .addContainerGap())
        );
        student_panel2Layout.setVerticalGroup(
            student_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_in_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(student_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tab_studentsLayout = new javax.swing.GroupLayout(tab_students);
        tab_students.setLayout(tab_studentsLayout);
        tab_studentsLayout.setHorizontalGroup(
            tab_studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_studentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(873, Short.MAX_VALUE))
            .addGroup(tab_studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_studentsLayout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(student_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        tab_studentsLayout.setVerticalGroup(
            tab_studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_studentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(tab_studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_studentsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(student_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        main_pane.addTab("Students", tab_students);

        tab_transactions.setBackground(new java.awt.Color(142, 194, 65));

        trans_panel1.setBackground(new java.awt.Color(22, 72, 143));

        trans_txt_studentname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_studentname.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_studentname.setText("Student name:");

        trans_txt_studentnumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_studentnumber.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_studentnumber.setText("Student number:");

        trans_txt_trancheamount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_trancheamount.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_trancheamount.setText("Payment amount:");

        trans_txt_tranchedate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_tranchedate.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_tranchedate.setText("Payment date:");

        trans_txt_discount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_discount.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_discount.setText("Discount:");

        trans_txt_balance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_balance.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_balance.setText("New balance:");

        trans_txt_discountamount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_txt_discountamount.setForeground(new java.awt.Color(255, 255, 255));
        trans_txt_discountamount.setText("Current balance:");

        trans_in_trancheamount.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_trancheamount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_trancheamount.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_trancheamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_trancheamountActionPerformed(evt);
            }
        });

        trans_in_studentnumber.setEditable(false);
        trans_in_studentnumber.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_studentnumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_studentnumber.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_studentnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_studentnumberActionPerformed(evt);
            }
        });

        trans_in_studentname.setEditable(false);
        trans_in_studentname.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_studentname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_studentname.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_studentnameActionPerformed(evt);
            }
        });

        trans_in_discount.setEditable(false);
        trans_in_discount.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_discount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_discount.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_discountActionPerformed(evt);
            }
        });

        trans_in_balance.setEditable(false);
        trans_in_balance.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_balance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_balance.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_balanceActionPerformed(evt);
            }
        });

        trans_in_discountamount.setEditable(false);
        trans_in_discountamount.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_discountamount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_discountamount.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_discountamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_discountamountActionPerformed(evt);
            }
        });

        trans_btn_pay.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_pay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_pay.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_pay.setText("Pay");
        trans_btn_pay.setBorder(null);

        trans_btn_edit.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_edit.setText("Edit");
        trans_btn_edit.setBorder(null);

        trans_btn_update.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_update.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_update.setText("Update");
        trans_btn_update.setBorder(null);
        trans_btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_btn_updateActionPerformed(evt);
            }
        });

        trans_btn_searchUser.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_searchUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_searchUser.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_searchUser.setText("Search User");
        trans_btn_searchUser.setBorder(null);
        trans_btn_searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_btn_searchUserActionPerformed(evt);
            }
        });

        trans_in_searchUser.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_searchUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_searchUser.setForeground(new java.awt.Color(0, 0, 0));
        trans_in_searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_in_searchUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout trans_panel1Layout = new javax.swing.GroupLayout(trans_panel1);
        trans_panel1.setLayout(trans_panel1Layout);
        trans_panel1Layout.setHorizontalGroup(
            trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trans_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(trans_panel1Layout.createSequentialGroup()
                        .addComponent(trans_txt_tranchedate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(trans_date_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(trans_panel1Layout.createSequentialGroup()
                        .addComponent(trans_txt_trancheamount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(trans_in_trancheamount))
                    .addGroup(trans_panel1Layout.createSequentialGroup()
                        .addComponent(trans_txt_discountamount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(trans_in_discountamount))
                    .addGroup(trans_panel1Layout.createSequentialGroup()
                        .addComponent(trans_txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(trans_in_discount))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trans_panel1Layout.createSequentialGroup()
                        .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trans_txt_studentname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(trans_txt_studentnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(trans_btn_searchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trans_in_studentname, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(trans_in_studentnumber)
                            .addComponent(trans_in_searchUser, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                    .addGroup(trans_panel1Layout.createSequentialGroup()
                        .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trans_txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(trans_panel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(trans_btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(trans_panel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(trans_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(trans_btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(trans_in_balance))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        trans_panel1Layout.setVerticalGroup(
            trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trans_panel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_in_searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_btn_searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_txt_studentname)
                    .addComponent(trans_in_studentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_in_studentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_txt_studentnumber))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_in_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_txt_discount))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_in_discountamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_txt_discountamount))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_txt_trancheamount)
                    .addComponent(trans_in_trancheamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trans_date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_txt_tranchedate))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_txt_balance)
                    .addComponent(trans_in_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trans_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        trans_panel2.setBackground(new java.awt.Color(22, 72, 143));

        trans_in_search.setBackground(new java.awt.Color(255, 255, 255));
        trans_in_search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_in_search.setForeground(new java.awt.Color(0, 0, 0));

        trans_table.setBackground(new java.awt.Color(153, 204, 255));
        trans_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trans_table.setForeground(new java.awt.Color(0, 0, 0));
        trans_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID Number", "Discount", "Current balance", "Tranche amount", "Tranche date", "Balance"
            }
        ));
        trans_scrollpane.setViewportView(trans_table);

        trans_btn_search.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_search.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_search.setText("Search");
        trans_btn_search.setBorder(null);

        trans_btn_refresh.setBackground(new java.awt.Color(142, 194, 65));
        trans_btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans_btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        trans_btn_refresh.setText("Refresh");
        trans_btn_refresh.setBorder(null);

        javax.swing.GroupLayout trans_panel2Layout = new javax.swing.GroupLayout(trans_panel2);
        trans_panel2.setLayout(trans_panel2Layout);
        trans_panel2Layout.setHorizontalGroup(
            trans_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trans_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trans_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trans_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addGroup(trans_panel2Layout.createSequentialGroup()
                        .addComponent(trans_btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trans_btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trans_in_search)))
                .addContainerGap())
        );
        trans_panel2Layout.setVerticalGroup(
            trans_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trans_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trans_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_in_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(trans_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tab_transactionsLayout = new javax.swing.GroupLayout(tab_transactions);
        tab_transactions.setLayout(tab_transactionsLayout);
        tab_transactionsLayout.setHorizontalGroup(
            tab_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trans_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trans_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tab_transactionsLayout.setVerticalGroup(
            tab_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trans_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab_transactionsLayout.createSequentialGroup()
                        .addComponent(trans_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        main_pane.addTab("Transactions", tab_transactions);

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(main_panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_pane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setIconImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("RGO_LOGOnew.png"));
        setIconImage(icon.getImage());
    }
    
    private void exitConfirmation(){
        int yesnoExit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the program?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (yesnoExit == JOptionPane.YES_OPTION){
            dispose();
        }else{
            
        }
    }
      
    private void main_panel_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_panel_headerMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_main_panel_headerMouseDragged

    private void main_panel_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_panel_headerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_main_panel_headerMousePressed

    private void student_in_studentemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_studentemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_studentemailActionPerformed

    private void student_in_studentmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_studentmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_studentmobileActionPerformed

    private void student_in_schoollocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_schoollocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_schoollocationActionPerformed

    private void student_in_studentnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_studentnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_studentnumberActionPerformed

    private void student_in_schoolnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_schoolnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_schoolnameActionPerformed

    private void student_in_studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_in_studentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_in_studentnameActionPerformed

    private void trans_in_trancheamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_trancheamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_trancheamountActionPerformed

    private void trans_in_studentnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_studentnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_studentnumberActionPerformed

    private void trans_in_studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_studentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_studentnameActionPerformed

    private void trans_in_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_discountActionPerformed

    private void trans_in_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_balanceActionPerformed

    private void trans_in_discountamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_discountamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_discountamountActionPerformed

    private void trans_btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_btn_updateActionPerformed

    private void student_btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_btn_enterActionPerformed
        // TODO add your handling code here:
        String sql = "insert into student (student_name, student_gender, student_dob, student_mobile, student_email, student_number, school_name, school_location, branch_name, discount_name) values (?,?,?,?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, student_in_studentname.getText());
            pst.setString(2, (String) student_combo_gender.getSelectedItem());
            pst.setString(3, ((JTextField)student_date_chooser.getDateEditor().getUiComponent()).getText());
            pst.setString(4, student_in_studentmobile.getText());
            pst.setString(5, student_in_studentemail.getText());
            pst.setString(6, student_in_studentnumber.getText());
            pst.setString(7, student_in_schoolname.getText());
            pst.setString(8, student_in_schoollocation.getText());
            pst.setString(9, (String) student_combo_branch.getSelectedItem());
            pst.setString(10, (String) student_combo_discount.getSelectedItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Student Information Added!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_student_btn_enterActionPerformed

    private void trans_in_searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_in_searchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_in_searchUserActionPerformed

    private void student_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_btn_editActionPerformed
        // TODO add your handling code here:

        student_in_studentname.setEditable(true);
        student_in_studentmobile.setEditable(true);
        student_in_studentemail.setEditable(true);
        student_in_studentnumber.setEditable(true);
        student_in_schoolname.setEditable(true);
        student_in_schoollocation.setEditable(true);
        student_combo_gender.setEditable(true);
        student_combo_branch.setEditable(true);
        student_combo_discount.setEditable(true);
        JDateChooser student_date_chooser = new JDateChooser();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) student_date_chooser.getDateEditor();
        editor.setEditable(false);
    }//GEN-LAST:event_student_btn_editActionPerformed

    private void trans_btn_searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_btn_searchUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_trans_btn_searchUserActionPerformed

    private void student_btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_btn_updateActionPerformed
        // TODO add your handling code here:
        try{
            String studentVal1 = student_in_studentname.getText();
            String studentVal2 = student_in_studentmobile.getText();
            String studentVal3 = student_in_studentemail.getText();
            String studentVal4 = student_in_studentnumber.getText();
            String studentVal5 = student_in_schoolname.getText();
            String studentVal6 = student_in_schoollocation.getText();
            String studentVal7 = student_combo_gender.getSelectedItem().toString();
            String studentVal8 = student_combo_branch.getSelectedItem().toString();
            String studentVal9 = student_combo_discount.getSelectedItem().toString();
            java.util.Date date = student_date_chooser.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String studentVal10 = sdf.format(date);
            
            String sql = "udpate student set student_name='"+studentVal1+"', student_mobile='"+studentVal2+"', student_email='"+studentVal3+"', student_number='"+studentVal4+"', school_name='"+studentVal5+"', school_location='"+studentVal6+"', student_gender='"+studentVal7+"', branch_name='"+studentVal8+"', discount_name='"+studentVal9+"', student_dob='"+studentVal10+"'"; 
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Student Profile Updated!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_student_btn_updateActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PT_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PT_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PT_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PT_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PT_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel main_logo;
    private javax.swing.JTabbedPane main_pane;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel main_panel_header;
    private javax.swing.JLabel main_title;
    private javax.swing.JButton student_btn_delete;
    private javax.swing.JButton student_btn_edit;
    private javax.swing.JButton student_btn_enter;
    private javax.swing.JButton student_btn_refresh;
    private javax.swing.JButton student_btn_search;
    private javax.swing.JButton student_btn_update;
    private javax.swing.JComboBox<String> student_combo_branch;
    private javax.swing.JComboBox<String> student_combo_discount;
    private javax.swing.JComboBox<String> student_combo_gender;
    private com.toedter.calendar.JDateChooser student_date_chooser;
    private javax.swing.JTextField student_in_schoollocation;
    private javax.swing.JTextField student_in_schoolname;
    private javax.swing.JTextField student_in_search;
    private javax.swing.JTextField student_in_studentemail;
    private javax.swing.JTextField student_in_studentmobile;
    private javax.swing.JTextField student_in_studentname;
    private javax.swing.JTextField student_in_studentnumber;
    private javax.swing.JPanel student_panel1;
    private javax.swing.JPanel student_panel2;
    private javax.swing.JScrollPane student_scrollpane;
    private javax.swing.JTable student_table;
    private javax.swing.JLabel student_txt_branch;
    private javax.swing.JLabel student_txt_discount;
    private javax.swing.JLabel student_txt_schoollocation;
    private javax.swing.JLabel student_txt_schoolname;
    private javax.swing.JLabel student_txt_studentbday;
    private javax.swing.JLabel student_txt_studentemail;
    private javax.swing.JLabel student_txt_studentgender;
    private javax.swing.JLabel student_txt_studentmobile;
    private javax.swing.JLabel student_txt_studentname;
    private javax.swing.JLabel student_txt_studentnumber;
    private javax.swing.JPanel tab_students;
    private javax.swing.JPanel tab_transactions;
    private javax.swing.JButton trans_btn_edit;
    private javax.swing.JButton trans_btn_pay;
    private javax.swing.JButton trans_btn_refresh;
    private javax.swing.JButton trans_btn_search;
    private javax.swing.JButton trans_btn_searchUser;
    private javax.swing.JButton trans_btn_update;
    private com.toedter.calendar.JDateChooser trans_date_chooser;
    private javax.swing.JTextField trans_in_balance;
    private javax.swing.JTextField trans_in_discount;
    private javax.swing.JTextField trans_in_discountamount;
    private javax.swing.JTextField trans_in_search;
    private javax.swing.JTextField trans_in_searchUser;
    private javax.swing.JTextField trans_in_studentname;
    private javax.swing.JTextField trans_in_studentnumber;
    private javax.swing.JTextField trans_in_trancheamount;
    private javax.swing.JPanel trans_panel1;
    private javax.swing.JPanel trans_panel2;
    private javax.swing.JScrollPane trans_scrollpane;
    private javax.swing.JTable trans_table;
    private javax.swing.JLabel trans_txt_balance;
    private javax.swing.JLabel trans_txt_discount;
    private javax.swing.JLabel trans_txt_discountamount;
    private javax.swing.JLabel trans_txt_studentname;
    private javax.swing.JLabel trans_txt_studentnumber;
    private javax.swing.JLabel trans_txt_trancheamount;
    private javax.swing.JLabel trans_txt_tranchedate;
    // End of variables declaration//GEN-END:variables
}
