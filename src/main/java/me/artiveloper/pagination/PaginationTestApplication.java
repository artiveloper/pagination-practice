package me.artiveloper.pagination;

import me.artiveloper.pagination.domain.Pagination;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class PaginationTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PaginationTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PaginationTestApplication.class, args);
	}

}
