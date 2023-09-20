package Project;


import java.sql.*;
import java.util.*;



public class cFour {

	

	public static void createPatient(Connection con) throws Exception {
				
		try {
			
			  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	
			
			  /*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - A
			  System.out.println();
			  System.out.println();
			  System.out.println("      Create New Patient  ");
		      System.out.println("  ============================");
	    	  System.out.println(" Enter the Patient information");
	    	  System.out.println();
	    	  
	    	  System.out.print("       Enter their SSN: ");
	    	  String containsSSN = scan.nextLine();
	    	  //scan.re
	    	  
	    	  System.out.print("       Enter their First Name: ");
	    	  String containsFirstName = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their Middle Name: ");
	    	  String containsMiddleName = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their Last Name: ");
	    	  String containLastName = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their Street Address: ");
	    	  String containsStreetAddress = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their City: ");
	    	  String containsCity = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their State: ");
	    	  String containsState = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their Zip Code: ");
	    	  String containsZipCode = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their Email Address: ");
	    	  String containsEmail = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their status (T or F): ");
	    	  String containAD = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their PhoneNumber: ");
	    	  String containsPhone = scan.nextLine();
	    	  
	    	  System.out.print("       Enter their DOB (dd-MMM-yy): ");
	    	  String containDOB = scan.nextLine();
			  /*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - A

	    	  
			  /*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - B
	    	  String sql = "INSERT INTO PATIENT(PATIENTID,SSN, FirstName, MiddleName, StreetAdd, City, State, Zip, Email, LastName , ACTIVEPATIENT, Phone, DOB)"
	    			  + "Values (mySeq.nextVal,?,?,?,?,?,?,?,?,?,?,?,?)";
	    	
	    	  PreparedStatement statement = connect.prepareStatement(sql);
	    	   
	    	  statement.setString(1,containsSSN);
	    	  statement.setString(2,containsFirstName);
	    	  statement.setString(3,containsMiddleName);
	    	  statement.setString(4,containsStreetAddress);
	    	  statement.setString(5,containsCity);
	    	  statement.setString(6,containsState);
	    	  statement.setString(7,containsZipCode);
	    	  statement.setString(8,containsEmail);
	    	  statement.setString(9,containLastName);
	    	  statement.setString(10,containAD);
	    	  statement.setString(11,containsPhone);
	    	  statement.setString(12,containDOB);
	    	  
	    	  int rows = statement.executeUpdate();
	    	  
	    	  if(rows > 0) {
	    		  System.out.println();
	    		  System.out.println("      A new patient has been created succesfully.");
	    		  System.out.println("    -----------------------------------------");
	    		  System.out.println("             -------------------------");
	    		  System.out.println("                   ------------");
	    	  }
			  /*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - B

	    	  
		} catch (Exception e) {
			 System.out.println(e);
		}
		
		
	}
	
	public static void createDoctor(Connection con) throws Exception {
		
		
		try {
						 
			 /*- - - - - - -- - --  - - - -- - - */
			  Connection connect = con;              // Connection works
			  Scanner scan = new Scanner(System.in);
			  /*- - - - - - -- - --  - - - -- - - */
	
	/*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - A
	  System.out.println();
	  System.out.println();	
	  System.out.println("       Create New Doctor  ");
      System.out.println("  ============================");
      System.out.println(" Enter the Doctor information");
 	  
 	  System.out.println();
 	  
 	  System.out.print("       Enter their SSN: ");
 	  String containsSSN = scan.nextLine();
 	  
 	  System.out.print("       Enter their First Name: ");
 	  String containsFirstName = scan.nextLine();
 	  
 	  System.out.print("       Enter their Middle Name: ");
 	  String containsMiddleName = scan.nextLine();
 	  
 	  System.out.print("       Enter their Last Name: ");
 	  String containLastName = scan.nextLine();
 	  
 	  System.out.print("       Enter their DOB (dd-MMM-yy): ");
 	  String containDOB = scan.nextLine();
 	  
 	  System.out.print("       Enter their Street Address: ");
 	  String containsStreetAddress = scan.nextLine();
 	  
 	  System.out.print("       Enter their City: ");
 	  String containsCity = scan.nextLine();
 	  
 	  System.out.print("       Enter their State: ");
 	  String containsState = scan.nextLine();
 	  
 	  System.out.print("       Enter their Zip Code: ");
 	  String containsZipCode = scan.nextLine();
 	  
 	  System.out.print("       Enter their Email Address: ");
 	  String containsEmail = scan.nextLine();
 	  
 	  System.out.print("       Enter their Phone Number: ");
 	  String containsPhone = scan.nextLine();
 	  
 	 String sql = "SELECT clinic.clinicname, clinic.cliniclicense FROM clinic ";
	  
	  
     Statement statement1 = connect.createStatement();
     ResultSet result = statement1.executeQuery(sql);
     System.out.println();
     System.out.println("         Active Clinics");
     System.out.println("   Clinic Name       License #");
     System.out.println("===============================");
     
     while(result.next()) {
     	String clinicName = result.getString("clinicname");
     	int clinicLicense = result.getInt("cliniclicense");
     	System.out.printf("%13s %13d\n", clinicName, clinicLicense);
     }
     System.out.println(); System.out.println();
 	  
 	  System.out.print("       Enter their Clinic License: ");
 	  int containsClinicNum = scan.nextInt();
 	  
 	  System.out.print("       Enter their status (T or F): ");
 	  String containsAD = scan.next();
	  /*- - - - - - - - - - - - - - - - - - - - - - - - */ //Good - A

	  /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */ //Good - B
 	  sql = "INSERT INTO DOCTOR(DOCTORID, SSN, FirstName, MiddleName, LastName, DOB, StreetAdd, City, State, Zip, Email, PhoneNumber,CLINIC_CLINICLICENSE,ACTIVEDOCTOR)"
 			  + "Values (mySeq.nextVal,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 	
 	  PreparedStatement statement = connect.prepareStatement(sql);
 	   
 	  statement.setString(1,containsSSN);
 	  statement.setString(2,containsFirstName);
 	  statement.setString(3,containsMiddleName);
 	  statement.setString(4,containLastName);
 	  statement.setString(5,containDOB);
 	  statement.setString(6,containsStreetAddress);
 	  statement.setString(7,containsCity);
 	  statement.setString(8,containsState);
 	  statement.setString(9,containsZipCode);
 	  statement.setString(10,containsEmail);
 	  statement.setString(11,containsPhone);
 	  statement.setInt(12,containsClinicNum);
 	  statement.setString(13,containsAD);
 	  
 	  
 	  int rows = statement.executeUpdate();
 	  
 	  if(rows > 0) {
 		  System.out.println();
 		 System.out.println();
		  System.out.println("     A new Doctor has been created succesfully.");
		  System.out.println("    -----------------------------------------");
		  System.out.println("             -------------------------");
		  System.out.println("                   ------------");
 	  }
 	  /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */ //Good - B
 	  
	  //connect.close();
		} catch (Exception e) {
			 System.out.println(e);
		}
	
		
	}
	
     public static void createAppointment(Connection con) throws Exception {
		
	      try {
	     /*- - - - - - -- - --  - - - -- - - */
		  Connection connect = con;              // Connection works
		  Scanner scan = new Scanner(System.in);
		  /*- - - - - - -- - --  - - - -- - - */
		  
		  String firstName;
    	  String middleName;    
    	  String lastName;
    	  int ID = 0;
    	  
    	  /*- - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - -*/ //Good - A
         int holdsSelectedVal = 0;
         float holdsBillTotal = 0;
    	  String Done = "car";
    	  
    	  int a = 0;
    	  int b = 0;
    	  int c = 0;
    	  int d = 0;
    	  int e = 0;
 
    	  
		  while(holdsSelectedVal != 5) {
			  System.out.println();
		  System.out.println("  Options:                   ");
		  System.out.println("         Select 1 for a Checkup(physical): $250.00");
		  System.out.println("         Select 2 for a Immunization: $125.00");
		  System.out.println("         Select 3 for a Prescription: $40.00");
		  System.out.println("         Select 4 for a Consulation: $200.00");
		  System.out.println();
		  System.out.println("         - - - - - - - - - - - - - - - - - - - - - - - - - -");
		  System.out.println("         Enter 5 if you are done selecting all the options.");
		  System.out.println("         - - - - - - - - - - - - - - - - - - - - - - - - - -");
		  System.out.print("Enter your choice: ");
		  holdsSelectedVal = scan.nextInt();
		  
		  if(holdsSelectedVal == 1 && a++ == 0) {
			  holdsBillTotal += 250.00;
			  System.out.println("Your selection has been saved");
		  } else if(holdsSelectedVal == 2 && b++ == 0){
			  holdsBillTotal += 125.00;
			  System.out.println("Your selection has been saved");
		  }
		  else if(holdsSelectedVal == 3 && c++ == 0){
			  holdsBillTotal += 40.00;
			  System.out.println("Your selection has been saved");
			  
		  }else if(holdsSelectedVal == 4 && d++ == 0 ) {
			   holdsBillTotal += 200.00;
			   System.out.println("Your selection has been saved");
		  }else if(holdsSelectedVal == 5 && e++ == 0 ) {
		  }else {
			  System.out.println();
			  System.out.println("Your selection is incorrect or there are no more selections");
			  System.out.println("-----------------------------------------------------------");
		  }
		  
		  }
		  
		  System.out.println();
		  System.out.println("        Bill Total: " + holdsBillTotal);
		  System.out.println(" ----                      ----");
		  System.out.println("      ----          ----");
		  System.out.println("             ----");
		  System.out.println();
		    /*- - - - - - - - -- - - - - - - - - - - - - - - - - - -  - - - - - -*/ //Good - A
		  
		  
		       /*- - - - - - - - -- - - - - - - - - - - - - - - - - - -  - - - - - -*/ //Good - B
		          if(holdsBillTotal > 0.0) {
			      String sql = "Select Doctor.DOCTORID, Doctor.FIRSTNAME, Doctor.MIDDLENAME, Doctor.LASTNAME  FROM DOCTOR";
			      		
			      Statement statement = connect.createStatement();
			      ResultSet result = statement.executeQuery(sql);
			      
			      System.out.println(" List of doctors at Osprey Medical");
			      System.out.println("===================================");
			      System.out.println( );
			      
			      sql = String.format("%-15s%-15s%-15s%-15s", "ID", "First Name", "Middle Name", "Last Name");
			    
			                                 
			       System.out.println(sql);
			       System.out.println();
			      
			       System.out.println("ID- - -> FirstName- - -> MiddleName- - -> LastName- - -> ");
			       
			      while(result.next()) {
			           ID = result.getInt("DOCTORID");
			    	   firstName = result.getString("FIRSTNAME");
			    	   middleName = result.getString("MIDDLENAME");
			    	   lastName = result.getString("LASTNAME");
			   
			    	   System.out.println("               " + ID +  " : " + firstName + " " + middleName + " " + lastName);
			    	  // System.out.format("%-15s %-15s%-15s%-15s",ID,firstName,middleName,lastName);  //prints everything in one row
			     }
			       System.out.println();
			       System.out.println("Enter Date here (dd-mmm-yy): ");
		    	   String holdsDate = scan.next();
		    	   

		    	   System.out.println("Enter Appointment time (HH:MM AM/PM): ");
		    	   String holdsAppTime = scan.next();
		    	   
		    	   String sqlpatient = "SELECT patient.patientid, patient.firstname, patient.middlename, patient.lastname FROM patient WHERE patient.activepatient = 'T' OR patient.activepatient = 't' ";
					  
					  
		            Statement sqlstatement = connect.createStatement();
		            ResultSet patientResult = sqlstatement.executeQuery(sqlpatient);
		            System.out.println();
		            System.out.println("                      Active Patients");
		            System.out.println("ID #      First Name    Middle Name           Last Name");
		            System.out.println("========================================================");
		            
		            while(patientResult.next()) {
		            	int idPT = patientResult.getInt("patientid");
		            	String firstNamePT = patientResult.getString("firstname");
		            	String middleNamePT = patientResult.getString("middlename");
		            	String lastNamePT = patientResult.getString("lastname");
		            	System.out.printf("%5d %13s %15s %20s\n", idPT, firstNamePT, middleNamePT, lastNamePT);
		            }
		            System.out.println(); System.out.println();
			    	  
		    	   System.out.println("Enter Patient ID here: ");
		    	   int holdsPatientID = scan.nextInt();
		    	   
			       System.out.println();
		    	   System.out.printf("Enter selected Doctor ID here: ");
		    	   int holdsDoctorId = scan.nextInt();
		    	   
		    	   
		    	   System.out.println( );
		    	   System.out.print("Enter appointment status (SCHEDULED, COMPLETE, CANCELLED): ");
		    	   String appStatus = scan.next();
		    	   System.out.println();
		    	   /*- - - - - - - - -- - - - - - - - - - - - - - - - - - -  - - - - - -*/ //Good - B
		 		  
		    	
		           /*- - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - -*/ // Bad - C
		    	   String sqll = "INSERT INTO appointment(APPOINTMENTID, \"Date\", PATIENTID, DOCTORID, STATUS, APPOINTMENTTIME)"
		    	 			  + "VALUES (mySeq.nextVal,?,?,?,?,?)";
		    	   
		    	   PreparedStatement statementt = connect.prepareStatement(sqll);
		    	   statementt.setString(1, holdsDate);	
		    	   statementt.setInt(2, holdsPatientID); 
		    	   statementt.setInt(3, holdsDoctorId);
		    	   statementt.setString(4, appStatus);
		    	   statementt.setString(5, holdsAppTime);
			      
	
		    	   int rows = statementt.executeUpdate();
		    	 	  
		    	 	  if(rows > 0) {
		    	 		  System.out.print("A new appointment has been created succesfully.");
		    	 		  System.out.println();
		    	 		  
		    	 		  
		    	 		  
			    	 	  /*- - - - -- - -*/
			    	 	  creatBill(connect,holdsPatientID,holdsDoctorId,holdsBillTotal); //Good
			    	 	 /*- - - - -- - -*/
			    	 	  creatRecord(connect,holdsDate,holdsDoctorId,holdsPatientID);   //Good
			    	 	 /*- - - - - - - */
			    	 	  createPatientRecord(connect,holdsPatientID,holdsDoctorId);   //Good
			    	 	 /*- - - - - - - */
		    	 	  }
		    	 	  /*- - - - - - - - -- - - - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - -  - -*/ // Bad - C
		    	
		    	 	  
 	
		    	 	  
		    	 	  
		  }else {
			System.out.println("       <- - - - - - - Appointment cannot be created, as a result of the bill be equal to (0.0) - - - - - - ->");
			System.out.println("                       - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("                                         - - - - - - - - - - - - - - - -");
		}
		 
	  	} catch (Exception e) {
			 System.out.println(e);
		}
			
	}

     public static void creatBill(Connection con,int holdsPatientID ,int holdsDoctor, float billTotal) throws Exception {
	
	       try {
		
	     /*- - - - - - - - -  - - - - - -*/ 	  
		  Connection connect = con;
		  /*- - - - - - - - -  - - - - - -*/
		    int PatientId = holdsPatientID;
		    int DoctorID = holdsDoctor;
		    float BillTotal = billTotal;
		    /*- - - - - - - - -  - - - - - -*/ 
		    
		    /*- - - - - - - - -  - - - - - -*/ 
		    int willHoldAppointmentId = 0;
		   
		    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - */
		    String ssqqll = "SELECT appointment.appointmentid FROM appointment WHERE patientid = ? AND doctorid = ?";
		    PreparedStatement statementOne = connect.prepareStatement(ssqqll);
		    
		    statementOne.setInt(1,PatientId);
		    statementOne.setInt(2, DoctorID);
		    
		    ResultSet rs = statementOne.executeQuery();                                 // Good
		    
		    while(rs.next()) {
		    	willHoldAppointmentId = rs.getInt("appointmentid");
		    }
		    /*- - - - - - - - - - - - -*/
		 	    
		    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - -*/
		  String sql = "INSERT INTO bill(BILLID, BILLTOTAL, BILLOUTSTANDING, APPOINTMENT_APPOINTMENTID, DOCTORID, BILLPAYED)"
    			  + "Values (mySeq.nextVal,?,?,?,?,?)";
    	
    	  PreparedStatement statementTwo = connect.prepareStatement(sql);
    	  
		  statementTwo.setFloat(1, BillTotal);
		  statementTwo.setFloat(2, BillTotal);
		  statementTwo.setInt(3, willHoldAppointmentId);
		  statementTwo.setInt(4,DoctorID);
		  statementTwo.setString(5,"No");
		                                                                              // Good
		  int rows = statementTwo.executeUpdate();
	 	  
		  System.out.println();
	 	  if(rows > 0) {
	 		  System.out.println("        A Bill has been created succesfully.");
	 		  System.out.println("     -------------------------------------");
    		  System.out.println("           -------------------------");
    		  System.out.println("                 ------------");
	 		  System.out.println();
	 	  }
	 	 /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/
		  
		  
	   	} catch (Exception e) {
			 System.out.println(e);
		}
	
   }

     public static void creatRecord(Connection con, String Date, int docID, int patientID) throws Exception {
    	 
    	try {
    		/*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  /*- - - - - - - - -  - - - - - -*/ 	
			  String holdsDate = Date;
			  int DoctorId = docID;
			  int PatientId = patientID;
			  /*- - - - - - - - -  - - - - - -*/ 	
			  int willHoldAppointmentId = 0;
			  /*- - - - - - - - -  - - - - - -*/ 	
			  
			  /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
			    String ssqqll = "SELECT appointment.appointmentid FROM appointment WHERE patientid = ? AND doctorid = ?";
			    PreparedStatement statementOne = connect.prepareStatement(ssqqll);
			    
			    statementOne.setInt(1,PatientId);
			    statementOne.setInt(2, DoctorId);
			    
			    ResultSet rs = statementOne.executeQuery();
			    
			    while(rs.next()) {                                           // Good
			    	willHoldAppointmentId = rs.getInt("appointmentid");
		
			    }
			
			    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
			    
			    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
			    String sqll = "INSERT INTO record (RECORDID, APPOINTMENTID, \"Date\")"
					  + " VALUES (mySeq.nextVal, ?, ?)";
			  
	
			  PreparedStatement statementTwo = connect.prepareStatement(sqll);
			   statementTwo.setInt(1, willHoldAppointmentId);
			   statementTwo.setString(2, holdsDate);
			                                                           //Bad
			  int rows = statementTwo.executeUpdate();
			  if(rows > 0) {
				  System.out.println("        Record has been created succesfully.");
				  System.out.println("      ----------------------------------------");
	    		  System.out.println("             -------------------------");
	    		  System.out.println("                   ------------");
	    		  System.out.println();
			  }
			  /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
			  
		  
		} catch (Exception e) {
			System.out.println(e);
		}
     
     }
     
     
      public static void createPatientRecord(Connection con, int patientID, int docID){
     
    	  
    	  
    	  Connection connect = con;
    	  
    	  try {
			
    		  
    		  int DoctorId = docID;
			  int PatientId = patientID;
			  /*- - - - - - - - -  - - - - - -*/ 	
			  int willHoldAppointmentId = 0;
			  /*- - - - - - - - -  - - - - - -*/ 
			  int willHoldsRecordID = 0;
			  /*- - - - - - - - -  - - - - - -*/ 
			  int clinic = 9823340;
			  
			  /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
			    String ssqqll = "SELECT APPOINTMENTID FROM appointment WHERE patientid = ? AND doctorid = ?";
			    PreparedStatement statementOne = connect.prepareStatement(ssqqll);
			    
			    statementOne.setInt(1,PatientId);
			    statementOne.setInt(2, DoctorId);
			    
			    ResultSet rs = statementOne.executeQuery();
			                                                                 // Good
			    while(rs.next()) {                                               
			    	willHoldAppointmentId = rs.getInt("appointmentid");
			    }
			    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
    		  
    		  String sql = "SELECT RECORDID FROM record WHERE APPOINTMENTID = ?";
    		  PreparedStatement statementTwo = connect.prepareStatement(sql);
    		  
    		  statementTwo.setInt(1, willHoldAppointmentId);
    		  
    		  ResultSet rss = statementTwo.executeQuery();
    		                                                                 // Good
    		   while(rss.next()) {                                           
			    	willHoldsRecordID = rss.getInt("RECORDID");
			    }
    		   /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -*/
    		  
    		  
        	  String sqql = "INSERT INTO patientrecord (PATIENTRECORDID, RECORD_RECORDID, PATIENT_PATIENTID, CLINICLICENSE)"
              + " VALUES (mySeq.nextVal, ?, ?, ?)";

    		  
        	  PreparedStatement statementThree = connect.prepareStatement(sqql);
        	  statementThree.setInt(1,willHoldsRecordID);
        	  statementThree.setInt(2,PatientId);
        	  statementThree.setInt(3,clinic);
        	                                                                // Good
        	  int rows = statementThree.executeUpdate();
        	  
        	  if(rows > 0) {
        		  System.out.println("     Patient record has been created succesfully.");
    			  System.out.println("       ----------------------------------------");
	    		  System.out.println("              -------------------------");
	    		  System.out.println("                    ------------");
        		  
        	  }
        	  
    		  
		} catch (Exception e) {
			System.out.println(e);
		}
         
       }       

      public static void editPatient(Connection con) throws Exception {
	
    	  try {
  			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 		
			  
			  int willHoldChoice = 0;
			  String sql;
			  PreparedStatement statement;
			  
			  String sqlpatient = "SELECT patient. patientID, patient.firstname, patient.middlename, patient.lastname, patient.activepatient FROM patient";
			  
			  
	            Statement sqlstatement = connect.createStatement();
	            ResultSet result = sqlstatement.executeQuery(sqlpatient);
	            System.out.println();
	            System.out.println("                            Patients");
	            System.out.println("ID #      First Name          Middle Name            Last Name           Status");
	            System.out.println("===============================================================================");
	            
	            while(result.next()) {
	            	int IDPT = result.getInt("patientID");
	            	String firstNamePT = result.getString("firstname");
	            	String middleNamePT = result.getString("middlename");
	            	String lastNamePT = result.getString("lastname");
	            	String statusPT = result.getString("activepatient");
	            	System.out.printf("%4d %13s %20s %20s %15s\n", IDPT, firstNamePT, middleNamePT, lastNamePT, statusPT);
	            }
	            System.out.println(); System.out.println();
			  
			  String Done = "car";
			  while(willHoldChoice!=12) {
				  
				  System.out.println();
				  System.out.println(" Options:                 ");
				  System.out.println("        Enter 0: to change patient -> SSN");
				  System.out.println("        Enter 1: to change patient -> First-Name");
				  System.out.println("        Enter 2: to change patient -> Middle-Name");
				  System.out.println("        Enter 3: to change patient -> Last-Name");
				  System.out.println("        Enter 4: to change patient -> StreetAdd");
				  System.out.println("        Enter 5: to change patient -> City");
				  System.out.println("        Enter 6: to change patient -> State");
				  System.out.println("        Enter 7: to change patient -> Zip");
				  System.out.println("        Enter 8: to change patient -> Email");
				  System.out.println("        Enter 9: to change patient -> Status");
				  System.out.println("        Enter 10: to change patient -> Phone");
				  System.out.println("        Enter 11: to change patient -> DOB");
				  System.out.println("        Enter 12: to Exit");
				  System.out.print("Enter choice: ");
				  willHoldChoice = scan.nextInt();
				  System.out.println();
				  
				  
				  if(willHoldChoice == 0) {
					  	System.out.print("Enter patient ID: ");
						int patientID = scan.nextInt();
					  	System.out.print("Enter new SSN: ");
						String newSName = scan.next();
						
						 sql = "UPDATE Patient SET SSN = ? WHERE PATIENTID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setString(1, newSName);
						statement.setInt(2, patientID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("---------------------------------");
							System.out.println("Patient SSN has been updated");
						}
					  
				  }else if(willHoldChoice == 1) {
				     
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new name: ");
					String newName = scan.next();
					
					 sql = "UPDATE Patient SET FIRSTNAME = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------");
						System.out.println("Patient name has been updated");
					}
			
				}else if(willHoldChoice == 2) {
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new middle name: ");
					String newMName = scan.next();
					
					 sql = "UPDATE Patient SET MIDDLENAME = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newMName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-----------------------------------------");
						System.out.println("Patient Middle name has been updated");
					}
					
				}else if(willHoldChoice == 3) {
					
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new last name: ");
					String newLName = scan.next();
					
					 sql = "UPDATE Patient SET LASTNAME = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newLName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("--------------------------------------");
						System.out.println("Patient last name has been updated");
					}
					
				}else if(willHoldChoice == 4) {
					
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter address name: ");
					String newAName = scan.next();
					
					 sql = "UPDATE Patient SET STREETADD = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newAName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("--------------------------------------");
						System.out.println("Patient Address has been updated");
					}
					
					
				}else if(willHoldChoice == 5) {
					
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new City: ");
					String newCName = scan.next();
					
					 sql = "UPDATE Patient SET CITY = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newCName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------");
						System.out.println("Patient City has been updated");
					}
					
				}else if(willHoldChoice == 6) {
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new State: ");
					String newSName = scan.next();
					
					 sql = "UPDATE Patient SET STATE = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newSName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("----------------------------------");
						System.out.println("Patient State has been updated");
					}
					
				}else if(willHoldChoice == 7) {
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new zip: ");
					int newZName = scan.nextInt();
					
					 sql = "UPDATE Patient SET ZIP = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setInt(1, newZName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("--------------------------------------");
						System.out.println("Patient zip code has been updated");
					}
					
				}else if(willHoldChoice == 8) {
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new email: ");
					String newEName = scan.next();
					
					 sql = "UPDATE Patient SET EMAIL = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newEName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("------------------------------------");
						System.out.println("Patient Email has been updated");
					}
					
				}else if(willHoldChoice == 9) {
					
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new status (T or F): ");
					String newAName = scan.next();
					
					 sql = "UPDATE Patient SET ACTIVEPATIENT = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newAName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-----------------------------------");
						System.out.println("Patient status has been updated");
					}
					
				}else if(willHoldChoice == 10) {
					
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new phone: ");
					String newPName = scan.next();
					
					 sql = "UPDATE Patient SET PHONE = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newPName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-----------------------------------------");
						System.out.println("Patient phone number has been updated");
					}
					
				}else if(willHoldChoice == 11) {
					System.out.print("Enter patient ID: ");
					int patientID = scan.nextInt();
					System.out.print("Enter new DOB: ");
					String newOName = scan.next();
					
					 sql = "UPDATE Patient SET DOB = ? WHERE PATIENTID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newOName);
					statement.setInt(2, patientID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------");
						System.out.println("Patient DOB has been updated");
					}
				}else if(willHoldChoice == 12) {
				}else {
					System.out.println("----------------------------------");
					System.out.println("Select number is out of bounds");
				}
				
			  }
		
    		} catch (Exception e) {
   			 System.out.println(e);
   		}
	
	
    }
      
      
      
      
     public static void editDoctor(Connection con) throws Exception {
	
    	 try {
 			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	 
			  
			  int willHoldChoice = 0;
			  String sql;
			  PreparedStatement statement;
			  
			  String sqlll = "SELECT doctor.firstname, doctor.middlename, doctor.lastname FROM doctor WHERE doctor.activedoctor = 'T' OR doctor.activedoctor = 't' ";

	            
	            Statement statementThree = connect.createStatement();
	            ResultSet resultThree = statementThree.executeQuery(sqlll);
	            System.out.println("                     Active Doctors");
	            System.out.println("========================================================");
	            System.out.println("   First Name          Middle Name            Last Name");
	            
	            while(resultThree.next()) {
	            	String firstNameDT = resultThree.getString("firstname");
	            	String middleNameDT = resultThree.getString("middlename");
	            	String lastNameDT = resultThree.getString("lastname");
	            	System.out.printf("%13s %20s %20s\n", firstNameDT, middleNameDT, lastNameDT);
	            }
	            	System.out.println(); System.out.println();    
			  
			  String Done = "car";
			  while(willHoldChoice!=13) {
				  
				  System.out.println();
				  System.out.println(" Options:                 ");
				  System.out.println("        Enter 0: to change Doctor ->  SSN");
				  System.out.println("        Enter 1: to change Doctor ->  First-Name");
				  System.out.println("        Enter 2: to change Doctor ->  Middle-Name");
				  System.out.println("        Enter 3: to change Doctor ->  Last-Name");
				  System.out.println("        Enter 4: to change Doctor ->  StreetAdd");
				  System.out.println("        Enter 5: to change Doctor ->  City");
				  System.out.println("        Enter 6: to change Doctor ->  State");
				  System.out.println("        Enter 7: to change Doctor ->  Zip");
				  System.out.println("        Enter 8: to change Doctor ->  Email");
				  System.out.println("        Enter 9: to change Doctor ->  Status");
				  System.out.println("        Enter 10: to change Doctor -> Phone");
				  System.out.println("        Enter 11: to change Doctor -> DOB");
				  System.out.println("        Enter 12: to change Doctor -> Clinic License");
				  System.out.println("        Enter 13: to Exit");
				  System.out.print("Enter choice: ");
				  willHoldChoice = scan.nextInt();
				  System.out.println();
			  
				  if(willHoldChoice == 0) {
						System.out.print("Enter Doctor ID: ");
						int docID = scan.nextInt();
						System.out.print("Enter new SSN: ");
						String newSName = scan.next();
						
						sql = "UPDATE Doctor SET SSN = ? WHERE DOCTORID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setString(1, newSName);
						statement.setInt(2, docID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("-----------------------------");
							System.out.println("New SSN has been created");
						}
					  
				  }else if(willHoldChoice == 1) {
				     
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new name: ");
					String newName = scan.next();
					
					 sql = "UPDATE Doctor SET FIRSTNAME = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("------------------------------------");
						System.out.println("Doctor's Name has been updated");
					}
			
				}else if(willHoldChoice == 2) {
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new middle name: ");
					String newMName = scan.next();
					
					 sql = "UPDATE Doctor SET MIDDLENAME = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newMName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("------------------------------------");
						System.out.println("Doctor's Name has been updated");
					}
					
				}else if(willHoldChoice == 3) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new last name: ");
					String newLName = scan.next();
					
					 sql = "UPDATE Doctor SET LASTNAME = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newLName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("----------------------------------------");
						System.out.println("Doctor's Last Name has been updated");
					}
					
				}else if(willHoldChoice == 4) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter address name: ");
					String newAName = scan.next();
					
					 sql = "UPDATE Doctor SET STREETADD = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newAName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------------");
						System.out.println("Doctor's Address has been updated");
					}
					
					
				}else if(willHoldChoice == 5) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new City: ");
					String newCName = scan.next();
					
					 sql = "UPDATE Doctor SET CITY = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newCName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------");
						System.out.println("Doctor's city has been updated");
					}
					
				}else if(willHoldChoice == 6) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new State: ");
					String newSName = scan.next();
					
					 sql = "UPDATE Doctor SET STATE = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newSName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-----------------------------------");
						System.out.println("Doctor's state has been updated");
					}
					
				}else if(willHoldChoice == 7) {
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new zip: ");
					int newZName = scan.nextInt();
					
					 sql = "UPDATE Doctor SET ZIP = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setInt(1, newZName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("---------------------------------------");
						System.out.println("Doctor's Zip code has been updated");
					}
					
				}else if(willHoldChoice == 8) {
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new email: ");
					String newEName = scan.next();
					
					 sql = "UPDATE Doctor SET EMAIL = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newEName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("--------------------------------------------");
						System.out.println("Doctor's email address has been updated");
					}
					
				}else if(willHoldChoice == 9) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new active status: ");
					String newAName = scan.next();
					
					 sql = "UPDATE Doctor SET ACTIVEDOCTOR = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newAName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-------------------------------------");
						System.out.println("Doctor's status has been updated");
					}
					
				}else if(willHoldChoice == 10) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new phone: ");
					String newPName = scan.next();
					
					 sql = "UPDATE Doctor SET PHONENUMBER = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newPName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-------------------------------------------");
						System.out.println("Doctor's phone number has been updated");
					}
					
				}else if(willHoldChoice == 11) {
					
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					System.out.print("Enter new DOB: ");
					String newOName = scan.next();
					
					 sql = "UPDATE Doctor SET DOB = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setString(1, newOName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-----------------------------------");
						System.out.println("Doctor's DOB has been updated");
					}
				}else if(willHoldChoice == 12) {
					System.out.print("Enter Doctor ID: ");
					int docID = scan.nextInt();
					
					System.out.print("Enter new Clinc License: ");
					int newOName = scan.nextInt();
					
					 sql = "UPDATE Doctor SET CLINIC_CLINICLICENSE = ? WHERE DOCTORID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setInt(1, newOName);
					statement.setInt(2, docID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("----------------------------------------------");
						System.out.println("Doctor's Clinic License has been updated");
					}
				}else if(willHoldChoice == 13) {
				}else {
					System.out.println("Select number is out of bounds");
				}

			  }
			  
    		} catch (Exception e) {
   			 System.out.println(e);
   		  }
	
     }


      public static void editAppointment(Connection con) throws Exception {
	
    	  try {
  			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	
			  
			  
			  int willHoldChoice = 0;
			  String sql;
			  PreparedStatement statement;
			  
			  String Done = "car";
			  while(willHoldChoice !=6) {
				  
				  System.out.println();
				  System.out.println(" Options:                 ");
				  System.out.println("        Enter 1: to change -> App date");
				  System.out.println("        Enter 2: to change -> App time");
				  System.out.println("        Enter 3: to change -> App PatientID");
				  System.out.println("        Enter 4: to change -> Doctor DoctorId");
				  System.out.println("        Enter 5: to change -> Appointment Status");
				  System.out.println("        Enter 6: to -> Exit");
				  willHoldChoice = scan.nextInt();
				  System.out.println();
			  
				  if(willHoldChoice == 1) {
						System.out.print("Enter new date (dd-mmm-yyyy): ");
						String newSName = scan.next();
						System.out.print("Enter App ID: ");
						int appID = scan.nextInt();
						
						sql = "UPDATE APPOINTMENT SET Date = ? WHERE APPOINTMENTID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setString(1, newSName);
						statement.setInt(2, appID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("--------------------------------------");
							System.out.println("Appointment Date has been updated");
						}
					  
				  }else if (willHoldChoice == 2) {
						System.out.print("Enter new time (HH:MM AM/PM): ");
						String newSName = scan.next();
						System.out.print("Enter App ID: ");
						int appID = scan.nextInt();
						
						sql = "UPDATE APPOINTMENT SET APPOINTMENTTIME = ? WHERE APPOINTMENTID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setString(1, newSName);
						statement.setInt(2, appID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("--------------------------------------");
							System.out.println("Appointment time has been updated");
						}
				  }else if(willHoldChoice == 3 ) {
					  
						System.out.print("Enter new PatientID: ");
						int newSName = scan.nextInt();
						System.out.print("Enter App ID: ");
						int appID = scan.nextInt();
						
						sql = "UPDATE APPOINTMENT SET PATIENTID = ? WHERE APPOINTMENTID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setInt(1, newSName);
						statement.setInt(2, appID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("------------------------------------------");
							System.out.println("Appointment PatientId has been updated");
						}
					  
				  }else if(willHoldChoice == 4) {
						System.out.print("Enter new DoctorID: ");
						int newSName = scan.nextInt();
						System.out.print("Enter App ID: ");
						int appID = scan.nextInt();
						
						sql = "UPDATE APPOINTMENT SET DOCTORID = ? WHERE APPOINTMENTID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setInt(1, newSName);
						statement.setInt(2, appID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("-------------------------------------");
							System.out.println("Appointment time has been updated");
						}
						
						
				   else if(willHoldChoice == 5) {
					   System.out.print("Enter App ID: ");
					   appID = scan.nextInt();
					   System.out.print("\nEnter appointment status (SCHEDULED, COMPLETE, CANCELLED): ");
					   String appStatus = scan.next();
					   
					   sql = "UPDATE APPOINTMENT SET STATUS = ? WHERE APPOINTMENTID = ?";
					   statement = connect.prepareStatement(sql);
					   statement.setString(1, appStatus);
					   statement.setInt(2, appID);
					   
					   row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("-------------------------------------");
							System.out.println("Appointment status has been updated");
						}
					   
				   }
						
				  }else if(willHoldChoice == 6) {
				  }else {
					  System.out.println("Select number is out of bounds");
				  }
			 
			  }
			  
			  
			  //connect.close();
    		} catch (Exception e) {
   			 System.out.println(e);
   		}
	
	
      }

     public static void editBill(Connection con) throws Exception {
	
    	 try {
 			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	
			  
			  
			  int willHoldChoice = 0 ;
			  String sql;
			  PreparedStatement statement;
			  
			  while((willHoldChoice != 5) ) {
				  
				  System.out.println();
				  System.out.println(" Options:                 ");
				  System.out.println("        Enter 1: to change -> Bill total");
				  System.out.println("        Enter 2: to change -> App ID");
				  System.out.println("        Enter 3: to change -> DoctorID");
				  System.out.println("        Enter 4: to change -> BillPayed");
				  System.out.println("        Enter 5: to Exit");
				  System.out.println();
				  
			       System.out.print("Enter the your choice: ");
				  willHoldChoice = scan.nextInt();
				  System.out.println("----------------------------------------");
				  
			       if(willHoldChoice == 1) {
			    	   
			    		System.out.print("Enter new Bill total: ");
						Float newSName = scan.nextFloat();
						System.out.print("Enter Bill ID: ");
						int billID = scan.nextInt();
						
						sql = "UPDATE BILL SET BILLTOTAL = ? WHERE BILLID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setFloat(1,newSName);
						statement.setInt(2, billID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("-------------------------------");
							System.out.println("New Time has been created");
						}
			    	   
				  
			      }else if(willHoldChoice == 2) {
			    	  
			   		System.out.print("Enter new App ID: ");
					int newSName = scan.nextInt();
					System.out.print("Enter Bill ID: ");
					int billID = scan.nextInt();
					
					sql = "UPDATE BILL SET APPOINTMENT_APPOINTMENTID = ? WHERE BILLID = ?";
				    statement = connect.prepareStatement(sql);
					statement.setInt(1,newSName);
					statement.setInt(2, billID);
					
					int row = statement.executeUpdate();
					if(row > 0) {
						System.out.println("-------------------------------");
						System.out.println("New Time has been created");
					}
			    	  
			      }else if(willHoldChoice == 3) {
			    	  
			    	  System.out.print("Enter new Doctor ID: ");
						int newSName = scan.nextInt();
						System.out.print("Enter Bill ID: ");
						int billID = scan.nextInt();
						
						sql = "UPDATE BILL SET DOCTORID = ? WHERE BILLID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setInt(1,newSName);
						statement.setInt(2, billID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("------------------------------");
							System.out.println("New Time has been created");
						}
			    	  
			    	  
			      }else if(willHoldChoice == 4) {
			    	  
			    	  System.out.print("Enter new BillPayed status: ");
						String newSName = scan.next();
						System.out.print("Enter Bill ID: ");
						int billID = scan.nextInt();
						
						sql = "UPDATE BILL SET BILLPAYED = ? WHERE BILLID = ?";
					    statement = connect.prepareStatement(sql);
						statement.setString(1,newSName);
						statement.setInt(2, billID);
						
						int row = statement.executeUpdate();
						if(row > 0) {
							System.out.println("------------------------------");
							System.out.println("New Time has been created");
						}
			      }else if(willHoldChoice == 5) {
			    	  main(null);
			      }
				  else {
					  System.out.print("Select number is out of bounds\n");
				  }
			       
			   
			  }
			  
			  
		  //connect.close();
			
			  
    		} catch (Exception e) {
   			 System.out.println(e);
   		}
	
	
      }


     public static void makePayment(Connection con) throws Exception {
	
    	 try {
 			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	
			  int willHoldBillId;
			  float willHoldBillTotal;
			  float willHoldBillOutstanding = 0;
			  int willHoldAppointmentId;
			  /*- - - - - - - - -  - - - - - -*/ 
			  
			  
			  //while(){
			  System.out.println();
			    System.out.println("         Make Payment ");
			      System.out.println("============================");
			      System.out.println();
			  
			  System.out.print("Please Enter the patient ID: ");
			  int holdsPatientID = scan.nextInt();
			  
			  System.out.println("BillID- - -> BillTotal- - -> Billoutstanding- - -> AppointmentID- - -> ");
			  
			  String sql = "SELECT DISTINCT bill.billid, bill.billtotal,bill.billoutstanding,bill.appointment_appointmentid" 
					  + " FROM BILL, appointment "
					  + "WHERE appointment.appointmentid IN ("
					  + " Select appointment.appointmentid " 
					  + " FROM appointment "
					  + " WHERE appointment.patientid = ?)";
			  
			  PreparedStatement statement = connect.prepareStatement(sql);
			  statement.setInt(1, holdsPatientID);
			    
			    ResultSet rs = statement.executeQuery();
			                                                                 
			    while(rs.next()) {                                               
			    	willHoldBillId= rs.getInt("billid");
			    	willHoldBillTotal = rs.getFloat("billtotal");
			    	willHoldBillOutstanding = rs.getFloat("billoutstanding");
			    	willHoldAppointmentId = rs.getInt("appointment_appointmentid");
			    	
			    	System.out.println();
			    	System.out.println("                   " + willHoldBillId + " : " + willHoldBillTotal + " : " + willHoldBillOutstanding + " : " + willHoldAppointmentId);
			    	System.out.println();
			    }

			  
			    System.out.print("Select the BillId you would like to pay: ");
			    int holdsSelectedBillId = scan.nextInt();
			    
			    sql = "SELECT bill.billid, bill.billtotal, bill.billoutstanding, bill.appointment_appointmentid FROM bill WHERE billid = '" + holdsSelectedBillId + "'";
			    statement = connect.prepareStatement(sql);
			    rs = statement.executeQuery();
			    while(rs.next()) {                                               
			    	willHoldBillId= rs.getInt("billid");
			    	willHoldBillTotal = rs.getFloat("billtotal");
			    	willHoldBillOutstanding = rs.getFloat("billoutstanding");
			    	willHoldAppointmentId = rs.getInt("appointment_appointmentid");
			    }
			    
			    
			    
			    float holdsTheAmount = 0;
			    System.out.print("Enter the amount you want to pay: ");
			    holdsTheAmount = scan.nextFloat();
			    
			    float holsCalaculationAmount = willHoldBillOutstanding - holdsTheAmount;
			    
			    
			    /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/
			   
			    
			    String sqll = "Update BILL set billoutstanding = ? WHERE billid = ?";
			    
		
			    
			    PreparedStatement statementTwo = connect.prepareStatement(sqll);
				  statementTwo.setFloat(1, holsCalaculationAmount);
				  statementTwo.setInt(2, holdsSelectedBillId);
			    
				 
				  
				  int row = statementTwo.executeUpdate();
					if(row > 0) {
						System.out.println();
						System.out.println("       Bill has been upated");
						System.out.println("     ------------------------");
			    		  System.out.println("        --------------");
			    		  System.out.println("            ------");
					}
					
				/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/
					
					
					System.out.println();
					System.out.print("Enter date to store the payment (dd-mmm-yyyy): ");
					String holdsDate = scan.next();
					
					String ssqqll = "INSERT INTO payment(PAYMENTID,PAYMENTDATE,PAYMENTAMOUNT,PATIENT_PATIENTID)"
							  + "Values (mySeq.nextVal,?,?,?)";
				 	
					PreparedStatement statementThree = connect.prepareStatement(ssqqll);
					  statementThree.setString(1, holdsDate);
					  statementThree.setFloat(2, holdsTheAmount);
					  statementThree.setInt(3, holdsPatientID);
			  
					  int rowTwo = statementThree.executeUpdate();
						if(rowTwo > 0) {
							System.out.println();
							System.out.println("       Payment has been created.");
							System.out.println("      --------------------------");
				    		  System.out.println("         ---------------");
				    		  System.out.println("             ------");
    	                  }
			  
			  
			 
			  //connect.close();
		
			  
    		} catch (Exception e) {
   			 System.out.println(e);
   		}
	
	
     }

     public static void createReport(Connection con) throws Exception {
	
    	 try {
 			
    		  /*- - - - - - - - -  - - - - - -*/ 	
			  Connection connect = con;
			  Scanner scan = new Scanner(System.in); // Connection works
			  /*- - - - - - - - -  - - - - - -*/ 	
			  
			  String sql = "SELECT patient.firstname, patient.middlename, patient.lastname FROM patient WHERE patient.activepatient = 'T' OR patient.activepatient = 't' ";
			  
			  
			            Statement statement = connect.createStatement();
			            ResultSet result = statement.executeQuery(sql);
			            System.out.println();
			            System.out.println("                     Active Patients");
			            System.out.println("   First Name          Middle Name            Last Name");
			            System.out.println("========================================================");
			            
			            while(result.next()) {
			            	String firstNamePT = result.getString("firstname");
			            	String middleNamePT = result.getString("middlename");
			            	String lastNamePT = result.getString("lastname");
			            	System.out.printf("%13s %20s %20s\n", firstNamePT, middleNamePT, lastNamePT);
			            }
			            System.out.println(); System.out.println();
	            
			 /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
			    String sqlll = "SELECT doctor.firstname, doctor.middlename, doctor.lastname FROM doctor WHERE doctor.activedoctor = 'T' OR doctor.activedoctor = 't' ";

			            
	            Statement statementThree = connect.createStatement();
	            ResultSet resultThree = statementThree.executeQuery(sqlll);
	            System.out.println("                     Active Doctors");
	            System.out.println("   First Name          Middle Name            Last Name");
	            System.out.println("========================================================");
	            
	            while(resultThree.next()) {
	            	String firstNameDT = resultThree.getString("firstname");
	            	String middleNameDT = resultThree.getString("middlename");
	            	String lastNameDT = resultThree.getString("lastname");
	            	System.out.printf("%13s %20s %20s\n", firstNameDT, middleNameDT, lastNameDT);
	            }
	            	System.out.println(); System.out.println();    
	            
			/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
 
			 /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
			   String sqql = "SELECT bill.billid, bill.billtotal, bill.billoutstanding, appointment.\"Date\" "
			   		+ "FROM BILL "
			   		+ "INNER JOIN appointment ON bill.appointment_appointmentid = appointment.appointmentid "
			   		+ "WHERE bill.billoutstanding != '0'";
					   
			    System.out.println("                              Outstanding Bills");
			    System.out.println("================================================================================");
			    System.out.println("  Bill ID        Bill Total       Bill Outstanding         Appointment Date");
	            Statement statementFive = connect.createStatement();
	            ResultSet resultFive = statementFive.executeQuery(sqql);
	            
	            while(resultFive.next()) {
	            	int billId = resultFive.getInt("billid");
	            	float billTotal = resultFive.getFloat("billtotal");
	            	float billOut = resultFive.getFloat("billoutstanding");
	            	String appTime = resultFive.getString("\"date\"");
	            	System.out.printf("%9d %14.2f %19.2f              %s \n", billId, billTotal, billOut, appTime);
	            }
	            	System.out.println(); System.out.println(); 
	            
	         /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
			  
	            
	            
	            
	            
	           /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	            
	            
	            String sqqll = "SELECT * FROM appointment WHERE appointment.\"Date\" > sysdate";
	            
	            System.out.println("                                   Outstanding Appointments");
			    System.out.println("===========================================================================================================");
			    System.out.println(" App ID           Date                 Time       Patient ID         Doctor ID       Status");
	            Statement statementSix = connect.createStatement();
	            ResultSet resultSix = statementSix.executeQuery(sqqll);
	            
	            while(resultSix.next()) {
	            	int appID = resultSix.getInt("appointmentid");
	            	String date = resultSix.getString("date");
	            	String appTime = resultSix.getString("appointmenttime");
	            	int patientID = resultSix.getInt("patientid");
	            	int doctorID = resultSix.getInt("doctorid");
	            	String status = resultSix.getString("status");
	            	System.out.printf(" %4d       %s       %s       %5d %18d        %s\n", appID, date, appTime, patientID, doctorID, status);
	            }
	            System.out.println(); System.out.println();
	            
			  //connect.close();
			
			  
	            } catch (Exception e) {
   			 System.out.println(e);
   		}
	
	
     }
     
     public static void createCustomReportsName(Connection con) throws Exception {
    	 try {
    		 
    		 	Scanner scan = new Scanner(System.in);
    		 	Connection connect = con;
    		 	
    		 	System.out.println("   --REPORTS BY NAME--");
    		 	System.out.printf("Enter patient last name: ");
    		 	String holdsName = scan.next();
    		 	System.out.println();
    		 	
    		 	String outstandingAppointments = "SELECT patient.lastname, appointment.\"Date\", appointment.appointmenttime FROM appointment\n"
    		 			+ "INNER JOIN patient ON appointment.patientid = patient.patientid\n"
    		 			+ "WHERE patient.lastname = '"
    		 			+ holdsName
    		 			+ "' AND appointment.\"Date\" < sysdate";
	            
	            System.out.println("                  Outstanding Appointments");
			    System.out.println("========================================================================");
			    System.out.println("    Last Name                Date                          Time");
	            Statement statementOne = connect.createStatement();
	            ResultSet resultOne = statementOne.executeQuery(outstandingAppointments);
	            
	            while(resultOne.next()) {
	            	String lastName = resultOne.getString("lastname");
	            	String date = resultOne.getString("date");
	            	String time = resultOne.getString("appointmenttime");
	            	System.out.printf("%15s         %19s          %19s \n", lastName, date, time);
	            	
	            }
	            System.out.println(); System.out.println();
	            
	            
	            String outstandingBills = "SELECT patient.lastname, patient.patientid, bill.billid, bill.billtotal, bill.billoutstanding, appointment.\"Date\" FROM bill \n"
	            		+ "INNER JOIN appointment on bill.appointment_appointmentid = appointment.appointmentid \n"
	            		+ "INNER JOIN patient ON appointment.patientid = patient.patientid\n"
	            		+ "WHERE bill.billoutstanding > 0\n"
	            		+ "AND patient.lastname = '"
	            		+ holdsName
	            		+ "'";
						   
				    System.out.println("                              Outstanding Bills");
				    System.out.println("============================================================================================================");
				    System.out.println("      Last Name             PatientID     Bill ID       Bill Total       Bill Outstanding         Appointment Date");
		            Statement statementTwo = connect.createStatement();
		            ResultSet resultTwo = statementTwo.executeQuery(outstandingBills);
		            
		            while(resultTwo.next()) {
		            	String lastName = resultTwo.getString("lastname");
		            	int patientID = resultTwo.getInt("patientid");
		            	int billId = resultTwo.getInt("billid");
		            	float billTotal = resultTwo.getFloat("billtotal");
		            	float billOut = resultTwo.getFloat("billoutstanding");
		            	String appTime = resultTwo.getString("\"date\"");
		            	System.out.printf("%15s %18d   %10d %15.2f %19.2f              %s \n", lastName, patientID, billId, billTotal, billOut, appTime);
		            }
	            	System.out.println(); System.out.println();
	            
		            String paidBills = "SELECT patient.lastname, patient.patientid, bill.billid, bill.billtotal, bill.billoutstanding, appointment.\"Date\" FROM bill \n"
		            		+ "INNER JOIN appointment on bill.appointment_appointmentid = appointment.appointmentid \n"
		            		+ "INNER JOIN patient ON appointment.patientid = patient.patientid\n"
		            		+ "WHERE bill.billoutstanding = 0\n"
		            		+ "AND patient.lastname = '"
		            		+ holdsName
		            		+ "'";
							   
					    System.out.println("                                 Paid Bills");
					    System.out.println("============================================================================================================");
					    System.out.println("      Last Name             PatientID     Bill ID       Bill Total       Bill Outstanding         Appointment Date");
			            Statement statementThree = connect.createStatement();
			            ResultSet resultThree = statementThree.executeQuery(paidBills);
			            
			            while(resultThree.next()) {
			            	String lastName = resultThree.getString("lastname");
			            	int patientID = resultThree.getInt("patientid");
			            	int billId = resultThree.getInt("billid");
			            	float billTotal = resultThree.getFloat("billtotal");
			            	float billOut = resultThree.getFloat("billoutstanding");
			            	String appTime = resultThree.getString("\"date\"");
			            	System.out.printf("%15s %18d   %10d %15.2f %19.2f              %s \n", lastName, patientID, billId, billTotal, billOut, appTime);
			            }      
		            	System.out.println(); System.out.println();
    		 
    	 }
    	 catch (Exception e) {
    		 System.out.println(e);
    	 }
     }
     
     public static void createCustomReportsDate(Connection con) throws Exception {
    	 try {
    		 
    		Scanner scan = new Scanner(System.in);
 		 	Connection connect = con;
 		 	
 		 	System.out.println("   --REPORTS BY DATE RANGE--");
 		 	System.out.printf("Enter starting date (dd-mmm-yyyy): ");
 		 	String holdsStartingDate = scan.next();
 		 	System.out.printf("\nEnter ending date (dd-mmm-yyyy): ");
 		 	String holdsEndingDate = scan.next();
 		 	System.out.println();
 		 	
 		 	String outstandingAppointments = "SELECT patient.lastname, appointment.\"Date\", appointment.appointmenttime FROM appointment INNER JOIN patient ON appointment.patientid = patient.patientid\n"
 		 			+ "WHERE appointment.\"Date\" BETWEEN '"
 		 			+ holdsStartingDate + "' AND '"
 		 			+ holdsEndingDate + "'";
 		 			
	            
	            System.out.println("                     Outstanding Appointments");
			    System.out.println("============================================================================");
			    System.out.println("  Last Name                    Date                            Time");
	            Statement statementOne = connect.createStatement();
	            ResultSet resultOne = statementOne.executeQuery(outstandingAppointments);
	            
	            while(resultOne.next()) {
	            	String lastName = resultOne.getString("lastname");
	            	String date = resultOne.getString("date");
	            	String time = resultOne.getString("appointmenttime");
	            	System.out.printf(" %12s            %19s             %14s \n", lastName, date, time);
	            	
	            }
	            System.out.println(); System.out.println();
	            
	            String outstandingBills = "SELECT patient.lastname, patient.patientid, bill.billid, bill.billtotal, bill.billoutstanding, appointment.\"Date\" FROM appointment INNER JOIN bill ON appointment.appointmentid = bill.appointment_appointmentid\n"
	            		+ "INNER JOIN patient on appointment.patientid = patient.patientid\n"
	            		+ "WHERE appointment.\"Date\" BETWEEN '"
	            		+ holdsStartingDate +"' AND '"
	            		+ holdsEndingDate + "'"
	            		+ " AND bill.billoutstanding != '0'";
						   
				    System.out.println("                              Outstanding Bills");
				    System.out.println("============================================================================================================");
				    System.out.println("      Last Name             PatientID     Bill ID       Bill Total       Bill Outstanding         Appointment Date");
		            Statement statementTwo = connect.createStatement();
		            ResultSet resultTwo = statementTwo.executeQuery(outstandingBills);
		            
		            while(resultTwo.next()) {
		            	String lastName = resultTwo.getString("lastname");
		            	int patientID = resultTwo.getInt("patientid");
		            	int billId = resultTwo.getInt("billid");
		            	float billTotal = resultTwo.getFloat("billtotal");
		            	float billOut = resultTwo.getFloat("billoutstanding");
		            	String appTime = resultTwo.getString("\"date\"");
		            	System.out.printf("%15s %18d   %10d %15.2f %19.2f              %s \n", lastName, patientID, billId, billTotal, billOut, appTime);
		            }
		            System.out.println(); System.out.println();
	            
		            String paidBills = "SELECT patient.lastname, patient.patientid, bill.billid, bill.billtotal, bill.billoutstanding, appointment.\"Date\" FROM appointment INNER JOIN bill ON appointment.appointmentid = bill.appointment_appointmentid\n"
		            		+ "INNER JOIN patient on appointment.patientid = patient.patientid\n"
		            		+ "WHERE appointment.\"Date\" BETWEEN '"
		            		+ holdsStartingDate +"' AND '"
		            		+ holdsEndingDate + "'"
		            		+ " AND bill.billoutstanding = '0'";
							   
					    System.out.println("                              Paid Bills");
					    System.out.println("============================================================================================================");
					    System.out.println("      Last Name             PatientID     Bill ID       Bill Total       Bill Outstanding         Appointment Date");
			            Statement statementThree = connect.createStatement();
			            ResultSet resultThree = statementThree.executeQuery(paidBills);
			            
			            while(resultThree.next()) {
			            	System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			            	String lastName = resultThree.getString("lastname");
			            	int patientID = resultThree.getInt("patientid");
			            	int billId = resultThree.getInt("billid");
			            	float billTotal = resultThree.getFloat("billtotal");
			            	float billOut = resultThree.getFloat("billoutstanding");
			            	String appTime = resultThree.getString("\"date\"");
			            	System.out.printf("%15s %18d   %10d %15.2f %19.2f              %s \n", lastName, patientID, billId, billTotal, billOut, appTime);            		            
			            }
			            System.out.println(); System.out.println();	
    	 }
    	 catch (Exception e) {
    		 System.out.println(e);
    	 }
     }

	
	
		
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

	
		         // String-Connection & username & Password
		/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	    System.out.println("Enter username: ");
		String user = scan.nextLine();
		System.out.println("Enter password: ");
	    String password = scan.nextLine();
	    String url = "jdbc:oracle:thin:@cisvm-oracle.unfcsd.unf.edu:1521:orcl";
	    /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	    
	    try {   // Connection being established        
	     /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection connect = DriverManager.getConnection(url, user, password);
	      /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	      
	      // Will hold the number the Staff select from the menu
	      int hold;
		
	      do {
	
	           // Menu Option
	      /* - - - - - - - - - - - - - - - - - - - - */
	    	  System.out.println();
	    	  System.out.println();
	      System.out.println("  Welcome To Osprey Medical  ");
	      System.out.println("============================");
	      System.out.println("  Options:                   ");
	  //    System.out.println("Select an Option");
	      
	      System.out.println();
	      System.out.println("         Enter 1: to create a patient");
	      System.out.println("         Enter 2: to create a Doctor");
	      System.out.println("         Enter 3: to create an Appointment");
	      System.out.println("         Enter 4: to Edit Patient");
	      System.out.println("         Enter 5: to Edit Doctor");
	      System.out.println("         Enter 6: to Edit Appointment");
	      System.out.println("         Enter 7: to Edit Bill");
	      
	      System.out.println("         Enter 8: to Make a payment");
	      System.out.println("         Enter 9: Create generic reports");
	      System.out.println("         Enter 10: Create custom reports");
	      
	      System.out.println("         Enter 11: to Exit");
	      /* - - - - - - - - - - - - - - - - - - - - */
	      System.out.println();
	                                                    // The choice is made
	      System.out.print("Enter your choice: ");
	      hold = scan.nextInt();
	//      System.out.println("\n");
	      /* - - - - - - - - - - - - - - - - - - - - */ 
          
          switch(hold) {
   
          case 1:
        	createPatient(connect); 
        	break;
          case 2:
        	  createDoctor(connect);
        	break;
          case 3:
            createAppointment(connect);
        	  break;
          case 4:
        	  editPatient(connect);
        	  break;
          case 5: 
        	  editDoctor(connect);
        	  break;
          case  6:
        	  editAppointment(connect);
        	  break;
          case 7:
        	  editBill(connect);
          case 8:
        	  makePayment(connect);
        	  break;
          case 9:
        	  createReport(connect);
        	  break;
          case 10:
        	 
        	  int reporting = 0;
        	  System.out.println("\n\n    --CUSTOM REPORTING--");
        	  System.out.println("Please choose from the following options:");
        	  System.out.println("1. Reporting by name");
        	  System.out.println("2. Reporting by date range");
        	  System.out.println("0. Quit");
        	  System.out.printf("\nSelection: ");
        	  reporting = scan.nextInt();
        	  	while(reporting != 0) {
        	  		if(reporting == 1) {
        	  			createCustomReportsName(connect);
        	  			break;
        	  		}
        	  		if(reporting == 2) {
        	  			createCustomReportsDate(connect);
        	  			break;
        	  		}
        	  		System.out.printf("\nInvalid selection, please choose again: ");
        	  		reporting = scan.nextInt();
        	  	}
        	  		break;
            }
          
          
          if(hold != 11 && hold != 1 && hold != 2 && hold != 3 && hold != 4 && hold != 5 && hold != 6 && hold != 7 && hold != 8 && hold != 9 && hold != 10) {
        	  System.out.println();
        	  System.out.println("Plese select one of the option that are listed");  
        	  System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -"); 
        	  System.out.println("         - - - - - - - - - - - - - - "); 
        	  System.out.println("              - - - - - - - - - "); 
        	  System.out.println("                 - - - - - -"); 
        	  System.out.println();
          }
       
	      } while (hold != 11);
	      
		 System.out.println("--Thank you for using the Osprey Medical Database Program!--");
	     connect.close();
	     scan.close();
	      
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	    

	 	
	}
	
}
