import com.javacourses.clinic.Client;
import com.javacourses.clinic.Clinic;
import org.junit.Assert;
import org.junit.Test;

public class ClinicTest {

    @Test
    public void test_addClient() {
        Clinic clinic = new Clinic(5);
        clinic.addClient(0, new Client("John", "Whatson-cat"));
        clinic.addClient(1, new Client("Bill", "Murrey-cat"));
        clinic.addClient(2, new Client("Deinerys", "Drake1"));
        clinic.addClient(3, new Client("Oleg", "Varick"));
        clinic.addClient(4, new Client("Tom", "Jerry"));

        clinic.addClient(0, new Client("John", "Wane"));
        String idExpect = "John";
        String petExpect = "Wane";
        String idActual = clinic.getClients()[0].getId();
        String petActual = clinic.getClients()[0].getPetName();
        Assert.assertEquals(idExpect, idActual);
        Assert.assertEquals(petExpect, petActual);
    }

    @Test
    public void test_findClientsByPetName(){
        Clinic clinic = new Clinic(5);
        clinic.addClient(0, new Client("John", "Whatson-cat"));
        clinic.addClient(1, new Client("Bill", "Murrey-cat"));
        clinic.addClient(2, new Client("Deinerys", "Drake1"));
        clinic.addClient(3, new Client("Oleg", "Varick"));
        clinic.addClient(4, new Client("Tom", "Jerry"));

        String petName = "Jerry";
        Client[] expectedClients = new Client[1];
        expectedClients[0] = new Client("Tom", "Jerry");
        Client[] actualClients = clinic.findCLientsByPetName(petName);
        for (int i = 0; i < expectedClients.length; i++) {
            System.out.println(expectedClients[i]);
            System.out.println(actualClients[i]);
            Assert.assertEquals(expectedClients[i], actualClients[i]);
        }
    }
}
