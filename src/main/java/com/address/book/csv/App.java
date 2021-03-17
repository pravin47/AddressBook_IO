package com.address.book.csv;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		String filePath = "G:\\brigelab\\java\\day28\\pravin.csv";
		System.out.println("Starting File writing :" + filePath);
		writeCsv(filePath);

		System.out.println("starting read file");
		readCsv(filePath);

	}

	public static void writeCsv(String filePath) {

		List<AddressBookCsv> Book = new ArrayList<AddressBookCsv>();

		AddressBookCsv Book1 = new AddressBookCsv();
		Book1.setfName("pravin");
		Book1.setlName("bagul");
		Book1.setaddress("ram nabag");
		Book1.setCity("pune");
		Book1.setState("Maharashtra");
		Book1.setZip("424304");
		Book1.setPhoneNumber("9797979797");
		Book1.setEmail("bagul.pravin2@gmail.com");
		Book.add(Book1);

		FileWriter filewriter1 = null;
		try {
			filewriter1 = new FileWriter(filePath);
			filewriter1.append("fName,lName,address,City,State,Zip,PhoneNumber,Email");
			for (AddressBookCsv ad : Book) {

				filewriter1.append(String.valueOf(ad.getfName()));
				filewriter1.append(String.valueOf(ad.getlName()));
				filewriter1.append(String.valueOf(ad.getaddress()));
				filewriter1.append(String.valueOf(ad.getCity()));
				filewriter1.append(String.valueOf(ad.getState()));
				filewriter1.append(String.valueOf(ad.getZip()));
				filewriter1.append(String.valueOf(ad.getPhoneNumber()));
				filewriter1.append(String.valueOf(ad.getEmail()));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				filewriter1.flush();
				filewriter1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void readCsv(String filePath) {

		BufferedReader reader = null;
		try {
			List<AddressBookCsv> Book = new ArrayList<AddressBookCsv>();
			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine() != null)) {
				String field = line.split(",");

				if (field.length() > 0) {
					
				AddressBookCsv Book1 = new AddressBookCsv();
				Book1.setfName("pravin");
				Book1.setlName("bagul");
				Book1.setaddress("ram nabag");
				Book1.setCity("pune");
				Book1.setState("Maharashtra");
				Book1.setZip("424304");
				Book1.setPhoneNumber("9797979797");
				Book1.setEmail("bagul.pravin2@gmail.com");
				Book.add(Book1);
				

				}

			}
			for (AddressBookCsv ad : Book) {
				
			System.out.printf("First Name = %s,Last Name = s, Address = %s, City = %s, State = %s,Zip = %s,Phone Number = %s,Email = %s",ad.getfName(),ad.getlName(),ad.getaddress(),ad.getCity(),ad.getState(),ad.getZip()ad.getPhoneNumber(),ad.getEmail());
			}
			
			
			

		} catch (Exception e) {
			e.printstackTrace();
		}finally {
			try {
				reader.close();
			}catch(Exception e) {
			e.printStackTrace();
			}
		}

	}
}