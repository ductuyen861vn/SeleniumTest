package ObjectPage;

/**
 * Created by QAVN on 5/22/2017.
 */
public class Guru99LoginPage {

    public static final int WAIT_TIME = 30; // Delay time to wait the website
    // launch completely
    public static final String BASE_URL = "http://www.demo.guru99.com/";

    // Valid account for login
    public static final String USER_NAME = "mngr78109";
    public static final String PASSWD = "gYhYvyt";


    // Expected output
    public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
    public static final String EXPECT_ERROR = "User or Password is not valid";

    public static final String PATTERN = ":";
    public static final String FIRST_PATTERN = "mngr";
    public static final String SECOND_PATTERN = "[0-9]+1";


    public static final String FIREFOX_PATH =
            "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
}
