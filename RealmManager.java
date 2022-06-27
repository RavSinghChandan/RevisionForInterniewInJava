package com.sprint1q4;

public class RealmManager extends Manager{
	 void read() {
		System.out.println("RealmManager");
	}
	static void write() {
		System.out.println("RealmManager");
	}
}
public class DataManager  extends Manager {
	static	void read() {
		System.out.println("DataManager");
	}
	static	void write() {
		System.out.println("DataManager");
	}
}
 public DisckRealmManager extends RealmManager{
	 static void read() {
			System.out.println("DisckRealmManager");
		}
	 static	void write() {
			System.out.println("DisckRealmManager");
		}
 }
 
 InmemorialRealmManager extends RealmManager{
	 static void read() {
			System.out.println("InmemorialRealmManager");
		}
	 static void write() {
			System.out.println("InmemorialRealmManager");
		}
 }
 
 DisckCoreRealmManager extends DataManager{
	static void rea1() {
			System.out.println("DisckCoreRealmManager");
		}
 }