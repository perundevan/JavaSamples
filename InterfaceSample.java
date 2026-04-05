public class InterfaceSample {

    static void main() {

        //customer
        Bank hdfc =  new HDFC();

        //bank
        HDFC hdfc1 =  new HDFC();


        //xyz
        XYZ hdfc2 =  new HDFC();
        hdfc.withdraw();
    }
}


interface Bank{
    void withdraw();
    void deposit();
    void transfer();
}

interface XYZ{
    void withdraw();
}


class HDFC  implements Bank, XYZ{

    @Override
    public void withdraw() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void transfer() {

    }

    void pinChange(){

    }

    void ATMWihtdraw(){

    }

    void calculateROI(){

    }
}