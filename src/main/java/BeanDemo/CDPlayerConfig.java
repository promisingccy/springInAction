package BeanDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CDPlayerConfig
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 15:05
 * @Version 1.0
 **/
@Configuration  // 表明这个类是一个配置类，
// 该类应该包含在Spring应用上下文中如何创建bean的细节。

@ComponentScan  //这个注解能够在Spring中启用组件扫描
//@ComponentScan(basePackages = {"BeanDemo"}) //指定范围
//@ComponentScan(basePackageClasses = {SgtPeppers.class}) //指定范围
// 如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包。
// 因为CDPlayerConfig类位于soundsystem包中，因此Spring
// 将会扫描这个包以及这个包下的所有子包，查找带有@Component注解的类。
// 这样的话，就能发现CompactDisc，并且会在Spring中自动为 其创建一个bean。
public class CDPlayerConfig {

    @Bean //@Bean注解会告诉Spring这个方法将会返回一个对象，
    // 该对象要注册为Spring应用上下文中的bean。 方法体中包含了最终产生bean实例的逻辑。
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    //cdPlayer()方法像sgtPeppers()方法一样，同样使用了@Bean注解，
    // 这表明这个方法会创建一个bean实例并将其注册到Spring应用上下文中。
    // 所创建的beanID为cdPlayer，与方法的名字相同。
    // cdPlayer()的方法体与sgtPeppers()稍微有些区别。在这里并没有使用默认的构造器构建实例，
    // 而是调用了需要传入CompactDisc对象的构造器来创建CDPlayer实例。
    // 看起来，CompactDisc是通过调用sgtPeppers()得到的，但情况并非完全如此。
    // 因为sgtPeppers()方法上添加了@Bean注解，Spring 将会拦截所有对它的调用，
    // 并确保直接返回该方法所创建的bean，而不是每次都对其进行实际的调用。
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());//通过调用方法来引用bean的方式
    }

    @Bean
    // 当Spring调用cdPlayer()创建CDPlayerbean的时候，它会自动装配一个CompactDisc到配置方法之中。
    // 然后，方法体就可以按照合适的方式来使用它。借助这种技术，
    // cdPlayer()方法也能够将CompactDisc注入到CDPlayer的构造器中，
    // 而且不用明确引用CompactDisc的@Bean方法
    public CDPlayer cdPlayer1(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);//
    }
}
