package com.example.testtask;

import com.example.testtask.domain.User;
import com.example.testtask.repository.UserRepository;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Date;

public class AddUser {

    public static void defoultAdd(UserRepository userRepository){
        AddUser.newUser(userRepository, "Max", "max1234@gmail.com");
        AddUser.newUser(userRepository, "Alex", "alex@gmail.com");
        AddUser.newUser(userRepository, "Ilon", "mask@gmail.com");
        AddUser.newUser(userRepository, "Xenia", "qwerty@gmail.com");
        AddUser.newUser(userRepository, "Syuzan", "zyz@gmail.com",
                "Гаврилова Сюзан Егоровна", false, AddUser.getDate(10,2, 1998));
        AddUser.newUser(userRepository, "Irina", "irina@gmail.com",
                "Салопятова Ирина Романова", false, AddUser.getDate(14,4, 1988));
        AddUser.newUser(userRepository);
    }

    public static void newUser(UserRepository userRepository){
        try {
            URL url = new URL("http://fotorelax.ru/wp-content/uploads/2016/03/Beautiful-photos-and-pictures-on-various-subjects-01.jpg");
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();

            User user = new User();
            user.setUsername("user");
            user.setEmail("user@gmail.com");
            user.setPhoto(response);
            userRepository.save(user);

//            FileOutputStream file = new FileOutputStream("E:/userimage.jpg");
//            ByteArrayInputStream input = new ByteArrayInputStream(response);
//            BufferedImage bi = ImageIO.read(input);
//            ImageIO.write(bi, "jpg", file);

        } catch (Exception e){
            System.out.println("some problems");
        }
    }

    public static void newUser(UserRepository userRepository, String username, String email){
        try {
            User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("some problems");
        }
    }

    public static void newUser(UserRepository userRepository, String username, String email,
                               String fio, boolean sex, Date birth){
        try {
            User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setFio(fio);
            user.setSex(sex);
            user.setBirth(birth);
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("some problems");
        }
    }

    public static Date getDate(int day, int month, int year){
        return new Date(year-1900, month - 1, day);
    }


}
