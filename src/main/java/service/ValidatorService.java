package service;


import exception.IncorrectParamException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ValidatorService {
    public String validate(String str) {
        String[] strs = str.split("-");
        for (int i = 0; i < strs.length; i++) {
            if (!StringUtils.isEmpty(strs[i])) {
                throw new IncorrectParamException();
            }
            strs[i] = StringUtils.capitalize(strs[i].toLowerCase());
        }
        return String.join("-",strs);
    }
}