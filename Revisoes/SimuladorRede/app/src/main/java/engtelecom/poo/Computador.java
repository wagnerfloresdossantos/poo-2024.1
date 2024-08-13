package engtelecom.poo;

public class Computador {

    private String macAddress;
    private String ipAddress;

    public Computador(String macAddress, String ipAddress) {
        this.macAddress = macAddress;
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
