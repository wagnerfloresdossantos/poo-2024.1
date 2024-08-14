package engtelecom.poo;

public class Identificador {

    private String macAddress;
    private String ipAddress;

    public Identificador(String macAddress, String ipAddress) {
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
