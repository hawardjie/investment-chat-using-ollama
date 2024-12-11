package postsea.investment.llm.chat;

import org.junit.jupiter.api.Test;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private OllamaChatModel client;

	@Test
	void testChat() {
		String response = client.call("Which company is best in LLM?");
		System.out.println(response);
		assertThat(response)
				.isNotBlank()
				.contains("Microsoft");
	}

}
