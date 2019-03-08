package lms;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistDialog extends JDialog{
	JLabel l_id, l_pw, l_pwcheck, l_name, l_birth, l_addr, l_space;
	JTextField t_id, t_name, t_addr, t_addrdetail;
	Choice ch_year, ch_month, ch_date;
	JPasswordField t_pw, t_pwcheck;
	JPanel p_main, p_label, p_edit, p_bt;
	JButton bt_checkid, bt_ok, bt_cancel;
	Dimension d_label = new Dimension(110, 25);
	Dimension d_text = new Dimension(150, 25);
	LoginDialog parent;
	public RegistDialog(LoginDialog parent) {
		p_main = new JPanel();
		p_label = new JPanel();
		p_edit = new JPanel();
		p_bt = new JPanel();
		this.parent = parent;
		bt_ok = new JButton("가입");
		bt_cancel = new JButton("취소");
		p_main.setLayout(new BorderLayout());
		
		setLabels();
		setEditors();		
		p_bt.add(bt_ok);
		p_bt.add(bt_cancel);
		p_main.add(p_bt, BorderLayout.SOUTH);
		
		add(p_main);
		addBtnEvent();
		setModal(true);
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(parent);
		setVisible(true);
	}
	public void setEditors() {
		t_id = new JTextField();
		bt_checkid = new JButton("중복 확인");
		t_pw = new JPasswordField();		
		t_pwcheck = new JPasswordField();
		t_name = new JTextField();
		t_addr = new JTextField();
		l_space = new JLabel();//공백 라벨
		t_addrdetail = new JTextField(20);
		
		ch_year = new Choice();
		ch_month = new Choice();
		ch_date = new Choice();
		
		p_edit.setLayout(new FlowLayout(FlowLayout.LEFT));
		p_edit.add(t_id);
		p_edit.add(bt_checkid);
		p_edit.add(t_pw);
		p_edit.add(t_pwcheck);
		p_edit.add(t_name);
		p_edit.add(l_space);
		p_edit.add(ch_year);
		p_edit.add(ch_month);
		p_edit.add(ch_date);
		p_edit.add(t_addr);
		p_edit.add(t_addrdetail);
		p_main.add(p_edit);
		setChildSize(p_edit, d_text);
		l_space.setPreferredSize(new Dimension(80, 25));
		bt_checkid.setPreferredSize(new Dimension(90, 25));
		ch_year.setPreferredSize(new Dimension(70, 25));
		ch_month.setPreferredSize(new Dimension(70, 25));
		ch_date.setPreferredSize(new Dimension(70, 25));

		p_edit.setBorder(BorderFactory.createEmptyBorder(40, 10, 0, 0));
	}
	
	public void setLabels() {
		l_id = new JLabel("ID");
		l_pw = new JLabel("비밀번호");
		l_pwcheck = new JLabel("비밀번호 확인");
		l_name = new JLabel("이름");
		l_addr = new JLabel("주소");
		l_birth = new JLabel("생년월일");
		
		p_label.add(l_id);
		p_label.add(l_pw);
		p_label.add(l_pwcheck);
		p_label.add(l_name);
		p_label.add(l_birth);
		p_label.add(l_addr);
		p_main.add(p_label, BorderLayout.WEST);
		setChildSize(p_label, d_label);
		p_label.setBorder(BorderFactory.createEmptyBorder(40, 40, 0, 0));
		
	}
	
	public void FontChange(Component component, Font font) {
		component.setFont(font);
		if(component instanceof Container) {
			for(Component child : ((Container)component).getComponents()) {
				FontChange(child, font);
			}
		}
	}
	
	public void setChildSize(Component component, Dimension d) {
		component.setPreferredSize(d);
		if(component instanceof Container) {
			for(Component child : ((Container)component).getComponents()) {
				setChildSize(child, d);
			}
		}
	}
	
	public void addBtnEvent() {
		bt_ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		bt_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		bt_checkid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.checkUser(t_id.getText());
			}
		});
	}
	
}
