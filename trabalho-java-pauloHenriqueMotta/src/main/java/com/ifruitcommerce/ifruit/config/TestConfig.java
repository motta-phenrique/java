package com.ifruitcommerce.ifruit.config;

import com.ifruitcommerce.ifruit.entities.*;
import com.ifruitcommerce.ifruit.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.ifruitcommerce.ifruit.entities.OrderStatus;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1L, "Paulo Henrique", "motta.phenrique@teste.com", "31231321", "123456");
        User u2 = new User(2L, "Edvaldo", "edvialdo.junior@exemplo.com", "23123123", "232424");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Category c1 = new Category(3L, "Grão");
        Category c2 = new Category(4L, "Doce");

        categoryRepository.saveAll(Arrays.asList(c1, c2));

        Product pr1 = new Product(5L, "Bala", "Bala doce", 1.00, "imagem");
        Product pr2 = new Product(6L, "Tomate", "Salada", 6.00, "imagem");

        productRepository.saveAll(Arrays.asList(pr1, pr2));

        Payment p1 = new Payment(7L, null);
        Payment p2 = new Payment(8L, null);

        paymentRepository.saveAll(Arrays.asList(p1, p2));

        OrderItem oi1 = new OrderItem(9L, 2, 10.0);
        OrderItem oi2 = new OrderItem(10L, 2, 10.0);

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2));

        Order o1 = new Order(11L, null, OrderStatus.CANCELED);
        Order o2 = new Order(12L, null, OrderStatus.DELIVERED);

        orderRepository.saveAll(Arrays.asList(o1, o2));

        User u3 = userRepository.findUserByEmail("motta.phenrique@teste.com");
        System.out.println("Nome: " + u3.getName() + " Email: " + u3.getEmail());

        Product pr3 = productRepository.findProductByName("Tomate");
        System.out.println("Nome: " + pr3.getName() + " Descrição: " + pr3.getDescription());
    }
}
