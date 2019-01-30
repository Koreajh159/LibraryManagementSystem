package lms.bookinform;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BookInformMain extends JPanel{
	String[] title_arr = {"도서 목록", "유실 도서", "요청 도서", "구매 도서"};
	
	JButton[] bt_arr = new JButton[title_arr.length];
	JButton bt_list, bt_lost, bt_request, bt_buy;
	JPanel p_north, p_center;
	Dimension d_bt = new Dimension(200,40);
	public BookInformMain() {
		setLayout(new BorderLayout());
		setNorthP();
		
		p_center = new JPanel();
		add(p_center);
		setVisible(true);
	}
	public void setNorthP() {
		p_north = new JPanel();
		setBtn(bt_arr, title_arr);
		add(p_north, BorderLayout.NORTH);
	}
	public void setBtn(JButton[] bt, String[] title_arr) {
		for(int i = 0 ; i<bt.length ; i++) {
			bt[i] = new JButton(title_arr[i]);
			bt[i].setPreferredSize(d_bt);
			bt[i].setFont(new Font("돋움", Font.BOLD, 30));
			p_north.add(bt[i]);
		}
	}
}
