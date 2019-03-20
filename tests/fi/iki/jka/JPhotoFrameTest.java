package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void checkTimingOfActionPerformed() throws Exception {
        JPhotoFrame frame = new JPhotoFrame();
        frame.photos = new JPhotoCollection();
        frame.actionPerformed(new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW));
//
        assertThat(frame.interval, equalTo(5000));
    }
}