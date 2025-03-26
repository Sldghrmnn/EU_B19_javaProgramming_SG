package day48_AbstractClass.Cake;

public class VanilyaliKek extends BaseKek{

    private int vanilya;

    public VanilyaliKek(int yumurta, int un, int seker, int kabartmaTozu, int sut, int yag) {
        super(yumurta, un, seker, kabartmaTozu, sut, yag);
        this.vanilya = vanilya;
    }

    public int getVanilya() {
        return vanilya;
    }

    public void setVanilya(int vanilya) {
        this.vanilya = vanilya;
    }


    @Override
    public void karistir() {
        System.out.println("Aşağıdaki malzemelri karıştırma kabına koy");
        System.out.println("En az 5 dakika karıştır");
        System.out.println("Un              = " + getUn());
        System.out.println("KabartmaTozu    = " + getKabartmaTozu());
        System.out.println("Seker           = " + getSeker());
        System.out.println("Sut             = " + getSut());
        System.out.println("Yag             = " + getYag());
        System.out.println("Yumurta         = " + getYumurta());
        System.out.println("Vanilya         = " + getVanilya());

        System.out.println("Bütün malzemeler karıştırıldı");
        setMixed(true);


    }

    @Override
    public void pisir() {
        if (isMixed()){
            System.out.println("kek pişirilebilir");
        }else{
            System.out.println("Önce keki karıştır");
        }
    }
}
