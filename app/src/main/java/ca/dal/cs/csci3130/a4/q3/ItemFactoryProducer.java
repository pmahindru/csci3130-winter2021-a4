package ca.dal.cs.csci3130.a4.q3;

public class ItemFactoryProducer {
    public static ItemFactory getFactory(boolean isSmallTask) {
        if (isSmallTask){
            return new SmallTaskFactory();
        }
        else {
            return new GoodsFactory();
        }

    }
}
