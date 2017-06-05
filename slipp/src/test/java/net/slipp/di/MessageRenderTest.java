package net.slipp.di;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("di.xml")
public class MessageRenderTest {

	@Autowired
	private MessageRender messageRender;
	
	@Test
	public void render() {
		messageRender.render();
	}
}