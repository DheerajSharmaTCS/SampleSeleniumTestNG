package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest {
    @Test
    void loginWithEmail(){
        System.out.println("Login With Email");
        Assert.assertEquals("dheeraj","dheeraj");
    }
    @Test
    void loginByFacebook(){
        System.out.println("Login With Facebook");
        Assert.assertEquals(2,4);//false
    }
}
