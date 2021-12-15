package com.myConference.SIIProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myConference.SIIProject.domain.user.*;
import com.myConference.SIIProject.domain.user.account.UserAccountRepository;
import com.myConference.SIIProject.infrastructure.api.user.authentication.UserAuthenticationEndpoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(UserAuthenticationEndpoint.class)
@ContextConfiguration("/applicationContext.xml")

public class CreateUserTest {

    @Autowired
    private MockMvc mvc;
    ObjectMapper objectMapper = new ObjectMapper();

    @MockBean
    UserAccountRepository userAccountRepository;
    DeviceAuthenticationService deviceAuthenticationService;


    @Test
    public void givenTokenBackWhenUserCreated() throws Exception {


        CreateUserCommand createUserCommand = new CreateUserCommand("Dawid", "Puka",
                "Dawidos", "Lolek123");


        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/authentication/signup")
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createUserCommand));

        mvc.perform(requestBuilder)
                .andExpect(status().isOk());



    }
}
