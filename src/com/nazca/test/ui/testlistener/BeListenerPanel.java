/*
 * BeListenerPanel.java
 * 
 * Copyright(c) 2007-2016 by Yingzhi Tech
 * All Rights Reserved
 * 
 * Created at 2016-11-10 14:42:08
 */
package com.nazca.test.ui.testlistener;

import com.nazca.test.listener.TestListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 被监听者
 *
 * @author 赵洪坤 <zhaohongkun@yzhtech.com>
 */
public class BeListenerPanel extends javax.swing.JPanel {

    //放间谍的地方
    List<TestListener> testListenerList = new ArrayList<>();

    public void addListener(TestListener testListener) {
        testListenerList.add(testListener);
    }

    public void removeAllListener(TestListener testListener) {
        testListenerList.clear();
    }

    private void fireValueChange(String value) {
        for (TestListener testListener : testListenerList) {
            testListener.getChangedBeLisentedTexdFiled(value);
        }
    }

    /**
     * Creates new form BeListener
     */
    public BeListenerPanel() {
        initComponents();
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                fireValueChange(jTextField1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                fireValueChange(jTextField1.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                fireValueChange(jTextField1.getText());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setText("被监听的面板");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
