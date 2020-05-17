package SpringBootPart1;

import Repository.FakeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class SpringbootApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootApplication.class,args);
    }
    @Bean
    public CommandLineRunner commrunner(ApplicationContext ctx)
    {
        return args ->
        {
            FakeRepo repo = new FakeRepo();
            System.out.println("application start");
            String[] name = ctx.getBeanDefinitionNames();

            repo.insertUser(1,"tebogo","lebepe");


        };
    }
}