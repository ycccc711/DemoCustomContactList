package sg.edu.rp.c346.democustomcontactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView contact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact = findViewById(R.id.listViewContact);

        //arrayList
        alContactList = new ArrayList<>();

        //objects (constructor in contact class)
        Contact item1 = new Contact("Mary",65,65442334,'F');
        Contact item2 = new Contact("Ken",65,97442437,'M');

        //add into arrayList
        alContactList.add(item1);
        alContactList.add(item2);

        //initialize customAdapter
        caContact = new CustomAdapter(MainActivity.this,R.layout.row,alContactList);
        //connect it to the ListView
        contact.setAdapter(caContact);

    }
}
