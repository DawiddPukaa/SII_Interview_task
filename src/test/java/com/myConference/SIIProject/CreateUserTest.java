package com.myConference.SIIProject;

import com.myConference.SIIProject.domain.user.account.UserAccount;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Configuration
public class CreateUserTest extends AbstractTest {


    @Test
    public void createUser() throws Exception {
        String uri = "/signup";

        UserAccount userAccount = new UserAccount();
        userAccount.setName("Dawid");
        userAccount.setSecondName("Puka");
        userAccount.setUsername("DejwidPiukej");
        userAccount.setPassword("Haslo");

        String inputJson = super.mapToJson(userAccount);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201,status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content,"User is created successfull");


    }
}
