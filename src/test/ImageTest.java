package test;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * @Auther: chenle
 * @Date: 2020/9/14 - 22:26
 * @Description: test
 * @version: 1.0
 */
public class ImageTest {

    @Test
    public void test() {
        try {
            BufferedImage image = ImageIO.read(new File("D:/idea_workspace/tank/src/images/bulletD.gif"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
