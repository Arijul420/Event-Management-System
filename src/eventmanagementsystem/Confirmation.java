package eventmanagementsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SOUVON
 */
public class Confirmation extends javax.swing.JFrame {
    String oID="%",no="%",cID="%",date="%",time="%",tot="%",query;
    /**
     * Creates new form Confirmation
     */
    public Confirmation() {
        initComponents();
        query="SELECT * FROM ConfirmedOrders";
        getOrders();
    }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cidtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ntf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        oidtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ttf = new javax.swing.JTextField();
        max = new rojerusan.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        ott = new javax.swing.JTable();
        jdc1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        otc = new javax.swing.JComboBox<>();
        sort1 = new rojerusan.RSButtonMetro();
        jLabel9 = new javax.swing.JLabel();
        sc = new javax.swing.JComboBox<>();
        max1 = new rojerusan.RSButtonMetro();
        max2 = new rojerusan.RSButtonMetro();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(238, 82, 83));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmed Orders");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Customer ID");

        cidtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Order ID");

        ntf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Amount");

        oidtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Bill No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date");

        ttf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        max.setText("Max");
        max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxActionPerformed(evt);
            }
        });

        ott.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Order_Id", "Cus_ID", "Total", "Date", "Time", "Res_Name", "Res_ID", "Event Address"
            }
        ));
        ott.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ottMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ott);

        jLabel8.setText("Order Type");

        otc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "House Event", "Outdoor Event" }));
        otc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otcActionPerformed(evt);
            }
        });

        sort1.setText("Search");
        sort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sort1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Sorting Order");

        sc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Ascending", "Descending" }));
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });

        max1.setText("Sort");
        max1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max1ActionPerformed(evt);
            }
        });

        max2.setText("Back");
        max2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max2ActionPerformed(evt);
            }
        });

        jButton1.setText("View Top Customers and Restaurants");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(max2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sort1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ttf)
                    .addComponent(ntf)
                    .addComponent(oidtf)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cidtf))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdc1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sort1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxActionPerformed
        // TODO add your handling code here:
        if(otc.getSelectedItem().toString().equals("House Event"))
        query="Select *from ConfirmedOrders where TotalAmount = (Select Max(TotalAmount) from ConfirmedOrders) and Res_ID is Null";
        else if(otc.getSelectedItem().toString().equals("Outdoor Event"))
            query="Select *from ConfirmedOrders where TotalAmount = (Select Max(TotalAmount) from ConfirmedOrders) and Res_ID is not Null";
        else
            query="Select *from ConfirmedOrders where TotalAmount = (Select Max(TotalAmount) from ConfirmedOrders)";
        
        
            
        getOrders();
    }//GEN-LAST:event_maxActionPerformed

    private void ntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntfActionPerformed

    private void otcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otcActionPerformed

    private void sort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sort1ActionPerformed
        // TODO add your handling code here:
       if(otc.getSelectedItem().toString().equals("Any")){
        if(!(cidtf.getText().isEmpty()))
           cID=cidtf.getText();
       if(!(oidtf.getText().isEmpty()))
           oID=oidtf.getText();
       if(!(ntf.getText().isEmpty()))
           no=ntf.getText();
       if(!(ttf.getText().isEmpty()))
           tot=ttf.getText();
       if(jdc1.getDate()!=null)
       {
           SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
           date=sdf.format(jdc1.getDate());
       }
       else
           date="%";
       
       query="Select * from ConfirmedOrders where Bill_No like '"+no+"' and Order_ID like '"+oID+"' and C_ID like '"+cID+"' and TotalAmount like '"+tot+"' and O_Date like '"+date+"'";
          
       }
       else
       {    
           if(otc.getSelectedItem().toString().equals("House Event"))
           query="Select * from ConfirmedOrders where Res_ID is null";
           else
               query="Select * from ConfirmedOrders where Res_ID is not null";
       }
       getOrders();
        
          
    }//GEN-LAST:event_sort1ActionPerformed

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scActionPerformed

    private void max1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max1ActionPerformed
        // TODO add your handling code here:
       String o=sc.getSelectedItem().toString();
       if(o.equals("Ascending"))
           o="Asc";
       else
           o="Desc";
       query="Select *from ConfirmedOrders order by TotalAmount "+o;
       getOrders();
    }//GEN-LAST:event_max1ActionPerformed

    private void ottMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ottMouseClicked
        // TODO add your handling code here:
        int n=ott.getSelectedRow();
        TableModel Model = ott.getModel();
        String oid=Model.getValueAt(n,1).toString();
        new AssignedEmployee(oid).setVisible(true);
    }//GEN-LAST:event_ottMouseClicked

    private void max2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminPanel().setVisible(true);
    }//GEN-LAST:event_max2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TopCustomersAndRestaurants().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public ArrayList<ConfirmedOrders> PrOList(){
        ArrayList<ConfirmedOrders> PreviousOrderList=new ArrayList<>();
        sqlConnect co = new sqlConnect();
        co.connectDB();
       
      
        
        try {
           
            
           
            co.resultSet = co.statement.executeQuery(query);
            ConfirmedOrders CO;

            while (co.resultSet.next()) {
                CO=new ConfirmedOrders(co.resultSet.getString("O_Date"),co.resultSet.getString("O_Time"),co.resultSet.getString("Event_address"),co.resultSet.getString("Res_Name"),co.resultSet.getInt("Bill_No"),co.resultSet.getInt("Res_ID"),co.resultSet.getInt("Order_ID"),co.resultSet.getInt("C_ID"),co.resultSet.getInt("TotalAmount"));
                PreviousOrderList.add(CO);
                
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return PreviousOrderList;
    }
    public void getOrders()
    {
        ArrayList<ConfirmedOrders>list=PrOList();
        DefaultTableModel model = (DefaultTableModel) ott.getModel();
        model.setRowCount(0);
        Object[] row =new Object[9];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getBill_no();
            row[1]=list.get(i).getOrderID();
            row[2]=list.get(i).getCustomerID();
            row[3]=list.get(i).getTotalAmount();
            row[4]=list.get(i).getOrderDate();
            row[5]=list.get(i).getOrderTime();
            row[6]=list.get(i).getRes_name();
            row[7]=list.get(i).getRes_id();
            row[8]=list.get(i).getEventAddress();
            
            model.addRow(row);
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cidtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc1;
    private rojerusan.RSButtonMetro max;
    private rojerusan.RSButtonMetro max1;
    private rojerusan.RSButtonMetro max2;
    private javax.swing.JTextField ntf;
    private javax.swing.JTextField oidtf;
    private javax.swing.JComboBox<String> otc;
    private javax.swing.JTable ott;
    private javax.swing.JComboBox<String> sc;
    private rojerusan.RSButtonMetro sort1;
    private javax.swing.JTextField ttf;
    // End of variables declaration//GEN-END:variables
}
