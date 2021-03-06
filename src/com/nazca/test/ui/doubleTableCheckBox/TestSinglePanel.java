/*
 * TestSinglePanel.java
 * 
 * Copyright(c) 2007-2016 by Yingzhi Tech
 * All Rights Reserved
 * 
 * Created at 2016-10-14 16:08:51
 */
package com.nazca.test.ui.doubleTableCheckBox;

import com.nazca.test.listener.AgentListener;
import com.nazca.test.agent.GetInviteCodeAgent;
import com.nazca.test.common.PopMenu;
import com.nazca.test.listener.CheckBoxTableIsCheckedListener;
import com.nazca.test.model.CheckableItem;
import com.nazca.test.model.InviteCodeTableModel;
import com.nazca.test.pojo.InviteCode;
import com.nazca.test.renderer.SingleStudentTableRenderer;
import com.nazca.test.renderer.TableCheckBoxCellEditor;
import com.nazca.test.renderer.TableCheckBoxHeaderRenderer;
import com.nazca.test.util.ComparatorTool;
import com.nazca.ui.NWaitingPanel;
import com.nazca.ui.UIUtilities;
import com.nazca.ui.laf.border.IconLabelBorder;
import com.nazca.ui.util.CardLayoutWrapper;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 赵洪坤 <zhaohongkun@yzhtech.com>
 */
public class TestSinglePanel extends javax.swing.JPanel {

    private InviteCodeTableModel inviteCodeTableModel = null;
    private final TableCheckBoxCellEditor tableCheckBoxCellEditor = new TableCheckBoxCellEditor();
    private TableCheckBoxHeaderRenderer tableCheckBoxHeaderRenderer = null;
    private TableRowSorter<TableModel> rowSorter = null;
    private GetInviteCodeAgent getAgent = null;
    private SingleStudentTableRenderer tableRenderer = null;
    private IconLabelBorder leftBorder = null;
    private IconLabelBorder rightBorder = null;
    private CardLayoutWrapper rightCard = null;
    private CheckableItem<InviteCode> inviteCode;

    /**
     * Creates new form TestOnePanel
     */
    public TestSinglePanel() {
        initComponents();
        initUI();
        initModel();
        initListener();
        getAgent.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rightPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        nWaitingPanel1 = new com.nazca.ui.NWaitingPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setResizeWeight(0.8);

        leftPanel.setPreferredSize(new java.awt.Dimension(1000, 100));
        leftPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        leftPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setPreferredSize(new java.awt.Dimension(400, 100));
        rightPanel.setLayout(new java.awt.CardLayout());

        contentPanel.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        rightPanel.add(contentPanel, "CONTENT");
        rightPanel.add(nWaitingPanel1, "WAIT");

        jSplitPane1.setRightComponent(rightPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void initUI() {
        leftBorder = new IconLabelBorder(getClass().getResource(//左右面板标题
                "/com/nazca/test/res/32.png"), "信息列表");
        leftPanel.setBorder(leftBorder);
        rightBorder = new IconLabelBorder(getClass().getResource(
                "/com/nazca/test/res/32.png"), "详细信息");
        rightPanel.setBorder(rightBorder);
        rightCard = new CardLayoutWrapper(rightPanel);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {//鼠标右键单击
            new PopMenu<InviteCode>(jTable1, tableCheckBoxHeaderRenderer).show(evt.getX(), evt.getY());
        } else if (UIUtilities.isLeftDoubleClick(evt)) {
        }

//        if (SwingUtilities.isRightMouseButton(evt)) {
//            selectMenuItem.setEnabled(isSelectAbled());
//            cancelSelectMenuItem.setEnabled(isCancelSelectAbled());
//            selectAllMenuItem1.setEnabled(isSelectAllAbled());
//            cancelSelectAllMenuItem.setEnabled(isCancelSelectAllAbled());
//            popMenu.show(jTable1, evt.getX(), evt.getY());
//        } else if (UIUtilities.isLeftDoubleClick(evt)) {
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

//    private boolean isSelectAbled() {
//        for (int i : jTable1.getSelectedRows()) {
//            int index = jTable1.convertRowIndexToModel(i);
//            CheckableItem<InviteCode> item = inviteCodeTableModel.getData(index);
//            if (!item.isChecked()) {
//                return true;
//            }
//        }
//        return false;
//    }
//    private boolean isCancelSelectAbled() {
//        for (int i : jTable1.getSelectedRows()) {
//            int index = jTable1.convertRowIndexToModel(i);
//            CheckableItem<InviteCode> item = inviteCodeTableModel.getData(index);
//            if (item.isChecked()) {
//                return true;
//            }
//        }
//        return false;
//    }
//    private boolean isSelectAllAbled() {
//        for (CheckableItem<InviteCode> item : inviteCodeTableModel.getDatas()) {
//            if (item.isChecked() == false) {
//                return true;
//            }
//        }
//        return false;
//    }
//    private boolean isCancelSelectAllAbled() {
//        for (CheckableItem<InviteCode> item : inviteCodeTableModel.getDatas()) {
//            if (item.isChecked() == true) {
//                return true;
//            }
//        }
//        return false;
//    }
    private void initListener() {

        getAgent = new GetInviteCodeAgent();
        getAgent.addListener(queryListener);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    rightCard.show(CardLayoutWrapper.CONTENT);//切换面板
                    int selectedCount = jTable1.getSelectedRowCount();
                    if (selectedCount == 1) {
                        int index = jTable1.getSelectedRow();
                        if (index >= 0) {
                            index = jTable1.convertRowIndexToModel(index);
                            inviteCode = inviteCodeTableModel.getData(index);
                            jTextField1.setText(inviteCode.getItem().getInviteCode());
                            jTextField2.setText(inviteCode.getItem().getMobile());
                        }
                    } else if (selectedCount > 1) {
                        //TODO
//                        int[] rows=studentTableComp.getSelectedRows();
//                        studentTableComp.getSelectionModel().get;
                        nWaitingPanel1.setIndeterminate(true);
                        nWaitingPanel1.showWaitingMode();
                        rightCard.show(CardLayoutWrapper.WAIT);
                        nWaitingPanel1.showMsgMode("请选择一行数据", 0, NWaitingPanel.MSG_MODE_INFO);
                    } else {
                        //TODO
                        nWaitingPanel1.setIndeterminate(true);
                        nWaitingPanel1.showWaitingMode();
                        rightCard.show(CardLayoutWrapper.WAIT);
                        nWaitingPanel1.showMsgMode("请选择一行数据", 0, NWaitingPanel.MSG_MODE_INFO);
//                        jTable1.getSelectionModel().setSelectionInterval(0, 0);
                    }
                }
            }
        });
        inviteCodeTableModel.addListener(new CheckBoxTableIsCheckedListener() {
            @Override
            public void checkStateChanged(boolean checked) {
            }

            @Override
            public void updateCheckedCount(int count) {
                if (count == inviteCodeTableModel.getRowCount() && count > 0) {
                    tableCheckBoxCellEditor.stopCellEditing();
                    tableCheckBoxHeaderRenderer.setSelected(true);
                    revalidate();
                    repaint();
                } else {
                    List<CheckableItem<InviteCode>> checkedDataList = new ArrayList<>();
                    checkedDataList.addAll(inviteCodeTableModel.getCheckedItemList());
                    tableCheckBoxHeaderRenderer.setSelected(false);
                    List<Integer> list = new ArrayList<>();
                    for (CheckableItem<InviteCode> inviteCode1 : checkedDataList) {
                        list.add(inviteCodeTableModel.getDataRow(inviteCode1));
                    }
                    for (int idx : list) {
                        inviteCodeTableModel.setValueAt(true, idx, 0);
                    }
                    revalidate();
                    repaint();
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel leftPanel;
    private com.nazca.ui.NWaitingPanel nWaitingPanel1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
     private void initModel() {
        inviteCodeTableModel = new InviteCodeTableModel();
        jTable1.setModel(inviteCodeTableModel);
        tableRenderer = new SingleStudentTableRenderer();
        jTable1.setDefaultRenderer(Object.class, tableRenderer);
        inviteCodeTableModel.initTblHeaderWidth(jTable1);
//        jTable1.getColumnModel().getColumn(inviteCodeTableModel.INVITE_CODE).setCellRenderer(new CenterTableRenderer());
        UIUtilities.setTableColumnFixedSize(jTable1, inviteCodeTableModel.CHECK_BOX, 24);
        jTable1.getColumnModel().getColumn(inviteCodeTableModel.CHECK_BOX).setCellRenderer(tableCheckBoxCellEditor);
        tableCheckBoxHeaderRenderer = new TableCheckBoxHeaderRenderer(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                tableCheckBoxCellEditor.stopCellEditing();
                Object source = e.getSource();
                if (source instanceof AbstractButton == false) {
                    return;
                }
                boolean checked = e.getStateChange() == ItemEvent.SELECTED;
                for (int i = 0; i < inviteCodeTableModel.getRowCount(); i++) {
                    inviteCodeTableModel.setValueAt(checked, i, 0);
                }
            }
        }, jTable1);
        jTable1.getColumnModel().getColumn(inviteCodeTableModel.CHECK_BOX).setHeaderRenderer(
                tableCheckBoxHeaderRenderer);
        rowSorter = UIUtilities.generateAndSetTriStateRowSorter(jTable1, inviteCodeTableModel);
        jTable1.setRowSorter(rowSorter);
        rowSorter.setComparator(inviteCodeTableModel.INVITE_CODE, ComparatorTool.getStringComparator);
        //TODO 临时解决双选择的问题
//        jTable1.setRowSelectionAllowed(false);
//        jTable1.setColumnSelectionAllowed(false);
//        jScrollPane1.setRowHeaderView(jTable1);
//        jScrollPane1.setCorner(JScrollPane.UPPER_LEFT_CORNER, jTable1.getTableHeader());
//        jScrollPane1.setViewportView(jTable1);
//        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        jTable1.getTableHeader().setReorderingAllowed(false);
//        jTable1.getTableHeader().setResizingAllowed(false);
    }

    private final AgentListener<List<InviteCode>> queryListener = new AgentListener<List<InviteCode>>() {
        @Override
        public void onStarted(long seq) {
            //禁用所有组件
            inviteCodeTableModel.clear();
        }

        @Override
        public void onSucceeded(List<InviteCode> result, long seq) {
            List<CheckableItem<InviteCode>> cList = new ArrayList<>();
            for (InviteCode code : result) {
                CheckableItem<InviteCode> item = new CheckableItem(code);
                cList.add(item);
            }
            if (!cList.isEmpty()) {
                inviteCodeTableModel.setDatas(cList);
                jTable1.getSelectionModel().setSelectionInterval(0, 0);
            }

        }

        @Override
        public void onFailed(String errMsg, int errCode, long seq) {
        }
    };
}
