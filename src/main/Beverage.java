package main;

/**
 * @author yylin
 */
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

class TeaMilk extends Beverage {
    public TeaMilk() {
        description = "�̲�";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}

class Honey extends Beverage {
    // ��¼���ϵı������Ǳ�װ����
    Beverage beverage;

    // �ñ�װ���߼�¼��ʵ��������
    public Honey(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "����" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}

class Mocha extends Beverage {
    // ��һ��������¼���ϣ�Ҳ���Ǳ�װ����
    Beverage beverage;

    // �ѱ�װ���߼�¼��ʵ��������
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Ħ��" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}

//������
class TestMain {
    public static void main(String[] args) {
        Beverage beverage = new TeaMilk();// ���忧�ȶ���
        //beverage = new Mocha(beverage);// ��Ħ��װ��
        beverage = new Honey(beverage);// �÷���װ��
        System.out.println("�˿͵��ˣ�" + beverage.getDescription() + "��\n�۸��ǣ�" + beverage.cost() + "Ԫ");
    }
}


//
//public abstract class Drink {
//    protected String description;
//
//    public String getDescription() {
//        return description="ni";
//    }
//
//    public abstract float cost();
//}
//
//class Milk extends Drink {
//
//    public Milk() {
//        this.description = "milk";
//    }
//
//    @Override
//    public float cost() {
//        return 10;
//    }
//
//}
//
//class Sugar extends Drink {
//
//    private Drink drink;
//
//    public Sugar(Drink d) {
//        this.drink = d;
//    }
//
//    public String getDescription() {
//        return drink.getDescription() + "+sugar";
//    }
//
//    @Override
//    public float cost() {
//        return drink.cost() + 2;
//    }
//
//}
//
//
//class Test {
//
//    public static void main(String[] args) {
//        Drink d = new Milk();
//        System.out.println(d.getDescription() + ":" + d.cost());
//
//        d = new Sugar(d);
//        System.out.println(d.getDescription() + ":" + d.cost());
//
//        //d = new Chocolate(d);
//        //System.out.println(d.getDescription() + ":" + d.cost());
//
//    }
//
//}