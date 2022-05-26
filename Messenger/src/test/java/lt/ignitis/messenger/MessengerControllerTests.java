package lt.ignitis.messenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import lt.ignitis.messenger.entities.Client;
import lt.ignitis.messenger.entities.Message;
import lt.ignitis.messenger.restControllers.MessageController;
import lt.ignitis.messenger.services.MessageService;

@SpringBootTest
class MessengerControllerTests {

	@Mock
	MessageService messageService;
	
	@InjectMocks
	MessageController controller;
	
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void successAddMethodReturnsSauktinisObject(){
		Message s=new Message("Jonas", "2022-05-26", "Hello world");
		Message g=new Message("Jonas", "2022-05-26", "Hello world");
		g.setId(1);
		
		when(messageService.saveMessage(s)).thenReturn(g);
		Message sS=controller.add(s);
		
		assertEquals(s, sS);
		verify(messageService).saveMessage(s);
		 
	}

}
