package pl.gatomek.challenge.reactsbuuid.proxy;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping( "/api")
public class UsersRestController {

	@GetMapping(value = "/uuid", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getUuid() {
		return UUID.randomUUID().toString();
	}
}
