package LCS_Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LCS_GUI_Project {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Longest Common Subsequence");
        frame.setSize(900, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("X:");
        l1.setBounds(50, 20, 30, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(80, 20, 150, 30);

        JLabel l2 = new JLabel("Y:");
        l2.setBounds(250, 20, 30, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(280, 20, 150, 30);

        JButton btn = new JButton("Start Algorithm");
        btn.setBounds(480, 20, 180, 30);

        JTable table1 = new JTable();
        JTable table2 = new JTable();

        JScrollPane sp1 = new JScrollPane(table1);
        sp1.setBounds(50, 80, 350, 250);

        JScrollPane sp2 = new JScrollPane(table2);
        sp2.setBounds(450, 80, 350, 250);

        JLabel res = new JLabel("LCS: ");
        res.setBounds(50, 350, 400, 30);
        res.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(btn);
        frame.add(sp1); frame.add(sp2);
        frame.add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String X = t1.getText();
                String Y = t2.getText();

                int m = X.length();
                int n = Y.length();

                int[][] dp = new int[m+1][n+1];
                String[][] dir = new String[m+1][n+1];

                for(int i=0;i<=m;i++){
                    for(int j=0;j<=n;j++){
                        if(i==0 || j==0){
                            dp[i][j] = 0;
                            dir[i][j] = "";
                        }
                        else if(X.charAt(i-1) == Y.charAt(j-1)){
                            dp[i][j] = dp[i-1][j-1] + 1;
                            dir[i][j] = "↖";
                        }
                        else if(dp[i-1][j] >= dp[i][j-1]){
                            dp[i][j] = dp[i-1][j];
                            dir[i][j] = "↑";
                        }
                        else{
                            dp[i][j] = dp[i][j-1];
                            dir[i][j] = "←";
                        }
                    }
                }

                DefaultTableModel model1 = new DefaultTableModel(m+1, n+1);
                DefaultTableModel model2 = new DefaultTableModel(m+1, n+1);

                for(int i=0;i<=m;i++){
                    for(int j=0;j<=n;j++){
                        model1.setValueAt(dp[i][j], i, j);
                        model2.setValueAt(dir[i][j], i, j);
                    }
                }

                table1.setModel(model1);
                table2.setModel(model2);

                String lcs = "";
                int i = m, j = n;

                while(i > 0 && j > 0){
                    if(X.charAt(i-1) == Y.charAt(j-1)){
                        lcs = X.charAt(i-1) + lcs;
                        i--; j--;
                    }
                    else if(dp[i-1][j] >= dp[i][j-1]){
                        i--;
                    }
                    else{
                        j--;
                    }
                }

                res.setText("Longest Common Subsequence: " + lcs);
            }
        });

        frame.setVisible(true);
    }
}