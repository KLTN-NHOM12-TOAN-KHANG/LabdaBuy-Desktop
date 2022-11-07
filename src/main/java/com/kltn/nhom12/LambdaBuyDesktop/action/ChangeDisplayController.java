package com.kltn.nhom12.LambdaBuyDesktop.action;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kltn.nhom12.LambdaBuyDesktop.bean.MenuBean;
import com.kltn.nhom12.LambdaBuyDesktop.gui.UserManagementPanel;

public class ChangeDisplayController {
	private JPanel root ;
    public String kindSelected = "";
    
    private List<MenuBean> listItem = null;

    public ChangeDisplayController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "UserManagement";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
//        JPanel node = new QLSanPhamPanel();
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<MenuBean> listItem){
        this.listItem = listItem;
        for(MenuBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
		public void mouseClicked(MouseEvent e) {
			switch(kind){
			case "HomePage":
//				node = new PageHomePanel();
				break;
//            case "ProductManagement":
//                try {
////					node = new ProductManagementPanel();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//                break;
//            case "CategoryManagement":
//                try {
////					node = new CategoryManagementPanel();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//                break;
//            case "OrderManagement":
//                try {
////					node = new OrderManagementPanel();
//				} catch (IOException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//                break;
            case "UserManagement":
                node = new UserManagementPanel();
                break;
//            case "QLThongKe":
//                node = new StatisticManagementPanel();
//                break;
            default:
                break;
        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
        setChangeBackground(kind);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(76,175,80));
                jlbItem.setBackground(new Color(76,175,80));
            }
		}

		private void setChangeBackground(String kind){
	        for(MenuBean item: listItem){
	            if(item.getKind().equalsIgnoreCase(kind)){
	                item.getJpn().setBackground(new Color(96,100,191));
	                item.getJlb().setBackground(new Color(96,100,191));
	            }else{
	                item.getJpn().setBackground(new Color(76,175,80));
	                item.getJlb().setBackground(new Color(76,175,80));
	            }
	        }
	    }
    }
}
