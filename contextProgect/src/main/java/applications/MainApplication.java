package applications;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import database.Database;

@NoArgsConstructor
@Component
public class MainApplication {

    @Autowired
    private BankClientsApp bankClientsApp;

    @Autowired
    private TransferByPhoneApp transferByPhoneApp;

    @Autowired
    private Database database;

    public void run(int senderId, int phoneNumber, int value) {
        if (!bankClientsApp.checkUserExist(senderId)) {
            return;
        }

        if (!bankClientsApp.checkUserExist(phoneNumber)) {
            return;
        }

        transferByPhoneApp.transfer(senderId, phoneNumber, value);
        database.transferMoney(senderId, phoneNumber, value);
    }
}
