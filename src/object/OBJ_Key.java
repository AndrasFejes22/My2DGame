package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Key extends SuperObject{

    public OBJ_Key() {

        name = "key";
        try {
            image = ImageIO.read(getClass().getResource("/player/boy_up_1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
