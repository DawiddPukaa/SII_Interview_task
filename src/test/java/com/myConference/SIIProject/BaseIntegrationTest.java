package com.myConference.SIIProject;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = {SiiProjectApplication.class},
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@ActiveProfiles(profiles = "integration")
class BaseIntegrationTest {
    @LocalServerPort
    private int port;

    UriComponentsBuilder localhost() {
        return UriComponentsBuilder.fromHttpUrl("http://localhost")
            .port(port);
    }
}
