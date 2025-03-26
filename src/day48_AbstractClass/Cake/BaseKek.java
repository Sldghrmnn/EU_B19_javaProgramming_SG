package day48_AbstractClass.Cake;

public abstract class BaseKek {


    private int yumurta;
    private int un;
    private int seker;
    private int kabartmaTozu;
    private int sut;
    private int yag;

    private boolean isMixed;

    public BaseKek(int yumurta, int un,int seker, int kabartmaTozu, int sut, int yag) {
        this.yumurta = yumurta;
        this.un = un;
        this.seker = seker;
        this.kabartmaTozu = kabartmaTozu;
        this.sut = sut;
        this.yag = yag;
    }

    public boolean isMixed() {return isMixed;}

    public void setMixed(boolean mixed) {isMixed = mixed;}

    public int getYumurta() {return yumurta;}

    public void setYumurta(int yumurta) {this.yumurta = yumurta;}

    public int getUn() {return un;}

    public void setUn(int un) {this.un = un;}

    public int getSeker() {return seker;}

    public void setSeker(int seker) {this.seker = seker;}

    public int getKabartmaTozu() {return kabartmaTozu;}

    public void setKabartmaTozu(int kabartmaTozu) {this.kabartmaTozu = kabartmaTozu;}

    public int getSut() {return sut;}

    public void setSut(int sut) {this.sut = sut;}

    public int getYag() {return yag;}

    public void setYag(int yag) {this.yag = yag;}

    @Override
    public String toString() {
        return "BaseKek{" +
                "yumurta=" + yumurta +
                ", un=" + un +
                ", seker=" + seker +
                ", kabartmaTozu=" + kabartmaTozu +
                ", sut=" + sut +
                ", yag=" + yag +
                '}';
    }

    public abstract void karistir();
    public abstract void pisir();
}
