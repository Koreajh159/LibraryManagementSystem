package lms.member;

import javax.swing.table.AbstractTableModel;

public class MemberTableModel extends AbstractTableModel{
	String[] columnTitle= {"ȸ����ȣ","ȸ���̸�","ȸ������","����ó","�ּ�","�̸���","����Ǽ�","����Ǽ�","ȸ�������"};
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
