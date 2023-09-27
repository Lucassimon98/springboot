//package com.example.springboot;

//import com.example.springboot.models.ProductModel;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.reactive.server.WebTestClient;

//import java.math.BigDecimal;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class SpringbootApplicationTests {
//	@Autowired
//	private WebTestClient webTestClient;
//
//	@Test
//	void testCreateProductSuccess() {
//		var products = new ProductModel("Lucas Simon", new BigDecimal(100));
//
//		webTestClient
//				.post()
//				.uri("/products")
//				.bodyValue(products)
//				.exchange()
//				.expectStatus().isOk()
//				.expectBody()
//				.jsonPath("$").isArray()
//				.jsonPath("$.length()").isEqualTo(1)
//				.jsonPath("$[0].name").isEqualTo(products.getName())
//				.jsonPath("$[0].value").isEqualTo(products.getValue());
//	}
//
//	@Test
//	void testCreateProductFailure() {
//	}
//
//}
