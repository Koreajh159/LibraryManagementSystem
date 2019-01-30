package lms.bookManagement;


import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BookLost extends JPanel{
	
	JPanel p_west;
	JPanel p_west_north;
	JButton bt_all;
	JButton bt_jurisdiction;
	JButton bt_rental;
	
	JPanel p_west_center;
	JTable table;
	JScrollPane scroll;
	
	JPanel p_east;
	JPanel p_east_north;
	JTextField t_search;
	JButton bt_search;
	JPanel p_east_center;
	JLabel b_num;
	JTextField t_num;
	JLabel b_category;
	JLabel b_name;
	JLabel b_publisher;
	JLabel b_writer;
	JLabel b_registDay;
	JLabel b_amount;
	JLabel b_condition;
	JLabel b_officer;
	JLabel b_reason;
	JLabel b_detailInfo;
	
	JTextField t_category;
	JTextField t_name;
	JTextField t_publisher;
	JTextField t_writer;
	JTextField t_registDay;
	JTextField t_amount;
	JTextField t_condition;
	JTextField t_officer;
	JTextField t_reason;
	
	JTextArea t_detailInfo;
	JScrollPane t_scroll;
	
	JPanel p_east_south;
	JButton bt_new;
	JButton bt_regist;
	JButton bt_edit;
	JButton bt_del;
	
	ArrayList<JLabel> l_list = new ArrayList<JLabel>();
	ArrayList<JTextField> t_list = new ArrayList<JTextField>();
	
	Dimension d1 = new Dimension(1200,50);
	Dimension d2 = new Dimension(550,550);
	Dimension d3 = new Dimension(400,370);

	
	Dimension d_bt = new Dimension(200,40);
	Dimension d_label = new Dimension(100,25);
	Dimension d_text = new Dimension(200,25);
	Dimension d_search = new Dimension(400,30);
	
	public BookLost() {
		create();

		
		
		add(p_west);
		p_west.setPreferredSize(d2);
	
		p_west.add(p_west_north);
		p_west_north.add(bt_all);
		p_west_north.add(bt_jurisdiction);
		p_west_north.add(bt_rental);
		p_west.add(p_west_center);
		p_west_center.add(scroll);
		
		
		
		//리스트에 넣기
		l_list.add(b_num);
		l_list.add(b_category);
		l_list.add(b_name);
		l_list.add(b_publisher);
		l_list.add(b_writer);
		l_list.add(b_registDay);
		l_list.add(b_amount);
		l_list.add(b_condition);
		l_list.add(b_officer);
		l_list.add(b_reason);
		l_list.add(b_detailInfo);
		
		
		t_list.add(t_num);
		t_list.add(t_category);
		t_list.add(t_name);
		t_list.add(t_publisher);
		t_list.add(t_writer);
		t_list.add(t_registDay);
		t_list.add(t_amount);
		t_list.add(t_condition);
		t_list.add(t_officer);
		t_list.add(t_reason);
	

		
		add(p_east);
		p_east.setPreferredSize(d2);
		
		p_east.add(p_east_north);
		p_east_north.add(t_search);
		t_search.setPreferredSize(d_search);
		p_east_north.add(bt_search);
		
		
		for(int i=0; i<t_list.size();i++) {
			t_list.get(i).setPreferredSize(d_text);
		
		}
		t_scroll.setPreferredSize(new Dimension(200,50));
		for(int i=0; i<l_list.size();i++) {
	
			l_list.get(i).setPreferredSize(d_label);
		}
	
		
		
		p_east.add(p_east_center);
		p_east_center.setPreferredSize(d3);
		p_east_center.add(b_num);
		p_east_center.add(t_num);
		
		p_east_center.add(b_category);
		p_east_center.add(t_category);
		p_east_center.add(b_name);
		p_east_center.add(t_name);
		p_east_center.add(b_publisher);
		p_east_center.add(t_publisher);
		p_east_center.add(b_writer);
		p_east_center.add(t_writer);
		p_east_center.add(b_registDay);
		p_east_center.add(t_registDay);
		p_east_center.add(b_amount);
		p_east_center.add(t_amount);
		p_east_center.add(b_condition);
		p_east_center.add(t_condition);
		p_east_center.add(b_officer);
		p_east_center.add(t_officer);
		p_east_center.add(b_reason);
		p_east_center.add(t_reason);
		p_east_center.add(b_detailInfo);
		p_east_center.add(t_scroll);
		
		p_east.add(p_east_south);
		p_east_south.add(bt_new);
		p_east_south.add(bt_regist);
		p_east_south.add(bt_edit);
		p_east_south.add(bt_del);
		setVisible(false);
	}
	public void create(){

		p_west = new JPanel();
		p_west_north = new JPanel();
		bt_all = new JButton("전체 유실도서");
		bt_jurisdiction= new JButton("처리 대기 도서");
		bt_rental = new JButton("처리 완료 도서");
		
		p_west_center = new JPanel();
		table = new JTable(6,10);
		scroll = new JScrollPane(table);
		
		p_east = new JPanel();
		p_east_north = new JPanel();
		t_search= new JTextField();
		bt_search=new JButton("검색");
		
		p_east_center = new JPanel();
		b_num = new JLabel("도서번호");
		t_num = new JTextField();
		b_category = new JLabel("분류");
		b_name = new JLabel("도서명");
		b_publisher = new JLabel("출판사");
		b_writer = new JLabel("저자");
		b_registDay = new JLabel("도서 등록일");
		b_amount = new JLabel("동일 도서 수량");
		b_condition = new JLabel("상태");
		b_officer = new JLabel("책임자");
		b_reason = new JLabel("사유");
		b_detailInfo = new JLabel("파손 상세 정보");
		
		t_category = new JTextField();
		t_name = new JTextField();
		t_publisher = new JTextField();
		t_writer = new JTextField();
		t_registDay = new JTextField();
		t_amount = new JTextField();
		t_condition = new JTextField();
		t_officer = new JTextField();
		t_reason = new JTextField();
		t_detailInfo = new JTextArea();
		t_scroll = new JScrollPane(t_detailInfo);
		
		
		p_east_south = new JPanel();
		bt_new = new JButton("신규");
		bt_regist = new JButton("등록");
		bt_edit = new JButton("수정");
		bt_del = new JButton("삭제");
		
	}
}







