package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {
	
	public static void main (String[] args) throws ParseException{
		Student s = new Student();
		s.setNim("4512210028");
		s.setNama("Rahmad Dedi Julian Daulay");
		s.setAlamat("Jl. Gandul Raya No. 30");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("16-07-1993"));
		s.setNoHp("085297084525");
		
		Employee e = new Employee();
		e.setNip("4512210011");
		e.setNama("Reza Saputra Yusuf");
		e.setAlamat("Jl. Bojong Gede No. 45");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("21-08-1994"));
		e.setNoHp("087767889122");
		
		showData(s);
		System.out.println("\n========================\n");
		showData(e);
	}
	
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format(s.getTglLahir()));
		System.out.println("No Hp : " + s.getNoHp());
	}
	
	static void showData(Employee e){
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format(e.getTglLahir()));
		System.out.println("No Hp : " + e.getNoHp());
	}
}