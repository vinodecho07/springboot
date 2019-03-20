package com.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.product.service.ProductDetailService;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductDetailRestControllerTest.class)
public class ProductDetailRestControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@MockBean
	private ProductDetailService productDetailService;

	private String uri = "/api/getProductDetail/1";


	@Test
	public void testProductDetail() throws Exception {
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				.accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(404, status);

	}

	
}
