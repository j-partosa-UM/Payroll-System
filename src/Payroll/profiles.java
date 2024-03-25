/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author yume
 */
public class profiles extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    Statement st = null;
    
    
    /**
     * Creates new form profiles
     */
    public profiles() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        conn = db.connectdb();
        show_profiles();
        currentDate();
        
    }
    
     public void currentDate(){
        
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        label_date.setText((month+1)+"/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        label_time.setText(hour+":"+(minute)+":"+second);
        
    }
     
     
     public void show_profiles(){
         
         DefaultTableModel table = new DefaultTableModel();
         
         table.addColumn("Id");
         table.addColumn("Surname");
         table.addColumn("Firstname");
         table.addColumn("M/I");
         table.addColumn("Gender");
         table.addColumn("Email");
         table.addColumn("Contact Number");
         table.addColumn("Address");
         table.addColumn("Department");
         table.addColumn("Designation");
         table.addColumn("Job Title");
         table.addColumn("Date Hired");
         table.addColumn("Salary");
         table.addColumn("Status");
         
         try{
             String sql = "SELECT * FROM Profile";
             st = conn.createStatement();
             rs = st.executeQuery(sql);
             
             
             while(rs.next()){
             
                 table.addRow(new Object[]{
                 
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14)
             
                });
             
             }
             table_profiles.setModel(table);
             
         } catch(SQLException e){
             JOptionPane.showMessageDialog(null,e);
         }
         
     }
     
     
  /* public ArrayList<Profiles_1> profiles(){
       ArrayList<Profiles_1> profile = new ArrayList<>();
       String sql = "SELECT * FROM Profile";
       try{
      Statement st = conn.createStatement();
       rs = st.executeQuery(sql);
       
     //  Profiles_1 pf;
       while(rs.next()){
           
        pf = new Profiles_1(rs.getString("Id"),
                   rs.getString("surname"),
                   rs.getString("firstname"),
                   rs.getString("email"),
                   rs.getString("cnumber"),
                   rs.getString("address"),
                   rs.getString("department"),
                   rs.getString("designation"),
                   rs.getString("jobtitle"),
                   rs.getString("Salary"),
                   rs.getString("status"));
           
           profile.add(pf);   
       }
       }
       catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,e);
            
        }
        return profile;
       
       }
   
   public void show_profiles(){
       ArrayList<Profiles_1> list = profiles();
       DefaultTableModel model = (DefaultTableModel) table_profiles.getModel();
       Object[] row = new Object[10];
       for(int i=0;i<list.size();i++){
           row[0] = list.get(i).getId();
           row[1] = list.get(i).getSurname();
           row[2] = list.get(i).getFirstname();
           row[3] = list.get(i).getCnumber();
           row[4] = list.get(i).getAddress();
           row[5] = list.get(i).getDept();
           row[6] = list.get(i).getDesignation();
           row[7] = list.get(i).getJobtitle();
           row[8] = list.get(i).getSalary();
           row[9] = list.get(i).getStatus();
           model.addRow(row);
           
      
       }
       
       
   }
     */
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_home = new javax.swing.JLabel();
        button_register2 = new javax.swing.JButton();
        button_profiles = new javax.swing.JButton();
        button_timesheet = new javax.swing.JButton();
        button_allowance = new javax.swing.JButton();
        button_deductions = new javax.swing.JButton();
        button_updatesalary = new javax.swing.JButton();
        button_reports = new javax.swing.JButton();
        button_payment = new javax.swing.JButton();
        button_logout = new javax.swing.JButton();
        label_profile = new javax.swing.JLabel();
        label_searchSurname = new javax.swing.JLabel();
        txt_searchSurname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        label_surname = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        label_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_mInitial = new javax.swing.JTextField();
        label_mInitial = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        label_cnumber = new javax.swing.JLabel();
        txt_cnumber = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        label_address = new javax.swing.JLabel();
        label_dept = new javax.swing.JLabel();
        txt_dept = new javax.swing.JTextField();
        label_designation = new javax.swing.JLabel();
        txt_designation = new javax.swing.JTextField();
        label_gender = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        txt_jobtitle = new javax.swing.JTextField();
        label_jobtitle = new javax.swing.JLabel();
        label_datehired = new javax.swing.JLabel();
        txt_datehired = new javax.swing.JTextField();
        label_salary = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        button_update = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_reset = new javax.swing.JButton();
        label_details = new javax.swing.JLabel();
        label_searchID = new javax.swing.JLabel();
        txt_searchID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_profiles = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        label_date = new javax.swing.JMenu();
        label_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 246, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(1099, 715));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(171, 179, 174));

        label_home.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label_home.setForeground(new java.awt.Color(39, 158, 89));
        label_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/logo_mini.png"))); // NOI18N
        label_home.setText("PayGo");
        label_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_homeMouseClicked(evt);
            }
        });

        button_register2.setBackground(new java.awt.Color(102, 102, 102));
        button_register2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_register2.setForeground(new java.awt.Color(255, 255, 255));
        button_register2.setText("Register Employees");
        button_register2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_register2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_register2.setName(""); // NOI18N
        button_register2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register2ActionPerformed(evt);
            }
        });

        button_profiles.setBackground(new java.awt.Color(102, 102, 102));
        button_profiles.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_profiles.setForeground(new java.awt.Color(255, 255, 255));
        button_profiles.setText("Profiles");
        button_profiles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_profiles.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_profiles.setName(""); // NOI18N
        button_profiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_profilesActionPerformed(evt);
            }
        });

        button_timesheet.setBackground(new java.awt.Color(102, 102, 102));
        button_timesheet.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_timesheet.setForeground(new java.awt.Color(255, 255, 255));
        button_timesheet.setText("Time Sheet");
        button_timesheet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_timesheet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_timesheet.setName(""); // NOI18N
        button_timesheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_timesheetActionPerformed(evt);
            }
        });

        button_allowance.setBackground(new java.awt.Color(102, 102, 102));
        button_allowance.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_allowance.setForeground(new java.awt.Color(255, 255, 255));
        button_allowance.setText("Allowance");
        button_allowance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_allowance.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_allowance.setName(""); // NOI18N
        button_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_allowanceActionPerformed(evt);
            }
        });

        button_deductions.setBackground(new java.awt.Color(102, 102, 102));
        button_deductions.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_deductions.setForeground(new java.awt.Color(255, 255, 255));
        button_deductions.setText("Deductions");
        button_deductions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_deductions.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_deductions.setName(""); // NOI18N
        button_deductions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deductionsActionPerformed(evt);
            }
        });

        button_updatesalary.setBackground(new java.awt.Color(102, 102, 102));
        button_updatesalary.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_updatesalary.setForeground(new java.awt.Color(255, 255, 255));
        button_updatesalary.setText("Update Salary");
        button_updatesalary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_updatesalary.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_updatesalary.setName(""); // NOI18N
        button_updatesalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updatesalaryActionPerformed(evt);
            }
        });

        button_reports.setBackground(new java.awt.Color(102, 102, 102));
        button_reports.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_reports.setForeground(new java.awt.Color(255, 255, 255));
        button_reports.setText("Reports");
        button_reports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_reports.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_reports.setName(""); // NOI18N
        button_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_reportsActionPerformed(evt);
            }
        });

        button_payment.setBackground(new java.awt.Color(102, 102, 102));
        button_payment.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_payment.setForeground(new java.awt.Color(255, 255, 255));
        button_payment.setText("Payment");
        button_payment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_payment.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_payment.setName(""); // NOI18N
        button_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_paymentActionPerformed(evt);
            }
        });

        button_logout.setBackground(new java.awt.Color(51, 51, 51));
        button_logout.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        button_logout.setForeground(new java.awt.Color(255, 255, 255));
        button_logout.setText("LOGOUT");
        button_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_logout.setName(""); // NOI18N
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_home)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(button_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_register2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_profiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_deductions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_allowance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_updatesalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_timesheet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(12, 12, 12)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 708, Short.MAX_VALUE)
                .addComponent(button_logout)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(button_register2)
                    .addGap(18, 18, 18)
                    .addComponent(button_profiles)
                    .addGap(18, 18, 18)
                    .addComponent(button_timesheet)
                    .addGap(18, 18, 18)
                    .addComponent(button_allowance)
                    .addGap(18, 18, 18)
                    .addComponent(button_deductions)
                    .addGap(18, 18, 18)
                    .addComponent(button_updatesalary)
                    .addGap(18, 18, 18)
                    .addComponent(button_reports)
                    .addGap(18, 18, 18)
                    .addComponent(button_payment)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );

        label_profile.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_profile.setForeground(new java.awt.Color(39, 158, 89));
        label_profile.setText("Employees Profile");

        label_searchSurname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_searchSurname.setText("Surname");

        txt_searchSurname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_searchSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchSurnameActionPerformed(evt);
            }
        });
        txt_searchSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchSurnameKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        label_id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_id.setText("ID");

        txt_id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        label_surname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_surname.setText("Surname");

        txt_surname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_surnameActionPerformed(evt);
            }
        });

        label_firstname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_firstname.setText("Firstname");

        txt_firstname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_mInitial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mInitialActionPerformed(evt);
            }
        });

        label_mInitial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_mInitial.setText("M/I");

        label_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_email.setText("Email");

        txt_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        label_cnumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_cnumber.setText("Contact Number");

        txt_cnumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_cnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cnumberActionPerformed(evt);
            }
        });

        txt_address.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        label_address.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_address.setText("Address");

        label_dept.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_dept.setText("Department");

        txt_dept.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deptActionPerformed(evt);
            }
        });

        label_designation.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_designation.setText("Designation");

        txt_designation.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_designationActionPerformed(evt);
            }
        });

        label_gender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_gender.setText("Gender");

        r_male.setBackground(new java.awt.Color(255, 255, 255));
        r_male.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setBackground(new java.awt.Color(255, 255, 255));
        r_female.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        txt_jobtitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_jobtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobtitleActionPerformed(evt);
            }
        });

        label_jobtitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_jobtitle.setText("Job Titile");

        label_datehired.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_datehired.setText("Date Hired");

        txt_datehired.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_datehired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_datehiredActionPerformed(evt);
            }
        });

        label_salary.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_salary.setText("Basic Salary");

        txt_salary.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_status.setText("Status");

        txt_status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });

        button_update.setBackground(new java.awt.Color(39, 158, 89));
        button_update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_update.setText("Update");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        button_delete.setBackground(new java.awt.Color(109, 126, 116));
        button_delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_delete.setForeground(new java.awt.Color(255, 255, 255));
        button_delete.setText("Delete");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_reset.setBackground(new java.awt.Color(153, 153, 153));
        button_reset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_reset.setForeground(new java.awt.Color(255, 255, 255));
        button_reset.setText("Reset");
        button_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(button_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_delete)
                        .addGap(14, 14, 14)
                        .addComponent(button_reset))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(label_id)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(label_firstname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_mInitial)
                                        .addComponent(label_gender))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(r_male)
                                            .addGap(18, 18, 18)
                                            .addComponent(r_female))
                                        .addComponent(txt_mInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_surname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_designation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_dept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_address)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_cnumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_jobtitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_jobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_datehired)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_datehired, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label_salary)
                                .addGap(18, 18, 18)
                                .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_jobtitle)
                    .addComponent(txt_jobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_surname)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cnumber)
                    .addComponent(txt_cnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_datehired)
                    .addComponent(txt_datehired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_firstname)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_address)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_salary)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_mInitial)
                    .addComponent(txt_mInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dept)
                    .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_status)
                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_designation)
                        .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_gender)
                        .addComponent(r_male)
                        .addComponent(r_female)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_delete)
                    .addComponent(button_reset)
                    .addComponent(button_update))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        label_details.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label_details.setText("Details");

        label_searchID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_searchID.setText("Employee ID");

        txt_searchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchIDKeyReleased(evt);
            }
        });

        table_profiles.setAutoCreateRowSorter(true);
        table_profiles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table_profiles.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        table_profiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Surname", "Firstname", "M/I", "Gender", "Email", "Contact Number", "Address", "Department", "Designation", "Job Titile", "Date Hired", "Salary", "Status"
            }
        ));
        table_profiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_profilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_profiles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_profile)
                            .addComponent(label_details))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(478, 478, 478)
                                .addComponent(label_searchID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_searchID, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_searchSurname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_searchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_profile)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_searchID))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_searchSurname)
                        .addComponent(txt_searchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        label_date.setText("Date");
        jMenuBar1.add(label_date);

        label_time.setText("Time");
        jMenuBar1.add(label_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchSurnameKeyReleased
        // TODO add your handling code here:
        
        try{
            
            String sql = "SELECT * FROM Profile where surname=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_searchSurname.getText());
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                txt_id.setText(rs.getString("Id"));
                txt_surname.setText(rs.getString("surname"));
                txt_firstname.setText(rs.getString("firstname"));
                txt_mInitial.setText(rs.getString("mInitial"));
                txt_email.setText(rs.getString("email"));
                txt_cnumber.setText(rs.getString("cnumber"));
                txt_address.setText(rs.getString("address"));
                txt_dept.setText(rs.getString("department"));
                txt_designation.setText(rs.getString("designation"));
                txt_jobtitle.setText(rs.getString("jobtitle"));
                txt_datehired.setText(rs.getString("dhired"));
                txt_salary.setText(rs.getString("Salary"));
                txt_status.setText(rs.getString("status"));
                
                String sex = rs.getString("gender");
                if(sex.equals("Male")){
                r_male.setSelected(true);
                r_female.setSelected(false);
                
                } else if(sex.equals("Female")){
                    r_female.setSelected(true);
                    r_male.setSelected(false);
                }
                
            }
            
            
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        
        
    }//GEN-LAST:event_txt_searchSurnameKeyReleased

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_surnameActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_mInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mInitialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mInitialActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_cnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cnumberActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deptActionPerformed

    private void txt_designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_designationActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:
        
        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
        
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:
        
        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
        
    }//GEN-LAST:event_r_femaleActionPerformed

    private void txt_jobtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobtitleActionPerformed

    private void txt_datehiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_datehiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_datehiredActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        // TODO add your handling code here:
        
         try{
                String sql ="delete from Profile where id=? ";
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.execute();
                
                String sq ="delete from Overall where id=? ";
                pst1=conn.prepareStatement(sq);
                pst1.setString(1, txt_id.getText());
                pst1.execute();

                JOptionPane.showMessageDialog(null,"Record Deleted");

            }catch(SQLException e){

                JOptionPane.showMessageDialog(null, e);
            }finally {

                try{
                    pst.close();
                    pst1.close();

                }
                catch(SQLException e){

                }
            }
        
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resetActionPerformed
        // TODO add your handling code here:
        
        txt_surname.setText("");
        txt_firstname.setText("");
        txt_mInitial.setText("");
        txt_email.setText("");
        txt_cnumber.setText("");
        txt_address.setText("");
        txt_dept.setText("");
        txt_designation.setText("");
        txt_jobtitle.setText("");
        txt_datehired.setText("");
        txt_salary.setText("");
        txt_status.setText("");
        txt_id.setText("");
        txt_searchSurname.setText("");
        txt_searchID.setText("");
        r_male.setSelected(false);
        r_female.setSelected(false);
        
        
    }//GEN-LAST:event_button_resetActionPerformed

    private void label_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_homeMouseClicked

    private void txt_searchSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchSurnameActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void table_profilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_profilesMouseClicked
        // TODO add your handling code here:
        
        int i = table_profiles.getSelectedRow();
        TableModel model = table_profiles.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_surname.setText(model.getValueAt(i, 1).toString());
        txt_firstname.setText(model.getValueAt(i, 2).toString());
        txt_mInitial.setText(model.getValueAt(i, 3).toString());
        txt_email.setText(model.getValueAt(i, 5).toString());
        txt_cnumber.setText(model.getValueAt(i, 6).toString());
        txt_address.setText(model.getValueAt(i, 7).toString());
        txt_dept.setText(model.getValueAt(i, 8).toString());
        txt_designation.setText(model.getValueAt(i, 9).toString());
        txt_jobtitle.setText(model.getValueAt(i,10).toString());
        txt_datehired.setText(model.getValueAt(i,11).toString());
        txt_salary.setText(model.getValueAt(i,12).toString());
        txt_status.setText(model.getValueAt(i, 13).toString());
        
        String sex = model.getValueAt(i, 4).toString();
                if(sex.equals("Male")){
                r_male.setSelected(true);
                r_female.setSelected(false);
                } else{
                    r_female.setSelected(true);
                    r_male.setSelected(false);
                }
        int srow = table_profiles.getSelectedRow();
        
        
    }//GEN-LAST:event_table_profilesMouseClicked

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String val = txt_surname.getText();
            String val2 = txt_firstname.getText();
            String val3 = txt_mInitial.getText();
            String val4 = txt_email.getText();
            String val5 = txt_cnumber.getText();
            String val6 = txt_address.getText();
            String val7 = txt_dept.getText();
            String val8 = txt_designation.getText();
            String val9 = txt_jobtitle.getText();
            String val10 = txt_datehired.getText();
            String val11 = txt_salary.getText();
            String val12 = txt_status.getText();
            String val13 = txt_id.getText();
            
            String sql = "UPDATE Profile set surname = '"+val+"', firstname = '"+val2+"',"
                    + "mInitial = '"+val3+"', email = '"+val4+"', cnumber = '"+val5+"',"
                    + "address = '"+val6+"', department = '"+val7+"', designation = '"+val8+"',"
                    + "jobtitle = '"+val9+"', dhired = '"+val10+"', Salary = '"+val11+"',"
                    + "status = '"+val12+"' where id = '"+val13+"' ";
            
            String sq = "UPDATE Overall set Id = '"+val13+"', surname = '"+val+"', firstname = '"+val2+"'"
                    + "where surname = '"+val+"'";
            
            pst = conn.prepareStatement(sql);
            pst1 = conn.prepareStatement(sq);
            pst.execute();
            pst1.execute();
           
            JOptionPane.showMessageDialog(null,"Updated Successfully!");
            
            
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_button_updateActionPerformed

    private void button_register2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register2ActionPerformed
        // TODO add your handling code here:

        register j = new register();
        j.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button_register2ActionPerformed

    private void button_profilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_profilesActionPerformed
        // TODO add your handling code here:

        profiles j = new profiles();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_profilesActionPerformed

    private void button_timesheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_timesheetActionPerformed
        // TODO add your handling code here:

        timesheet j = new timesheet();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_timesheetActionPerformed

    private void button_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_allowanceActionPerformed
        // TODO add your handling code here:

        allowance j = new allowance();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_allowanceActionPerformed

    private void button_deductionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deductionsActionPerformed
        // TODO add your handling code here:

        deduction j = new deduction();
        j.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button_deductionsActionPerformed

    private void button_updatesalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updatesalaryActionPerformed
        // TODO add your handling code here:
        update_salary j = new update_salary();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_updatesalaryActionPerformed

    private void button_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_reportsActionPerformed
        // TODO add your handling code here:
        reports j = new reports();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_reportsActionPerformed

    private void button_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_paymentActionPerformed
        // TODO add your handling code here:

        payment j = new payment();
        j.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button_paymentActionPerformed

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        // TODO add your handling code here:

        login x = new login();
        x.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button_logoutActionPerformed

    private void txt_searchIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchIDKeyReleased
        // TODO add your handling code here:

        try{

            String sql ="select * from Profile where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_searchID.getText());
            rs=pst.executeQuery();

            while(rs.next()){
                
                txt_id.setText(rs.getString("Id"));
                txt_surname.setText(rs.getString("surname"));
                txt_firstname.setText(rs.getString("firstname"));
                txt_mInitial.setText(rs.getString("mInitial"));
                txt_email.setText(rs.getString("email"));
                txt_cnumber.setText(rs.getString("cnumber"));
                txt_address.setText(rs.getString("address"));
                txt_dept.setText(rs.getString("department"));
                txt_designation.setText(rs.getString("designation"));
                txt_jobtitle.setText(rs.getString("jobtitle"));
                txt_datehired.setText(rs.getString("dhired"));
                txt_salary.setText(rs.getString("Salary"));
                txt_status.setText(rs.getString("status"));
                
                String sex = rs.getString("gender");
                if(sex.equals("Male")){
                r_male.setSelected(true);
                r_female.setSelected(false);
                } else{
                    r_male.setSelected(false);
                r_female.setSelected(true);
                }

            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(SQLException e){

            }
        }

    }//GEN-LAST:event_txt_searchIDKeyReleased

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_allowance;
    private javax.swing.JButton button_deductions;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_payment;
    private javax.swing.JButton button_profiles;
    private javax.swing.JButton button_register2;
    private javax.swing.JButton button_reports;
    private javax.swing.JButton button_reset;
    private javax.swing.JButton button_timesheet;
    private javax.swing.JButton button_update;
    private javax.swing.JButton button_updatesalary;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_cnumber;
    private javax.swing.JMenu label_date;
    private javax.swing.JLabel label_datehired;
    private javax.swing.JLabel label_dept;
    private javax.swing.JLabel label_designation;
    private javax.swing.JLabel label_details;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_firstname;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_home;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_jobtitle;
    private javax.swing.JLabel label_mInitial;
    private javax.swing.JLabel label_profile;
    private javax.swing.JLabel label_salary;
    private javax.swing.JLabel label_searchID;
    private javax.swing.JLabel label_searchSurname;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel label_surname;
    private javax.swing.JMenu label_time;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTable table_profiles;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_cnumber;
    private javax.swing.JTextField txt_datehired;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jobtitle;
    private javax.swing.JTextField txt_mInitial;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_searchID;
    private javax.swing.JTextField txt_searchSurname;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables

private String gender;

}
