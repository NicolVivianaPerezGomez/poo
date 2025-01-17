package co.edu.ue.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	
	@Bean  //ME PERMITE VOLVERLO O INYECTARLO COMO UN OBJETO
	public InMemoryUserDetailsManager usermanager() {
		List<UserDetails> users = List.of(
				User
				.withUsername("client")
				.password("{noop}1234")
				.roles("USERS")
			    .build(),
			    User
			    .withUsername("admin")
			    .password("{noop}1234")
			    .roles("ADMINS")
			    .build()
			    );
				
		return new InMemoryUserDetailsManager(users);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf(cus->cus.disable())
		.authorizeHttpRequests(aut->
			aut.requestMatchers(HttpMethod.POST,"/dato-sav").hasAnyRole("ADMINS")
			//.requestMatchers(HttpMethod.DELETE,"/datos/**").hasAnyRole("ADMINS","OTHER")
			.requestMatchers(HttpMethod.GET,"/dato-all/*").authenticated()
			.requestMatchers(HttpMethod.GET,"/dato-id").authenticated()	
			.requestMatchers(HttpMethod.GET,"/dato-email").authenticated()	
			.requestMatchers(HttpMethod.GET,"/dato-up").authenticated()	
			
			)
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	

}
