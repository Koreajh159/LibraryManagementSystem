package lms.bookManagement;


import java.awt.Choice;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BookRequest extends JPanel{
	
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
	JLabel b_requestDay;
	JLabel b_money;
	JLabel b_condition;
	JLabel b_requestPerson;
	
	JTextField t_category;
	JTextField t_name;
	JTextField t_publisher;
	JTextField t_writer;
	JTextField t_requestDay;
	JTextField t_money;
	Choice c_condition;
	JTextField t_requestPerson;
	
	JPanel p_east_south;

	JButton bt_edit;
	JButton bt_del;
	
	ArrayList<JLabel> l_list = new ArrayList<JLabel>();
	ArrayList<JTextField> t_list = new ArrayList<JTextField>();
	
	Dimension d1 = new Dimension(1200,50);
	Dimension d2 = new Dimension(550,500);
	Dimension d3 = new Dimension(400,300);

	
	Dimension d_bt = new Dimension(200,40);
	Dimension d_label = new Dimension(100,25);
	Dimension d_text = new Dimension(200,25);
	Dimension d_search = new Dimension(400,30);
	
	public BookRequest() {
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
		l_list.add(b_requestDay);
		l_list.add(b_money);
		l_list.add(b_condition);
		l_list.add(b_requestPerson);
		

		
		
		t_list.add(t_num);
		t_list.add(t_category);
		t_list.add(t_name);
		t_list.add(t_publisher);
		t_list.add(t_writer);
		t_list.add(t_requestDay);
		t_list.add(t_money);
		t_list.add(t_requestPerson);
	

		c_condition.setPreferredSize(d_text);
		c_condition.add("완료");
		c_condition.add("처리중");
		
		
		add(p_east);
		p_east.setPreferredSize(d2);
		
		p_east.add(p_east_north);
		p_east_north.add(t_search);
		t_search.setPreferredSize(d_search);
		p_east_north.add(bt_search);
		
		
		for(int i=0; i<t_list.size();i++) {
			t_list.get(i).setPreferredSize(d_text);

		}
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
		p_east_center.add(b_requestDay);
		p_east_center.add(t_requestDay);
		p_east_center.add(b_money);
		p_east_center.add(t_money);
		//p_east_center.add(b_condition);
		//p_east_center.add(c_condition);
		p_east_center.add(b_requestPerson);
		p_east_center.add(t_requestPerson);
		p_east_center.add(b_condition);
		p_east_center.add(c_condition);

		
		p_east.add(p_east_south);
		p_east_south.setPreferredSize(new Dimension(400,200));
		p_east_south.add(bt_edit);
		p_east_south.add(bt_del);
		setVisible(false);
	}

	public void create(){

		p_west = new JPanel();
		p_west_north = new JPanel();
		bt_all = new JButton("전체 요청 도서");
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
		t_num.setEditable(false);
		b_category = new JLabel("분류");
		b_name = new JLabel("도서명");
		b_publisher = new JLabel("출판사");
		b_writer = new JLabel("저자");
		b_requestDay = new JLabel("도서 요청일");
		b_money = new JLabel("도서 금액");
		b_condition = new JLabel("상태");
		b_requestPerson = new JLabel("요청자");
	
		t_category = new JTextField();
		t_category.setEditable(false);
		t_name = new JTextField();
		t_name.setEditable(false);
		t_publisher = new JTextField();
		t_publisher.setEditable(false);
		t_writer = new JTextField();
		t_writer.setEditable(false);
		t_requestDay = new JTextField();
		t_requestDay.setEditable(false);
		t_money = new JTextField();
		t_money.setEditable(false);
		c_condition = new Choice();
		t_requestPerson = new JTextField();
		t_requestPerson.setEditable(false);
		
		p_east_south = new JPanel();
		bt_edit = new JButton("수정");
		bt_del = new JButton("삭제");
		GregorianCalendar calendar = new GregorianCalendar(Locale.KOREA);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getWeekYear());
		System.out.println(Calendar.MONTH-1);
		
	}
}







