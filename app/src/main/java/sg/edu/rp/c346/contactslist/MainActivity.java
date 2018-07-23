package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContactsItem;
    ArrayList<ContactItems> alContacts;
    CustomAdapter caContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContactsItem = findViewById(R.id.ListViewContacts);
        alContacts = new ArrayList<>();

        ContactItems contact1 = new ContactItems("Mary","+65",65442334);
        ContactItems contact2 = new ContactItems("Ken","+65",97442437);

        alContacts.add(contact1);
        alContacts.add(contact2);

        caContact = new CustomAdapter(this,R.layout.contact_layout, alContacts);

        lvContactsItem.setAdapter(caContact);

    }


}
