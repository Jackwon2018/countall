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
        description = "奶茶";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}

class Honey extends Beverage {
    // 记录饮料的变量，是被装饰者
    Beverage beverage;

    // 让被装饰者记录到实例变量中
    public Honey(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "蜂蜜" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}

class Mocha extends Beverage {
    // 用一个变量记录饮料，也就是被装饰者
    Beverage beverage;

    // 把被装饰者记录到实例变量中
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "摩卡" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}

//测试类
class TestMain {
    public static void main(String[] args) {
        Beverage beverage = new TeaMilk();// 定义咖啡对象
        //beverage = new Mocha(beverage);// 用摩卡装饰
        beverage = new Honey(beverage);// 用蜂蜜装饰
        System.out.println("顾客点了（" + beverage.getDescription() + "）\n价格是：" + beverage.cost() + "元");
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