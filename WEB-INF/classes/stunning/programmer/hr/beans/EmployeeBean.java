package stunning.programmer.hr.beans;
import java.util.*;
import java.math.*;

public class EmployeeBean implements java.io.Serializable
{
private String employeeId;
private String name;
private int designationCode;
private String designation;
private String dateOfBirth;
private String gender;
private boolean isIndian;
private BigDecimal basicSalary;
private String panNumber;
private String aadharCardNumber;
public EmployeeBean()
{
this.employeeId="";
this.name="";
this.designationCode=0;
this.designation="";
this.dateOfBirth="";
this.gender="";
this.isIndian=false;
this.basicSalary=null;
this.panNumber="";
this.aadharCardNumber="";
}
public boolean isMale()
{
return gender.equals("M");
}
public boolean isFeMale()
{
return gender.equals("F");
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDesignationCode() {
	return designationCode;
}
public void setDesignationCode(int designationCode) {
	this.designationCode = designationCode;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public boolean getIsIndian() {
	return isIndian;
}
public void setIsIndian(boolean isIndian) {
	this.isIndian = isIndian;
}
public BigDecimal getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(BigDecimal basicSalary) {
	this.basicSalary = basicSalary;
}
public String getPanNumber() {
	return panNumber;
}
public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}
public String getAadharCardNumber() {
	return aadharCardNumber;
}
public void setAadharCardNumber(String aadharCardNumber) {
	this.aadharCardNumber = aadharCardNumber;
}
}