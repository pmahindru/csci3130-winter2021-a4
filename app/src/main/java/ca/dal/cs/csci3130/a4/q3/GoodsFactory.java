package ca.dal.cs.csci3130.a4.q3;

public class GoodsFactory implements ItemFactory {
    @Override
    public Item getItem(String itemType) {
        if (itemType.equals(ItemConstants.BABY_TOY)){
            return new BabyToy();
        }
        else if (itemType.equals(ItemConstants.CLOTHES)){
            return new Clothes();
        }
        else if (itemType.equals(ItemConstants.COMPUTER_PARTS)){
            return new ComputerParts();
        }
        return null;
    }
}
