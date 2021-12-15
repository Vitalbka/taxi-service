package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            logger.info("Login method was called. Params = {}", login);
            return driver.get();
        }
        logger.warn("Authentication attempt failed. Params: login={}", login);
        throw new AuthenticationException("Login or password was incorrect!");
    }
}
