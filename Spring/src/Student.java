

import java.util.ArrayList;

public class Student {

private int sNumber ;
private String name ;

private String dept;

private Sample sample;
public Student(){
	System.out.println("Student------");
}

public Sample getSample() {
	return sample;
}

public void setSample(Sample sample) {
	this.sample = sample;
}

public int getsNumber() {
	return sNumber;
}

public void setsNumber(int sNumber) {
	this.sNumber = sNumber;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
