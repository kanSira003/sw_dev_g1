
package com.example.accessingdatamysql;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import com.example.accessingdatamysql.controller.DefaultController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.example.accessingdatamysql.service.repo.StudentRepository;
import com.example.accessingdatamysql.service.repo.entity.StudentEntity;

//@AutoConfigureMockMvc
@WebMvcTest(DefaultController.class)
//@SpringBootTest
public class DefaultControllerTests {

	@Autowired
	private MockMvc mockMvc;

    @MockBean
    private StudentRepository studentRepository;

	@Test
	public void index_shouldReturnWelcomeWithDate() throws Exception {

		List<StudentEntity> mockUserList = new ArrayList<StudentEntity>();
		mockUserList.add(new StudentEntity(123, "name123", 0));
		mockUserList.add(new StudentEntity(456, "name456", 0));
		when(studentRepository.findAll()).thenReturn(mockUserList);

		MvcResult result = this.mockMvc.perform(get("/"))//.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		String content = result.getResponse().getContentAsString();

		assertTrue(content.matches("Welcome .*"));


	}


}
