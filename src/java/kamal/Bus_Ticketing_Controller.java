package kamal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/busTicketURL")
public class Bus_Ticketing_Controller {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Bus_Ticketing addCountry(Bus_Ticketing bus_ticketing) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kamal", "root", "123");
            PreparedStatement ps = con.prepareStatement("INSERT INTO bus_ticketing (date, start_date, passenger_name, age, sex, phone_number, destination, bus_number, bus_name, bus_type, ticket_type, total_amount) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, bus_ticketing.getCurrentDate());
            ps.setString(2, bus_ticketing.getStartDate());
            ps.setString(3, bus_ticketing.getPassengerName());
            ps.setString(4, bus_ticketing.getPassengerAge());
            ps.setString(5, bus_ticketing.getPassengerSex());
            ps.setString(6, bus_ticketing.getPhoneNumber());
            ps.setString(7, bus_ticketing.getPassengerDestination());
            ps.setString(8, bus_ticketing.getBusNumber());
            ps.setString(9, bus_ticketing.getBusName());
            ps.setString(10, bus_ticketing.getBusType());
            ps.setString(11, bus_ticketing.getTicketType());
            ps.setString(12, bus_ticketing.getTotalAmount());

            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);
        }

        return bus_ticketing;
    }
    
}
