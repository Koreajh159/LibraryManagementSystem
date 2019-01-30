package lms.member;

import javax.swing.table.AbstractTableModel;

public class MemberTableModel extends AbstractTableModel{
	String[] columnTitle= {"회원번호","회원이름","회원상태","연락처","주소","이메일","대출권수","예약권수","회원등록일"};
	Object[] data;
	
	public int getColumnCount() {

		return columnTitle.length;
	}
	
	public String getColumnName(int col) {
		return columnTitle[col];
	}
	
	public int getRowCount() {
		return 0;
	}

	public Object getValueAt(int row, int col) {

		return null;
	}

}
