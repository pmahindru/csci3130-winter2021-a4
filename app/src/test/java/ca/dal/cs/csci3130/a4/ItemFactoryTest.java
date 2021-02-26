package ca.dal.cs.csci3130.a4;

import org.junit.Test;

import ca.dal.cs.csci3130.a4.q3.BabyToy;
import ca.dal.cs.csci3130.a4.q3.Clothes;
import ca.dal.cs.csci3130.a4.q3.ComputerParts;
import ca.dal.cs.csci3130.a4.q3.Item;
import ca.dal.cs.csci3130.a4.q3.ItemConstants;
import ca.dal.cs.csci3130.a4.q3.ItemFactory;
import ca.dal.cs.csci3130.a4.q3.ItemFactoryProducer;
import ca.dal.cs.csci3130.a4.q3.MowTheLawn;
import ca.dal.cs.csci3130.a4.q3.PickUpGrocery;
import ca.dal.cs.csci3130.a4.q3.WalkADog;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class ItemFactoryTest {

    @Test
    public void testSmallTaskFactory() {
        ItemFactory factory = ItemFactoryProducer.getFactory(true);
        Item walkADog = factory.getItem(ItemConstants.WALK_A_DOG);
        assertThat(walkADog, instanceOf(WalkADog.class));
        assertFalse(walkADog instanceof MowTheLawn);

        Item mowTheLawn = factory.getItem(ItemConstants.MOW_THE_LAWN);
        assertThat(mowTheLawn, instanceOf(MowTheLawn.class));
        assertFalse(mowTheLawn instanceof WalkADog);

        Item pickupGrocery = factory.getItem(ItemConstants.PICK_UP_GROCERY);
        assertThat(pickupGrocery, instanceOf(PickUpGrocery.class));
    }


    @Test
    public void testGoodsFactory() {
        ItemFactory factory = ItemFactoryProducer.getFactory(false);
        Item babyToy = factory.getItem(ItemConstants.BABY_TOY);
        assertThat(babyToy, instanceOf(BabyToy.class));
        assertFalse(babyToy instanceof WalkADog);

        Item clothes = factory.getItem(ItemConstants.CLOTHES);
        assertThat(clothes, instanceOf(Clothes.class));
        assertFalse(clothes instanceof BabyToy);

        Item computerPart = factory.getItem(ItemConstants.COMPUTER_PARTS);
        assertThat(computerPart, instanceOf(ComputerParts.class));
        assertFalse(computerPart instanceof BabyToy);
    }
}
