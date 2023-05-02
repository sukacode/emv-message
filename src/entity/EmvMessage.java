package entity;

public class EmvMessage {
    private String emv;

    public EmvMessage(String emv) {
        this.emv = emv;
    }

    public EmvMessage() {
    }

    public String getEmv() {
        return emv;
    }

    public void setEmv(String emv) {
        this.emv = emv;
    }
}
