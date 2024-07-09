package applications;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class  BankClientsApp {

    public boolean checkUserExist(int userId) {
        return true;
    }
}