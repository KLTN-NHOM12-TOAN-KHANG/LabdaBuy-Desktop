package com.kltn.nhom12.LambdaBuyDesktop.gui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.example.kltn.SpringAPILambdaBuy.entities.UserEntity;
import com.kltn.nhom12.LambdaBuyDesktop.action.ChangeDisplayController;
import com.kltn.nhom12.LambdaBuyDesktop.bean.MenuBean;

public class MainFrm extends JFrame {

//	public static void main(String[] args) {
//		MainFrm mainfrm = new MainFrm();
//		mainfrm.setVisible(true);
//	}
    /**
     * Creates new form MainFrm
     */
    public MainFrm(UserResponseDto user) {
        initComponents();
        
        setTitle("LAMBDABUY");
        ChangeDisplayController controller = new ChangeDisplayController(jpnView);
        controller.setView(jpnHome, jlbHome);
        
        List<MenuBean> listItem = new ArrayList<>();
        listItem.add(new MenuBean("HomePage", jpnHome, jlbHome));
        listItem.add(new MenuBean("ProductManagement", jpnProductManagement, jlbProductManagement));
        listItem.add(new MenuBean("CategoryManagement", jpnCategoryManagement, jlbCategoryManagement));
        listItem.add(new MenuBean("UserManagement", jpnUserManagement, jlbUserManagement));
        listItem.add(new MenuBean("OrderManagement", jpnOrderManagement, jlbOrderManagement));
        listItem.add(new MenuBean("StatisticManagement", jpnStatisticManagement, jlbStatisticManagement));


        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnProductManagement = new javax.swing.JPanel();
        jlbProductManagement = new javax.swing.JLabel();
        jpnCategoryManagement = new javax.swing.JPanel();
        jlbCategoryManagement = new javax.swing.JLabel();
        jpnUserManagement = new javax.swing.JPanel();
        jlbUserManagement = new javax.swing.JLabel();
        jpnStatisticManagement = new javax.swing.JPanel();
        jlbStatisticManagement = new javax.swing.JLabel();
        jpnOrderManagement = new javax.swing.JPanel();
        jlbOrderManagement = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setName(""); // NOI18N

        jpnHome.setBackground(new java.awt.Color(232, 64, 60));

        jlbHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHome.setText("LAMBDABUY");

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnProductManagement.setBackground(new java.awt.Color(70, 175, 80));

        jlbProductManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbProductManagement.setForeground(new java.awt.Color(255, 255, 255));
        jlbProductManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbProductManagement.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jpnQLSanphamLayout = new javax.swing.GroupLayout(jpnProductManagement);
        jpnProductManagement.setLayout(jpnQLSanphamLayout);
        jpnQLSanphamLayout.setHorizontalGroup(
            jpnQLSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLSanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProductManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLSanphamLayout.setVerticalGroup(
            jpnQLSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLSanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProductManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnCategoryManagement.setBackground(new java.awt.Color(70, 175, 80));

        jlbCategoryManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCategoryManagement.setForeground(new java.awt.Color(255, 255, 255));
        jlbCategoryManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCategoryManagement.setText("QUẢN LÝ DANH MỤC");

        javax.swing.GroupLayout jpnQlDanhmucLayout = new javax.swing.GroupLayout(jpnCategoryManagement);
        jpnCategoryManagement.setLayout(jpnQlDanhmucLayout);
        jpnQlDanhmucLayout.setHorizontalGroup(
            jpnQlDanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQlDanhmucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCategoryManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQlDanhmucLayout.setVerticalGroup(
            jpnQlDanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQlDanhmucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCategoryManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnUserManagement.setBackground(new java.awt.Color(70, 175, 80));

        jlbUserManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbUserManagement.setForeground(new java.awt.Color(255, 255, 255));
        jlbUserManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbUserManagement.setText("QUẢN LÝ NGƯỜI DÙNG");

        javax.swing.GroupLayout jpnQLNguoidungLayout = new javax.swing.GroupLayout(jpnUserManagement);
        jpnUserManagement.setLayout(jpnQLNguoidungLayout);
        jpnQLNguoidungLayout.setHorizontalGroup(
            jpnQLNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnQLNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLNguoidungLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jlbUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jpnQLNguoidungLayout.setVerticalGroup(
            jpnQLNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(jpnQLNguoidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLNguoidungLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        jpnStatisticManagement.setBackground(new java.awt.Color(70, 175, 80));

        jlbStatisticManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbStatisticManagement.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatisticManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStatisticManagement.setText("QUẢN LÝ THỐNG KÊ");

        javax.swing.GroupLayout jpnQLThongkeLayout = new javax.swing.GroupLayout(jpnStatisticManagement);
        jpnStatisticManagement.setLayout(jpnQLThongkeLayout);
        jpnQLThongkeLayout.setHorizontalGroup(
            jpnQLThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnQLThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLThongkeLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jlbStatisticManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jpnQLThongkeLayout.setVerticalGroup(
            jpnQLThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jpnQLThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLThongkeLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbStatisticManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        jpnOrderManagement.setBackground(new java.awt.Color(70, 175, 80));

        jlbOrderManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbOrderManagement.setForeground(new java.awt.Color(255, 255, 255));
        jlbOrderManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbOrderManagement.setText("QUẢN LÝ ĐƠN HÀNG");

        javax.swing.GroupLayout jpnQLDonhangLayout = new javax.swing.GroupLayout(jpnOrderManagement);
        jpnOrderManagement.setLayout(jpnQLDonhangLayout);
        jpnQLDonhangLayout.setHorizontalGroup(
            jpnQLDonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnQLDonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLDonhangLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jlbOrderManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jpnQLDonhangLayout.setVerticalGroup(
            jpnQLDonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jpnQLDonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQLDonhangLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbOrderManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("KHÓA LUẬN TỐT NGHIỆP - NHÓM 12");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnProductManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnCategoryManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnStatisticManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnOrderManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnProductManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCategoryManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnOrderManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStatisticManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnRoot.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm(new UserResponseDto()).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbOrderManagement;
    private javax.swing.JLabel jlbUserManagement;
    private javax.swing.JLabel jlbStatisticManagement;
    private javax.swing.JLabel jlbCategoryManagement;
    private javax.swing.JLabel jlbProductManagement;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnOrderManagement;
    private javax.swing.JPanel jpnUserManagement;
    private javax.swing.JPanel jpnProductManagement;
    private javax.swing.JPanel jpnStatisticManagement;
    private javax.swing.JPanel jpnCategoryManagement;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration         
}