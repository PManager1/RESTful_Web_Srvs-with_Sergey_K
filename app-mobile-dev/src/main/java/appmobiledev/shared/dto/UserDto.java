package appmobiledev.shared.dto;
import java.io.Serializable;

// Data transfer object is a design pattern,
// DTO) is an object that carries data between processes. When you’re working with a remote interface,
// each call is expensive. As a result, you need to reduce the number of calls. The solution is to create a
// Data Transfer Object that can hold all the data for the call.

public class UserDto implements Serializable {
    private static final long serialVersionUID = 2000L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPAssword;
    private String emailVerificationToken;
    private String emailVerificationStatus;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPAssword() {
        return encryptedPAssword;
    }

    public void setEncryptedPAssword(String encryptedPAssword) {
        this.encryptedPAssword = encryptedPAssword;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public String getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(String emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }
}
