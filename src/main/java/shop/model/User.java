package shop.model;

/**
 * @program: Shop
 * @Date: 2018/9/12 16:37
 * @Author: undefined
 * @Description:
 */
public class User {
    private long id;
    private String userName;
    private String passWord;
    private String gender;
    private String cellPhone;
    private String email;

    public User(long id, String userName, String passWord, String gender, String cellPhone, String email) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.gender = gender;
        this.cellPhone = cellPhone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
