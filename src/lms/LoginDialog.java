package lms;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lms.db.DBConnection;
import lms.db.UserInformation;

public class LoginDialog extends JDialog{
	JPanel p_input, p_bt, p_logo;
	public JTextField t_id; 
	public JPasswordField t_pw;
	JLabel la_id, la_pw;
	JButton bt_login, bt_cancel, bt_regist;
	String user_id, user_pw;
	DBConnection db;
	Connection conn;
	MainFrame main;
	public LoginDialog(MainFrame main) {
		super(main, true);
		db = new DBConnection();
		conn = db.getConn();
		this.main = main;
		
		la_id = new JLabel("ID : ");
		la_id.setPreferredSize(new Dimension(100, 25));
		t_id = new JTextField();
		t_id.setPreferredSize(new Dimension(200, 25));
		t_id.setHorizontalAlignment(SwingConstants.CENTER);
		la_pw = new JLabel("Password : ");
		la_pw.setPreferredSize(new Dimension(100, 25));
		t_pw = new JPasswordField();
		t_pw.setPreferredSize(new Dimension(200, 25));
		t_pw.setHorizontalAlignment(SwingConstants.CENTER);
		bt_login = new JButton("로그인");
		
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUserInform();
				searchUser();
			}
		});
		bt_cancel = new JButton("취소");
		bt_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		bt_regist = new JButton("회원가입");
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registUser();
			}
		});
		
		p_logo = new JPanel();
		p_logo.setPreferredSize(new Dimension(400, 25));
		p_input = new JPanel();
		p_bt = new JPanel();
		
		p_input.add(la_id);
		p_input.add(t_id);
		p_input.add(la_pw);
		p_input.add(t_pw);
		
		p_bt.add(bt_login);
		p_bt.add(bt_cancel);
		p_bt.add(bt_regist);
		
		add(p_logo, BorderLayout.NORTH);
		add(p_input);
		add(p_bt, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setLocationRelativeTo(main);
		
		setVisible(true);
	}
	
	public void close() {
		System.exit(0);
	}
	
	public void getUserInform() {
		user_id = this.t_id.getText();
		user_pw = "";
		char[] pw_arr = this.t_pw.getPassword();
		for(int i = 0 ; i < pw_arr.length ; i++) {
			user_pw += pw_arr[i];
		}
	}
	public void registUser() {
		RegistDialog registform = new RegistDialog(this);
		setModal(false);
	}
	public void searchUser() {
		StringBuffer sb = new StringBuffer();
		sb.append("select MEMBER_ID, NAME, ID, PASSWORD from member");
		sb.append(" where ID='"+user_id+"'");
		sb.append(" and PASSWORD='"+user_pw+"'");
		System.out.println(sb);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sb.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = pstmt.executeQuery();
			rs.last();
			if(rs.getRow()==0) {
				JOptionPane.showMessageDialog(this,"등록되지 않은 사용자 입니다");
			}else {
				System.out.println("로그인 성공");
				int member_id = rs.getInt("member_id");
				String user_name = rs.getString("name");
				String user_id = rs.getString("id");
				String user_pw = rs.getString("password");
				UserInformation userinform = new UserInformation(member_id, user_name, user_id, user_pw);
				userinform.addCurrentUser();
				this.setVisible(false);
				main.toFront();
				main.setEnabled(true);
				main.setTitle(user_name+"님 접속중");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Boolean checkUser(String user_id) {
		StringBuffer sb = new StringBuffer();
		ResultSet rs = null;
		sb.append("select ID from member");
		sb.append(" where ID='"+user_id+"'");
		try {
			PreparedStatement pstmt = conn.prepareStatement(sb.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = pstmt.executeQuery();
			rs.last();
			if(rs.getRow()==0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				rs.close();
			}
		}
	}
}
