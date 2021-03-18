package com.example.testtask;

import com.example.testtask.domain.User;
import com.example.testtask.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

@SpringBootApplication
public class TesttaskApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TesttaskApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		AddUser.defoultAdd(userRepository);

		System.out.println("all is ok");
	}




}
