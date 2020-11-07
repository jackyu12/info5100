package hello;

public class Main2 {

	public static void main(String[] args) {
		HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {
                	
                }
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                    while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                    while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
        
    }
		// TODO Auto-generated method stub

	}
class Doctor{
    public String name;
    public Doctor(String name) {
        this.name = name;
    }

}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}
class HospitalRoom {
	private int doctor;
	private int patient;
	public synchronized boolean doctorEnter(Doctor d) throws InterruptedException {
		 
			if(doctor==0) {
	
				doctor++;
				System.out.println("Doctor "+d.name+" entered, number of doctor: "+doctor);
				return true;
				}else if(doctor==1){
					
					System.out.println("Doctor "+d.name+" is waiting to enter, number of doctor: "+doctor);
							
						
					
				}else {
					return false;
				}
		
			
		
	
		return true;
        //TODO: implement your code here
    }

    public synchronized boolean doctorLeave(Doctor d) throws InterruptedException {
    	
    		if(doctor!=1) {
    		return false;
    		}else {
    		doctor--;
    		System.out.println("Doctor "+d.name+" is left, number of doctor: "+doctor);
    		
    		}
    	
    	
    	return true;
        //TODO: implement your code here
    }

    public synchronized boolean patientEnter(Patient p) throws InterruptedException {
    	if(patient<3) {
    		patient++;
    		System.out.println("patient "+p.name+" entered, number of patient: "+patient);
    	}else if(patient==3) {
    		System.out.println("patient "+p.name+" is waiting to enter, number of patient: "+patient);
    		
    	}else
    		return false;
    	return true;
        //TODO: implement your code here
    }

    public synchronized boolean patientLeave(Patient p) throws InterruptedException {
    	if(patient<=0) {
    		return false;
    	}else {
    		patient--;
    		System.out.println("patient "+p.name+" left, number of patient: "+patient);
    	}
    	return true;
        //TODO: implement your code here
    }
}



