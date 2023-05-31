package com.ui.demo.springbootmvctiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.SimpleSpringPreparerFactory;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@SpringBootApplication
public class SpringbootmvctilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvctilesApplication.class, args);
	}

	
	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();

        tiles.setDefinitions(new String[] {"/WEB-INF/tiles.xml"});
        tiles.setPreparerFactoryClass(SimpleSpringPreparerFactory.class);
       // tiles.setCompleteAutoload(true);

		return tiles;
	}
}
