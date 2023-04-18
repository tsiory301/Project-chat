
package event;

import model.Model_Message;


public interface EventLogin {
    public void login();

    public void register(model.Model_Register data, EventMessage message);

    public void goRegister();

    public void goLogin();
    
}
