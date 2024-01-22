package com.msb.employee.config

import io.r2dbc.spi.ConnectionFactory
import org.jooq.impl.DSL
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JooqConfig(val connectionFactory: ConnectionFactory) {

  @Bean
  fun jooqDslContext() = DSL.using(connectionFactory)
}
