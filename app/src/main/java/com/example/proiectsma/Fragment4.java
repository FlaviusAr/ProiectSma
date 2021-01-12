package com.example.proiectsma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.proiectsma.UserHelperClass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;

import static android.content.ContentValues.TAG;


public class Fragment4 extends Fragment {
    EditText edit_firstname,edit_lastname,edit_phone,edit_city;
    TextView textview_email;
    Button buttondate1;
    FirebaseDatabase rootNode;
    DatabaseReference reference,reference2;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String Uid = user.getUid();
    String email =user.getEmail();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment4, container, false);

        edit_firstname=(EditText) view.findViewById(R.id.edit_firstname);
        edit_lastname=(EditText) view.findViewById(R.id.edit_lastname);
        edit_phone=(EditText) view.findViewById(R.id.edit_phone);
        edit_city=(EditText) view.findViewById(R.id.edit_city);
        buttondate1=(Button) view.findViewById(R.id.butondate1);
        TextView textview_email= (TextView) view.findViewById(R.id.textview_email);
        textview_email.setText(email);


        buttondate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference=rootNode.getReference("users");
                String firstname=edit_firstname.getText().toString();
                String lastname=edit_lastname.getText().toString();
                String phone=edit_phone.getText().toString();
                String city=edit_city.getText().toString();


                UserHelperClass helperClass=new UserHelperClass(firstname,lastname,phone,city);
                reference.child(Uid).setValue(helperClass);
                Toast.makeText(getActivity(),"Info added",Toast.LENGTH_SHORT).show();
            }
        });

/*
        String path="users"+Uid;
        final FirebaseDatabase database2 = FirebaseDatabase.getInstance();
        DatabaseReference ref = database2.getReference(path);

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                UserHelperClass helperClass2=dataSnapshot.getValue(UserHelperClass.class);
                String nume=helperClass2.getFirstname();
                edit_firstname.setText(nume);



                //String value = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
*/


        return view;
    }
}