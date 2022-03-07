package com.collabera.capstone;

import com.collabera.capstone.model.Driver;
import com.collabera.capstone.model.TripBooking;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.collabera.capstone.model.Admin;
import com.collabera.capstone.model.Cab;
import com.collabera.capstone.model.Customer;
import com.collabera.capstone.service.impl.AdminServiceImpl;
import com.collabera.capstone.service.impl.CabServiceImpl;
import com.collabera.capstone.service.impl.CustomerServiceImpl;
import com.collabera.capstone.service.impl.DriverServiceImpl;
import com.collabera.capstone.service.impl.TripBookingServiceImpl;



@SpringBootTest
class CabBookingApplicationTests {
@Autowired
CabServiceImpl cabserviceimpl;
@Autowired
DriverServiceImpl driverserviceimpl;
@Autowired
AdminServiceImpl adminserviceimpl;
@Autowired
CustomerServiceImpl customerserviceimpl;
@Autowired
TripBookingServiceImpl tripbookingserviceimpl;



@Test
void contextLoads() {
}



@Test
public void insertCab() {
Cab c = new Cab();
c.setCabId(1);
c.setCarType("Audi");
c.setPerKmRate(10.0F);
cabserviceimpl.insertCab(c);
assertThat(c.getCabId()).isGreaterThan(0);
}



@Test
public void insertAdmin() {
Admin a = new Admin();
a.setAdminId(1);
a.setUsername("abc");
a.setPassword("abc@123");
a.setAddress("Chennai");
a.setMobileNumber("8765745678");
a.setEmail("abc@gmail.com");
adminserviceimpl.insertAdmin(a);
assertThat(a.getAdminId()).isGreaterThan(0);
}



@Test
public void insertCustomer() {
Customer c = new Customer();
c.setCustomerId(1);
c.setUsername("xyz");
c.setPassword("xyz@123");
c.setAddress("Bangalore");
c.setMobileNumber("8778745678");
c.setEmail("xyz@gmail.com");
customerserviceimpl.insertCustomer(c);
assertThat(c.getCustomerId()).isGreaterThan(0);
}



@Test
public void Adddriver() {
Driver d = new Driver();
d.setDriverId(1);
d.setLicenceNo("magh");
d.setRating(4.5F);
Cab c = new Cab();
c.setCabId(1);
c.setCarType("swift");
c.setPerKmRate(11.0F);
d.setCab(c);
driverserviceimpl.insertDriver(d);
assertThat(d.getDriverId()).isGreaterThan(0);



}



@Test
public void insertTripBooking() {
TripBooking tb = new TripBooking();
tb.setTripBookingId(1);
tb.setCustomerId(1);
tb.setFromLocation("vadapalani");
tb.setToLocation("AVM");
tb.setStatus(true);
tb.setBill(65);
tripbookingserviceimpl.insertTripBooking(tb);
assertThat(tb.getTripBookingId()).isGreaterThan(0);
}



@Test
public void DisplayDriver() // display driver
{
assertThat(driverserviceimpl.viewDriver(1)).isNotEqualTo(0);
}



@Test
public void bestDriver() {
assertThat(driverserviceimpl.viewBestDriver()).isNotEqualTo(-1);
}



@Test
public void DisplayCab() // display
{
assertThat(cabserviceimpl.viewCabsOfType(null)).isNotEqualTo(0);
}



@Test
public void counttype() {
assertThat(cabserviceimpl.countCabsOfType("swift")).isNotEqualTo(-1);
}
}