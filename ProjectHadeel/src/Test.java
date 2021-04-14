import java.util.Scanner;

/**
 * Created by USER on 04/04/2021.
 */
public class Test {
    public static void main(String[] args) {
        ManagerOperation m=new ManagerOperation();
        ChildData c=new ChildData(1,"h","yahya","hgffff","ui","juuu","jhhg","iii","iiii","uyy","uhb","hdfjhd");
        Scanner input=new Scanner(System.in);
        m.addChild(1,"Ahmed","yahya","Mohammed","mal","yamani","12-2-2021","sanaa","60 Street","1 leavl","2-3-2021","regular");
        m.addChild(2,"Osama","Mohammed","Salah","mal","yamani","1-2-2021","sanaa","30 Street","1 leavl","2-3-2021","regular");
        m.addChild(3,"محمد","سالم","المهدي","ذكر","يمني","2-1-2021","صنعاء","شارع القيادة","الاول","2-3-2021","منتظم");
        m.addChild(4,"غدير","سالم","المهدي","انثى","يمني","2-1-2021","صنعاء","شارع القيادة","الاول","2-3-2021","منتظم");
        m.addChild(5,"هيدي","صالح","محمد","انثى","يمني","4-1-2020","صنعاء","شارع القيادة","الثاني","2-3-2021","منقطع");
        m.addChild(6,"رغد","عرفات ","محسن","انثى","يمني","3-2-2019","صنعاء","شارع القيادة","الثالث","2-3-2021","منتظم");
        m.addChild(7,"اميرة","عرفات ","محسن","انثى","يمني","3-2-2019","صنعاء","شارع القيادة","الثالث","2-3-2021","منتظم");
        m.viewChild();

        m.editChild(1,"احمد","إياد","صالح","ذكر","يمني","1-12-2020","صنعاء","شارع القيادة","الاول","2-3-2021","منتظم");
        m.editChild(7,"امجد","امين","المهدي","ذكر","يمني","2-1-2021","صنعاء","شارع القيادة","الاول","2-3-2021","منتظم");
        System.out.println("************************************************بعد التعديل********************************* ");
        m.viewChild();
        System.out.println("**************************************************بعد الحذف***********************************");
        m.deleteChild(1);
        m.viewChild();
        System.out.println("***************************************************البحث**************************************");
        System.out.println(m.searchChild(2));
        System.out.println(m.searchChild(5));
      

    }
}
