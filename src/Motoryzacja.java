import java.util.Scanner;

public class Motoryzacja {

    public static void main(String[] arg)
    {
        Pojazd samochod1 = new SportowySamochod();
        samochod1.WypiszPodstawoweInformacje();

        SportowySamochod samochod2 = new SportowySamochod();
        samochod2.setCena(1000);
        samochod2.gaz();
        samochod2.setSpoiler(true);

        TurystycznyMotore mot = new TurystycznyMotore();

        mot.getPojemnoscBagaznika();
        mot.setMozliwoscPodrozowaniaPodwojnie(true);
        mot.hamulec();
        mot.setMarka("Yamaha");
    }

}



interface Obsluga
{
    void gaz();
    void hamulec();
    void start();
    void stop();

}

interface Panel
{
    void kierunkowskaz();
    void swiatlaAwaryjne();
    void klakson();
}

abstract class Pojazd implements Panel, Obsluga
{

    private double _cena;
    private String _marka;
    private String _model;
    private double _pojemnoscSilnika;
    private int _rokProduckji;
    private String _rodzajSkrzyniBiegow;
    private String _paliwo;
    private double _mocSilnika;

    public void WypiszPodstawoweInformacje()
    {
        getCena();
        getMarka();
        getModel();
        getPojemnoscSilnika();
        getRokProdukcji();
        getRodzajSkrzyniBiegow();
        getPaliwo();
        getMocSilnika();

    }

    Pojazd()
    {
        _cena = 0.0;
        _marka = "";
        _model = "";
        _pojemnoscSilnika = 0.0;
        _rokProduckji = 0;
        _rodzajSkrzyniBiegow = "";
        _paliwo = "";
        _mocSilnika = 0.0;


    }

    public void setCena(double cena)
    {
         this._cena = cena;
    }
    public void setMarka(String marka)
    {
        this._marka = marka;
    }
    public void setModel(String model )
    {
        this._model = model;
    }
    public void setPojemnoscSilnika(double pojemnoscSilnika)
    {
        this._pojemnoscSilnika = pojemnoscSilnika;
    }
    public void setRokProdukcji(int rokProduckji)
    {
        this._rokProduckji = rokProduckji;
    }
    public void setRodzajSkrzyniBiegow(String rodzajSkrzyniBiegow)
    {
        this._rodzajSkrzyniBiegow = rodzajSkrzyniBiegow ;
    }
    public void setPaliwo(String paliwo)
    {
        this._paliwo = paliwo ;
    }
    public void setMocSilnika(double mocSilnika)
    {
        this._mocSilnika = mocSilnika;
    }

    public void getCena(){ System.out.println("cena: " + _cena); }
    public void getMarka() { System.out.println("Marka: " + _marka); }
    public void getModel() { System.out.println("model: " + _model); }
    public void getPojemnoscSilnika()
    {
        System.out.println("Pojemnosc Silnika: " + _pojemnoscSilnika);
    }
    public void getRokProdukcji()
    {
        System.out.println("Rok Produkcji: " + _rokProduckji);
    }
    public void getRodzajSkrzyniBiegow()
    {
        System.out.println("Rodzaj Skrzyni Biegow: " + _rodzajSkrzyniBiegow);
    }
    public void getPaliwo()
    {
        System.out.println("Paliwo: " + _paliwo);
    }
    public void getMocSilnika()
    {
        System.out.println("Moc Silnika: " + _mocSilnika);
    }

}

abstract  class Motocykl extends Pojazd
{
    private String _rodzajStartu;
    private String _rodzajKategoriA;
    private String _rodzajNapedu;

    public void WypiszPodstawoweInformacje()
    {
        super.WypiszPodstawoweInformacje();

        getRodzajKategoriA();
        getRodzajNapedu();
        getRodzajStartu();
    }

    Motocykl()
    {
        _rodzajStartu = "";
        _rodzajKategoriA = "";
        _rodzajNapedu = "";
    }

    public void setRodzajStartu(String rodzajStartu){ this._rodzajStartu = rodzajStartu;}
    public void setRodzajKategoriA(String rodzajKategoriA){ this._rodzajKategoriA = rodzajKategoriA;}
    public void setRodzajNapedu(String rodzajNapedu){ this._rodzajNapedu = rodzajNapedu;}

    public void getRodzajStartu(){ System.out.println("Rodzaj Startu:" + _rodzajStartu);}
    public void getRodzajKategoriA(){ System.out.println("Rodzaj Kategori A:" + _rodzajStartu);}
    public void getRodzajNapedu(){ System.out.println("Rodzaj Napedu:" + _rodzajStartu);}

}

abstract class Samochod extends Pojazd
{
    private int _iloscDrzwi;
    private String _typNadwozia;
    private double _pojemnoscBagaznika;

    public void WypiszPodstawoweInformacje()
    {
        super.WypiszPodstawoweInformacje();

        getIloscDrzwi();
        getPojemnoscBagaznika();
        getTypNadwozia();

    }

    Samochod()
    {
        _iloscDrzwi = 0;
        _typNadwozia = "";
        _pojemnoscBagaznika = 0.0;
    }

    public void setIloscDrzwi(int iloscDrzwi){ this._iloscDrzwi = iloscDrzwi;}
    public void setTypNadwozia(String typNadwozia){ this._typNadwozia = typNadwozia;}
    public void setPojemnoscBagaznika(int pojemnoscBagaznika){ this._pojemnoscBagaznika = pojemnoscBagaznika;}

    public void getIloscDrzwi(){ System.out.println("Ilosc Drzwi:" + _iloscDrzwi);}
    public void getTypNadwozia(){ System.out.println("Typ Nadwozia:" + _typNadwozia);}
    public void getPojemnoscBagaznika(){ System.out.println("Pojemnosc Bagaznika:" + _pojemnoscBagaznika);}


}

class SportowySamochod extends Samochod
{
    private boolean _spoiler;
    private String _przystosowanieOgumienia;
    private String _przeznaczenie;

    public void WypiszPodstawoweInformacje()
    {
        super.WypiszPodstawoweInformacje();
        getPrzeznaczenie();
        getPrzystosowanieOgumienia();

    }

    SportowySamochod()
    {
        _spoiler = false;
        _przystosowanieOgumienia = "";
        _przeznaczenie= "";

    }

    public void setSpoiler(boolean spolier){this._spoiler = spolier;}
    public void setPrzystosowanieOgumienia(String przystosowanieOgumienia){this._przystosowanieOgumienia = przystosowanieOgumienia;}
    public void setPrzeznaczenie(String przeznaczenie){this._przeznaczenie = przeznaczenie;}

    public void getSpoiler(){ System.out.println("Spoiler: " + _spoiler);}
    public void getPrzystosowanieOgumienia(){ System.out.println("Przystosowanie Ogumienia:" + _przystosowanieOgumienia);}
    public void getPrzeznaczenie(){ System.out.println("Przeznaczenie:" + _przeznaczenie);}


    @Override
    public void gaz() {
        System.out.println("Gaz: SportowySamochod");
    }

    @Override
    public void hamulec() {
        System.out.println("Hamulec: SportowySamochod");
    }

    @Override
    public void start() {
        System.out.println("Start: SportowySamochod");
    }

    @Override
    public void stop() {
        System.out.println("Stop: SportowySamochod");
    }

    @Override
    public void kierunkowskaz() {
        System.out.println("Kierunkowskaz: SportowySamochod");
    }

    @Override
    public void swiatlaAwaryjne() {
        System.out.println("Swiatla Awaryjne: SportowySamochod");
    }

    @Override
    public void klakson() {
        System.out.println("Klakson: SportowySamochod");
    }


}

class MiejskiSamochod extends Samochod
{
    private boolean _eco;
    private boolean _intalacjaGazowa;
    private boolean _automatyczneParkowanie;
    private boolean _kameraCofania;

    MiejskiSamochod()
    {
        _eco = false;
        _intalacjaGazowa = false;
        _automatyczneParkowanie = false;
        _kameraCofania = false;
    }

    public void WypiszPodstawoweInformacje()
    {
        super.WypiszPodstawoweInformacje();
        super.WypiszPodstawoweInformacje();

        getAutomatyczneParkowanie();
        getEco();
        getInstalacjaGazowa();
        getKameraCofania();
    }

    public void setEco(boolean eco){this._eco = eco;}
    public void setInstalacjaGazowa(boolean instalacjaGazowa){this._intalacjaGazowa = instalacjaGazowa;}
    public void setAutomatyczneParkowanie(boolean automatyczneParkowanie){this._automatyczneParkowanie = automatyczneParkowanie;}
    public void setKameraCofania(boolean kameraCofania){this._kameraCofania = kameraCofania;}

    public void getEco(){ System.out.println("Eco:" + _eco);}
    public void getInstalacjaGazowa(){ System.out.println("Instalacja Gazowa:" + _intalacjaGazowa);}
    public void getAutomatyczneParkowanie(){ System.out.println("Automatyczne Parkowanie:" + _automatyczneParkowanie);}
    public void getKameraCofania(){ System.out.println("Kamera Cofania:" + _kameraCofania);}


    @Override
    public void gaz() {
        System.out.println("Gaz: MiejskiSamochod");
    }

    @Override
    public void hamulec() {
        System.out.println("Hamulec: MiejskiSamochod");
    }

    @Override
    public void start() {
        System.out.println("Start: MiejskiSamochod");
    }

    @Override
    public void stop() {
        System.out.println("Stop: MiejskiSamochod");
    }

    @Override
    public void kierunkowskaz() {
        System.out.println("Kierunkowskaz: MiejskiSamochod");
    }

    @Override
    public void swiatlaAwaryjne() {
        System.out.println("Swiatla Awaryjne: MiejskiSamochod");
    }

    @Override
    public void klakson() {
        System.out.println("Klakson: MiejskiSamochod");
    }
}

class SportowyMotocykl extends Motocykl
{
    private String _przystostowanie;
    private String _typ;

    SportowyMotocykl()
    {
        _przystostowanie = "";
        _typ = "";
    }

    public void WypiszPodstawoweInformacje()
    {
        super.WypiszPodstawoweInformacje();


        getPrzystosowanie();
        getTyp();
    }

    public void setPrzystosowanie(String przysotsowanie){this._przystostowanie = przysotsowanie;}
    public void setTyp(String typ){this._typ = typ;}

    public void getPrzystosowanie(){System.out.println("Przystosowanie:" + _przystostowanie);}
    public void getTyp(){System.out.println("Typ:" + _typ);}

    @Override
    public void gaz() {
        System.out.println("Gaz: SportowyMotocykl");
    }

    @Override
    public void hamulec() {
        System.out.println("Hamulec: SportowyMotocykl");
    }

    @Override
    public void start() {
        System.out.println("Start: SportowyMotocykl");
    }

    @Override
    public void stop() {
        System.out.println("Stop: SportowyMotocykl");
    }

    @Override
    public void kierunkowskaz() {
        System.out.println("Kierunkowskaz: SportowyMotocykl");
    }

    @Override
    public void swiatlaAwaryjne() {
        System.out.println("Swiatla Awaryjne: SportowyMotocykl");
    }

    @Override
    public void klakson() {
        System.out.println("Klakson: SportowyMotocykl");
    }
}

class TurystycznyMotore extends Motocykl
{
    private boolean _bagaznik;
    private double _pojemnoscBagaznika;
    private boolean _mozliwoscPodrozowaniaPodwojnie;

    TurystycznyMotore()
    {
        _bagaznik = false;
        _pojemnoscBagaznika = 0.0;
        _mozliwoscPodrozowaniaPodwojnie = false;
    }

    public void WypiszPodstawoweInforacje()
    {
        super.WypiszPodstawoweInformacje();

        getBagaznik();
        getMozliwoscPodrozowaniaPodwojnie();
        getPojemnoscBagaznika();
    }

    public void setBagaznik(boolean bagaznik){this._bagaznik = bagaznik;}
    public void setPojemnoscBagaznika(double pojemnoscBagaznika){this._pojemnoscBagaznika = pojemnoscBagaznika;}
    public void setMozliwoscPodrozowaniaPodwojnie(boolean mozliwoscPodrozowaniaPodwojnie){this._mozliwoscPodrozowaniaPodwojnie = mozliwoscPodrozowaniaPodwojnie;}

    public void getBagaznik(){System.out.println("Bagaznik:" + _bagaznik);}
    public void getPojemnoscBagaznika(){System.out.println("Pojemnosc Bagaznika:" + _pojemnoscBagaznika);}
    public void getMozliwoscPodrozowaniaPodwojnie(){System.out.println("Mozliwosc Podrozowania Podwojnie:" + _mozliwoscPodrozowaniaPodwojnie);}


    @Override
    public void gaz() {
        System.out.println("Gaz: TurystycznyMotore");
    }

    @Override
    public void hamulec() {
        System.out.println("Hamulec: TurystycznyMotore");
    }

    @Override
    public void start() {
        System.out.println("Start: TurystycznyMotore");
    }

    @Override
    public void stop() {
        System.out.println("Stop: TurystycznyMotore");
    }

    @Override
    public void kierunkowskaz() {
        System.out.println("Kierunkowskaz: TurystycznyMotore");
    }

    @Override
    public void swiatlaAwaryjne() {
        System.out.println("Swiatla Awaryjne: TurystycznyMotore");
    }

    @Override
    public void klakson() {
        System.out.println("Klakson: TurystycznyMotore");
    }
}
