package View;

/**
 * This class controls the Read User Window
 */
public class ReadUserUserView extends UserView {

    /**
     * Implementing show function in order to manipulate the update button
     */
    @Override
    public void show() {
        super.show();
        userName.setDisable(true);
        userPassword.setDisable(true);
        userFirstName.setDisable(true);
        userLastName.setDisable(true);
        userCity.setDisable(true);
        userBirthDate.setDisable(true);
    }
}