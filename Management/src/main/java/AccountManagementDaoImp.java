import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import com.capgemini.pecuniafinance.bean.*;
import com.capgemini.pecuniafinance.service.AccountManagementServiceImp;

import junit.framework.TestCase;



public class AccountManagementDaoImp extends TestCase{
	 static Map<Long,AccountDetails> map=new HashMap<Long,AccountDetails>();
	 AccountManagementServiceImp service = new AccountManagementServiceImp();
	  @Test
	 public void test()
	 {
		 assertEquals(false,map.containsKey(944094835100l));
	 }
	 @Test
	 public void testValidAddress() {

	 assertEquals(true, service.validAddress("3-76/5u", "block-3", "hyderabad", "telangana", "india", 502301));

	 }
	 @Test
	 public void testValidAddressAddressLine1() {
	
	 assertEquals(true, service.validAddressLine1("3-45/5r"));
	 }
	 @Test
	 public void testValidAddressAddressLine2() {
	 
	 assertEquals(true, service.validAddressLine2("block-35r"));
	 }
	 @Test
	 public void testValidAddressAddressCity() {
	
	 assertEquals(true, service.validAddressCity("kolkata"));
	 }
	 @Test
	 public void testValidAddressState() {
	 
	 assertEquals(true, service.validAddressState("westbengal"));
	 }
	 @Test
	 public void testValidAddressCountry() {
	
	 assertEquals(true, service.validAddressCountry("India"));
	 }
	 @Test
	 public void testValidAddressPincode() {

	 assertEquals(true, service.validAddressPincode(512369));
	 }
	 @Test
	 public void testvalidMobileNumber() {
	
	 assertEquals(true, service.validMobileNumber(7893078017l));
	 }
	
}
