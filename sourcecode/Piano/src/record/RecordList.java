package record;

import java.util.ArrayList;

public class RecordList {
	private static ArrayList<Record> recordsList = new ArrayList<Record>();
	public static void addToRecordList(Record record) {
		recordsList.add(record);
	}
	public static void printOut() {
		for(Record i : recordsList) {
			i.play();
			System.out.println(i.getListNotes());
		}
	}
	public static ArrayList<Record> getListRecord() {
		return recordsList;
	}
	
	
}
