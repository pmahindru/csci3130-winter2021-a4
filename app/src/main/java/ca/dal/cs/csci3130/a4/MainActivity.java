package ca.dal.cs.csci3130.a4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ca.dal.cs.csci3130.a4.q3.ItemConstants;
import ca.dal.cs.csci3130.a4.q5.GoodsPreferenceManager;
import ca.dal.cs.csci3130.a4.q5.TaskPreferenceManager;
import ca.dal.cs.csci3130.a4.q5.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //populating the list
        this.populateList();

        //attaching the handlers
        Button setPriceButton = (Button) findViewById(R.id.setNotificationButton);
        setPriceButton.setOnClickListener(this);
    }

    protected void populateList() {
        Spinner itemList = (Spinner) findViewById(R.id.itemSelector);
        List<String> items = new ArrayList<String>();
        items.add(ItemConstants.WALK_A_DOG);
        items.add(ItemConstants.BABY_TOY);
        @SuppressLint("ResourceType") ArrayAdapter<String> itemListAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, items);
        itemListAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        itemList.setAdapter(itemListAdapter);
    }

    protected String getPriceText(int price) {
        return String.valueOf(price);
    }

    protected int extractNewBid() {
        int newBid = 0;
        try {
            EditText newPriceTextBox = (EditText) findViewById(R.id.newPriceBox);
            newBid = Integer.parseInt(newPriceTextBox.getText().toString());
        } catch (NumberFormatException exc) {
            Toast.makeText(this, "Enter a new bid", Toast.LENGTH_LONG).show();
        }
        return newBid;
    }

    protected void sendNewBid(int newBid) {
        TaskPreferenceManager manager = new TaskPreferenceManager();
        User user1 = new User(manager, 10);
        User user2 = new User(manager, 20);
        manager.setPrice(newBid);

        //showing the new bids
        EditText user1TextBox = (EditText) findViewById(R.id.user1);
        EditText user2TextBox = (EditText) findViewById(R.id.user2);
        user1TextBox.setText(getPriceText(user1.getCurrentPrice()));
        user2TextBox.setText(getPriceText(user2.getCurrentPrice()));
    }

    protected void sendGoodsNotification(String message) {
        GoodsPreferenceManager manager = new GoodsPreferenceManager();
        User user3 = new User(manager, 0);
        User user4 = new User(manager, 0);
        manager.setMessage(message);

        //showing the new message
        EditText user3TextBox = (EditText) findViewById(R.id.user3);
        EditText user4TextBox = (EditText) findViewById(R.id.user4);
        user3TextBox.setText(user3.getCurrentMessage());
        user4TextBox.setText(user4.getCurrentMessage());
    }

    protected String getSelectedItem() {
        Spinner itemList = (Spinner) findViewById(R.id.itemSelector);
        return itemList.getSelectedItem().toString();
    }

    protected void clearTextBoxes() {
        ((EditText) findViewById(R.id.user1)).setText("");
        ((EditText) findViewById(R.id.user2)).setText("");
        ((EditText) findViewById(R.id.user3)).setText("");
        ((EditText) findViewById(R.id.user4)).setText("");
    }

    @Override
    public void onClick(View view) {
        //clear old values
        clearTextBoxes();

        String selectedItem = getSelectedItem();
        if (selectedItem.equals(ItemConstants.WALK_A_DOG)) {
            int newBid = extractNewBid();
            if (newBid > 0) {
                this.sendNewBid(newBid);
            } else {
                Toast.makeText(this, "Enter your bid", Toast.LENGTH_LONG).show();
                return;
            }
        } else if (selectedItem.equals(ItemConstants.BABY_TOY)) {
            this.sendGoodsNotification(selectedItem);
        }
    }
}