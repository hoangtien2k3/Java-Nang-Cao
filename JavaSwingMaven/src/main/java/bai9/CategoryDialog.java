/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

/**
 *
 * @author WINDOWNS 11
 */
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class CategoryDialog extends JDialog {
    private JTextField txtCategory;
    private JButton btnSave;
    private JButton btnCancel;

    private String category;

    public CategoryDialog(JFrame parent) {
        super(parent, "Category Dialog", true);
        setSize(300, 150);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel lblCategory = new JLabel("Category:");
        txtCategory = new JTextField();
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");

        panel.add(lblCategory, BorderLayout.WEST);
        panel.add(txtCategory, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);

        btnSave.addActionListener((ActionEvent e) -> {
            category = txtCategory.getText();
            dispose(); // Đóng dialog sau khi nhấn Save
        });

        btnCancel.addActionListener((ActionEvent e) -> {
            category = null; // Trả về null nếu hủy bỏ
            dispose(); // Đóng dialog sau khi nhấn Cancel
        });

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public String getCategory() {
        return category;
    }
}
