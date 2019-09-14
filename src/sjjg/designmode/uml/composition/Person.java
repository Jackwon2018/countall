package sjjg.designmode.uml.composition;

import main.designmode.uml.composition.Head;
import main.designmode.uml.composition.IDCard;

public class Person {
    private IDCard card; //聚合关系
    private main.designmode.uml.composition.Head head = new Head(); //组合关系

}
