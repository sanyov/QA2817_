package by.itstep.anonymous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousJFrame extends JFrame {
    public AnonymousJFrame() {
        JButton btn = new JButton("Say 'Hello'");

        // Вот наш пример анонимного класса
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Hello, world");
            }
        });

        // Кладем кнопку на СЕВЕР
        add(btn, BorderLayout.NORTH);

        // Задаем размеры формы
        setBounds(100, 100, 200, 100);

        // Устанавливаем свойство для закрытия приложения при закрытии формы
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем форму видимой
        setVisible(true);
    }
}
