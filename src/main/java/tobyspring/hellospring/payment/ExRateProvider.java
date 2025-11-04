package tobyspring.hellospring.payment;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public interface ExRateProvider {
    BigDecimal getExRate(String currency) throws IOException;
}
