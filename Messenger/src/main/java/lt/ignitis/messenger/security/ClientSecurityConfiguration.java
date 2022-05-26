package lt.ignitis.messenger.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ClientSecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").roles("USER")
                .and()
                .withUser("admin").roles("USER", "ADMIN");

    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
          
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/client/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/client").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/client/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/client/**").hasRole("ADMIN")
        		.antMatchers(HttpMethod.GET, "/statistic/**").hasRole("ADMIN");
    }
    
}

