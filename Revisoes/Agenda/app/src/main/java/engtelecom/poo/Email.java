package engtelecom.poo;

public class Email {

    private String rotulo;
    private String email;

    public Email(String rotulo, String email) {
        this.rotulo = rotulo;
        this.email = email;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public boolean testaEmail(String email) {

        return true;
    }

    /*
    // Valida e-mail
    String eR = "^[\\w−\\+]+(\\.[\\w]+)∗@[\\w−]+(\\.[\\w]+)∗(\\.[a−z]{2,})$";
    String email = "meu.email@dominio.com.br";
    System.out.println("Email válido? " + email.matches(eR));
    */


}
